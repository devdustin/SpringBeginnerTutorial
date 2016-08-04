package com.devdustin.springbeginnertutorial.dependencyinjection;

public class ExampleRunner {
	
	private InterfaceDependency interfaceDependency;
	
	// constructor injection
	public ExampleRunner(InterfaceDependency dependency) {
		dependency.setInjectionType("constructor");
		this.interfaceDependency = dependency;				
	}
	
	// setter injection
	public void setClassDependency(InterfaceDependency dependency) {
		dependency.setInjectionType("setter");
		this.interfaceDependency = dependency;	
	}

	public void run() {
		System.out.println("running...");
		System.out.println(String.format("Dependency injection that was used: %s", this.interfaceDependency.getInjectionType()));
	}

	public static void main(String[] args) {
		/* CONSTRUCTOR INJECTION */
		InterfaceDependency constructorInjectionDependency = new InterfaceDependencyImpl();
		
		// constructor dependency injection happens here
		ExampleRunner runner = new ExampleRunner(constructorInjectionDependency);
		
		runner.run();
		/* END CONSTRUCTOR INJECTION */
		
		/* SETTER INJECTION */
		InterfaceDependency setterInjectionDependency = new InterfaceDependencyImpl();		
		
		// setter dependency injection happens here
		runner.setClassDependency(setterInjectionDependency);
		
		runner.run();
		/* END SETTER INJECTION */
	}
}
