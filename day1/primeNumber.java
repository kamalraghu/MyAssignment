package week1.day1;

public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i;
int n=3;
int count = 0;

for(i=2;i<=n/2;i++)
{
	if(n % i == 0) {
		count=1;
	}
	}
if(count == 0)
{
	System.out.println("Its is prime no");
}else {
	System.out.println("its not a prime");
}
}
	}


