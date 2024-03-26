package aJAVA_question;

public class q_08 {
    public static void main(String[] args) {

        int totalSec = 7582;

        int min = totalSec / 60;
        int sec = totalSec % 60;

        int hour = min / 60;

        int min_2 = min - (hour * 60);

        System.out.printf(String.format("%d시간 %d분 %d초", hour, min_2, sec));
    }
}
