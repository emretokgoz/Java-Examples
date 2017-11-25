
package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {
   
    public static void main(String[] args) {
  
    for(;;){
    Scanner scan = new Scanner(System.in);
 
        System.out.println("A için bir değer girin:");
    int a = scan.nextInt();
        System.out.println("B için bir değer girin:");
    int b = scan.nextInt();
     
        if (a != b){
            
        System.out.println("A B ye eşit değildir.");
         
        }
        else {
        System.out.println("A B ye eşittir.");
                
        }    
        
    }            
    }
    
}
