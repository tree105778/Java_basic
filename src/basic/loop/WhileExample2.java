package basic.loop;

public class WhileExample2 {

    public static void main(String[] args) {
        // 48 ~ 150 사이의 정수 중 8의 배수만 가로로 출력해 보세요.
        int i = 23;
        while (i <= 150) {
            if (i % 8 == 0) {
                System.out.print(i + " ");
                i += 8;
            } else
                i++;
        }

        System.out.println();
        // 1 ~ 100까지의 정수 중 4의 배수이면서
        // 8의 배수는 아닌 수를 가로로 출력해 보세요.
        int j = 1;
        while (j <= 100) {
            if (j % 8 != 0 && j % 4 == 0) {
                System.out.print(j + " ");
                j += 4;
            } else j++;
        }
        System.out.println();
        //1 ~ 30000 까지의 정수 중 258의 배수의 개수를 출력.
        int num = 1;
        int cnt = 0;
        while (num <= 30000) {
            if (num % 258 ==  0) {
                cnt++;
                num += 258;
            } else num++;
        }
        System.out.println("cnt = " + cnt);

        // 1000의 약수의 개수를 출력하세요.
        int k = 1;
        int count = 0;
        while (k <= 1000) {
            if (1000 % k == 0) {
                count++;
            }
            k++;
        }
        System.out.println("count = " + count);
    }

}
