package com.hust.soict.k.helper;

public class BubbleSort implements NumberSorter {

	public void sort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
	        for (int j = n - 1; j >= 1; j--) {
	            if (arr[j] < arr[j - 1]) {
	                int temp = arr[j];
	                arr[j] = arr[j-1];
	                arr[j-1] = temp;
	            }
	        }
	    }
	}
}