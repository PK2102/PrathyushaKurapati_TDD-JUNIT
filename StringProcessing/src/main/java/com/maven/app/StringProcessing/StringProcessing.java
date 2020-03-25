package com.maven.app.StringProcessing;

public class StringProcessing {
	

	public String process(String str) {
		// TODO Auto-generated method stub
		String result=str;
		if(str.length()==1)
		{
			if(str.charAt(0)=='A')
				result="";
		}
		if(str.length()>=2)
		{
			if(str.charAt(0)=='A')
			{
				if(str.charAt(1)=='A')
					result = str.substring(2, str.length());
				else
					result = str.substring(1, str.length());
			}
			else
			{
				if(str.charAt(1)=='A')
					result = str.charAt(0)+str.substring(2,str.length());
				
			}
		}
		return result;
		
	}

}
