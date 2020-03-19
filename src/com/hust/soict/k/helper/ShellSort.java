package com.hust.soict.k.helper;

public class ShellSort implements NumberSorter {

	public void sort(int[] arr) {
		int n = arr.length;
		for (int tmp = n / 2; tmp > 0; tmp /= 2) {
	        for (int i = tmp; i < n; i++) {
	            int key = arr[i];
	            int j = i;
	            while (j >= tmp && arr[j - tmp] > key) {
	                arr[j] = arr[j - tmp];
	                j -= tmp;
	            }
	            arr[j] = key;
	        }
	    }
	}
}