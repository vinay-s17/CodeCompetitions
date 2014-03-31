import java.text.DecimalFormat;
import java.util.Scanner;
public class AtmCodeChef 
{
	public  static void main(String ar[])
		{
			Scanner in = new Scanner(System.in);
			int withdraw = in.nextInt();
			double balance = in.nextDouble();
	 
			DecimalFormat df = new DecimalFormat(".00");
			if ((withdraw+0.5) <= balance && withdraw % 5 == 0)
				System.out.println(df.format(balance - withdraw - 0.50));
			else
				System.out.println(df.format(balance));
		}
}
