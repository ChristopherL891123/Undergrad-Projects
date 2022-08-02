package com.mycompany.comsc_1451_project;

// Lecture #17 - OOP 11/2/2021
// How to deal with inheritance and polymorphism in JAVA.
// All 4 students in attendance, Instrutor: Dr. Charles Thangaraj

// Here we are attempting to model a road E-bike and its attributes
// We will inherit some of the basic properties of a bike from the base class (i.e. MyRoadBike_InheritedClass) and
// will implement (i.e. the inherit) some properties from the MyEBikeInterface which is an interface defined for 
// the MyEBike_Inherited class.

import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;

// Inherited class from multiple classes
// Base class/super class/parent class: MyRoadBike_InhertitedClass
// Interface class: MyEBike_InhertitedClass_L2

// We cannot create objects for an interface, it is simply ment for being implemented "inherited" by other classes
// Type of a class, but it does not contain any actual code other then simple declarations
// The interiting class must then implement i.e. define the functionality for methods in the interface

interface MyEBike_InhertitedClass_L2_Interface
{
	// These are the desired (i.e. to inherit from the MyEBike_InhertitedClass_L2 class) properties 
	// Make these variables the same name as the original class variable names
	
	public int rangeMiles = 0;
	public String batteryType = "Null"; // Li-ion, NiMH, SLA, AGM
	public int batterySize = 25; // A-h
	public int batteryVolt = 12; // 12 or 24 or 36 or 48
	public double motorPower = 0.5; // In kW 
		
	// Any method declared here MUST NOT have any method body inside the interface
	// The class that is implementing this interface has to declare the contents for this method
	public String getInfo();

}

interface MyEBike_InhertitedClass_L2_Interface2
{
	// These are the desired (i.e. to inherit from the MyEBike_InhertitedClass_L2 class) properties 
	// Make these variables the same name as the original class variable names
	
	public int rangeMiles = 100;
	public String batteryType = "Null"; // Li-ion, NiMH, SLA, AGM
	public int batterySize = 25; // A-h
	public int batteryVolt = 12; // 12 or 24 or 36 or 48
	public double motorPower = 0.5; // In kW 
		
	// Any method declared here MUST NOT have any method body inside the interface
	// The class that is implementing this interface has to declare the contents for this method
	public String getInfo();

}


interface MyTestInterface
{
	public String canImplementMultipleInterfaces = "Null - test String";
	public void justAnExampleForPMType2();
	
} // End interface MyEBikeInterface


class MyERoadBike_InheritedClass_Multiple extends MyRoadBike_InheritedClass implements MyEBike_InhertitedClass_L2_Interface, MyTestInterface
{
	// constructor
	public MyERoadBike_InheritedClass_Multiple(int S, int G, String C, String SF, boolean HBT)
	{
		super(S,G,C,SF,HBT);
		super.getInfo();
	}
	
	
	//To overcome the final value problem for interface variables
	public int rangeMiles;
	public String batteryType; // Li-ion, NiMH, SLA, AGM
	public int batterySize; // A-h
	public int batteryVolt; // 12 or 24 or 36 or 48
	public double motorPower; // In kW 
	
	
	// This method is overriding the base class's getInfo() -- this is the first type of Polymorphism
	// That is: an inherited method being overridden by the inhertited class
	public String getInfo()
	{
		//return ("\nDemo for the interface's method being defined in the inherited class\n");
		return("\nE-Road-Bike\nNo of gears: " + this.numOfGears + "\n" + "Max speed: " + this.maxSpeed + "\n" + "Paint Color: " + this.paintColor + "\n" + "Safety: " + this.safetyFeatures + "\n" + "Flat Handle Bar: " + this.isFlatHandleBar() + "\nRange: " + this.rangeMiles + "\nBattery Type: " + this.batteryType + "\nBattery Volt: " + this.batteryVolt + "\nBattery Size: " + this.batterySize + "\nMotor Power: " + this.motorPower + "\n");   	
	}
        
        public void setERproperties(int range, String battType, int battSz, double mP, int voltage)
        {
            this.rangeMiles = range;
            this.batteryType = battType;
            this.batterySize = battSz;
            this.motorPower = mP;
            this.batteryVolt = voltage;
        }
	
	public void testInterfaceDemo()
	{
		System.out.print("\n" + this.canImplementMultipleInterfaces + "\n");
	}
	
	// This method is overriding the base class's getInfo() -- this is the second type of Polymorphism
	// That is: an implemented interface method being defined by the inhertited class
	public void justAnExampleForPMType2()
	{
		System.out.print("\nThis method is just to show that a method declared in the interface can be overridden\n");
	}
	
} // Ends class MyERoadBike_InheritedClass_Multiple

