package c2tc;
import java.util.*;
public class EvenOdd {
public static void main (String[] args)
{
Scanner sc = new Scanner(System.in);
int n;
System.out.println("Enter the number :");
n = sc.nextInt();
if((n/2)*2==n)
{
System.out.print("Even\n");
}
else
System.out.print("Odd\n");
}
}
