package com.devdustin.springbeginnertutorial.dependencyinjection;

public class ClassDependency {
	
	private String field;
		
	public void classMethod() {
		System.out.println("running class dependency method...");
	}
	
	public String getField() {
		return field;
	}
	
	public void setField(String field) {
		this.field = field;
	}
}
