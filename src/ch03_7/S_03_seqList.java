package ch03_7;

import java.util.ArrayList;
import java.util.Arrays;

public class S_03_seqList {
    public static void main(String[] args) {
        String[] data = {"138", "129", "142"};  // 배열

        ArrayList<String> pitches = new ArrayList<>(Arrays.asList(data));
        // 이거 치면 위에 import 알아서 쳐짐
        // Arrays.asList(배열)로 리스트 변환

        System.out.println(pitches);

        //

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3));
        // Integer : 정수 ㄴ> 데이터 그냥 asList 안에 그냥 숫자 넣어도 노상관
        // Arrays.asList(1, 2, 3)로 리스트 변환
        System.out.println(nums);

    }
}
