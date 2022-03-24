Minimum_distance_between_two_numbers.java

import java.util.Scanner;

public class Minimum_distance_between_two_numbers {

	static int minDist(int arr[], int n, int x, int y) {
		int start = -1;
		int end = -1;
		int INT_MAX = 1000000;
		int res = INT_MAX;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				start = i;
			}
			if (arr[i] == y) {
				end = i;
			}
			if (start != -1 && end != -1) {
				res = Math.min(res, Math.abs(start - end));
			}
		}
		return res;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter range :");
		int n = sc.nextInt();
		System.out.println("enter X elements : ");
		int x = sc.nextInt();
		System.out.println("enter Y elements : ");
		int y = sc.nextInt();
		System.out.println("enter arrays elements : ");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int res = minDist(arr, n, x, y);
		System.out.println(res);

	}

}
