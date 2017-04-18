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
