package com.devdustin.springbeginnertutorial.dependencyinjection;

public class ExampleRunner {
	
	private ClassDependency classDependency;
	
	// constructor injection
	public ExampleRunner(ClassDependency dependency) {
		this.classDependency = dependency;
	}
	
	// setter injection
	public void setClassDependency(ClassDependency dependency) {
		this.classDependency = dependency;
	}

	public void run() {
		System.out.println("running...");
		
		this.classDependency.printInjectionType();
	}

	public static void main(String[] args) {
		/* CONSTRUCTOR INJECTION */
		ClassDependency constructorInjectionDependency = new ClassDependency();
		constructorInjectionDependency.setInjectionType("from constructor");

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
