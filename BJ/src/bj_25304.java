import java.util.Scanner;

//구매한 물건들의 총 금액 X 입력받기
//구매한 물건이 몇개인지 N 입력받기
// for문으로 n개 만큼 돌려서 구매한 물건의 가격과 개수를 a와 b 입력받기
//구매한 물건의 가격 * 개수를 다 더하면 총 금액 sum으로 저장
//sum과 x가 같으면 Yes출력 아니면 No 출력

import java.util.Scanner;

public class bj_25304 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            sum += a * b;
        }

        if (sum == x) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

