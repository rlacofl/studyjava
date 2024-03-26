package ch03;

public class S_03_indecrease {
    public static void main(String[] args) {
        int i = 0;
        int j = 10;

        i++;
        j--;

        System.out.println(i);
        System.out.println(j);



        // 연산자의 위치
        i = 0;
        System.out.println(i++);  // ++가 뒤에있을 땐, i를 출력하고 난 다음에 1이 증가
        System.out.println(i);    // 위에서 ++ 당했으니까 0 + 1 해서 1이 출력

        System.out.println(++i);  // 먼저 i를 증가시키고 출력하기
    }
}
