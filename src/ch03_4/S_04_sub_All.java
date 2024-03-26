package ch03_4;

public class S_04_sub_All {
    public static void main(String[] args) {
        String a = "Hello Java";

        System.out.println(a.replaceAll("Java", "World")); // Hello World
        // replaceAll : 문자열에서 특정 문자열을 다른 문자열로 바꿈

        System.out.println(a.substring(0, 4));  // Hell
        // (0, 4) 이면 0부터, 4는 포함 안 됨.
        // substring : 특정 문자열을 뽑아낼 때 사용
    }
}
