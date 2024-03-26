package ch03_4;

public class S_05_UpperCase_split {
    public static void main(String[] args) {
        String a = "Hello Java";

        System.out.println(a.toUpperCase());  // 대문자
        System.out.println(a.toLowerCase());  // 소문자
        // 문자열을 모두 대문자 or 소문자로 변경할 때

        String e = "a:b:c:d";
        String[] result = e.split(":");
        // result는 {"a", "b", "c", "d"
    }
}
