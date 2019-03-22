package com.collections;

import java.util.HashMap;
import java.util.Scanner;

public class RepeatativeCharactersCount {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		System.out.println(str);
		HashMap<Character, Integer> charMap=new HashMap<Character, Integer>();
		char[] str_ch=str.toCharArray();
		for(char c:str_ch)
		{
			if(charMap.containsKey(c))
			{
				charMap.put(c, charMap.get(c)+1);
				//System.out.println("if"+charMap.put(c, charMap.get(c)+1));
			}
			else
			{
				charMap.put(c, 1);
				//System.out.println("else"+charMap.put(c, 1));
			}
		}
		System.out.println(charMap);
		
	}
		

}
