import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.

        Scanner sc = new Scanner(System.in);

        double A, B = 0;

        A = sc.nextInt();
        B = sc.nextInt();

        sc.close();

        System.out.println(A / B);

    }
}