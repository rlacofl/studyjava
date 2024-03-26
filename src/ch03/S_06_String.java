package ch03;

public class S_06_String {
    public static void main(String[] args) {

        // 리터럴 표기 방식 (쌍따옴표 안에 문자열을 넣는 방법)
        String a = "Happy Java";
        String b = "a";
        String c = "123";

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        // new 키워드는 객체를 만들 때 사용
        String d = new String("Happy Java");
        String e = new String("a");
        String f = new String("123");

        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}
