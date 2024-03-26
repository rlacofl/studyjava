package ch03_11;

public class S_01_typeChange {
    public static void main(String[] args) {

        // *문자열을 숫자로 변환*
        String num = "123";

        int n = Integer.parseInt(num);

        // int에는 메서드 없는데 Integer에는 . 찍으면 > 메서드 있음
        // 리턴은 입력을 해야 알 수 있음

        // 123을 (num)에 넣음 그리고 그 값을 int n 에 넣음 ??

        double d = Double.parseDouble(num);    // 실수
        System.out.println(n+100);  // n이 숫자여야지만 더하기 가능

        System.out.println(d); // 123.0


        // *숫자를 문자열로 변환*
        // n = 123
//        String num2 = "" + n;
//        // 문자열 + 숫자 = 문자열 (숫자가 문자열로 자동변환 됨)
//
//        System.out.println(num2);  // 123

        String num2 = "123" + n;
        // 문자열 + 숫자 = 문자열 (숫자가 문자열로 자동변환 됨)

        System.out.println(num2);  // 123123


        // 메서드를 사용해서 문자열 변환
        String num3 = String.valueOf(123);
        String num4 = Integer.toString(123);

        System.out.println(num3);  // 123
        System.out.println(num4);  // 123


        // 소수점이 있는 문자열 변환
        String num5 = "123.456";
        double d1 = Double.parseDouble(num5);
        System.out.println(d1);  // 123.456


        // 정수와 실수 사이의 형 변환
        int n2 = 123;
        double d2 = n2;   // 정수를 실수로 바꿀 때는 자동 변환
        System.out.println(d2);  // 123.0

        double d3 = 123.456;
        int n3 = (int) d3;   // 밑에 해설. 그래서 (int) 이렇게 적어줘야함.(캐스팅)
        // 실수를 정수로 바꿀 때에는 반드시 정수형으로 캐스팅 해주어야 함.
        // 왜냐면 정수>실수는 데이터 손실이 없는데, 실수>정수는 뒤에 소수점
        // 애들이 잘려서 데이터 손실이 있을 수 있기 때문에 자동 변환이 안 됨.
        // 내가 의도적으로 바꿔야함. 작데이터->큰데이터(O) / 큰데이터->작데이터(X)
        
        // 캐스팅(casting) : 실수의 소수점을 제거해 실수를 정수로 변환하는 것.
        System.out.println(n3);  // 123 (정수가 소수점을 가질 수 없기 때문에 잘리는 것.)


        // 실수 형태 문자열을 정수로 변환 시 주의. (오류 발생)

        String num6 = "123.456";
//        int n6 = Integer.parseInt(num6); // 실수 > 정수이기 때문에 에러 발생.
        double n6 = Double.parseDouble(num6); // 이렇게 해주기 !




    }
}
