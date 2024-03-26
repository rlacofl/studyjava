package ch04;

public class S01_if {
    public static void main(String[] args) {
        // if문
        int money = 2000;
        if (money >= 3000) {
            System.out.println("택시 타고 가셈");
            
        } else {
            System.out.println("걸어가");


         // and, or, not 연산자 ( &&(and), ||(or), !(not) )

            boolean hasCard = true;
            if (money >= 3000 || hasCard) {
                System.out.println("택시 타고 가");
            } else {
                System.out.println("걸어가");
            }

            if (money >= 3000 && hasCard) {
                System.out.println("택시 타고 가");
            } else {
                System.out.println("걸어가");
            }

        }
    }
}
