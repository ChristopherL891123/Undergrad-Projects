package com.mycompany.comsc_1451_project;

// Lecture #15 - OOP 10/26/2021
// How to deal with inheritance and polymorphism in JAVA.
// All 4 students in attendance, Instrutor: Dr. Charles Thangaraj

// Here we are attempting to model a basic bike and its attributes
// In this file we will have the description of the base class ONLY
// There is NO PSVM - This class (file) is not meant for execution purposes but only 
// to serve as a base class for other executable classes.


import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;

// Base class use to describe the common attributes for any bike
// A Base class is a class that has the attributes that all objects of 
// classes that may use this as their base class should have

// Base or Root or Parent class are alternate names for a class that is meant for others to inherit
// Objects of a base class may never be created

public class MyBike_BaseClass
{
	// Public member (fellow) variables - inheritable
	public int maxSpeed; // What is the max speed the bike safely rated for
	public int numOfGears; // Number of gears the bike has 
	public String paintColor; // Frame color of the bike
	public String safetyFeatures; // Text that lists all the safety features
	public int currSpeed; // A variable to store the speed of a bike
	// Private member variables - non-inheritable, only base class objects/methods can assess these
	private int justAnExample;
	
	// Protected member variables - selectively-accessable
	protected int justAnOtherExample;
	
	// Constructor for MyBike
	public MyBike_BaseClass(int S, int G)
	{
		this.maxSpeed = S;
		this.numOfGears = G;
		this.currSpeed = 0;
		// The keyword this refers to itself i.e. the base class
	}
	
	// Constructor #2 for MyBike
	public MyBike_BaseClass(int S, int G, String C, String SF)
	{
		this.maxSpeed = S;
		this.numOfGears = G;
		this.currSpeed = 0;
		paintColor = C;
		safetyFeatures = SF;
		// The keyword this refers to itself i.e. the base class
	}
	
	// Constructor #3 for MyBike
	public MyBike_BaseClass(int S, int G, String C)
	{
		this.maxSpeed = S;
		this.numOfGears = G;
		this.currSpeed = 0;
		paintColor = C;
		safetyFeatures = "";
		// The keyword this refers to itself i.e. the base class
	}
        
        public void setMaxSpeed(int speed){
            this.maxSpeed = speed;
        }
        
        public void setNumofGears(int gears)
        {
        
            this.numOfGears = gears;
        }
        
        public void setCurrSpeed(int currspeed)
        {
        
            this.currSpeed = currspeed;
        }
        public void setpaintColor(String color)
        {
            this.paintColor = color;
        }
        public void setSafetyFeatures(String features)
        {
            this.safetyFeatures = features;
        }
	// Include some methods that are common for all the objects of this class 
	// as well as any class that uses this class as its base class
	
	// Public member methods
	// Accessable by objects of this class as well as objects of classes that use this as its base class
	// such classes aka derived classes and derived class objects
	
	public void applyBrake(int decrement)
	{
		if(this.currSpeed > 0)
			this.maxSpeed -= decrement;
	}
	
	public void speedUp(int increment)
	{
		if(this.currSpeed < this.maxSpeed)
			this.currSpeed += increment;
	}
	
	public String getInfo()
	{
		//System.out.print("No of gears: " + this.numOfGears + "\n" + "Max speed: " + this.maxSpeed + "\n" + "Paint Color: " + this.paintColor + "\n" + "Safety: " + this.safetyFeatures + "\n" );
		return("Basic Bike\nNo of gears: " + this.numOfGears + "\n" + "Max speed: " + this.maxSpeed + "\n" + "Paint Color: " + this.paintColor + "\n" + "Safety: " + this.safetyFeatures + "\n" );
	}
	
	
	// Private member methods
	// Accessable by objects of this (the base) class ONLY.
	
	
	// Protected member methods
	// Accessable by objects of this (the base) class and inherited class objects ONLY.
	
	
} // End public class MyBike_BaseClass
