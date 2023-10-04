import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


//과목명, 학점, 등급 20줄을 입력받기
//BufferReader로 입력받기
//for문을 돌려서 20줄 입력받기
//StringTokenzier로 과목명, 학점, 등급 각각 저장
//switch문을 이용해서 등급에 따라 과목평점 부여하고 학점*과목평점을 계산하여 sum 변수로 총점 저장
//score변수를 이용해서 sum/학점의 총합을 계산해 전공평점 저장
//score 출력 10의 -4승이므로 소수점 6번째자리까지 출력
//출력 서식(%지시자)로 출력할 경우 println이 아닌 printf로 출력
//1차 시도 걸린 시간 50분 실패 : 계산이 안맞는다 왜지...
//설마 StringTokenizer을 for문 안에다가 넣어서 계속 생성되는건가..?
//이것도 아니다
//아 이런 변수가 너무 많아서 헷갈렸다.. sumnum += num에서 num이 아닌 credit을 더해야한다
//2차 시도 걸린 시간 20분 성공


public class bj_25206 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		double sum = 0; //총점
		double sumnum = 0; // 학점의 총합
		double score = 0; //전공평점
		
		for(int i = 0; i < 20; i++) {
			st = new StringTokenizer(br.readLine());
			String subject = st.nextToken(); //과목
			double credit = Double.parseDouble(st.nextToken()); //학점
			String grade = st.nextToken(); // 등급
			double num = 0; //과목평점
			
			if(!(grade.equals("P"))){
				switch(grade) {
				case "A+" :
					num = 4.5;
					break;
				case "A0" :
					num = 4.0;
					break;
				case "B+" :
					num = 3.5;
					break;
				case "B0" :
					num = 3.0;
					break;
				case "C+" :
					num = 2.5;
					break;
				case "C0" :
					num = 2.0;
					break;
				case "D+" :
					num = 1.5;
					break;
				case "D0" :
					num = 1.0;
					break;
				case "F" :
					num = 0.0;
					break;
				default:
                    break;
				}
				sum += credit*num;
				sumnum += credit;
			}
			score = sum / sumnum;
		}
		System.out.printf("%.6f", score);
	}

}