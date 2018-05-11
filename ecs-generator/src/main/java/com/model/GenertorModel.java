package com.model;

public class GenertorModel {
	
	private String  target;

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}
	
	public  String  getProjectTarger(){
		String   project_url="/src/main/java";
		
		return target+project_url;
	}
	
}
