package ch03_8;

import java.util.HashSet;
import java.util.Arrays;

public class S_03_SetMethod {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        // add = 그냥 집합 자료형에 값을 추가함
        set.add("Jump");
        set.add("To");
        set.add("Java");
        System.out.println(set);  // [Java, To, Jump] 출력

        // addAll - 값을 한꺼번에 여러 개 추가함
        set.addAll(Arrays.asList("HTML", "CSS", "JS"));
        System.out.println(set);  // [Java, To, Jump, HTML, CSS, JS] 출력

        //remove - 특정 값 제거함 죽여버림 아주그냥흔적도없이사라지게갈기갈기찢어버림
        set.remove("To");
        System.out.println(set);  // [Java, Jump, HTML, CSS, JS] 출력



    }
}
