package com.devdustin.springbeginnertutorial.dependencyinjection;

public class ExampleRunner {
	
	private ClassDependency classDependency;
	
	// constructor injection
	public ExampleRunner(ClassDependency dependency) {
		dependency.setInjectionType("constructor");
		this.classDependency = dependency;				
	}
	
	// setter injection
	public void setClassDependency(ClassDependency dependency) {
		dependency.setInjectionType("setter");
		this.classDependency = dependency;	
	}

	public void run() {
		System.out.println("running...");
		System.out.println(String.format("Dependency injection that was used: %s", this.classDependency.getInjectionType()));
	}

	public static void main(String[] args) {
		/* CONSTRUCTOR INJECTION */
		ClassDependency constructorInjectionDependency = new ClassDependency();
		
		// constructor dependency injection happens here
		ExampleRunner runner = new ExampleRunner(constructorInjectionDependency);
		
		runner.run();
		/* END CONSTRUCTOR INJECTION */
		
		/* SETTER INJECTION */
		ClassDependency setterInjectionDependency = new ClassDependency();
		setterInjectionDependency.setInjectionType("from setter");
		
		// setter dependency injection happens here
		runner.setClassDependency(setterInjectionDependency);
		
		runner.run();
		/* END SETTER INJECTION */
	}
}
