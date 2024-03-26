package ch04;

public class S06_continue {
    public static void main(String[] args) {

        int a = 0;
        while (a < 10) {
            a++;
            if (a % 2 == 0) {
                continue;  // a 가 짝수일 때.
            }
            System.out.println(a);
        }
    }
}
