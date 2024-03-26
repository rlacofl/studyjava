package ch04;

import java.util.ArrayList;
import java.util.Arrays;

public class S09_foreach {
    public static void main(String[] args) {

        ArrayList<String> numbers = new ArrayList<>(Arrays.asList("one", "two", "three"));
        // asList 쓰면 문자열 리스트여서 문자열로 그냥 바로 입력이 가능함

        for (String number: numbers) {  // (type 변수이름: ~~)
            // numbers 에 있는 한 개의 아이템이 number다.
            // foreach문은 리스트에서 아이템을 한 개씩 꺼내어 반복한다(지가 알아서 아이템을 한 개씩 꺼냄)
            System.out.println(number);
        }
    }
}
