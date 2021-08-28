package week3.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class FindIntersectionCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {3,2,11,4,6,7};
		int[] arr2 = {1,2,8,4,9,7};
		
		Set<Integer> set1 = new LinkedHashSet<Integer>();
		Set<Integer> set2 = new LinkedHashSet<Integer>();
		

		for (int inter1:arr1 )
		{
			set1.add(inter1);
		}
		for (int inter2: arr2)
		{
			set2.add(inter2);
			
		}
		System.out.println("Numbers in set1 :" +set1);
		System.out.println("Numbers in set2 :" +set2);
		set1.retainAll(set2);
		System.out.println(set1);
		
		
	}

}
