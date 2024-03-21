package practice;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int r,rev=0,temp;    
		  
		  Scanner s=new Scanner(System.in);
		  System.out.println("enter the number to be checked");
		  int n=s.nextInt();
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   rev=(rev*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==rev)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}  

	}


