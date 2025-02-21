package basic.casting;

public class CastingExample3 {

    public static void main(String[] args) {
        char c = 'B';
        int i = 2;

        //서로 다른 타입간의 연산은 작은 쪽이 큰 쪽을 따라간다.
        int intResult = c + i;
        char charResult = (char) (c + i);
        System.out.println();

        System.out.println("charResult = " + charResult);
        System.out.println("intResult = " + intResult);

        /////////////////////////////////////////////////////

        // int와 int의 연산은 결과가 int
        // double의 연산을 위해 직접 형 변환을 진행해야 한다.
        int k = 10;
        double d = (double) k / 4;
        System.out.println("d = " + d);
    }
}
