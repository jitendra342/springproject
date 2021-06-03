package com.capgemini.springbootnewproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 @Spri*/
@SpringBootApplication
public class App 
{
    public static void main(String[] args)
    {
    	SpringApplication.run(App.class, args);
    	
    	Sample sample = new Sample();
    	sample.m1();
    	SampleFirst.m2();
    	SampleSecond.m3();
    	SampleThird.m3();
    	
    }
    
}
