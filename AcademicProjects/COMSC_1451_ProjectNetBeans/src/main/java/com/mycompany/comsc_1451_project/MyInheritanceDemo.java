package com.mycompany.comsc_1451_project;

// Lecture #15 - OOP 10/26/2021
// How to deal with inheritance and polymorphism in JAVA.
// All 4 students in attendance, Instrutor: Dr. Charles Thangaraj

// Lecture #16 - OOP 10/28/2021
// How to deal with inheritance and polymorphism in JAVA.
// All 4 students in attendance, Instrutor: Dr. Charles Thangaraj

// Here we are attempting to model create objects of all the classes we have defined i.e. 
// Base class: MyBike_BaseClass
// Level 1 - inherited class: MyMountainBike_InheritedClass
// Level 1 - inherited class: MyRoadBike_InheritedClass
// Level 2 - inherited class: MyEBike (L1 - MyMountainBike)
// Level 2 - inherited (multiple) class: MyERoadBike (L1 - MyRoadBike, Interface: MyEBikeInterface)

// In Java we can have only one base class for any inherited class

import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;

// This class/file is intented to be a PSVM only class to test/demo creating objects 
// for the other classes we have written


class MyInheritanceDemo
{
	// This is a method that has been defined outside of the PSVM method
	// Also this is not a static method 
	// That means you cannot call this method directly from PSVM 
	// You will need to create an object of this class (MyInheritanceDemo) and then using that object can 
	// call this method.
	// A static method cannot call a non-static method
	public void testThisMethod(String nameIN)
	{
		System.out.print("Wow.. what were you thinking? " + nameIN);
	}
	
	
	public static void main(String args[])
	{
		// This is just to show how to call a method that has been defined outside of the PSVM method
		//MyInheritanceDemo ttt = new MyInheritanceDemo();
		//ttt.testThisMethod("Goof ball");

		MyBike_BaseClass basicBike01;
		
		basicBike01 = new MyBike_BaseClass(20,16,"Grey","Disk brakes, mirros, flat bar");
		
		System.out.println(basicBike01.getInfo());
		
		MyMountainBike_InheritedClass mountBike01;
		
		mountBike01 = new MyMountainBike_InheritedClass(4,false,true,10,24,"White","Alloy wheels, Mg paddles, crash gaurd");
		
		System.out.println(mountBike01.getInfo());		
		
		MyRoadBike_InheritedClass roadBike01;
		
		roadBike01 = new MyRoadBike_InheritedClass(30, 8, "Orange", "light weight alloy, suspension seats, race grips", true);
		
		System.out.println(roadBike01.getInfo());
		
		MyEBike_InheritedClass_L2 eBike01;
		
		eBike01 = new MyEBike_InheritedClass_L2(10, false, true, 20, 16, "Neon", "pedal assist, disk brakes", 75, "AGM", 50, 24, 1.5);
		
		System.out.println(eBike01.getInfo());
		
		MyERoadBike_InheritedClass_Multiple eRoadBike01;
		
		eRoadBike01 = new MyERoadBike_InheritedClass_Multiple(35,12,"Kappor Red", "Rechareable battery, GPS lock, regen brakes", false);
		
		System.out.println(eRoadBike01.getInfo());
		
		// Not allowed to change the variables when they are inherited from an Interface
		// For more info goto https://docs.oracle.com/javase/tutorial/java/IandI/index.html
		//eRoadBike01.rangeMiles = 95;
		//eRoadBike01.batteryType = "AGM";
		//eroadBike01.batteryVolt = 36;
		//eRoadBike01.batterySize = 12;
		//eRoadBike01.motorPower = 1.0;
		//System.out.println(eRoadBike01.getInfo());
		
	} // End PSVM
	
	
} // End class MyInheritanceDemo
