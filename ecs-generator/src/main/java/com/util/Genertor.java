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

import com.model.GenertorModel;

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
	public void configuration(GenertorModel model) {
		try {
			LOGGER.info("反向生成开始...");
			List<String> warnings = new ArrayList<String>();
			boolean overwrite = true;
			Configuration config = new Configuration();
			config.addContext(GenertotFactory.getConfiguration(model));
			DefaultShellCallback callback = new DefaultShellCallback(overwrite);
			MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,	callback, warnings);
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
