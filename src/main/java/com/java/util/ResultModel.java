package com.java.util;

public class ResultModel {

	private float max;
	private float min;

	private float avg;

	private int passCount;
	private int failCount;

	public ResultModel(float max, float min, float avg, int passCount, int failCount) {
		super();
		this.max = max;
		this.min = min;
		this.avg = avg;
		this.passCount = passCount;
		this.failCount = failCount;
	}

	public float getMax() {
		return max;
	}

	public void setMax(float max) {
		this.max = max;
	}

	public float getMin() {
		return min;
	}

	public void setMin(float min) {
		this.min = min;
	}

	public float getAvg() {
		return avg;
	}

	public void setAvg(float avg) {
		this.avg = avg;
	}

	public int getPassCount() {
		return passCount;
	}

	public void setPassCount(int passCount) {
		this.passCount = passCount;
	}

	public int getFailCount() {
		return failCount;
	}

	public void setFailCount(int failCount) {
		this.failCount = failCount;
	}

}
