package c2tc;
import java.util.*;
/**
 * @author gurus
 *
 */
class ArraySearch
{  
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
    	int i,n,search,flag=0;
		System.out.println("Enter the size of an array") ;
 		n = sc.nextInt();
		int[] a = new int[n];
 
    		System.out.println("Enter the elements of an array") ;
    		for(i=0;i<n;i++)
    		{
        		a[i] = sc.nextInt();
    		}
		
		System.out.println("Enter the element to search\n");
		search = sc.nextInt();
    
    	
    		for(i=0;i<n;i++)
    		{
        		if(a[i]==search)
        		{
            			System.out.println("Element "+search+" found at "+i+" position");
            			flag=1;
            			break;
        		}
    		
    		}
    		
    		if(flag==0)
    		{
        		System.out.println("Element "+search+" not found");
    		}
	}
}
