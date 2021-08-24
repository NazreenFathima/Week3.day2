package week3.day2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortCollections {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//1.Declare a String array and add the Strings values as (Google,Microsoft,TestLeaf,Maverick)	
		String[] stringArr = {"Google" ,"Microsoft","TestLeaf","Maverick"};
		
		//2.Get the length of the array
		int length = stringArr.length;
		System.out.println("Length of the array : "+length);
		
		List<String> StrList = new ArrayList<>(Arrays.asList(stringArr));
		System.out.println("String List : "+StrList);
		//3. sort the array	
		Collections.sort(StrList);
		System.out.println("Sorted String List : "+StrList);
		
		//4. Iterate it in the reverse order
		Collections.reverse(StrList);
		System.out.println("Reverse String List : "+StrList);
	
	}

}		




