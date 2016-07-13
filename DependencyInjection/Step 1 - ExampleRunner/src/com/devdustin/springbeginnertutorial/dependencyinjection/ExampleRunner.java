package com.devdustin.springbeginnertutorial.dependencyinjection;

public class ExampleRunner {
	
	public void run() {
		System.out.println("running...");
	}
		
	public static void main(String[] args) {
		ExampleRunner runner = new ExampleRunner();		
		runner.run();
	}
}
