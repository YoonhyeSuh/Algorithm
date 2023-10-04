import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//순서대로 킹, 퀸, 룩, 비숍, 나이트, 폰의 개수를 입력 받음
//BufferReader로 문자열 한줄씩 읽기
//StringTokenizer로 입력받은 문자열을 공백으로 분리
//IOException 까먹지 않기
//nextToken()으로 받기
//문자열이므로 int로 형변환
//원래수 - 입력받은 수를 계산해서 출력
//1차 시도 20분 성공

public class bj_3003 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		
		int king = Integer.parseInt(st.nextToken());
		int queen = Integer.parseInt(st.nextToken());;
		int rook = Integer.parseInt(st.nextToken());;
		int bishop = Integer.parseInt(st.nextToken());;
		int knight = Integer.parseInt(st.nextToken());;
		int pawn = Integer.parseInt(st.nextToken());;
		
		king = 1 - king;
		queen = 1 - queen;
		rook = 2 - rook;
		bishop = 2 - bishop;
		knight = 2 - knight;
		pawn = 8 - pawn;
		
		System.out.print(king + " ");
		System.out.print(queen + " ");
		System.out.print(rook + " ");
		System.out.print(bishop + " ");
		System.out.print(knight + " ");
		System.out.print(pawn + " ");
		
	}

}
