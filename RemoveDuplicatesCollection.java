package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		String[] words = text.split(" ");
		
		Set<String> uniqueWords = new LinkedHashSet<String>();
		Set<String> duplicateWords = new LinkedHashSet<String>();
		
		for (String str : words)
		{
			if(!uniqueWords.add(str))
			{
			duplicateWords.add(str);
			}	
		}
		System.out.println("Dupliacte Words :" +duplicateWords);
		System.out.println("Unique Words : "+uniqueWords);
	}
	

}
