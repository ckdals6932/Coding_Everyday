import java.util.*;

public class Main {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		for(int i = 0; i < testCase; i++) {
			int n = sc.nextInt();
			for(int j = 0; j < n; j++) {
				System.out.print("=");
			}
			System.out.println();
		}
	}
}
