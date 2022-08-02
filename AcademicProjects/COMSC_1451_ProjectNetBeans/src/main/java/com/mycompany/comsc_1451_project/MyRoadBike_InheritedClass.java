package com.mycompany.comsc_1451_project;

// Lecture #16 - OOP 10/28/2021
// How to deal with inheritance and polymorphism in JAVA.
// All 4 students in attendance, Instrutor: Dr. Charles Thangaraj

// Here we are attempting to model a road bike and its attributes
// We will inherit some of the basic properties of a bike from the base class (i.e. MyBike_BaseClass) and
// extend it as we see fit and crate a new class (i.e. the inherited class).

import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;

// Inherited class from Base class
// Base class/super class/parent class: MyBike_BaseClass
// Inherited class: MyRoadBike_InhertitedClass 

class MyRoadBike_InheritedClass extends MyBike_BaseClass
{
	static boolean flatHandleBar;
	
	// Getter
	public boolean isFlatHandleBar()
	{
		return flatHandleBar;
	}
	
	// Setter
	public void setFlatHandleBar(boolean type)
	{
		flatHandleBar = type;
	}
        
       
	
	// Constructor 
	public MyRoadBike_InheritedClass(int S, int G, String C, String SF, boolean HBT)
	{
		super(S,G,C,SF); // Calling the base class' constructor
		this.flatHandleBar = HBT;		
	}
	
	
	// Methods 
	
	public String getInfo()
	{	
		return("Road Bike\nNo of gears: " + this.numOfGears + "\n" + "Max speed: " + this.maxSpeed + "\n" + "Paint Color: " + this.paintColor + "\n" + "Safety: " + this.safetyFeatures + "\n" + "Flat Handle Bar: " + this.flatHandleBar + "\n");
	}
	
	
} // End class MyRoadBike_InhertitedClass

