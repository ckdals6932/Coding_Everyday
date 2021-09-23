import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int wordLength = sc.nextInt();
		long sum = 0;
		String word = sc.next();
		String saveNumber = "";
		
		for(int i = 0; i < wordLength; i++) {
			boolean findNum = word.charAt(i) >= '0' && word.charAt(i) <= '9';
			if(findNum) {
				saveNumber += word.charAt(i);
			}
			else {
				if(saveNumber.length() > 0) {
					sum += Long.parseLong(saveNumber);
					saveNumber = "";
					}
				}
			}
		if(saveNumber.length() > 0) {
			sum += Long.parseLong(saveNumber);
			saveNumber = "";
			}
		System.out.println(sum);
	}
}