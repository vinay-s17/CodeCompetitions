import java.util.Scanner;


public class AbcStrings 
{
	public static void main(String[] args) 
	{
		int sequenceOfNames=0;
		Scanner in = new Scanner(System.in);
		String abcString=in.next();
		char[] charInAbcString=abcString.toCharArray();
		int length=charInAbcString.length;
		for(int i=0;i<length;i++)
		{
			if((i+2) < length)
			{
				char[] charInName={ charInAbcString[i],charInAbcString[i+1],charInAbcString[i+2]};
				String subName =new String(charInName);
				if(subName.contains("A") && subName.contains("B") && subName.contains("C"))
					sequenceOfNames=sequenceOfNames+1;
			}
		}
		System.out.println(sequenceOfNames);			
	}
}
