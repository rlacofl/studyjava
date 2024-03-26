package aJAVA_question;

public class q_10 {
    public static void main(String[] args) {
        int man = 10000;
        int o_chun = 5000;
        int chun = 1000;

        man *= 3;
        o_chun *= 4;
        chun *= 7;

        int score = man + o_chun + chun;

        System.out.printf("%d원", score);
        // 꼭 String.format 을 안 써도 되는구나 . . .
    }
}
