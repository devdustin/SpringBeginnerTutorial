package com.devdustin.dependencyinjectionwithspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DependencyInjectionWithSpring implements CommandLineRunner {
   
   @Autowired
   @Qualifier(value = "sunnyWeatherServiceImpl")
   private WeatherService weatherService;
   
   @Override    
   public void run(String... args) throws Exception {
	   weatherService.printWeather();
   }
}