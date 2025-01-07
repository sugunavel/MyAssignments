package homeassignments;

import java.util.Scanner;

import cucumber.api.cli.Main;

public class IsPrime {
	public static void main(String args[]){    
		  int i,m=0,flag=0;      
		  Scanner scan = new Scanner(System.in);    
	      System.out.print("Enter a number : ");    
	      int num = scan.nextInt();       
		       
		  if(num==0||num==1){  
		   System.out.println(num+" is not prime number");      
		  }else{  
		   for(i=2;i<num;i++){      
		    if(num%i==0){      
		     System.out.println(num+" is not prime number");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)
		   { 
			   System.out.println(num+" is prime number");
			   }  
		  }//end of else  
		}    
		}   

