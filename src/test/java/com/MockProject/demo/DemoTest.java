package com.MockProject.demo;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.MockProject.demo.services.BubbleSort;

public class DemoTest {
@Test
public void test()
{
	BubbleSort bubbleSort=new BubbleSort();
	String bubbleSortvalue=bubbleSort.Sort();
	assertEquals(bubbleSortvalue,"hi there in Bubble");
}
}
