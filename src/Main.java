import java.util.ArrayList;
import java.util.List;


public class Main 
{
	public static void main(String[] args) 
	{
		List<String> uniqueNames=new ArrayList<>();
		String names[][]={
				{"vijay","vinoth"},
				{"vijay","shylu"},
				{"vijay","vinoth"},
				{"vijay","vinoth"} 				
				};
		for (int i = 0; i < names.length; i++) 
		{
			for (int j = 0; j < names[j].length; j++) 
			{
				//System.out.println(names[i][j]);
				if(!uniqueNames.contains(names[i][j]))
					uniqueNames.add(names[i][j]);
			}
		}
		
		for (String string : uniqueNames) 
		{
			System.out.println(string);
		}
		
		if(uniqueNames.size()%2==0)
			System.out.println("Yes");
		else
			System.out.println("No");
		
		
		
	}

}
