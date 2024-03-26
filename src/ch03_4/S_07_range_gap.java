package ch03_4;

public class S_07_range_gap {
    public static void main(String[] args) {

        // 1. 정렬, 공백 표현하기
        System.out.println(String.format("%10s", "hi."));        // 앞에 공백 넣기 (공백 10칸)

        System.out.println(String.format("%-10schaeri", "hi"));
        // 뒤에 공백 10칸 (- 붙이기)(hi 하고 공백 8칸, 채리)


        // 2. 소수점 표현하기
        System.out.println(String.format("%.4f", 3.12345678));

        System.out.println(String.format("%10.4", 3.12345678));
    }
}
