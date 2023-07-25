package week1.day1;

import java.util.Arrays;

public class Missingelement {

	public static void main(String[] args) {
		int a[]= {5,8,6,4,3,1};
		int len=a.length;
		Arrays.sort(a);
		int count=0;
		for(int i=a[0];i<=a[len-1];i++)
		{
			if(a[count]== i)
			{
				count++;
			
			}else
			{
				System.out.println(i);
			}
		}
	

		
		
		
		

	}

}
