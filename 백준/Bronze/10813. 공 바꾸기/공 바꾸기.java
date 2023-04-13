import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A, B, C, D, E, F, G, H;

        A = sc.nextInt();
        B = sc.nextInt();
        E = 0;

        int[] arr = new int[A];

        for (int i = 0; i < A; i++) {

            arr[i] = i + 1;

        }

        for (int i = 0; i < B; i++) {

            C = sc.nextInt();
            D = sc.nextInt();

            E = arr[C - 1];
            arr[C - 1] = arr[D - 1];
            arr[D - 1] = E;

        }

        for (int i = 0; i < A; i++) {

            System.out.print(arr[i] + " ");

        }


        sc.close();

    }

}