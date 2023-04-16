package com.healthycoderapp;


import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class BMICalculatorTest {

//	@Test
//	void testIsDietRecommended() {
//		//given 
//		double weight = 81.2;
//		double height = 1.50; 
//		
//		//when
//		
//		boolean recom = BMICalculator.isDietRecommended(weight, height);
//		
//		//then
//		
//		assertTrue(recom);
//	}
//	
//	@Test
//	void Return_array_Sum() {
//		
//		//given 
//		int[] array = {1,2,4,5};
//		
//		//when
//		
//		int res = StreamPractice.arraySum(array);
//		
//		//then
//		
//		assertEquals(13, res);
//	}
	
	
//	@Test
//	void return_sorted_array()
//	{
//		//given
//		
//		int[] array = {1,2,4,3,5};
//		
//		int[] expected = {1,4,3,4,5};
//		
//		//when
//		
//		int[] returnedList = StreamPractice.sortedArrayAccending(array);
//		
//		//then
//		
//		assertArrayEquals(expected, returnedList);
//		
////		assertArrayEquals(expected, returnedList);
//	}
	
//	@AfterAll
//	static void print()
//	{
//		System.out.println("Hello ist test case");
//	}
//	
//	
//	@BeforeAll
//	static void print1()
//	{
//		System.out.println("Hello second test case");
//	}
//	
	
//	@ParameterizedTest
//	@ValueSource(doubles = {70,60,50,80})
//	void testIsDietRecommended(Double paramWeight) {
//		//given 
//		double weight = paramWeight;
//		double height = 1.50; 
//		
//		//when
//		
//		boolean recom = BMICalculator.isDietRecommended(weight, height);
//		
//		//then
//		
//		assertTrue(recom);
//	}
	
	
//	@ParameterizedTest(name = "weight = {0} , height = {1}")
//	@CsvSource(value = {"90,1.5" , "40,1.80" , "80,1.5"})
//	void testIsDietRecommended(Double paramWeight , Double paramHeight) {
//		//given 
//		double weight = paramWeight;
//		double height = paramHeight; 
//		
//		//when
//		
//		boolean recom = BMICalculator.isDietRecommended(weight, height);
//		
//		//then
//		
//		assertTrue(recom);
//	}
//	
	
	@ParameterizedTest(name = "weight = {0} , height = {1}")
	@CsvFileSource(resources = "/testFile.csv")
	void testIsDietRecommendedCsvFile(Double paramWeight , Double paramHeight) {
		//given 
		double weight = paramWeight;
		double height = paramHeight; 
		
		//when
		
		boolean recom = BMICalculator.isDietRecommended(weight, height);
		
		//then
		
		assertTrue(recom);
	}
	
	
	
	
	

}
