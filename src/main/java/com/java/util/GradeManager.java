package com.java.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GradeManager {

	private Map<String, Integer> dataMap = new HashMap<String, Integer>();

	public String getGrade(Float inputMark) {
		Float mark = inputMark;

		if (isMarkBetween(mark, 85, 100)) {
			return "HD";
		} else if (isMarkBetween(mark, 75, 84)) {
			return "D";
		} else if (isMarkBetween(mark, 65, 74)) {
			return "C";
		} else if (isMarkBetween(mark, 50, 64)) {
			return "P";
		} else if (isMarkBetween(mark, 0, 49)) {
			return "F";
		} else {
			return null;
		}
	}

	public boolean isMarkBetween(float mark, float low, float high) {
		if (mark >= low && mark <= high) {
			return true;
		} else {
			return false;
		}
	}

	public void studentPassFailCounter(String grade) {

		int counter = 0;
		if (dataMap.containsKey(grade)) {
			counter = dataMap.get(grade);
			counter++;
		}
		dataMap.put(grade, counter);
	}

	public ResultModel getResultSummary(List<Float> dataList) {

		String grade = null;
		Float[] maxMinAvgArr = new Float[3];
		Float min = dataList.get(0);
		Float max = dataList.get(0);
		Float sum = 0f;

		for (Float inputMark : dataList) {
			grade = getGrade(inputMark);

			System.out.println("Input Mark: " + inputMark);
			System.out.println("Grade: " + grade);

			if (grade.equals("F")) {
				studentPassFailCounter(grade);
			} else if (grade != null) {
				studentPassFailCounter("P");
			}

			min = min < inputMark ? min : inputMark;
			max = max > inputMark ? max : inputMark;
			sum = sum + inputMark;

		}

		Float avg = sum / dataList.size();

		ResultModel summary = new ResultModel(max, min, avg, dataMap.get("P"), dataMap.get("F"));

		return summary;

	}
	
	
}
