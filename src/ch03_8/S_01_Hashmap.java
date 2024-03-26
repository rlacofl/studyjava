package ch03_8;

import java.util.HashMap;

public class S_01_Hashmap {
    public static void main(String[] args) {

        // Map은 key, value로 추가 (index 없음)
        HashMap<String, String> map = new HashMap<>(); 
        // put(key, value)로 추가하기 (list랑은 다름. put으로 입력 넣음)
        // 값이 2개가 들어가기 때문에 2개 적어줌
        map.put("people", "사람");
        map.put("baseball", "야구");
        map.put("apple", "사과");
        map.put("banana", "바나나");

        // get(key - 꺼내는 거)으로 value를 꺼냄
        System.out.println(map.get("people")); // 사람 출력
        System.out.println(map.get("baseball")); // 야구 출력

        // containsKey가 있으면 boolean(true, false)
        System.out.println(map.containsKey("people"));  // true

        // remove(Key)로 삭제하고 value가 리턴됨
        System.out.println(map.remove("people"));  // 사람
        System.out.println(map);

        System.out.println(map.size());
        
        // keySet = Key 값들만 모아 리턴
        System.out.println(map.keySet());
        System.out.println(map.values());

    }
}
