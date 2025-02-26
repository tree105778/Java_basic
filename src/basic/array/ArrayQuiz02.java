package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] kakao = {"무지", "네오", "어피치", "라이언", "춘식이"};
        int findIndex = -1;
        String[] temp;

        while (kakao.length > 0) {
            System.out.println("현재 저장된 친구들: " + Arrays.toString(kakao));
            System.out.print("삭제할 친구 이름을 입력하세요: ");
            String name = sc.next();

            for (int i = 0; i < kakao.length; i++) {
                if (kakao[i].equals(name)) {
                    findIndex = i;
                    break;
                }
            }

            if (findIndex == -1) {
                System.out.println("입력받은 이름이 없습니다.");
                continue;
            }

            temp = new String[kakao.length - 1];
            for (int i = findIndex; i < kakao.length - 1; i++) {
                kakao[i] = kakao[i + 1];
            }
            for (int i = 0; i < temp.length; i++) {
                temp[i] = kakao[i];
            }
            kakao = temp; temp = null;
            findIndex = -1;
        }
        System.out.println("더 이상 삭제할 친구가 없네요.");
        System.out.println("프로그램을 종료합니다.");
        sc.close();
    }
}
