package com.devdustin.springbeginnertutorial.dependencyinjection;

public class ExampleRunner {
	
	private DependencyOfExampleRunner dependency;
	
	public void run() {
		System.out.println("running...");
		
		// instantiate dependency
		dependency = new DependencyOfExampleRunner();
		// call method on dependency
		dependency.dependencyMethod();
	}
		
	public static void main(String[] args) {
		ExampleRunner runner = new ExampleRunner();		
		runner.run();
	}
}
