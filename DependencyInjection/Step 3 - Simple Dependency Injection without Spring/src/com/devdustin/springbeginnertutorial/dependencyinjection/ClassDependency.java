package com.devdustin.springbeginnertutorial.dependencyinjection;

public class ClassDependency {
	
	private String injectionType;
		
	public void printInjectionType() {
		System.out.println("running class dependency method...injection type is " + injectionType);
	}
	
	public String getInjectionType() {
		return injectionType;
	}
	
	public void setInjectionType(String injectionType) {
		this.injectionType = injectionType;
	}
}
