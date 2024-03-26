package ch03;

public class S_04_boolean {
    public static void main(String[] args) {
        int base = 180;
        int height = 185;
        boolean isTall = height > base;  // true


        if(isTall) {
            System.out.println("키가 큽니다.");  // sout > 단축구문
        }

        // 2
        int i = 3;
        boolean is0dd = i%2 == 1;


        System.out.println(is0dd);
    }
}
