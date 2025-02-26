package basic.array;

import java.util.Scanner;

public class InfiniteLoopQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, opIndex, result;
        int correct = 0, wrong = 0;
        char[] op = {'+', '-', '*', '/'};

        System.out.println("*** 연산 퀴즈 ***");
        System.out.println("# 종료하시려면 0을 입력하세요.");

        while (true) {
            num1 = (int) (100 * Math.random() + 1);
            num2 = (int) (100 * Math.random() + 1);
            opIndex = (int) (4 * Math.random());
            switch (opIndex) {
                case 0: result = num1 + num2; break;
                case 1: result = num1 - num2; break;
                case 2: result = num1 * num2; break;
                case 3: result = num1 / num2; break;
                default:
                    System.out.println("오류가 발생했습니다. 문제를 다시 출제하겠습니다");
                    continue;
            }
            System.out.printf("%d %c %d는? ", num1, op[opIndex], num2);
//            int input = sc.nextInt();
            String answer = sc.next();
            if (answer.equals("종료")) break;
            int input = Integer.parseInt(answer);
//            if (input == 0) break;
            if (result == input){
                System.out.println("정답입니다!");
                correct++;
            }
            else {
                System.out.println("오답입니다!");
                wrong++;
            }
        }
        System.out.println("정답횟수: " + correct);
        System.out.println("오답횟수: " + wrong);
    }
}
