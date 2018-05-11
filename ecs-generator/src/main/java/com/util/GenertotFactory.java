package com.util;

import org.mybatis.generator.config.CommentGeneratorConfiguration;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.Context;
import org.mybatis.generator.config.JDBCConnectionConfiguration;
import org.mybatis.generator.config.JavaClientGeneratorConfiguration;
import org.mybatis.generator.config.JavaModelGeneratorConfiguration;
import org.mybatis.generator.config.JavaTypeResolverConfiguration;
import org.mybatis.generator.config.PluginConfiguration;
import org.mybatis.generator.config.SqlMapGeneratorConfiguration;

import com.model.GenertorModel;

/**
 * 
 * @author chenghui
 *
 */
public class GenertotFactory {
	
	
	public static  Context  getConfiguration(GenertorModel model){
		Context  context=new Context(null);
		context.setId("dsql");
		context.setTargetRuntime("MyBatis3DynamicSql");
		JDBCConnectionConfiguration  jdbcConnnection=new JDBCConnectionConfiguration();
		jdbcConnnection.setConnectionURL(GenConstants.db_URL);
		jdbcConnnection.setDriverClass(GenConstants.db_driver);
		jdbcConnnection.setPassword(GenConstants.db_name);
		jdbcConnnection.setUserId(GenConstants.db_password);
		context.setJdbcConnectionConfiguration(jdbcConnnection);
		JavaTypeResolverConfiguration  javaTypeResolverConfiguration=new  JavaTypeResolverConfiguration();
		javaTypeResolverConfiguration.addProperty("forceBigDecimals", "false");
		context.setJavaTypeResolverConfiguration(javaTypeResolverConfiguration);
		SqlMapGeneratorConfiguration  sqlmap=new SqlMapGeneratorConfiguration();
		sqlmap.setTargetPackage("com.ycb.mapping");
		sqlmap.setTargetProject(model.getProjectTarger());
		sqlmap.addProperty("enableSubPakages", "true");
		context.setSqlMapGeneratorConfiguration(sqlmap);
		
		JavaClientGeneratorConfiguration  javaClientGenerator=new JavaClientGeneratorConfiguration();
		javaClientGenerator.addProperty("enableSubPackages", "true");
		javaClientGenerator.setConfigurationType("XMLMAPPER");
		javaClientGenerator.setTargetPackage("com.ycb.dao");
		javaClientGenerator.setTargetProject(model.getProjectTarger());
		context.setJavaClientGeneratorConfiguration(javaClientGenerator);
		
		JavaModelGeneratorConfiguration  javaModelGeneratorConfiguration =new JavaModelGeneratorConfiguration();
		javaModelGeneratorConfiguration.setTargetPackage("com.ycb.entity");
		javaModelGeneratorConfiguration.setTargetProject(model.getProjectTarger());
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
		context.addPluginConfiguration(pluginConfiguration2);
		context.addPluginConfiguration(pluginConfiguration3);
		return context;
	}
	
	
}
