package com.hust.soict.k.helper;

public class InsertionSort implements NumberSorter {

	public void sort(int[] arr) {
		int n = arr.length;
		for(int i=1; i<n; i++) {
			int x = arr[i];
			int y = i;
			while( y > 0 && arr[ y - 1 ] > x ) {
				arr[y]=arr[y-1];
				y--;
			}
			arr[y]=x;
		}
	}
}