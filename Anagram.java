package c2tc;
import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
	  public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter first word ");
	    String str1 = input.nextLine();
	    System.out.print("Enter second word ");
	    String str2 = input.nextLine();

	    if(str1.length() == str2.length()) {

	    //conversting to array
	      char[] charArray1 = str1.toCharArray();
	      char[] charArray2 = str2.toCharArray();

	      // sorting to  the char array
	      Arrays.sort(charArray1);
	      Arrays.sort(charArray2);

	      // if sorted char arrays are same then thhey are anagram

	      boolean result = Arrays.equals(charArray1, charArray2);

	      if(result) {
	        System.out.println( "Anagram.");
	      }
	      else {
	        System.out.println(" not anagram.");
	      }
	    }
	    else {
	      System.out.println(" not anagram.");
	    }

	    input.close();
	  }
	}

