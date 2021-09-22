package com.springboot.realproject.restcrud.dao;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class FirstNonRepeatingCharacter {

	public static void main(String args[])
	{
		String str="heeho";
		HashMap<Character,Integer> hmp=new LinkedHashMap<Character, Integer>();
		for(int i=0;i<str.length();i++)
		{
			if(hmp.containsKey(str.charAt(i)))
			{
				hmp.put(str.charAt(i), hmp.get(str.charAt(i))+1);
			}
			else
			{
				hmp.put(str.charAt(i),1);
			}
		}
		for(char s:hmp.keySet())
		{
			if(hmp.get(s)==1)
			{
				System.out.println(s);
				break;
			}
		}
	
	}
}
