package com.mycompany.comsc_1451_project;

// Lecture #15 - OOP 10/26/2021
// How to deal with inheritance and polymorphism in JAVA.
// All 4 students in attendance, Instrutor: Dr. Charles Thangaraj

// Here we are attempting to model a mountain bike and its attributes
// We will inherit some of the basic properties of a bike from the base class (i.e. MyBike_BaseClass) and
// extend it as we see fit and crate a new class (i.e. the inherited class).

import java.lang.*;

// Inherited class from Base class
// Base class/super class/parent class: MyBike_BaseClass
// Inherited class: MyMountainBike_InhertitedClass 

public class MyMountainBike_InheritedClass extends MyBike_BaseClass
{
	// public int seatHeight;
	// public boolean fullSuspension;
	// public boolean flatProofTyres;
	
	// Changed these to private to allow for getter and setter method access only 
	// If I expect this class to not serve as a base class for another inherited class
	// Then I can make all variable of this class private and allow access to those variable 
	// via the Interface methods (getters and setters)
	 int seatHeight;
	 boolean fullSuspension;
	 boolean flatProofTires;
	
	// Consturctor for the MyMountainBike inherited class
	public MyMountainBike_InheritedClass(int SH, boolean FS, boolean FPT, int S, int G, String C, String SF)
	{
		// Passing the base class parameters to the base class constructor
		// super is a keyword that refers to the base class
		// Make sure this is the first line in any inherited class constructor
		super(S,G,C,SF);
		
		this.seatHeight = SH;
		this.fullSuspension = FS;
		this.flatProofTires = FPT;
		
		//super.maxSpeed = 243;
		//super.justAnExample = 3; // calling a base class private variable - ERROR
		//super.justAnOtherExample = 4; // calling a base class protected variable		
	}
	
        
        
        
	// Setters and Getters
	// AKA Interface methods and these must be public
	
	// As we do not want direct access to class variable, we want to provide an interface for 
	// others to assess the values of class variable (public or protected) by declaring them as private and 
	// defining the getter and setter methods
	
	//Getters
	
	public int getSeatHeight()
	{
		return seatHeight;
	}
	
	public boolean isFullSuspension()
	{
		return fullSuspension;
	}
	
	public boolean isFlatProof()
	{
		return flatProofTires;
	}
	
	// Setter
        
        
	public void setSeatHeight(int SH)
	{
		seatHeight = SH;
	}
	
	public void setSuspension(boolean FS)
	{
		fullSuspension = FS;
	}
	
	public void setFlatProof(boolean FPT)
	{
		flatProofTires = FPT;
	}
	
	// Over-riding != Polymorphism
	// Over-riding the base class method to update it specifically to this inherited class
	
	public String getInfo()
	{
		//System.out.print("No of gears: " + this.numOfGears + "\n" + "Max speed: " + this.maxSpeed + "\n" + "Paint Color: " + this.paintColor + "\n" + "Safety: " + this.safetyFeatures + "\n" );
		//System.out.print("Seat height: " + this.getSeatHeight()  + "\n" + "Full Suspension: " + this.isFullSuspension() + "\n" + "Flat Proof Tyres: " + this.isFlatProof() + "\n");
		
		return("Mountain Bike\nNo of gears: " + this.numOfGears + "\n" + "Max speed: " + this.maxSpeed + "\n" + "Paint Color: " + this.paintColor + "\n" + "Safety: " + this.safetyFeatures + "\n" + "Seat height: " + this.getSeatHeight()  + "\n" + "Full Suspension: " + this.isFullSuspension() + "\n" + "Flat Proof Tyres: " + this.isFlatProof() + "\n");
		
	}
	
	// super.getInfo(); This would explicitly call the base classes's version of getInf0()
	// this.getInfor(); This would call the newly over-ridden method description written here in the inherited class
	
} // public class MyMountainBike_InhertitedClass 
