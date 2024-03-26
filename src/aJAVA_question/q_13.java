package aJAVA_question;

public class q_13 {
    public static void main(String[] args) {
        double gravity = -9.81;  // 중력 가속도
        double time = 5.0;       // 이동 시간
        double i_Vel = 0.0; // 초기 속도
        double i_Pos = 1000; // 초기 위치

        double total = (gravity * time * time / 2) + i_Vel + i_Pos;

//        System.out.println(total);
        System.out.println(String.format("%.2f초 후 위치: %.2fm", time, total));

        // ㅅㅂ.. 괄호 위치 조심하기 제발 . . .1!!

    }
}
