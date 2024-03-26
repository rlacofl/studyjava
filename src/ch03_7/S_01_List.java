package ch03_7;

import java.util.ArrayList;

public class S_01_List {
    public static void main(String[] args) {

        // array list 만들기
        ArrayList pitches = new ArrayList();
        // add : 추가
        pitches.add("138");  // 0
        pitches.add("129");  // 1
        pitches.add("142");  // 2

        // get : 값을 가져옴
        System.out.println(pitches.get(1)); // 1번 배열에 있는 애 가져옴

        // size : 아이템 갯수 리턴
        System.out.println(pitches.size()); // 3개가 들어가있으니까 = 3

        // contains : 해당 값이 리스트 안에 있는지 판별 > boolean으로 리턴
        System.out.println(pitches.contains("142")); // true

        // remove : remove(객체) 방식 - 입력한 값을 제거 후, 리턴 (boolean)
        System.out.println(pitches.remove("129")); // true = 제거됨

        // remove : remove(인덱스) 방식 - 해당 인덱스 값 제거 후, 그 값이 리턴
        System.out.println(pitches.remove(0)); // 138

    }
}
