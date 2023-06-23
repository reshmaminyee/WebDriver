package Nactest;

public class numberofcharacters {

	public static void main(String[] args) {
		String name="RESHMA";
		int count=0;
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)!=' ')
			{
				count++;	
			}
			}
		{
			System.out.println(count);
		}

	}

}
