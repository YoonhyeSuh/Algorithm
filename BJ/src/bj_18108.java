import java.util.Scanner;

//불기 연도 y를 scanner로 입력받기
//입력 받은 불기 연도를 서기 연도로 변환
//불기 - 543 = 서기

public class bj_18108 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int y = scanner.nextInt();
		System.out.println(y-543);

	}

}
