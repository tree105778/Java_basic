package basic.loop;

public class LoopNesting2 {
    public static void main(String[] args) {
        /*

         *
         **
         ***
         ****
         *****

         */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("============================================");
        /*

             *
            **
           ***
          ****
         *****

         */


        for (int i = 0; i < 5; i++) {
            // 별 찍기 전에 공백부터 만드는 for문
            for (int k = 0; k < 4 - i; k++) {
                System.out.print(" ");
            }
            // 별 찍는 for문
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("============================================");

        /*

        *****
         ****
          ***
           **
            *

         */

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 5; j > i ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
