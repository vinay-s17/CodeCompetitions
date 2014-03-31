import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



public class BadHorse 
{
	static List<String> input=new ArrayList<>();
	static List<String> processingString=new ArrayList<>();
	static int cases=0;
	public static void main(String[] args) 
	{
		BadHorse obj=new BadHorse();
		try 
		{
			obj.ReadFromFile();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}

		int counter=1;
		int testCase = 1;
		for(int i=0; i<Integer.parseInt(input.get(0)); i++)
		{
			Set<String> team1 = new HashSet<String>();
			Set<String> team2 = new HashSet<String>();
			boolean validTeam = true;
			int innerLoop = Integer.parseInt(input.get(counter++));
			for(int j=0; j<innerLoop; j++)
			{
				String pair = input.get(counter++);
				String[] players = pair.split(" ");
				team1.add(players[0]);
				team2.add(players[1]);
				if(team2.contains(players[0]) || team1.contains(players[1]))
				{
					validTeam = false;
					counter = counter + (innerLoop - j - 1);
					break;
				}
			}
			
			System.out.println("Case #" + testCase + ": " + (validTeam ? "Yes" : "No"));
			testCase++;
		}
	}
		
		/*for(int j=0;j<Integer.parseInt(input.get(0));j++)
		{
			int noOfDiv=0;
			int innerCounter = Integer.parseInt(input.get(counter++));
			for (int i = 0; i <innerCounter; i++) 
			{
				names =input.get(counter++).split(" ");	
				if(names[0] !=names[1])
					noOfDiv=obj.Result(names);
				else
				{
					noOfDiv=1;
					break;
				}
			}			
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append("Case #");
			stringBuilder.append(cases+1);
			stringBuilder.append(": ");		
			if(noOfDiv%2==0)
			{
				stringBuilder.append("Yes");
				System.out.println(stringBuilder.toString());
			}
			else
			{
				stringBuilder.append("No");
				System.out.println(stringBuilder.toString());	
			}
			cases++;
			processingString.clear();
		}*/
	
	
	public int Result(String[] names)
	{
			processingString.add(names[0]);
		for(int i=0;i<names.length;i++)
		{
			for (int j = 0; j < names.length; j++) 
			{				
				if(!names[i].equals(names[j]))
				{
					if(!processingString.contains(names[i]))
						processingString.add(names[i]);
				}
			}
		}
		return processingString.size();		
	}
	
	
	public void ReadFromFile() throws IOException 
	{
		BufferedReader br=null;
		try 
		{
			br=new BufferedReader(new FileReader("D:\\AA-small-practice-1.in"));
			for(String line; (line=br.readLine())!=null;)
			{
				input.add(line);
			}
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			if(br.readLine()==null)
				br.close();
		}		
	}
}
