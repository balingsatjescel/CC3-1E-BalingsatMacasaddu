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
public class Animals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       //create object for AnimalsBP
        AnimalBP turtle = new AnimalBP();
        System.out.println("Turtle");
        System.out.print("Specie:  ");
        turtle.setType("Reptile");
        String turtleType = turtle.getType();      
        System.out.println(turtleType);
        
        System.out.print("Number of feet:  ");
        turtle.setnumberofFeet(4);
        int turtlenumberofFeet = turtle.getnumberofFeet();
        System.out.println(turtlenumberofFeet);
        
        System.out.print("What color:  ");
        turtle.setcolor("Green");
        String turtleColor = turtle.getcolor();
        System.out.println(turtleColor);
        
        System.out.print("Lays egg?  ");
        turtle.setbooleanegg(true);
        Boolean turtleBooleanegg = turtle.booleanegg();
        System.out.println(turtleBooleanegg);
        System.out.println("---------------------");
               
        
        AnimalBP dog = new AnimalBP();
        System.out.println("Dog");
        System.out.print("Specie:  ");
        dog.setType("Mammal");
        String dogType = dog.getType();      
        System.out.println(dogType);
        
        System.out.print("Number of feet:  ");
        dog.setnumberofFeet(4);
        int dognumberofFeet = dog.getnumberofFeet();
        System.out.println(dognumberofFeet);
        
        System.out.print("What color:  ");
        dog.setcolor("Black");
        String dogColor = dog.getcolor();
        System.out.println(dogColor);
        
        System.out.print("Lays egg?  ");
        dog.setbooleanegg(false);
        Boolean dogBooleanegg = dog.booleanegg();
        System.out.println(dogBooleanegg);
        System.out.println("---------------------");
        
        
        AnimalBP cat = new AnimalBP();
        System.out.println("Cat");
        cat.setType("Mammal");
        String catType = cat.getType();      
        System.out.println(catType);
        
        System.out.print("Number of feet:  ");
        cat.setnumberofFeet(4);
        int catnumberofFeet = cat.getnumberofFeet();
        System.out.println(catnumberofFeet);
        
        System.out.print("What color:  ");
        cat.setcolor("White");
        String catColor = cat.getcolor();
        System.out.println(catColor);
        
        System.out.print("Lays egg?  ");
        cat.setbooleanegg(false);
        Boolean catBooleanegg = cat.booleanegg();
        System.out.println(catBooleanegg);
        
    }
    
}

