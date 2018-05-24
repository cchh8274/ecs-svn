package com.context;

import java.security.GeneralSecurityException;

import org.mybatis.generator.config.CommentGeneratorConfiguration;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.Context;
import org.mybatis.generator.config.JDBCConnectionConfiguration;
import org.mybatis.generator.config.JavaClientGeneratorConfiguration;
import org.mybatis.generator.config.JavaModelGeneratorConfiguration;
import org.mybatis.generator.config.JavaTypeResolverConfiguration;
import org.mybatis.generator.config.PluginConfiguration;
import org.mybatis.generator.config.SqlMapGeneratorConfiguration;
import org.mybatis.generator.config.TableConfiguration;

import com.exception.GenertorException;
import com.model.ConfigModel;
import com.model.GenertorModel;
import com.util.FilePathUtils;
import com.util.GenConstants;

/**
 * 
 * @author chenghui
 *
 */
public class GenertorFactory {
	
	
	public static Configuration  createConfiguration(GenertorModel model,String tableName,String dominName) throws GenertorException, GeneralSecurityException{
		Configuration config = new Configuration();
		//加载驱动
		config.addClasspathEntry(FilePathUtils.getPath()+GenConstants.DRIVER_JAR_PATH);
		//加载配置文件
		config.addContext(getConfiguration(model,tableName,dominName));
		return config;
	}
	
		
	public static  Context  getConfiguration(GenertorModel model,String tableName,String dominName) throws GeneralSecurityException, GenertorException{
		Context  context=new Context(null);
		context.setId("dsql");
		context.setTargetRuntime("MyBatis3");
		//初始化插件
		PluginConfig.createPlugins(null);
		//初始化驱动连接
		DrivarConfig.initJDBCdrivars(context, null);
		initJavaType(context);
		model=initModel(model);
		GenertorFileConfig.initGenetotFile(context, model.getModel(), model.getTarget());
		CommentGeneratorConfiguration  commentGeneratorConfiguration=new CommentGeneratorConfiguration();
		commentGeneratorConfiguration.addProperty("suppressDate", "true");
		commentGeneratorConfiguration.addProperty("suppressAllComments", "true");
		context.setCommentGeneratorConfiguration(commentGeneratorConfiguration);
		TableConfiguration tc=new TableConfiguration(context);
		tc.setTableName(tableName);
		tc.setDomainObjectName(dominName);
		context.addTableConfiguration(tc);
		return context;
	}
	
	
	private static  void initJavaType(Context  context){
		JavaTypeResolverConfiguration  javaTypeResolverConfiguration=new  JavaTypeResolverConfiguration();
		javaTypeResolverConfiguration.addProperty("forceBigDecimals", "false");
		context.setJavaTypeResolverConfiguration(javaTypeResolverConfiguration);
	}
	
	
	private static  GenertorModel  initModel(GenertorModel model) throws GenertorException{
		if(model  == null){
			GenertorModel mod=new GenertorModel();
			String path=FilePathUtils.getPath();
			String url=path.split(GenConstants.PROJECT_NAME)[0]+GenConstants.PROJECT_DAO;
			ConfigModel cm=new  ConfigModel("init");
			mod.setModel(cm);
			mod.setTarget(url);
			return mod;
		}
		return model;
	}
}
