import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StoreCredit 
{
	private List<String> input = new ArrayList<>();
	private List<String> output = new ArrayList<>();
	
	public int[] PositionOfItems(int credit,String[] priceOfItems)
	{
		int[] positions=new int[2];
		for(int i=0;i<priceOfItems.length;i++)
		{
			for(int j=i+1;j<priceOfItems.length;j++)
			{
				if((Integer.parseInt(priceOfItems[i]) + Integer.parseInt(priceOfItems[j])) == credit)
				{
					positions[0]=(i+1);
					positions[1]=(j+1);
				}
			}
		}
		Arrays.sort(positions);
		return positions;
	}
	
	public void process()
	{
		int counter = 1;
		for (int i=0; i<Integer.parseInt(input.get(0)); i++)
		{
			int credit = Integer.parseInt(input.get(counter++));
			counter++;
			//int itemCount = Integer.parseInt(input.get(counter++));
			String[] priceOfItems = input.get(counter++).split(" ");
			int[] result = PositionOfItems(credit, priceOfItems);
			
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append("Case #");
			stringBuilder.append(i+1);
			stringBuilder.append(": ");
			stringBuilder.append(result[0]);
			stringBuilder.append(" " + result[1]);
			System.out.println(stringBuilder.toString());
			output.add(stringBuilder.toString());
		}
	}
	
	public void ReadFromFile() throws IOException 
	{
		BufferedReader br = null;
		try 
		{
			br = new BufferedReader(new FileReader("D:\\A-large-practice.in"));
			for(String line; (line = br.readLine()) != null; )
				input.add(line);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			if(br != null)
				br.close();
		}
	}

	public static void main(String args[]) 
	{
		StoreCredit obj=new StoreCredit();
		try 
		{
			obj.ReadFromFile();
			obj.process();
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
