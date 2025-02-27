package oop.constructor;

public class Main {

    public static void main(String[] args) {

        Phone basic = new Phone();

        basic.showSpec();

        Phone basic2 = new Phone();
        basic2.showSpec();

        System.out.println("=======================================");

        Phone galaxy = new Phone("갤럭시 s25");
        galaxy.showSpec();

        System.out.println("=======================================");

        Phone iPhone = new Phone("아이폰 16", "스페이스 그레이");
        iPhone.showSpec();
    }

}