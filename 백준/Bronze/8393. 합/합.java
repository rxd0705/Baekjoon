import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //문제
        //n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
        //
        //입력
        //첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
        //
        //출력
        //1부터 n까지 합을 출력한다.

        Scanner sc = new Scanner(System.in);

        int A, B;

        A = sc.nextInt();

        B = 0;

        for (int i = 1; i < A + 1; i++) {

            B += i;

        }

        System.out.println(B);

        sc.close();
    }

}