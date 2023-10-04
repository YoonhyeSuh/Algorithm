import java.util.Scanner;

//scanner로 문자열 받기
//split로 공백 기준 자르기
//count로 받기
//1차 걸린 시간 20분-30분, 실패
//앞뒤 공백을 생각 안함
//인터넷에 쳐보니 trim()을 알게됨
//trim()은 문자열의 앞뒤 공백을 제거
//2차 걸린 시간 10분, 실패
//흠..왜지
//고민해본 결과 2차 시도 상태에서는 공백만 넣어도 갯수가 올라간다.
//그러면 공백일때 0이도록 if문을 써서 예외처리해준다.
//3차 시도 성공

public class bj_1152 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine().trim();
		int count = 0;
		
		if(s.equals("")) {
			count = 0;
		} else {
			count = s.split(" ").length;
		}
		
		
		System.out.println(count);
		
		scanner.close();
	}
}
