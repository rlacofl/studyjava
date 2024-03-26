package ch03_11;

import java.util.ArrayList;
import java.util.Arrays;

public class S_02_final {
    public static void main(String[] args) {

        final int n = 123;  // final로 설정하면 값을 바꿀 수 없음.
//        n = 456;   // 이렇게 하면 컴파일 오류

        // final은 상수. 변하지 않음. 자료형에 값을 단 한 번만 설정할 수 있게
        // 강제하는 키워드. 변수 앞에 붙어서 값을 한 번만 설정하게 한다.

//        final String s = "자바";
//        s = "자바 스크립트";   // 이렇게 못 바꿈.

        final ArrayList<String> a = new ArrayList<>(Arrays.asList("a", "b"));
//        a = new ArrayList<>(Arrays.asList("c", "d"));
                // 컴파일 오류 발생

        // 값을 변경해선 안 되는 (비밀번호 같은 것) 것들에 final을 붙이게 됨.

    }
}
