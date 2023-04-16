package com.healthycoderapp;

import java.util.ArrayList;
import java.util.List;


//class FunctionAdd{
//	
//	public int arraySum(List<Integer> array)
//	{
//		
//		int sum = 0;
//		for(int i : array)
//		{
//			sum = sum + i;
//		}
//		
//		return sum;
//	}
//}

public class StreamPractice {
	
	public static int arraySum(List<Integer> array)
	{
		
		int sum = 0;
		for(int i : array)
		{
			sum = sum + i;
		}
		
		return sum;
	}
	
	
	public static List<Integer> sortedListAccending(List<Integer> array)
	{
		return array.stream().sorted().toList();
	}

	
	public static int[] sortedArrayAccending(int[] array)
	{
		
		 int[] array1 = array;
		for(int i = 0 ; i<array1.length;i++)
			{
				for(int j = i+1 ; j<array1.length; j++)
				{
					if(array1[i] > array1[j])
					{
						int temp = array1[i];
						array1[i] = array1[j];
						array1[j] = temp;
					}
				}
			}
		
		return array1;
	}
	public static void main(String[] args) {
		List<Integer> array = new ArrayList<>();
		array.add(2);
		array.add(1);
		array.add(3);
		array.add(5);
		array.add(4);
		
		
		
//		FunctionAdd obj = new FunctionAdd();
		
//		System.out.println(arraySum(array));
		
		
		int[] arr = {2,1,3,5,4};
		
		int[] newArray = sortedArrayAccending(arr);
		
		for(int i : newArray)
		{
			System.out.println(i);
		}
		
		
		
		
//		List<Integer> returnedList = sortedAccending(array);
//		
//		for(int i : returnedList)
//		{
//			System.out.println(i);
//		}
//		
		
//		array.stream().sorted().forEach(System.out :: println);
		
//		int array[] = {3,2,1,4,5};
//		
////		for(int i : array)
////		{
////			System.out.println(i);
////		}
//		
//		
//		for(int i = 0 ; i<array.length;i++)
//		{
//			for(int j = i+1 ; j<array.length; j++)
//			{
//				if(array[i] > array[j])
//				{
//					int temp = array[i];
//					array[i] = array[j];
//					array[j] = temp;
//				}
//			}
//		}
//		
//		for(int i : array)
//		{
//			System.out.println(i);
//		}
//		
	

	}

}
