package week1.day1;
import java.util.Arrays;


public class duplicatenum {

	public static void main(String[] args) {
		int[] A= {5,8,9,10,5};
		Arrays.sort(A);
		int length = A.length;
		for (int i=0;i<A.length-1;i++)
		{
			if(A[i]== A[i+1])
			{
				System.out.println(A[i]);
			}
		}


	}

}
