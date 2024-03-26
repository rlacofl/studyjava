package aJAVA_question;

public class q_11 {
    public static void main(String[] args) {
        double jan = 81.36;
        double feb = jan + 0.71;
        double mar = feb - 0.43;

        double all = jan + feb + mar;
        double score = all / 3;


        System.out.printf("%.2fkg", score);

        // 엥 여긴 String.format 쓰면 오류임. %f 에선 포멧 쓰면 안 되나 . . ? 봄 . . .
    }
}
