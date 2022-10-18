package boj;

import java.util.Arrays;
import java.util.Scanner;

public class boj3003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] pieceArray = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		String result = (1 - pieceArray[0]) + " "
				+ (1 - pieceArray[1]) + " "
				+ (2 - pieceArray[2]) + " "
				+ (2 - pieceArray[3]) + " "
				+ (2 - pieceArray[4]) + " "
				+ (8 - pieceArray[5]);
		System.out.println(result);
	}
}
