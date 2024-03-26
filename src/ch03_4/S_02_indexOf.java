package ch03_4;

public class S_02_indexOf {
    public static void main(String[] args) {

        // 문자열에서 특정 문자열이 시작되는 위치 (index 값) return
        String a = "Hello Java";
        System.out.println(a.indexOf("Java"));  // 6
        System.out.println(a.indexOf("H"));     // 0
        System.out.println(a.indexOf(" "));     // 5 (공백도 문자임)
        // Hello Java 에서 Java 가 시작되는 위치는 6번째부터이기 때문에
        // 값은 6이 나옴
    }
}

