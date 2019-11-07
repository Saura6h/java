class inString
{
	public static void main(String[] args) 
	{
		System.out.print(searchFirst(args[0],args[1]));

	}
	static int searchFirst(String s1,String s2){
		boolean inString=false;
		int index_s2=0;
		for(int i=0;i<s1.length();i++)
		{
			if (s1.charAt(i)==s2.charAt(0))//if indexed character is equal to first character of s2
			{
				if (i+s2.length()<s1.length())
				{	
					if (s1.substring(i,i+s2.length()).equals(s2))// if the substring following index matches s2
					{
						inString=true;
						index_s2=i;
					}
				}
			}
		}
		if (inString){
			return  index_s2;
		}else{
			return -99;
		}
	}
}