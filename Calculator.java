 
package mypack; 
import java.util.Scanner;
import java.io.*;
import java.util.*;


public class Calculator {

public static void main(String[] args) {

     Console console = System.console();
	 System.out.print("Please enter expression value (Eg: 1+1 or 2^2 or 1+1-1*1) :\n");
	 
	 
     String str = console.readLine();
	 if(str !=null && !str.equals("")) {
	 System.out.println("\nYour expression is : "+str);
     double answer = calculateAnswer(str);
     int inAnswer = (int)answer;
	 System.out.println("\nCalucalated answer is : "+ inAnswer);   
	 }
	 else {
		 System.out.println("\nPlease enter valid input value. ");   
	 }
	
  }
 

/*Here we are calculating result */
public static double calculateAnswer(String str){
	    
	   
	    double answer = 0;
	    char a[]=str.toCharArray();

	    try{
        for(int i=0;i<a.length-1;){
        	double firstResultValue=answer;
        	
        	if(answer ==0){
        		firstResultValue =Double.parseDouble(""+a[i]);
        	}
           
	        answer = mathOperations(a[i+1],firstResultValue,Double.parseDouble(""+a[i+2]));
	        i = i+2;
        }
		
		 }
	 catch(Exception e){
		 System.out.println("\nPlease enter valid input value. ");  
         System.exit(0);	 
	 }
	            
	    return answer;
}

/*Here we are doing arithmetic operations*/
public static double mathOperations(char operator,double inputA,double inputB){
	
	 MathCalculation Maths = new MathCalculation();
	 double answer = 0;
	 
	switch (operator) {
    case '+': answer = Maths.add(inputA, inputB); //Adding
              break;
    case '-': answer = Maths.subtract(inputA, inputB);//Subtract
              break;
    case '*': answer = Maths.multiply(inputA, inputB);//Multiply
              break;
    case '/': answer = Maths.divide(inputA, inputB);//Divide
              break;
    case '^': answer = Maths.power(inputA, inputB);//Power
              break;
    }
	 
	return answer;
	
}




}