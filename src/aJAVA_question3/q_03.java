package aJAVA_question3;

public class q_03 {
    public static void main(String[] args) {

        int[] even = {0, 2, 4, 6, 8};
        int[] odd = {1, 3, 5, 7, 9};

        int[] result = all(even, odd);

        System.out.printf("결과: ");

        for (int i = 0; i < result.length; i++){
            System.out.printf("%d ", result[i]);
        }
    }

    public static int[] all(int[] even, int[] odd) {
        int[] allArr = new int[even.length + odd.length];

        for (int i = 0; i < even.length; i++) {

            allArr[2 * i] = even[i];
            allArr[2 * i + 1] = odd[i];
            // allArr[2 * i]번째 인덱스랑 even[i]번째 인덱스의 값이 같음
        }
        return allArr;
    }
}