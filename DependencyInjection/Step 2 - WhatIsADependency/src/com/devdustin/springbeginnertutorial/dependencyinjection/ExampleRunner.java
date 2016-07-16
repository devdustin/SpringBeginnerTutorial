package com.devdustin.springbeginnertutorial.dependencyinjection;

public class ExampleRunner {
	
	private ClassDependency dependency;
	private InterfaceDependency interfaceDependency;
	
	public void run() {
		System.out.println("running...");
		
		// instantiate class dependency
		dependency = new ClassDependency();
		// call method on class dependency
		dependency.classMethod();
		// field dependency
		dependency.setField("field value");
		System.out.println(String.format("The value of the field in class dependency is '%s'...", dependency.getField()));
		
		// instantiate interface dependency
		interfaceDependency = new InterfaceDependencyImpl();
		// call method on interface dependency
		interfaceDependency.interfaceMethod();
		
		dependencyInMethod(dependency);
	}
	
	private void dependencyInMethod(ClassDependency dependency) {
		dependency.classMethod();
	}
		
	public static void main(String[] args) {
		ExampleRunner runner = new ExampleRunner();		
		runner.run();
	}
}
