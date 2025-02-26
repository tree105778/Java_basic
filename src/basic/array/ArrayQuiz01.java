package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("# 먹고 싶은 음식을 입력하세요.");
        System.out.println("# 입력을 중지하려면 <그만> 이라고 입력하세요.");

        String[] foods = new String[0];
        String[] temp;

        while (true) {
            System.out.print("음식을 입력하세요(그만을 입력하면 프로그램 종료): ");
            String food = sc.next();

            if (food.equals("그만")) break;

            //기존 배열보다 큰 새 배열 생성
            temp = new String[foods.length + 1];

            for (int i = 0; i < foods.length; i++) {
                temp[i] = foods[i];
            }
            temp[foods.length] = food;
            foods = temp;
            temp = null;
            System.out.print("현재 음식 리스트: " + Arrays.toString(foods));
            System.out.println();
        }

        sc.close();
    }
}
