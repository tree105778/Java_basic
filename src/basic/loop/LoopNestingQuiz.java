package basic.loop;

import java.util.Scanner;

public class LoopNestingQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("소수 입력: ");
        int num = sc.nextInt();
        int totalCount = 0;
        boolean isPrime;

        for (int i = 2; i <= num; i++) {
            isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                totalCount++;
                System.out.print(i + " ");
            }
        }
        System.out.println("\n소수의 개수: " + totalCount);

        sc.close();
    }
}
