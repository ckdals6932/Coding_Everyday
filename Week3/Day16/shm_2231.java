package Day16;

import java.util.Scanner;

public class shm_2231 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		int num_length = num.length();
		int sumDisassemble = Integer.parseInt(num);
		int constructor = 0;
		
		for (int i = sumDisassemble - (num_length*9); i < sumDisassemble - (num_length); i++) {
			int sum = 0;
			int saveNum = i;
			for (int j = 1; j <= num_length; j++) {
				sum += (saveNum % 10);
				saveNum /= 10;
			}
			if (sumDisassemble == sum + i) {
				constructor = i;
				break;
			}
		}
		System.out.println(constructor);
	}
}
