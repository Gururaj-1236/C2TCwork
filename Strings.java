package c2tc;
import java.util.*;
public class Strings {
		public static void main(String args[]){  
		Scanner s = new Scanner(System.in);
		System.out.println("enter the first string");
		String s1=s.nextLine();  
		System.out.println("enter the second string");
		String s2=s.nextLine(); 
		//finding length of string
		int s3=s1.length()+s2.length();
		System.out.println("string length is: "+s3); 
		//lexicographically
				int result=s1.compareTo(s2) ;
				if(result==0)
				{
					System.out.println("yes");
				}
				else
					System.out.println("no");
	   //Capitalize the first letter in A and B and print them on a single line,separated by a space.		
		String s4=s1.substring(0,1).toUpperCase()+s1.substring(1);
		String s5=s2.substring(0,1).toUpperCase()+s2.substring(1);
		System.out.println(s4+" "+s5);
		
		}
		}
  
