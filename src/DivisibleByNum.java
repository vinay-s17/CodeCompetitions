import java.util.Scanner;


public class DivisibleByNum 
{
	public static void main(String[] args) 
	{
		int noOfDivisibleItems=0;
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		int[] numberList=new int[n];
		for(int i=0;i<n;i++)
		{
			numberList[i]=in.nextInt();
			if(numberList[i]%k==0)
				noOfDivisibleItems++;
		}
		System.out.println(noOfDivisibleItems);
	}
}
