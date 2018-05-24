package com.util;

import java.util.ArrayList;
import java.util.List;

public class GenConstants {
	/**
	 * 基础连接信息
	 */
	public static  final String  db_driver="com.mysql.jdbc.Driver";
	public static  final String  db_name="root";
	public static  final String  db_password="uAiqwVwjJ8-i";
	public static  final String  db_URL="jdbc:mysql://39.104.93.155:3306/24h";
	
	/**
	 * 路径名
	 */
	public static final String  PATH_FILE_NAME="path.txt";
	public static final String  PATH_KEY_TARGER="target";
	public static final String  PATH_FILE_NAME_CLASSSESS="classes";
	public static final String  PATH_FILE_ECS_GENERATOR="ecs-generator";
	
	
	/**
	 * 配置信息
	 */
	public static final String  DRIVER_JAR_PATH="lib/mysql-connector-java-5.1.6.jar";
	
	
	/**
	 * 生成文件配置信息
	 * @return
	 */
	public static final String  PACKAGE_ENTITY="com.ycb.entity";
	public static final String  PACKAGE_XML="com.ycb.mapping";
	public static final String  PACKAGE_DAO="com.ycb.dao";

	
	/**
	 * 项目名称
	 * @return
	 */
	public static final String  PROJECT_NAME="ecs-generator";
	public static final String  PROJECT_DAO="ecs-dao/src/main/java";

	
	public static List<String> keyList(){
		List<String> list=new ArrayList<String>();
		list.add(PATH_KEY_TARGER);
		list.add(PATH_FILE_NAME_CLASSSESS);
		list.add(PATH_FILE_ECS_GENERATOR);
		return list;
	}
}
