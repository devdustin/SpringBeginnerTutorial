package com.devdustin.dependencyinjectionwithspring;

import org.springframework.stereotype.Component;

@Component
public class CloudyWeatherServiceImpl implements WeatherService {
   @Override
   public void printWeather() {
      System.out.println("The weather is cloudy with a 90% chance of rain");
   }
}
