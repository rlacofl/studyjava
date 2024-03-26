package aJAVA_question;

public class q_14 {
    public static void main(String[] args) {

        int total = 152365;

        int oman = 5;
        int man = 0;
        int ochun = 0;
        int chun = 2;

        int discount = 365;

        int totalbill = 7;

        System.out.printf("5만원 x %d\n", oman);
        System.out.printf("만원 x %d\n", man);
        System.out.printf("5천원 x %d\n", ochun);
        System.out.printf("천원 x %d\n", chun);
        System.out.println("------------------");

        System.out.printf("총 장수: %d장\n", totalbill);
        System.out.printf("금액: %d원\n", total - discount);
        System.out.printf("할인: %d원", discount);
    }
}
