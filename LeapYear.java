package c2tc;
import java.util.Scanner;
public class LeapYear {
   public static void main(String[] args){
      int year;
      System.out.println("Enter an Year :: ");
      Scanner s = new Scanner(System.in);
      year = s.nextInt();

      if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
         System.out.println(year +" is a leap year");
      else
         System.out.println(year + " is not a leap year");
   }
}
