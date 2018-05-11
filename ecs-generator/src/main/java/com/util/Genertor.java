package com.util;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.CommentGeneratorConfiguration;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.Context;
import org.mybatis.generator.config.JDBCConnectionConfiguration;
import org.mybatis.generator.config.JavaClientGeneratorConfiguration;
import org.mybatis.generator.config.JavaModelGeneratorConfiguration;
import org.mybatis.generator.config.JavaTypeResolverConfiguration;
import org.mybatis.generator.config.PluginConfiguration;
import org.mybatis.generator.config.SqlMapGeneratorConfiguration;
import org.mybatis.generator.internal.DefaultShellCallback;

/**
 * 生成工具类
 * 
 * @author chenghui
 *
 */
public class Genertor {

	private static final Log LOGGER = LogFactory.getLog(Genertor.class);

	/**
	 * 
	 */
	public void configuration() {
		try {
			LOGGER.info("反向生成开始...");
			List<String> warnings = new ArrayList<String>();
			boolean overwrite = true;
			Configuration config = new Configuration();
			Context  context=new Context(null);
			context.setId("dsql");
			context.setTargetRuntime("MyBatis3DynamicSql");
			JDBCConnectionConfiguration  jdbcConnnection=new JDBCConnectionConfiguration();
			jdbcConnnection.setConnectionURL("jdbc:mysql://10.120.24.75:3306/btcp");
			jdbcConnnection.setDriverClass("com.mysql.jdbc.Driver");
			jdbcConnnection.setPassword("lenovo2015");
			jdbcConnnection.setUserId("sys_temp");
			context.setJdbcConnectionConfiguration(jdbcConnnection);
			JavaTypeResolverConfiguration  javaTypeResolverConfiguration=new  JavaTypeResolverConfiguration();
			javaTypeResolverConfiguration.addProperty("forceBigDecimals", "false");
			context.setJavaTypeResolverConfiguration(javaTypeResolverConfiguration);
			
			SqlMapGeneratorConfiguration  sqlmap=new SqlMapGeneratorConfiguration();
			sqlmap.setTargetPackage("com.lenovo.vorak.dao.vorak.mapping");
//			sqlmap.setTargetProject("D:\vorak\vorak\vorak-core\src\main\resources");
			sqlmap.addProperty("enableSubPakages", "true");
			context.setSqlMapGeneratorConfiguration(sqlmap);
			
			JavaClientGeneratorConfiguration  javaClientGenerator=new JavaClientGeneratorConfiguration();
			javaClientGenerator.addProperty("enableSubPackages", "true");
			javaClientGenerator.setConfigurationType("XMLMAPPER");
			javaClientGenerator.setTargetPackage(null);
			javaClientGenerator.setTargetProject(null);
			context.setJavaClientGeneratorConfiguration(javaClientGenerator);
			
			JavaModelGeneratorConfiguration  javaModelGeneratorConfiguration =new JavaModelGeneratorConfiguration();
			javaModelGeneratorConfiguration.setTargetPackage("com.lenovo.btcp.entity");
			javaModelGeneratorConfiguration.setTargetProject("");
			javaModelGeneratorConfiguration.addProperty("enableSubPackages", "true");
			javaModelGeneratorConfiguration.addProperty("trimStrings", "true");
			context.setJavaModelGeneratorConfiguration(javaModelGeneratorConfiguration);
			
			CommentGeneratorConfiguration  commentGeneratorConfiguration=new CommentGeneratorConfiguration();
			commentGeneratorConfiguration.addProperty("suppressDate", "true");
			commentGeneratorConfiguration.addProperty("suppressAllComments", "true");
			context.setCommentGeneratorConfiguration(commentGeneratorConfiguration);
			
			
			PluginConfiguration pluginConfiguration=new PluginConfiguration();
			pluginConfiguration.setConfigurationType("org.mybatis.generator.plugins.PaginationPlugin");
			PluginConfiguration pluginConfiguration2=new PluginConfiguration();
			pluginConfiguration.setConfigurationType("org.mybatis.generator.plugins.CustomOrCriteriaPlugin");
			PluginConfiguration pluginConfiguration3=new PluginConfiguration();
			pluginConfiguration.setConfigurationType("org.mybatis.generator.plugins.RenameExampleClassPlugin");
			pluginConfiguration3.addProperty("searchString", "Example$");
			pluginConfiguration3.addProperty("replaceString", "Criteria");
			context.addPluginConfiguration(pluginConfiguration);
			
			config.addContext(context);
			DefaultShellCallback callback = new DefaultShellCallback(overwrite);
			MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,
					callback, warnings);
			myBatisGenerator.generate(null);
			LOGGER.info("反向生成结束...");
		} catch (Exception e) {
			LOGGER.info("反向生成异常");
			LOGGER.error(e.getMessage(),e);
		}
	}
	
	private   void copyProperty(){
		
	}
}
