package week1.day1;

public class Intersection {

	public static void main(String[] args) {
		
		int a[]= {5,2,8,9,10,54};
		int b[]= {5,20,98,78,10,54};
		
		for(int i=0;i< a.length; i++)
		{
			for(int j=0;j<b.length; j++)
			{
				if(a[i]==b[j])
				{
					System.out.println("Common value" + a[i]);
				}
			}
		}
		

	}

}
