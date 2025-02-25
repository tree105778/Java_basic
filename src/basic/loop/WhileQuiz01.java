package basic.loop;

import java.util.Scanner;

public class WhileQuiz01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int upper, lower;


        /*
        upper = num1 > num2 ? num1 : num2;
        lower = num1 > num2 ? num2 : num1;
         */
        if (num1 > num2) {
            upper = num1;
            lower = num2;
        } else {
            upper = num2;
            lower = num1;
        }
        int total = 0;
        int i = lower;
        while (i <= upper) {
            total += i;
            i++;
        }
        System.out.printf("%d부터 %d까지의 누적합계: %d\n", lower, upper, total);
    }
}
