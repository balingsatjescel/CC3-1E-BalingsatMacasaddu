/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jj;

/**
 *
 * @author m304user
 */
public class StudentInfo {

        String university;
        String college;
        String term;
        String Schoolyear; 
        
        public StudentInfo(String college, String term){
            this.university = "University of the Cordilleras";
            this.college = college;
            this.term = term;
            this.Schoolyear = Schoolyear;
        }
        
        private String idnumber;
        private String familyname;
        private String firstname;
        private String academicprogram;
        private String track;
        
        public void setID(String IdNumber){
            
            idnumber = IdNumber;
        }
        
        public String getID(){
     
        return idnumber;
        }
        
        public void setFamilyName(String FamilyName){
            
            familyname = FamilyName;
        }
        
        public String getFamilyName(){
     
        return familyname;
        }
        
        public void setFirstName(String FirstName){
            
            firstname = FirstName;
        }
        
        public String getFirstName(){
     
        return firstname;
        }
        
        public void setAcadProg(String AcadProg){
            
            academicprogram = AcadProg;
        }
        
        public String getAcadProg(){
     
        return academicprogram;
        }        
        
        public void setTrack(String Track){
            
            track = Track;
        }
        
        public String getTrack(){
     
        return track;
        }  
        
        public void printall(){
            System.out.println(this.university + "\n" + this.college + "\n" 
                 + this.term + "\nStudent Information: "+ "\nID Number: " 
                 + this.idnumber + "\nName: " + this.familyname + ", " 
                 + this.firstname + "\nAcademic Program: " + this.academicprogram
                 + " - " + this.track);
        }
} 

