import java.util.Scanner;


public class DividingStamps 
{
	static int totalStamps=0;
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int testCases=in.nextInt();
		int[] stamps=new int[testCases];
		for(int i=0;i<testCases;i++)
		{
			stamps[i]=in.nextInt();
			totalStamps=totalStamps+stamps[i];	
		}
		DividingStamps obj=new DividingStamps();
		if(obj.CountForDivision(stamps))
			System.out.println("YES");
		else
			System.out.println("NO");
	}
	public boolean  CountForDivision(int[] stamps)
	{
		boolean result=false;
		for(int i=0;i<stamps.length;i++)
		{
			totalStamps=totalStamps-(i+1);
			
		}		
		if(totalStamps==0)
			result=true;
		return result;
	}
}
