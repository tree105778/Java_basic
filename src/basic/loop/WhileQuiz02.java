package basic.loop;

import java.util.Scanner;

public class WhileQuiz02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        boolean isPrime = true;

        int i = 2;
        while (i < num) {
            if (num % i == 0) {
                isPrime = false;
            }
            i++;
        }

        if (isPrime) {
            System.out.println(num + "은 소수입니다.");
        } else {
            System.out.println(num + "은 소수가 아닙니다.");
        }

        /* 강사님 코드 1
        System.out.println("========================================");

        int j = 2;

        while (num % j != 0) {
            j++;
        }

        System.out.printf("%d는(은) %s\n"
                , num, num == j ? "소수입니다." : "소수가 아닙니다.");

        sc.close();
        */
    }
}
