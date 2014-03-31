import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.spi.Invoker;


public class ReverseWords 
{
	public List<String> input=new ArrayList<>();
	int cases=0;
	
	public void ReadFromFile () throws IOException
	{
		BufferedReader reader=null;
		try 
		{
			reader= new BufferedReader(new FileReader("D:\\B-large-practice.in"));
			for(String line;(line = reader.readLine()) != null; )
				input.add(line);
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			if(reader !=null)
				reader.close();
		}
	}
	
	public void StringReverse(String words)
	{
		String[] revWords=words.split(" ");
		StringBuilder sb=new StringBuilder();
		
		sb.append("Case #");
		sb.append(cases+1);
		sb.append(": ");	
		
		for(int i=(revWords.length-1);i>=0;i--)
		{
			sb.append(revWords[i]);
			sb.append(" ");
		}
		
		System.out.println(sb.toString());
		cases++;
		
	}	
	public void Process()
	{
		int line=1;
		for(int i=0;i<Integer.parseInt(input.get(0));i++)
		{
			String str=input.get(line++);
			StringReverse(str);			
		}
	}
	public static void main(String[] args) 
	{
		ReverseWords obj=new ReverseWords();
		try 
		{
			obj.ReadFromFile();
			obj.Process();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}		
	}

}
