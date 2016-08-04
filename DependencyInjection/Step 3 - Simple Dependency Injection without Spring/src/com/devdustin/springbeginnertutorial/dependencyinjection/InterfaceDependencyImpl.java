package com.devdustin.springbeginnertutorial.dependencyinjection;

public class InterfaceDependencyImpl implements InterfaceDependency {
	private String injectionType;
	
	public void interfaceMethod() {
		System.out.println("running interface dependency method...");
	}

	public String getInjectionType() {
		return injectionType;
	}

	public void setInjectionType(String injectionType) {
		this.injectionType = injectionType;
	}
}
