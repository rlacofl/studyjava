package ch03_8;

import java.util.Arrays;
import java.util.HashSet;

public class S_02_Set {
    public static void main(String[] args) {

        // 집합 (Set)
        HashSet<String> set = new HashSet<>(Arrays.asList("H", "e", "l", "l", "o"));
        System.out.println(set);
        // 집합은 순서가 없고, 중복되지 않음 (L도 한 개밖에 안 들어감)


        // 교집합
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4,5,6,7,8,9));

        HashSet<Integer> intersection = new HashSet<>(s1);
        // 초기값으로 s1(1,2,3,4,5,6)으로 intersection 생성 (이 때는 intersection = s1)

        intersection.retainAll(s2); // 교집합만 남김
        // retainAll 메서드 사용 = intersection에서 s2 와 같은 값만 남기고 다 죽임

        System.out.println(intersection); // [4,5,6] 출력


        // 합집합
        HashSet<Integer> union = new HashSet<>(s1);
        union.addAll(s2); // s1와 s2 모두 더함 (중복 제외)

        System.out.println(union);  // [1,2,3,4,5,6,7,8,9] 출력
        
        
        // 차집합
        HashSet<Integer> substract = new HashSet<>(s1); //s1으로 substract 만듦
        substract.removeAll(s2);  // 차집합 수행 (s2 전부 다 지움)
        
        System.out.println(substract); // [1,2,3] 출력

    }
}

// 집합은 순서가 없고(index 없음) , 중복되지 않음.
// retainAll(교집합) , addAll(합집합) , removeAll(차집합)