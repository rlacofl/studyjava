package aJAVA_question;

public class q_12 {
    public static void main(String[] args) {

        int num = 374;

        int hund = num / 100;         // 3
        int ten = (num % 100) / 10;   // 7
        int one = (num % 100) % 10;   // 4
                                      // = 14

        int total = hund + ten + one;
        System.out.printf("총합: %d", total);

    }
}
