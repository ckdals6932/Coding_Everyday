import java.util.*;

public class Main{
	public static void main(String[] args){////그냥 이쯤되면 배열애호가네;;; 
		Scanner scan = new Scanner(System.in);
		int round = scan.nextInt();
		//// 이 문제도 배열 없이 풀 수 있을거 같단 말이지~
		int changYoung[] = new int [round]   // 세미콜론 다 어디갓죠 ? :ㅋㅋㅋㅋㅋ
		int sangDeok = new int [round]   // 세미콜론 다 어디갓죠 ? : ㅋㅋㅋㅋㅋ
		int sangPoint = 100;
		int changpoint = 100;
		for(int i = 0 ; i < round ; i++){
			changYoung[i] = scan.nextInt();
			sangDeok[i] = scan.nextInt();
			if(sangDeok[i] == changYoung[i]){
				continue;
			}
			if(sangDeok[i] > changYoung[i]) {
				changpoint-=sangDeok[i];
			}
			if(sangDeok[i] < changYoung[i]){
				sangPoint-=changYoung[i];
			}
		}
		
		System.out.println(changpoint);
		System.out.println(sangPoint);
	}
}