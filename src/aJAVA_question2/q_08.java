package aJAVA_question2;

public class q_08 {

    static class Elevator {
        public static void main(String[] args) {

            int a = 13;
            int b = 7;
            int c = 10;


            String a1 = String.valueOf(a);
            String b1 = String.valueOf(b);
            String c1 = String.valueOf(c);


            System.out.printf("%d층 -> %s 엘레베이터\n", a, guide(a));
            System.out.printf("%d층 -> %s 엘레베이터\n", b, guide(b));
            System.out.printf("%d층 -> %s 엘레베이터\n", c, guide(c));
        }

        public static String guide(int floor) { //와 스트링 변환하는거 이렇게 할 수도 잇음
            String guide = "F";

            if (floor < 11) {
                guide = "저층";
            }else if (floor >= 10) {
                guide = "고층";
            }

            return guide;
        }
    }
}
