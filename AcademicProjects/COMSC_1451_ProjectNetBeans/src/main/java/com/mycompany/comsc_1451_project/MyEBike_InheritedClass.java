package com.mycompany.comsc_1451_project;

// Lecture #16 - OOP 10/28/2021
// How to deal with inheritance and polymorphism in JAVA.
// All 4 students in attendance, Instrutor: Dr. Charles Thangaraj

// Here we are attempting to model an E-bike and its attributes
// We will inherit some of the basic properties of a bike from the base class (i.e. MyBike_BaseClass) and
// extend it as we see fit and crate a new class (i.e. the inherited class).

import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;

// Inherited class from a Inhertites class - level 2 (multi-level inheritance)
// Base class/super class/parent class: MyMountainBike_InhertitedClass
// Inherited class: MyEBike_InhertitedClass_L2

class MyEBike_InheritedClass_L2 extends MyMountainBike_InheritedClass
{
	
	 int rangeMiles;
	 String batteryType; // Li-ion, NiMH, SLA, AGM
	 int batterySize; // Amp-hour
	 int batteryVolt; // System operating volts 12/ 24/ 36/ 48 V
	 double motorPower; // In kilo Watts 0.5, 1.0, 1.5, 2.0 kW
	
	// Construtor 
	
	public MyEBike_InheritedClass_L2(int SH, boolean FS, boolean FPT, int S, int G, String C, String SF, int RM, String BTy, int BSz, int BVt, double MP)
	{
		// First line must be the call to the parent class's constructor
		super(SH, FS, FPT, S, G, C, SF);
		
		this.rangeMiles = RM;
		this.batteryType = BTy;
		this.batterySize = BSz;
		this.batteryVolt = BVt;
		this.motorPower = MP;	
		
	}
	
	// Setters and Getters
	// AKA Interface methods and these must be public
	
	public int getRange()
	{
		return rangeMiles;
	}

	public int setRange(int R)
	{
		rangeMiles = R;
		return 1;
	}
	
	public String getBattInfo()
	{
		String temp = ("\nBattery type: " + batteryType + "\nBattery size in Ah: " + batterySize + "\nBattery voltage: " + batteryVolt);
		return (temp);
	}

	public int setBattInfo(String BTY, int BSZ, int BVT)
	{
		batteryType = BTY;
		batterySize = BSZ;
		batteryVolt = BVT;
		return 1;
	}
	
	public double getKW()
	{
		return motorPower;
	}

	public int setKW(double PW)
	{
		motorPower = PW;
		return 1;
	}
	
	// Methods
	
	public String getInfo()
	{
		return("E-Bike\nNo of gears: " + this.numOfGears + "\n" + "Max speed: " + this.maxSpeed + "\n" + "Paint Color: " + this.paintColor + "\n" + "Safety: " + this.safetyFeatures + "\n" + "Seat height: " + this.getSeatHeight()  + "\n" + "Full Suspension: " + this.isFullSuspension() + "\n" + "Flat Proof Tyres: " + this.isFlatProof() + "\n" + "Range in miles: " + this.getRange() + this.getBattInfo() + "\nMotor capacity kW: " + this.getKW());
			
	}
	
} // End class MyEBike_InheritedClass_L2
