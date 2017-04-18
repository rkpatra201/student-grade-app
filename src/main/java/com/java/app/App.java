package com.java.app;

import java.util.Arrays;

import com.java.util.GradeManager;
import com.java.util.ResultModel;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		Float[] marksArr = new Float[] { 0f, 92f, 34f, 45.6f, 51.23f, 65f, 76f, 85f, 63.2f, 95.3f };

		ResultModel summary = new GradeManager().getResultSummary(Arrays.asList(marksArr));

		System.out.println("*****Result Summary*****");
		System.out.println("Max: " + summary.getMax());
		System.out.println("Min: " + summary.getMin());
		System.out.println("Avg: " + summary.getAvg());
		System.out.println("Pass Count: " + summary.getPassCount());
		System.out.println("Fail Count: " + summary.getFailCount());
	}
}

/**output **/

/*
 Hello World!
Input Mark: 0.0
Grade: F
Input Mark: 92.0
Grade: HD
Input Mark: 34.0
Grade: F
Input Mark: 45.6
Grade: F
Input Mark: 51.23
Grade: P
Input Mark: 65.0
Grade: C
Input Mark: 76.0
Grade: D
Input Mark: 85.0
Grade: HD
Input Mark: 63.2
Grade: P
Input Mark: 95.3
Grade: HD
*****Result Summary*****
Max: 95.3
Min: 0.0
Avg: 60.733
Pass Count: 6
Fail Count: 2

 */
