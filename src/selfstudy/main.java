package selfstudy;

import java.util.Calendar;

class Tire {
    void roll() {
        System.out.println("일반 타이어가 굴러갑니다");
    }
}

class Car {
    private Tire tire1 = new Tire();
    private Tire tire2 = new Tire() {
        void roll() {
            System.out.println("익명 자식 tire 객체 1이 굴러갑니다.");
        };
    };
}
public class main {

    public static void main(String[] args) {

    }
}
