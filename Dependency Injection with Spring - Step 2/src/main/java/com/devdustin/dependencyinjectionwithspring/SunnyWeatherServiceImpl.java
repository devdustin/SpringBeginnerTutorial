package com.devdustin.dependencyinjectionwithspring;

import org.springframework.stereotype.Component;

@Component
public class SunnyWeatherServiceImpl implements WeatherService {
   @Override
   public void printWeather() {
      System.out.println("The weather is sunny with a 20% chance of rain");
   }
}
