/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animals;

/**
 *
 * @author m304user
 */
public class AnimalBP {

    String type;
    int numberofFeet;
    String color;
    boolean egg;
    
    public void setType(String type){
        this.type = type;
    }
    public void setnumberofFeet(int numberofFeet){
        
        this.numberofFeet = numberofFeet;
    }
    
    public void setcolor(String color){
        this.color = color;
    }
    
    public void setbooleanegg(boolean egg){
        this.egg = egg;
    }
    
    public String getType(){ 
       return type;  
       
   }
    public int getnumberofFeet(){
       return numberofFeet;  
    }
    public String getcolor(){
       return color;  
    }
    public boolean booleanegg(){
       return egg;   
    }
   
}
