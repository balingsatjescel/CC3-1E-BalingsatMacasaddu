
package javaapplication15;
import java.util.Scanner;
public class JavaApplication15 {
   
    public static double mean(double[] x){
        double average = 0;
    for (int i=0;i<x.length;i++){
        average+= x[i];
        
    }
    System.out.println("Sum = " + average);
    return average/x.length;
    }
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("How many numbers do you want to enter? ");
    int a = 0;
    while(true){
            sc = new Scanner(System.in);
    try{
        a = sc.nextInt();
        break;
        }catch(Exception e){
            System.out.println("Invalid Input");
                        
           }
    }
        double list[] = new double[a];
        
     int i,num = 0;
     String input = " ";
   
     for(i=0; i<a; i++){
         System.out.print("Enter a number[" + i + "] = "); 
         list[i] = sc.nextFloat();     
         
     }
        System.out.println("Mean is: " + mean(list));
        
        Scanner scanner = new Scanner(System.in);
        
            int b = sc.nextInt();
            System.out.print("How many numbers do you want to enter?");
           
            
           }
                
            }
                              
    