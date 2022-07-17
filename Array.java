package c2tc;
import java.util.*;



public class Array {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		System.out.println("enter the number of arrays");
		n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the elements of an array");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
			
		}
		
		System.out.println("enter the element to be deleted");
		int ele =s.nextInt();
		for(int i=0; i<arr.length-1;i++)
		{
			if(arr[i]==ele)
			{
				for(int j=i;j<arr.length-1;j++)
				{
					arr[j]=arr[j+1];
				}
				break;
			}
			s.close();
		}
		System.out.println("array after deletion");
		for(int i=0;i<arr.length-1;i++)
		{
			System.out.println(arr[i]+"");
		}
	}

}
