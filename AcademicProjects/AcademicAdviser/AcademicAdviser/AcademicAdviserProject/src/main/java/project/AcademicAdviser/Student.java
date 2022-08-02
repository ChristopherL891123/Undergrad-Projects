package project.AcademicAdviser;

import static java.lang.Math.random;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 124ch
 */
public class Student {

    int ID;
    String Name;
    String timeline;
    TreeSet<String> Major;
    TreeSet<String> Minor;
    String TermStarted;
    String TermGraduating;


    Student(int id, String name, TreeSet<String> major, TreeSet<String> minor, String termStarted, String termGraduating, String Timeline){

        this.ID = id;
        this.Name = name;
        this.timeline = Timeline;
        this.Major = major;
        this.Minor = minor;
        this.TermStarted = termStarted;
        this.TermGraduating = termGraduating;
    } // end Student()

 
    
    
    static int MakeID(Hashtable<Integer, Student> StudentDirectory){

        int id;
        Random randNum = new Random();
        do{

            id = randNum.nextInt(7999) + 1000 ; // https://www.delftstack.com/howto/java/java-random-number-in-range/

        } //end do

        while(StudentDirectory.get(id) != null);


        return id;
    }

        void PopulateTimeline(String elementToAdd){

        if (elementToAdd.equals("Spring") || elementToAdd.equals("Fall")){

            this.timeline = this.timeline + System.lineSeparator() +elementToAdd + System.lineSeparator()+System.lineSeparator();

        }

        else{
            this.timeline = this.timeline + elementToAdd + System.lineSeparator();
        }

    } //end PopulateTimeline


    void PopulateMajor(String major){

        this.Major.add(major);

    } // end PopulateMajor

    // arranges the data into CSV
    String[] CSVgetData(){

        String MajorStr = String.join(",",this.Major.toString()).replace("[","").replace("]","");
        String MinorStr = String.join(",",this.Minor.toString()).replace("[","").replace("]","");

        this.timeline = this.timeline.replace(System.lineSeparator(),"!");


        String[] CSVLine = { String.valueOf(this.ID) , this.Name, MajorStr, MinorStr,this.TermStarted, this.TermGraduating, this.timeline};

        return CSVLine;
    }

    String[] getData(){


        if(this.timeline.contains("!")) this.timeline = this.timeline.replaceAll("!",System.lineSeparator());
        
        String MajorStr = String.join(",",this.Major.toString()).replace("[","").replace("]","");
        String MinorStr = String.join(",",this.Minor.toString()).replace("[","").replace("]","");


        String[] CSVLine = { "ID: "+String.valueOf(this.ID) , "Name: "+this.Name,"Major(s): "+MajorStr, "Minor(s): "+MinorStr,"Term started: "+this.TermStarted, "Term graduating: "+this.TermGraduating, System.lineSeparator() + "Course timeline: "+ System.lineSeparator() +this.timeline};

        return CSVLine;
    }

    // populates one line of the CSV file, after the line has been read!!
   static void PopulateFromCSV(Hashtable<Integer, Student> StudentDirectory, String[] line){ //line = reader.nextLine().split(",")

        int tempID = Integer.parseInt(line[0]);
        
        TreeSet<String> tempMajorTree = new TreeSet<>();

        TreeSet<String> tempMinorTree = new TreeSet<>();
      

        tempMajorTree.addAll(Arrays.asList(line[2].split("!")));
        tempMinorTree.addAll(Arrays.asList(line[3].split("!")));

        
        StudentDirectory.put(tempID, new Student(tempID, line[1],tempMajorTree,tempMinorTree,line[4],line[5], line[6].replace("!",System.lineSeparator())));
        
    } // end PopulateFromCSV


    static void SaveToCSV(Student profile, int TargetID, String Path){

        try{

            File file = new File(Path);
            FileWriter writer = new FileWriter(Path,true); // if not true, overwrites the contents of file
            Scanner reader = new Scanner(file);

                LinkedList<String> list = new LinkedList<>();
                int c = 0;
                // populate the list with the CSV file lines
                while(reader.hasNextLine()){
                        list.add(c,reader.nextLine());
                        c++;
                }

                FileWriter delete = new FileWriter(Path);
                delete.write("");

                // check element by element of the resulting linked list if it has the ID in its string
                int check = 0;
                for (int i = 0; i < list.size(); i++) {

                    if (list.get(i).contains(String.valueOf(TargetID))){ // TODO problem
                        System.out.println("in replacement condition");
                        // if it does, replace the element with the new value
                        list.remove(i);
                        list.add(String.join(",",profile.CSVgetData())); // try adding index too

                        check = 1;
                        break;
                    }
                }


                if (check == 0){

                    System.out.println("in addition condition");
                    list.add(String.join(",",profile.CSVgetData()));
                }

            for (int i = 0; i < list.size(); i++) {
                writer.write(list.get(i) + System.lineSeparator());
            }
            writer.flush();

            writer.close();
            reader.close();

        } catch (IOException e) {
            System.out.println("ERROR: File Not Found");
        }

    }//end SaveToCSV


}// end public class Student
