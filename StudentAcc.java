/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jj;

        public class StudentAcc{
            
    public static void main(String[] args) {
        
      StudentInfo John = new StudentInfo("College of Information Technology and Computer Science","2nd Term 2018-2019");
      John.setID("18-6527-837");
      John.setFamilyName("Macasaddu");
      John.setFirstName("John");
      John.setAcadProg("Bachelor of Science in Information Technology");
      John.setTrack("Major in Web Technology");
      John.term = "3rd Term School year 2018-2019";
      John.printall();  
      System.out.println("\n");
      StudentInfo Jescel = new StudentInfo("College of Information Technology and Computer Science","2nd Term 2018-2019");
      Jescel.setID("18-7176-729");
      Jescel.setFamilyName("Balingsat");
      Jescel.setFirstName("Jescel");
      Jescel.setAcadProg("Bachelor of Science in Information Technology");
      Jescel.setTrack("Major in Web Technology");
      Jescel.printall();  
    }
    
}
        
        
     