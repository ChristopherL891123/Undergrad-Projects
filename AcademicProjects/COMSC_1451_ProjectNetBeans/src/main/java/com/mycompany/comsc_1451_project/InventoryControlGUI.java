package com.mycompany.comsc_1451_project;

import static com.mycompany.comsc_1451_project.Add_Road_Bike.submitButton_RoadBike_clicked;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import com.mycompany.comsc_1451_project.MyMountainBike_InheritedClass;
import java.util.HashSet;
import java.util.Set;
public class InventoryControlGUI {
    
    
	//for add menu for basic bike
	static int sp_r_BasicBike_add;
	static int gtr_s_BasicBike_add;
	static String paint_BasicBike_add;
	static String s_sf_BasicBike_add;

	//for add menu for mountain bike
	static int sp_r_MountainBike_add;
	static int gtr_s_MountainBike_add;
	static String paint_MountainBike_add;
	static String s_sf_MountainBike_add;
	static int sh_MountainBike_add;
	static boolean fpt_MountainBike_add;
	static boolean fs_MountainBike_add;


	//for add menu for road bike
	static int sp_r_RoadBike_add;
	static int gtr_s_RoadBike_add;
	static String paint_RoadBike_add;
	static String s_sf_RoadBike_add;
	static boolean hbt_RoadBike_add;

	//for add menu for e bike
	 static int sp_r_EBike_add;
	 static int gtr_s_EBike_add;
	 static String paint_EBike_add;
	 static String s_sf_EBike_add;
	 static int sh_EBike_add;
	 static boolean fpt_EBike_add;
	 static boolean fs_EBike_add;
	 static int rm_Ebike_add;
	 static String bty_EBike_add;
	 static int bsz_EBike_add;
	 static int bvt_EBike_add;
	 static double mp_EBike_add;


	//for add menu for electric road bike(road + fixed? values in the interfaces defined in myERoadBike) this class doesn't use all the features of eBike(such as the ones derived from its super, mountainBike)
	 static int sp_r_ERoadBike_add;
	 static int gtr_s_ERoadBike_add;
	 static String paint_ERoadBike_add;
	 static String s_sf_ERoadBike_add;
	 static boolean hbt_ERoadBike_add;
         static int rm_ERoadBike_add;
         static String bty_ERoadBike_add;
         static int bsz_ERoadBike_add;
         static int bvt_ERoadBike_add;
         static double mp_ERoadBike_add;
         static int rm_ERoadbike_add;
	

//for delete menu 
         
         //for basic bike delete menu
         public static int  targetDelete_basicBike;
         public static String confirm_basicBike;
         
         //for mountain bike delete menu
         
         public static int  targetDelete_MBike;
         public static String confirm_MBike;
         

//for road bike delete
         public static int  targetDelete_RBike;
         public static String confirm_RBike;
         
//for e bike delete
         public static int  targetDelete_EBike;
         public static String confirm_EBike;

//for e road bike delete
         public static int  targetDelete_ERBike;
         public static String confirm_ERBike;
         
         
         
         
         //for search bikes
           static int type;
            //for seach basic bike
            
                public static int target_Speed;
                static int target_Gears;
                static String target_Color;
                static String target_Keyword;
                
                //for mountain bike search
                
                static int target_seatHeight;

                //for road bike search
                static boolean target_flatHandlebar;
                
                
                
                // for search e bike
                static int target_rangeMiles;
                static String target_batteryType; // Li-ion, NiMH, SLA, AGM
                static int target_batterySize; // Amp-hour
                static int target_batteryVolt; // System operating volts 12/ 24/ 36/ 48 V
                static double target_motorPower; // In kilo Watts 0.5, 1.0, 1.5, 2.0 kW
                
                
                //for edit menu
                
                //for edit basic bike
                
                   static int sp_r_BasicBike_add_EditMenu;
                    static int tr_s_BasicBike_add_EditMenu;
                    static int gtr_s_BasicBike_add_EditMenu;
                   static String paint_BasicBike_add_EditMenu;
                    static String s_sf_BasicBike_add_EditMenu;
                    //for edit mountain bike 
                    
                    
        static int sp_r_MountainBike_add_EditMenu;
        static int gtr_s_MountainBike_add_EditMenu;
        static String paint_MountainBike_add_EditMenu;
        static String s_sf_MountainBike_add_EditMenu;
        static int sh_MountainBike_add_EditMenu;
        static boolean fpt_MountainBike_add_EditMenu;
        static boolean fs_MountainBike_add_EditMenu;
        
        //for road bike
        
        static boolean hbt_RoadBike_add_EditMenu;
        
        //for e bike
        
        static int rm_Ebike_add_EditMenu ;
        static String bty_EBike_add_EditMenu;
        static int bsz_EBike_add_EditMenu;
        static int bvt_EBike_add_EditMenu;
        static double mp_EBike_add_EditMenu;
        
        //for e road bike
//-----------------------------------------//
	// Global Variables                                                           //
	//----------------------------------------------------------------------------//

	static final int MAX_INVENTORY_SIZE = 250;
	// This is the max capacity on the shop floor for inventory for all types of bike

	static final int MAX_INVENTORY_SIZE_PER_TYPE = 100;
	// This is the max capacity on the shop floor for inventory for a type of bike
	// We can use this to create arrays to hold the objects i.e. an abstract entry in software for an actual physical
	// bike on the shop floor.

	static boolean verbose_mode = false;
	// Switch that can make the program work silently

	//----------------------------------------------------------------------------//
	// Creating underlying arrays for data entry                                   //



	// BasicBikeInventory
	static MyBike_BaseClass[] myBasicBikeInventory = new MyBike_BaseClass[MAX_INVENTORY_SIZE_PER_TYPE];

	// MountainBikeInventory
	static MyMountainBike_InheritedClass[] myMountainBikeInventory = new MyMountainBike_InheritedClass[MAX_INVENTORY_SIZE_PER_TYPE];

	// RoadBikeInventory
	static MyRoadBike_InheritedClass[] myRoadBikeInventory = new MyRoadBike_InheritedClass[MAX_INVENTORY_SIZE_PER_TYPE];

	// EBikeInventory
	static MyEBike_InheritedClass_L2[] myEBikeInventory = new MyEBike_InheritedClass_L2[MAX_INVENTORY_SIZE_PER_TYPE];

	//ERoadBikeInventory
	static MyERoadBike_InheritedClass_Multiple[] myERoadBikeInventory = new MyERoadBike_InheritedClass_Multiple[MAX_INVENTORY_SIZE_PER_TYPE];

	public static void InitInventories()
	{
		 MyBike_BaseClass[] myBasicBikeInventory = new MyBike_BaseClass[MAX_INVENTORY_SIZE_PER_TYPE];

	// MountainBikeInventory
	 MyMountainBike_InheritedClass[] myMountainBikeInventory = new MyMountainBike_InheritedClass[MAX_INVENTORY_SIZE_PER_TYPE];

	// RoadBikeInventory
	 MyRoadBike_InheritedClass[] myRoadBikeInventory = new MyRoadBike_InheritedClass[MAX_INVENTORY_SIZE_PER_TYPE];

	// EBikeInventory
	 MyEBike_InheritedClass_L2[] myEBikeInventory = new MyEBike_InheritedClass_L2[MAX_INVENTORY_SIZE_PER_TYPE];

	//ERoadBikeInventory
	 MyERoadBike_InheritedClass_Multiple[] myERoadBikeInventory = new MyERoadBike_InheritedClass_Multiple[MAX_INVENTORY_SIZE_PER_TYPE];

	}

	public static void PopulateInventories()
	{
		for (int i = 0; i < MAX_INVENTORY_SIZE_PER_TYPE; i++) {
			myBasicBikeInventory[i] = new MyBike_BaseClass(0, 0, "Null", "Null");

			myMountainBikeInventory[i] = new MyMountainBike_InheritedClass(0, false, false, 0, 0, "Null", "Null");

			myRoadBikeInventory[i] = new MyRoadBike_InheritedClass(0, 0, "Null", "Null", false);

			myEBikeInventory[i] = new MyEBike_InheritedClass_L2(0, false, false, 0, 0, "Null", "Null", 0, "Null", 0, 0, 0.0);

			myERoadBikeInventory[i] = new MyERoadBike_InheritedClass_Multiple(0, 0, "Null", "Null", false);

		}
	}


	// add methods go here

	static void addToBasicBikeInventory(MyBike_BaseClass[] arr, boolean verbose, int arr_max_size)
	//adds just one bike at a time, the for loop checks if the bike is null and if it is null, it stores its location and then proceeds to construct a new obj of the bike
	//with the parameters provided in the function call, and places it in the place of the null bike.
	{
		int i;
		boolean bool_val = false;
		int tmp = 9999;
		int S;
		int G;
		String C;
		String SF;

		S = sp_r_BasicBike_add;

		G = gtr_s_BasicBike_add;

		C = paint_BasicBike_add;

		SF = s_sf_BasicBike_add;


		for (i = 0; i < arr_max_size; i++) {
			if ( (arr[i].maxSpeed == 0) && (arr[i].numOfGears == 0) && (arr[i].paintColor.equals("Null")) && (arr[i].safetyFeatures.equals("Null"))) {
				tmp = i;
				break;
			}
		}

		if (tmp < 100){
			arr[tmp] = new MyBike_BaseClass(S, G, C, SF);
                        JOptionPane.showMessageDialog(null,"Done" );

			//Add_Basic_Bike.feedback_BasicBike_addMenu.setText("Successfully added new bike");

		}

		else
                        JOptionPane.showMessageDialog(null, "ERROR: Inventory is full - cannot insert the new bike !!!");

                Add_Basic_Bike.submitButton_BasicBike_clicked = false;

		

	} // End addToBasicBikeInventory()

	static void addToMountainBikeInventory(MyMountainBike_InheritedClass[] arr, boolean verbose, int arr_max_size)
	//adds just one bike at a time, the for loop checks if the bike is null and if it is null, it stores its location and then proceeds to construct a new obj of the bike
	//with the parameters provided in the function call, and places it in the place of the null bike.
	{
		int i;
		boolean bool_val = false;
		int tmp = 9999;
		int S;
		int G;
		String C;
		String SF;

		int SH;
		boolean FS;
		boolean FPT;


		S = sp_r_MountainBike_add;

		G = gtr_s_MountainBike_add;

		C = paint_MountainBike_add;

		SF = s_sf_MountainBike_add;

		SH = sh_MountainBike_add;

		FS = fs_MountainBike_add;

		FPT = fpt_MountainBike_add;


		for (i = 0; i < arr_max_size; i++) {
			if ((arr[i].maxSpeed == 0) && (arr[i].numOfGears == 0) && (arr[i].paintColor.equals("Null")) && (arr[i].safetyFeatures.equals("Null"))) {
				tmp = i;
				break;
			}
		}

		if (tmp < 100){
			arr[tmp] = new MyMountainBike_InheritedClass(SH, FS, FPT, S, G, C, SF);
                        JOptionPane.showMessageDialog(null,"Done" );}

		else
			
                        JOptionPane.showMessageDialog(null, "ERROR: Inventory is full - cannot insert the new bike !!!");

                Add_Mountain_Bike.submitButton_MountainBike_clicked = false;

	

	} // End addToMountainBikeInventory()


	static void addToRoadBikeInventory(MyRoadBike_InheritedClass[] arr, boolean verbose, int arr_max_size)
	//adds just one bike at a time, the for loop checks if the bike is null and if it is null, it stores its location and then proceeds to construct a new obj of the bike
	//with the parameters provided in the function call, and places it in the place of the null bike.
	{
		int i;
		boolean bool_val = false;
		int tmp = 9999;
		int S;
		int G;
		String C;
		String SF;
		boolean HBT;


		S = sp_r_RoadBike_add;

		G = gtr_s_RoadBike_add;

		C = paint_RoadBike_add;

		SF = s_sf_RoadBike_add;

		HBT = hbt_RoadBike_add;


		for (i = 0; i < arr_max_size; i++) {
			if ((arr[i].maxSpeed == 0) && (arr[i].numOfGears == 0) && (arr[i].paintColor.equals("Null")) && (arr[i].safetyFeatures.equals("Null"))) {
				tmp = i;
				break;
			}
		}

		if (tmp < 100){
			arr[tmp] = new MyRoadBike_InheritedClass(S, G, C, SF, HBT);
                            JOptionPane.showMessageDialog(null,"Done" );}

		else
                        JOptionPane.showMessageDialog(null, "ERROR: Inventory is full - cannot insert the new bike !!!");

                 submitButton_RoadBike_clicked = false;
		
	} // End addToRoadBikeInventory()


	static void addToEBikeInventory(MyEBike_InheritedClass_L2[] arr, boolean verbose, int arr_max_size)
	//adds just one bike at a time, the for loop checks if the bike is null and if it is null, it stores its location and then proceeds to construct a new obj of the bike
	//with the parameters provided in the function call, and places it in the place of the null bike.
	{
		int i;
		boolean bool_val = false;
		int tmp = 9999;
		int S;
		int G;
		String C;
		String SF;

		int SH;
		boolean FS;
		boolean FPT;

		int RM;
		String BTy;
		int BSz;
		int BVt;
		double MP;


		S = sp_r_EBike_add;

		G = gtr_s_EBike_add;

		C = paint_EBike_add;

		SF = s_sf_EBike_add;

		SH = sh_EBike_add;

		FS = fs_EBike_add;

		FPT = fpt_EBike_add;


		RM = rm_Ebike_add;

		BTy = bty_EBike_add;

		BSz = bsz_EBike_add;

		BVt = bvt_EBike_add;

		MP = mp_EBike_add;


		for (i = 0; i < arr_max_size; i++) {
			if ((arr[i].maxSpeed == 0) && (arr[i].numOfGears == 0) && (arr[i].paintColor.equals("Null")) && (arr[i].safetyFeatures.equals("Null"))) {
				tmp = i;
				break;
			}
		}

		if (tmp < 100){
			arr[tmp] = new MyEBike_InheritedClass_L2(SH, FS, FPT, S, G, C, SF, RM, BTy, BSz, BVt, MP);
                                        JOptionPane.showMessageDialog(null,"Done" );

                }
		else
                        JOptionPane.showMessageDialog(null, "ERROR: Inventory is full - cannot insert the new bike !!!");

                Add_E_Bike.submitButton_EBike_clicked = false;

		

	} // End addToEBikeInventory()


	static void addToERoadBikeInventory(MyERoadBike_InheritedClass_Multiple[] arr, boolean verbose, int arr_max_size)
	//adds just one bike at a time, the for loop checks if the bike is null and if it is null, it stores its location and then proceeds to construct a new obj of the bike
	//with the parameters provided in the function call, and places it in the place of the null bike.
	{
		int i;
		boolean bool_val = false;
		int tmp = 9999;
		int S;
		int G;
		String C;
		String SF;
		boolean HBT;

		int RM;
		String BTy;
		int BSz;
		int BVt;
		double MP;
                String BTY;

		S = sp_r_ERoadBike_add;

		G = gtr_s_ERoadBike_add;

		C = paint_ERoadBike_add;

		SF = s_sf_ERoadBike_add;

		HBT = hbt_ERoadBike_add;
                
                RM = rm_ERoadbike_add;
                
                BSz = bsz_ERoadBike_add;
                
                BVt = bvt_ERoadBike_add;
                
                MP = mp_ERoadBike_add;
                
                BTY = bty_ERoadBike_add;


		for (i = 0; i < arr_max_size; i++) {
			if ((arr[i].maxSpeed == 0) && (arr[i].numOfGears == 0) && (arr[i].paintColor.equals("Null")) && (arr[i].safetyFeatures.equals("Null"))) {
				tmp = i;
				break;
			}
		}

		if (tmp < 100){
			arr[tmp] = new MyERoadBike_InheritedClass_Multiple(S, G, C, SF, HBT);
                        arr[tmp].setERproperties(RM,BTY,BSz,MP,BVt);
                    
                                        JOptionPane.showMessageDialog(null,"Done" );

                }
		else

                       JOptionPane.showMessageDialog(null, "ERROR: Inventory is full - cannot insert the new bike !!!");
                Add_E_RoadBike.submitButton_ERoadBike_clicked = true;

		

	} // End addToERoadBikeInventory()


	//--> DISPLAY METHODS <--

	static void displayBasicBikeInventory(MyBike_BaseClass[] arr, boolean verbose) {
		int tmp = 0;
                String str = "";
                
                DisplayBasicBike.DisplayBBTextArea.setText(" ");//reset the text area contents

		for (int i = 0; i < arr.length; i++) {
                    if (verbose)
                    str = ("\nShowing " + i + " of " + (arr.length - 1) + "\n" + arr[i].getInfo() + "\n");
                    DisplayBasicBike.DisplayBBTextArea.append(str);

                    if ((arr[i].maxSpeed == 0) && (arr[i].numOfGears == 0) && (arr[i].paintColor.equals("Null")) && (arr[i].safetyFeatures.equals("Null"))) {
                            tmp++;
                    }

		}
            JOptionPane.showMessageDialog(null, "Total inventory of Basic Bikes possible:"+ arr.length);
            JOptionPane.showMessageDialog(null, "Current inventory of Basic Bikes:"  + (arr.length - tmp));
            

	} // End displayBasicBikeInventory()


	static void displayMountainBikeInventory(MyMountainBike_InheritedClass[] arr, boolean verbose) {
		int tmp = 0;
                String str = "";
		for (int i = 0; i < arr.length; i++) {
			if (verbose)
				str = ("\nShowing " + i + " of " + (arr.length - 1) + "\n" + arr[i].getInfo() + "\n");
                                DisplayMountainBike.DisplayMBTextArea1.append(str);
			if ((arr[i].maxSpeed == 0) && (arr[i].numOfGears == 0) && (arr[i].paintColor.equals("Null")) && (arr[i].safetyFeatures.equals("Null"))) {
				tmp++;
			}

		}

	    JOptionPane.showMessageDialog(null, "Total inventory of Basic Bikes possible:"+ arr.length);
            JOptionPane.showMessageDialog(null, "Current inventory of Basic Bikes:"  + (arr.length - tmp));

	} // End displayMountainBikeInventory()


	static void displayRoadBikeInventory(MyRoadBike_InheritedClass[] arr, boolean verbose) {
		int tmp = 0;
                String str = "";

		for (int i = 0; i < arr.length; i++) {
			if (verbose)
				str = ("\nShowing " + i + " of " + (arr.length - 1) + "\n" + arr[i].getInfo() + "\n");
                                DisplayRoadBike.DisplayRBTextArea.append(str);


			if ((arr[i].maxSpeed == 0) && (arr[i].numOfGears == 0) && (arr[i].paintColor.equals("Null")) && (arr[i].safetyFeatures.equals("Null"))) {
				tmp++;
			}

		}

	    JOptionPane.showMessageDialog(null, "Total inventory of Basic Bikes possible:"+ arr.length);
            JOptionPane.showMessageDialog(null, "Current inventory of Basic Bikes:"  + (arr.length - tmp));

	} // End displayRoadBikeInventory()


	static void displayEBikeInventory(MyEBike_InheritedClass_L2[] arr, boolean verbose) {
		int tmp = 0;
                String str = "";

		for (int i = 0; i < arr.length; i++) {
			if (verbose)
				str = ("\nShowing " + i + " of " + (arr.length - 1) + "\n" + arr[i].getInfo() + "\n");
                                DisplayEBike.DisplayEBTextArea.append(str);

			if ((arr[i].maxSpeed == 0) && (arr[i].numOfGears == 0) && (arr[i].paintColor.equals("Null")) && (arr[i].safetyFeatures.equals("Null"))) {
				tmp++;
			}

		}

	    JOptionPane.showMessageDialog(null, "Total inventory of Basic Bikes possible:"+ arr.length);
            JOptionPane.showMessageDialog(null, "Current inventory of Basic Bikes:"  + (arr.length - tmp));

	} // End displayEBikeInventory()


	static void displayERoadBikeInventory(MyERoadBike_InheritedClass_Multiple[] arr, boolean verbose) {
		int tmp = 0;
                String str = "";

		for (int i = 0; i < arr.length; i++) {
			if (verbose)
				str = ("\nShowing " + i + " of " + (arr.length - 1) + "\n" + arr[i].getInfo() + "\n");
                                                System.out.println(str);

                                DisplayERoadBike.DisplayERBTextArea.append(str);


			if ((arr[i].maxSpeed == 0) && (arr[i].numOfGears == 0) && (arr[i].paintColor.equals("Null")) && (arr[i].safetyFeatures.equals("Null"))) {
				tmp++;
			}

		}

	    JOptionPane.showMessageDialog(null, "Total inventory of Basic Bikes possible:"+ arr.length);
            JOptionPane.showMessageDialog(null, "Current inventory of Basic Bikes:"  + (arr.length - tmp));

	} // End displayERoadBikeInventory()

	//----------------------------------------------------------------------------//
	// DELETION METHODS FOLLOW THIS SECTION                                      //
	//----------------------------------------------------------------------------//

	static void removeFromBasicBikeInventory(MyBike_BaseClass[] arr, boolean verbose, int arr_max_size) {
                
        


		if (DeleteBasicBike.DeleteBikeConfirm_DeleteBasicBike.getText().equals("Y") || DeleteBasicBike.DeleteBikeConfirm_DeleteBasicBike.getText().equals("y")) {
			if ((targetDelete_basicBike < 100) && (targetDelete_basicBike >= 0)) {
				arr[targetDelete_basicBike].maxSpeed = 0;
				arr[targetDelete_basicBike].numOfGears = 0;
				arr[targetDelete_basicBike].paintColor = "Null";
				arr[targetDelete_basicBike].safetyFeatures = "Null";
                                JOptionPane.showMessageDialog(null, "Bike number " + targetDelete_basicBike + " deleted\n");

			} else {
                                JOptionPane.showMessageDialog(null,"\nWARNING: Incorrect bike number entered - Aborting !!\n" );

			}
		} 
                
                else {
                                 JOptionPane.showMessageDialog(null,"\nExiting without deletion\n" );

		}}

                
                static void removeFromMountainBikeInventory(MyMountainBike_InheritedClass[] arr, boolean verbose, int arr_max_size) {
                
		if (DeleteMountainBike.DeleteBikeConfirm_DeleteMBike.getText().equals("Y") || DeleteMountainBike.DeleteBikeConfirm_DeleteMBike.getText().equals("y")) {
			if ((targetDelete_MBike < 100) && (targetDelete_MBike >= 0)) {
				arr[targetDelete_MBike].maxSpeed = 0;
				arr[targetDelete_MBike].numOfGears = 0;
				arr[targetDelete_MBike].paintColor = "Null";
				arr[targetDelete_MBike].safetyFeatures = "Null";
                                JOptionPane.showMessageDialog(null, "Bike number " + targetDelete_MBike + " deleted\n");

			} else {
                                JOptionPane.showMessageDialog(null,"\nWARNING: Incorrect bike number entered - Aborting !!\n" );

			}
		} 
                
                else {
                                 JOptionPane.showMessageDialog(null,"\nExiting without deletion\n" );

		}}
                
                static void removeFromRoadBikeInventory(MyRoadBike_InheritedClass[] arr, boolean verbose, int arr_max_size) {
                
        


		if (DeleteRoadBike.DeleteBikeConfirm_DeleteRBike.getText().equals("Y") || DeleteRoadBike.DeleteBikeConfirm_DeleteRBike.getText().equals("y")) {
			if ((targetDelete_RBike < 100) && (targetDelete_RBike >= 0)) {
				arr[targetDelete_RBike].maxSpeed = 0;
				arr[targetDelete_RBike].numOfGears = 0;
				arr[targetDelete_RBike].paintColor = "Null";
				arr[targetDelete_RBike].safetyFeatures = "Null";
                                JOptionPane.showMessageDialog(null, "Bike number " + targetDelete_RBike + " deleted\n");

			} else {
                                JOptionPane.showMessageDialog(null,"\nWARNING: Incorrect bike number entered - Aborting !!\n" );

			}
		} 
                
                else {
                                 JOptionPane.showMessageDialog(null,"\nExiting without deletion\n" );

		}}

                
                static void removeFromEBikeInventory(MyEBike_InheritedClass_L2[] arr, boolean verbose, int arr_max_size) {
                
		if (DeleteRoadBike.DeleteBikeConfirm_DeleteRBike.getText().equals("Y") || DeleteRoadBike.DeleteBikeConfirm_DeleteRBike.getText().equals("y")) {
			if ((targetDelete_EBike < 100) && (targetDelete_EBike >= 0)) {
				arr[targetDelete_EBike].maxSpeed = 0;
				arr[targetDelete_EBike].numOfGears = 0;
				arr[targetDelete_EBike].paintColor = "Null";
				arr[targetDelete_EBike].safetyFeatures = "Null";
                                JOptionPane.showMessageDialog(null, "Bike number " + targetDelete_EBike + " deleted\n");

			} else {
                                JOptionPane.showMessageDialog(null,"\nWARNING: Incorrect bike number entered - Aborting !!\n" );

			}
		} 
                
                else {
                                 JOptionPane.showMessageDialog(null,"\nExiting without deletion\n" );

		}
                

                
                
                
	} // End removeFromBasicBikeInventory()

                
                 static void removeFromERoadBikeInventory(MyERoadBike_InheritedClass_Multiple[] arr, boolean verbose, int arr_max_size) {
                
		if (DeleteERoadBike.DeleteBikeConfirm_DeleteERBike.getText().equals("Y") || DeleteERoadBike.DeleteBikeConfirm_DeleteERBike.getText().equals("y")) {
			if ((targetDelete_ERBike < 100) && (targetDelete_ERBike >= 0)) {
				arr[targetDelete_ERBike].maxSpeed = 0;
				arr[targetDelete_ERBike].numOfGears = 0;
				arr[targetDelete_ERBike].paintColor = "Null";
				arr[targetDelete_ERBike].safetyFeatures = "Null";
                                JOptionPane.showMessageDialog(null, "Bike number " + targetDelete_ERBike + " deleted\n");

			} else {
                                JOptionPane.showMessageDialog(null,"\nWARNING: Incorrect bike number entered - Aborting !!\n" );

			}
		} 
                
                else {
                                 JOptionPane.showMessageDialog(null,"\nExiting without deletion\n" );

		}
                 }
                

	//----------------------------------------------------------------------------//
	// SEARCH METHODS FOLLOW THIS SECTION                                         //
	//----------------------------------------------------------------------------//

	public static String searchBasicBikeInventory(MyBike_BaseClass[] arr, boolean verbose, int arr_max_size, int type) {
		int i;
                String str = "";
		int tmp = 9999;
		int S;
		int G;
		String C;
		String SF;
                   for(int i2=0;i2<arr.length;i2++){
                       System.out.println("arr[i2]: "+arr[i2].maxSpeed+","+arr[i2].numOfGears+","+arr[i2].paintColor);
                   }
                   System.out.println("type: "+type);
                   System.out.println("Target Speed "+target_Speed);
		switch (type) {

			case 1:    // Speed search
                                
				for (i = 0; i < arr_max_size; i++) {
                 

					if ((arr[i].maxSpeed > 0) && (arr[i].maxSpeed < target_Speed)) {
                                            
                                            JOptionPane.showMessageDialog(null,"Found bike #" + i+1 + " match search criteria" );
                                             str = (arr[i].getInfo());
                                            
					}

				}
				break;

			case 2:    // Gears search
               
				for (i = 0; i < arr_max_size; i++) {
                         

					if ((arr[i].numOfGears > 0) && (arr[i].numOfGears < target_Gears)) {
                                            
                                                JOptionPane.showMessageDialog(null,"\n\nFound bike #" + i + " match search criteria\n" );

						str = (arr[i].getInfo());
                       
					}
				}
				break;

                                
                                
                                
			case 3:    // Color search
				
				for (i = 0; i < arr_max_size; i++) {
                                    

					if ((arr[i].paintColor.contains(target_Color))) {
                                                JOptionPane.showMessageDialog(null,"\n\nFound bike #" + i + " match search criteria\n" );
						str = (arr[i].getInfo());
                           

					}
				}
				break;

			case 4:    // Keyword search
                            
				for (i = 0; i < arr_max_size; i++) {
                                             

					if ((arr[i].safetyFeatures.contains(target_Keyword))) {
                                        JOptionPane.showMessageDialog(null,"Found bike #" + i + " match search criteria");

						str = (arr[i].getInfo());
                                  

                                            
					}
				}
				break;

			default:
                                JOptionPane.showMessageDialog(null,("ERROR: Incorrect search type specified - Abort !!"));

				break;


		} // End Switch (type)
return str;
	} // End searchBasicBikeInventory()


        
        
        
        
        
        static void searchMountainBikeInventory(MyMountainBike_InheritedClass[] arr, boolean verbose, int arr_max_size, int type) {
		int i;
                String str = "";
		int tmp = 9999;
		int S;
		int G;
		String C;
		String SF;
                 int seatHeight;
                 boolean fullSuspension;
                 boolean flatProofTires;
		switch (type) {

			case 1:    // Speed search
                                
				for (i = 0; i < arr_max_size; i++) {
                                SearchMountainBike.textAreaCase1_SearchMB.setText(" ");

					if ((arr[i].maxSpeed > 0) && (arr[i].maxSpeed < target_Speed)) {
                                            
                                            JOptionPane.showMessageDialog(null,"Found bike #" + i + " match search criteria" );
                                             str = (arr[i].getInfo());

                                            SearchMountainBike.textAreaCase1_SearchMB.append(str + "\n");
                                            //
                                         
                                            
					}

				}
				break;

			case 2:    // Gears search
               
				for (i = 0; i < arr_max_size; i++) {
                                SearchMountainBike.textAreaCase1_SearchMB.setText(" ");

					if ((arr[i].numOfGears > 0) && (arr[i].numOfGears < target_Gears)) {
                                            
                                                JOptionPane.showMessageDialog(null,"\n\nFound bike #" + i + " match search criteria\n" );

						str = (arr[i].getInfo());
                                            SearchMountainBike.textAreaCase1_SearchMB.append(str + "\n");
					}
				}
				break;

                                
                                
                                
			case 3:    // Color search
				
				for (i = 0; i < arr_max_size; i++) {
                                SearchMountainBike.textAreaCase1_SearchMB.setText(" ");

					if ((arr[i].paintColor.contains(target_Color))) {
                                                JOptionPane.showMessageDialog(null,"\n\nFound bike #" + i + " match search criteria\n" );
						str = (arr[i].getInfo());
                                            SearchMountainBike.textAreaCase1_SearchMB.append(str + "\n");

					}
				}
				break;

			case 4:    // Keyword search
                            
				for (i = 0; i < arr_max_size; i++) {
                                SearchMountainBike.textAreaCase1_SearchMB.setText(" ");

					if ((arr[i].safetyFeatures.contains(target_Keyword))) {
                                        JOptionPane.showMessageDialog(null,"Found bike #" + i + " match search criteria");

						str = (arr[i].getInfo());
                                            SearchMountainBike.textAreaCase1_SearchMB.append(str + "\n");

                                            
					}
				}
				break;
                                
                                case 5:    // seat height search

				for (i = 0; i < arr_max_size; i++) {
                                SearchMountainBike.textAreaCase1_SearchMB.setText(" ");

					if ((arr[i].seatHeight > 0) && (arr[i].seatHeight < target_seatHeight)) {
                                            
                                            JOptionPane.showMessageDialog(null,"Found bike #" + i + " match search criteria" );
                                             str = (arr[i].getInfo());

                                            SearchMountainBike.textAreaCase1_SearchMB.append(str + "\n");
                                            
                                         
                                            
					}
                                    
				}
				break;

                                case 6:    // full suspension search
				
				for (i = 0; i < arr_max_size; i++) {
                                SearchMountainBike.textAreaCase1_SearchMB.setText(" ");

					if ((arr[i].fullSuspension)) {
                                                JOptionPane.showMessageDialog(null,"\n\nFound bike #" + i + " match search criteria\n" );
						str = (arr[i].getInfo());
                                            SearchMountainBike.textAreaCase1_SearchMB.append(str + "\n");

					}
				}
				break;
                                
                                case 7:    // full suspension search
				
				for (i = 0; i < arr_max_size; i++) {
                                SearchMountainBike.textAreaCase1_SearchMB.setText(" ");

					if ((arr[i].flatProofTires)) {
                                                JOptionPane.showMessageDialog(null,"\n\nFound bike #" + i + " match search criteria\n" );
						str = (arr[i].getInfo());
                                            SearchMountainBike.textAreaCase1_SearchMB.append(str + "\n");

					}
				}
				break;
                                
			default:
                                JOptionPane.showMessageDialog(null,("ERROR: Incorrect search type specified - Abort !!"));

				break;


		} // End Switch (type)

	} // End searchBasicBikeInventory()

        
        
        
        public static  String searchRoadBikeInventory(MyRoadBike_InheritedClass[] arr, boolean verbose, int arr_max_size, int type) {
		int i;
                String str = "";
		int tmp = 9999;
		int S;
		int G;
		String C;
		String SF;
                  
		switch (type) {

			case 1:    // Speed search
                                
				for (i = 0; i < arr_max_size; i++) {
                 

					if ((arr[i].maxSpeed > 0) && (arr[i].maxSpeed < target_Speed)) {
                                            
                                            JOptionPane.showMessageDialog(null,"Found bike #" + i+1 + " match search criteria" );
                                             str = (arr[i].getInfo());
                                   

                                            
					}

				}
				break;

			case 2:    // Gears search
               
				for (i = 0; i < arr_max_size; i++) {
                         

					if ((arr[i].numOfGears > 0) && (arr[i].numOfGears < target_Gears)) {
                                            
                                                JOptionPane.showMessageDialog(null,"\n\nFound bike #" + i + " match search criteria\n" );

						str = (arr[i].getInfo());
                                            

                                                
                       
					}
				}
				break;

                                
                                
                                
			case 3:    // Color search
				
				for (i = 0; i < arr_max_size; i++) {
                                    

					if ((arr[i].paintColor.contains(target_Color))) {
                                                JOptionPane.showMessageDialog(null,"\n\nFound bike #" + i + " match search criteria\n" );
						str = (arr[i].getInfo());
                                          


					}
				}
				break;

			case 4:    // Keyword search
                            
				for (i = 0; i < arr_max_size; i++) {
                                             

					if ((arr[i].safetyFeatures.contains(target_Keyword))) {
                                        JOptionPane.showMessageDialog(null,"Found bike #" + i + " match search criteria");

						str = (arr[i].getInfo());
                            
                                  

                                            
					}
				}
				break;
                                
                                
                                case 5:    // flat handlebar search
                            
				for (i = 0; i < arr_max_size; i++) {
                                             

					if ((arr[i].flatHandleBar)) {
                                        JOptionPane.showMessageDialog(null,"Found bike #" + i + " match search criteria");

						str = (arr[i].getInfo());
                                      
                                  

                                            
					}
				}
				break;

			default:
                                JOptionPane.showMessageDialog(null,("ERROR: Incorrect search type specified - Abort !!"));

				break;
        

                               
                }
                 return str;
        }
        
        
        
        public static  String searchEBikeInventory(MyEBike_InheritedClass_L2[] arr, boolean verbose, int arr_max_size, int type) {
		int i;
                String str = "";
		int tmp = 9999;
		int S;
		int G;
		String C;
		String SF;
                  
		switch (type) {

			case 1:    // Speed search
                                
				for (i = 0; i < arr_max_size; i++) {
                 

					if ((arr[i].maxSpeed > 0) && (arr[i].maxSpeed < target_Speed)) {
                                            
                                            JOptionPane.showMessageDialog(null,"Found bike #" + i+1 + " match search criteria" );
                                             str = (arr[i].getInfo());
                                   

                                            
					}

				}
				break;

			case 2:    // Gears search
               
				for (i = 0; i < arr_max_size; i++) {
                         

					if ((arr[i].numOfGears > 0) && (arr[i].numOfGears < target_Gears)) {
                                            
                                                JOptionPane.showMessageDialog(null,"\n\nFound bike #" + i + " match search criteria\n" );

						str = (arr[i].getInfo());
                                            

                                                
                       
					}
				}
				break;

                                
                                
                                
			case 3:    // Color search
				
				for (i = 0; i < arr_max_size; i++) {
                                    

					if ((arr[i].paintColor.contains(target_Color))) {
                                                JOptionPane.showMessageDialog(null,"\n\nFound bike #" + i + " match search criteria\n" );
						str = (arr[i].getInfo());
                                          


					}
				}
				break;

			case 4:    // Keyword search
                            
				for (i = 0; i < arr_max_size; i++) {
                                             

					if ((arr[i].safetyFeatures.contains(target_Keyword))) {
                                        JOptionPane.showMessageDialog(null,"Found bike #" + i + " match search criteria");

						str = (arr[i].getInfo());
                            
                                  

                                            
					}
				}
				break;
                                
                                
                                case 5:    // range miles search
                            
				for (i = 0; i < arr_max_size; i++) {
                  

					if ((arr[i].rangeMiles > 0) && (arr[i].rangeMiles < target_rangeMiles)) {
                                            
                                            JOptionPane.showMessageDialog(null,"Found bike #" + i+1 + " match search criteria" );
                                             str = (arr[i].getInfo());
                                   

                                            
					}

				}
				break;
                                
                               case 6:    // battery type search
                            
				for (i = 0; i < arr_max_size; i++) {
                                             

					if ((arr[i].batteryType.contains(target_batteryType))) {
                                        JOptionPane.showMessageDialog(null,"Found bike #" + i + " match search criteria");

						str = (arr[i].getInfo());
                            
                                  

                                            
					}
				}
				break;
                                
                                case 7:    // battery type search
                            
				for (i = 0; i < arr_max_size; i++) {
                  

					if ((arr[i].batterySize > 0) && (arr[i].batterySize < target_batterySize)) {
                                            
                                            JOptionPane.showMessageDialog(null,"Found bike #" + i+1 + " match search criteria" );
                                             str = (arr[i].getInfo());
                                   

                                            
					}

				}
                                
                                
                                case 8:    // battery type search
                            
				for (i = 0; i < arr_max_size; i++) {
                  

					if ((arr[i].batteryVolt > 0) && (arr[i].batteryVolt < target_batteryVolt)) {
                                            
                                            JOptionPane.showMessageDialog(null,"Found bike #" + i+1 + " match search criteria" );
                                             str = (arr[i].getInfo());
                                   

                                            
					}

				}
				break;
                                
                                case 9:
                                for (i = 0; i < arr_max_size; i++) {
                  

					if ((arr[i].motorPower > 0) && (arr[i].motorPower < target_motorPower)) {
                                            
                                            JOptionPane.showMessageDialog(null,"Found bike #" + i+1 + " match search criteria" );
                                             str = (arr[i].getInfo());
                                   

                                            
					}

				}
				break;
			default:
                                JOptionPane.showMessageDialog(null,("ERROR: Incorrect search type specified - Abort !!"));

				break;
        

                               
                }
                 return str;
        }
        public static  String searchERoadBikeInventory(MyERoadBike_InheritedClass_Multiple[] arr, boolean verbose, int arr_max_size, int type) {
		int i;
                String str = "";
		int tmp = 9999;
		int S;
		int G;
		String C;
		String SF;
                  
		switch (type) {

			case 1:    // Speed search
                                
				for (i = 0; i < arr_max_size; i++) {
                 

					if ((arr[i].maxSpeed > 0) && (arr[i].maxSpeed < target_Speed)) {
                                            
                                            JOptionPane.showMessageDialog(null,"Found bike #" + i+1 + " match search criteria" );
                                             str = (arr[i].getInfo());
                                   

                                            
					}

				}
				break;

			case 2:    // Gears search
               
				for (i = 0; i < arr_max_size; i++) {
                         

					if ((arr[i].numOfGears > 0) && (arr[i].numOfGears < target_Gears)) {
                                            
                                                JOptionPane.showMessageDialog(null,"\n\nFound bike #" + i + " match search criteria\n" );

						str = (arr[i].getInfo());
                                            

                                                
                       
					}
				}
				break;

                                
                                
                                
			case 3:    // Color search
				
				for (i = 0; i < arr_max_size; i++) {
                                    

					if ((arr[i].paintColor.contains(target_Color))) {
                                                JOptionPane.showMessageDialog(null,"\n\nFound bike #" + i + " match search criteria\n" );
						str = (arr[i].getInfo());
                                          


					}
				}
				break;

			case 4:    // Keyword search
                            
				for (i = 0; i < arr_max_size; i++) {
                                             

					if ((arr[i].safetyFeatures.contains(target_Keyword))) {
                                        JOptionPane.showMessageDialog(null,"Found bike #" + i + " match search criteria");

						str = (arr[i].getInfo());
                            
                                  

                                            
					}
				}
				break;
                                
                                
                                
                                case 5:    // flat handlebar search
                            
				for (i = 0; i < arr_max_size; i++) {
                                             

					if ((arr[i].flatHandleBar)) {
                                        JOptionPane.showMessageDialog(null,"Found bike #" + i + " match search criteria");

						str = (arr[i].getInfo());
                                      
                                  

                                            
					}
				}
				break;
                                
                                
                                
                                
                                
                                case 6:    // range miles search
                            
				for (i = 0; i < arr_max_size; i++) {
                  

					if ((arr[i].rangeMiles > 0) && (arr[i].rangeMiles < target_rangeMiles)) {
                                            
                                            JOptionPane.showMessageDialog(null,"Found bike #" + i+1 + " match search criteria" );
                                             str = (arr[i].getInfo());
                                   

                                            
					}

				}
				break;
                                
                               case 7:    // battery type search
                            
				for (i = 0; i < arr_max_size; i++) {
                                             

					if ((arr[i].batteryType.contains(target_batteryType))) {
                                        JOptionPane.showMessageDialog(null,"Found bike #" + i + " match search criteria");

						str = (arr[i].getInfo());
                            
                                  

                                            
					}
				}
				break;
                                
                                case 8:    // battery type search
                            
				for (i = 0; i < arr_max_size; i++) {
                  

					if ((arr[i].batterySize > 0) && (arr[i].batterySize < target_batterySize)) {
                                            
                                            JOptionPane.showMessageDialog(null,"Found bike #" + i+1 + " match search criteria" );
                                             str = (arr[i].getInfo());
                                   

                                            
					}

				}
                                
                                
                                case 9:    // battery type search
                            
				for (i = 0; i < arr_max_size; i++) {
                  

					if ((arr[i].batteryVolt > 0) && (arr[i].batteryVolt < target_batteryVolt)) {
                                            
                                            JOptionPane.showMessageDialog(null,"Found bike #" + i+1 + " match search criteria" );
                                             str = (arr[i].getInfo());
                                   

                                            
					}

				}
				break;
                                
                                case 10:
                                for (i = 0; i < arr_max_size; i++) {
                  

					if ((arr[i].motorPower > 0) && (arr[i].motorPower < target_motorPower)) {
                                            
                                            JOptionPane.showMessageDialog(null,"Found bike #" + i+1 + " match search criteria" );
                                             str = (arr[i].getInfo());
                                   

                                            
					}

				}
				break;
			default:
                                JOptionPane.showMessageDialog(null,("ERROR: Incorrect search type specified - Abort !!"));

				break;
        

                               
                }
                 return str;
        }
        
        
        // edit bikes methods below
        
        
        public static void EditBasicBikeInventory(MyBike_BaseClass[] arr , int arr_max_size, int bikeNumber)
        {
            for (int i = 0;i<arr_max_size;i++)
            {
                if (i == bikeNumber)
                {
                    arr[bikeNumber].setMaxSpeed(sp_r_BasicBike_add_EditMenu);
                    arr[bikeNumber].setNumofGears(gtr_s_BasicBike_add_EditMenu);
                    arr[bikeNumber].setpaintColor(paint_BasicBike_add_EditMenu);
                    arr[bikeNumber].setSafetyFeatures(s_sf_BasicBike_add_EditMenu);
                                            JOptionPane.showMessageDialog(null,"Done" );

                }
                
                
            }
        }
        
         public static void EditMountainBikeInventory(MyMountainBike_InheritedClass[] arr , int arr_max_size, int bikeNumber)
        {
            for (int i = 0;i<arr_max_size;i++)
            {
                if (i == bikeNumber)
                {
                    arr[bikeNumber].setMaxSpeed(sp_r_BasicBike_add_EditMenu);
                    arr[bikeNumber].setNumofGears(gtr_s_BasicBike_add_EditMenu);
                    arr[bikeNumber].setpaintColor(paint_BasicBike_add_EditMenu);
                    arr[bikeNumber].setSafetyFeatures(s_sf_BasicBike_add_EditMenu);
                    arr[bikeNumber].setSeatHeight(sh_MountainBike_add_EditMenu);
                    arr[bikeNumber].setFlatProof(fpt_MountainBike_add_EditMenu);
                    arr[bikeNumber].setFlatProof(fs_MountainBike_add_EditMenu); 
                                            JOptionPane.showMessageDialog(null,"Done" );

                }
                
                
            }
        }
         
         public static void EditRoadBikeInventory(MyRoadBike_InheritedClass[] arr , int arr_max_size, int bikeNumber)
        {
            for (int i = 0;i<arr_max_size;i++)
            {
                if (i == bikeNumber)
                {
                    arr[bikeNumber].setMaxSpeed(sp_r_BasicBike_add_EditMenu);
                    arr[bikeNumber].setNumofGears(gtr_s_BasicBike_add_EditMenu);
                    arr[bikeNumber].setpaintColor(paint_BasicBike_add_EditMenu);
                    arr[bikeNumber].setSafetyFeatures(s_sf_BasicBike_add_EditMenu);
                    arr[bikeNumber].setFlatHandleBar(hbt_RoadBike_add_EditMenu);
                                            JOptionPane.showMessageDialog(null,"Done" );


                }
                
                
            }
        }
       
//-----------------------------------------//
         public static void EditEBikeInventory(MyEBike_InheritedClass_L2[] arr , int arr_max_size, int bikeNumber)
        {
            for (int i = 0;i<arr_max_size;i++)
            {
                if (i == bikeNumber)
                {
                    arr[bikeNumber].setMaxSpeed(sp_r_BasicBike_add_EditMenu);
                    arr[bikeNumber].setNumofGears(gtr_s_BasicBike_add_EditMenu);
                    arr[bikeNumber].setpaintColor(paint_BasicBike_add_EditMenu);
                    arr[bikeNumber].setSafetyFeatures(s_sf_BasicBike_add_EditMenu);
                    arr[bikeNumber].setSeatHeight(sh_MountainBike_add_EditMenu);
                    arr[bikeNumber].setFlatProof(fpt_MountainBike_add_EditMenu);
                    arr[bikeNumber].setFlatProof(fs_MountainBike_add_EditMenu); 
                    arr[bikeNumber].setRange(rm_Ebike_add_EditMenu);
                    arr[bikeNumber].setBattInfo(bty_EBike_add_EditMenu,bsz_EBike_add_EditMenu,bvt_EBike_add_EditMenu);
                    arr[bikeNumber].setKW(mp_EBike_add_EditMenu);
                                            JOptionPane.showMessageDialog(null,"Done" );

                    
                    

                        
                }

            }
        }
        
        public static void EditERoadBikeInventory(MyERoadBike_InheritedClass_Multiple[] arr , int arr_max_size, int bikeNumber)
        {
            for (int i = 0;i<arr_max_size;i++)
            {
                if (i == bikeNumber)
                {
                    arr[bikeNumber].setMaxSpeed(sp_r_BasicBike_add_EditMenu);
                    arr[bikeNumber].setNumofGears(gtr_s_BasicBike_add_EditMenu);
                    arr[bikeNumber].setpaintColor(paint_BasicBike_add_EditMenu);
                    arr[bikeNumber].setSafetyFeatures(s_sf_BasicBike_add_EditMenu);
                    arr[bikeNumber].setFlatHandleBar(hbt_RoadBike_add_EditMenu);
                    arr[bikeNumber].setERproperties(rm_Ebike_add_EditMenu,bty_EBike_add_EditMenu,bsz_EBike_add_EditMenu,mp_EBike_add_EditMenu,bvt_EBike_add_EditMenu);
                                            JOptionPane.showMessageDialog(null,"Done" );


                    
               

                        
                }

            }
        }
        
        
	public static void main(String[] args) {

		//----------------------------------------------------------------------------//
		// Initializing the underlying arrays for data entry                          //
		//----------------------------------------------------------------------------//

		for (int i = 0; i < MAX_INVENTORY_SIZE_PER_TYPE; i++) {
			myBasicBikeInventory[i] = new MyBike_BaseClass(0, 0, "Null", "Null");

			myMountainBikeInventory[i] = new MyMountainBike_InheritedClass(0, false, false, 0, 0, "Null", "Null");

			myRoadBikeInventory[i] = new MyRoadBike_InheritedClass(0, 0, "Null", "Null", false);

			myEBikeInventory[i] = new MyEBike_InheritedClass_L2(0, false, false, 0, 0, "Null", "Null", 0, "Null", 0, 0, 0.0);

			myERoadBikeInventory[i] = new MyERoadBike_InheritedClass_Multiple(0, 0, "Null", "Null", false);

		}

                
                
		

	} // End PSVM

}


