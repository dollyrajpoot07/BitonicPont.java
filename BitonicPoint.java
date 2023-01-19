// You are given a bitonic sequence, the task is to find Bitonic Point in it.
// A Bitonic Sequence is a sequence of numbers which is first strictly increasing 
// then after a point strictly decreasing.

// Input : arr[] = {6, 7, 8, 11, 9, 5, 2, 1}
// Output: 11
// All elements before 11 are smaller and all
// elements after 11 are greater.

// Input : arr[] = {-3, -2, 4, 6, 10, 8, 7, 1}
// Output: 10

import java.io.*;
class BitonicPoint { 
	static int binarySearch(int arr[], int low, int high) {
		while (low <= high) {
		int mid = low + (high - low) / 2;

		if(arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1])
			return mid;

		else if (arr[mid] < arr[mid + 1])
			low = mid + 1;
		else
			high = mid - 1;
		}

		return -1;
	}

	public static void main (String[] args) {
		int arr[] = { 6, 7, 8, 11, 9, 5, 2, 1 };
		int n = arr.length;
		int index = binarySearch(arr, 1, n - 2);
		if (index != -1)
		System.out.println(arr[index]);
	}
}
