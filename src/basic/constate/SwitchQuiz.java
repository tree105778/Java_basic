package basic.constate;

import java.util.Scanner;

public class SwitchQuiz {
    public static void main(String[] args) {
        int result = 0;
        boolean errorFlag = true;
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        String op = sc.next();
        int num2 = sc.nextInt();

        switch (op) {
            case "+":
                result = num1 + num2; errorFlag = false;
                break;
            case "-":
                result = num1 - num2; errorFlag = false;
                break;
            case "*":
                result = num1 * num2; errorFlag = false;
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("연산할 수 없는 값입니다.");
                    break;
                }
                result = num1 / num2; errorFlag = false;
                break;
            default:
                System.out.println("연산자를 다시 입력하세요.");
                break;
        }

        if (!errorFlag) {
            System.out.printf("%d %s %d = %d", num1, op, num2, result);
        }
        sc.close();
    }
}
