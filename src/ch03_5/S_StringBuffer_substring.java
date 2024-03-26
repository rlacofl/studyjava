package ch03_5;

public class S_StringBuffer_substring {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();
        sb.append("hello jump to java");

        System.out.println(sb.substring(0, 4));
        // 0번째 부터 4번째 앞까지(4번째 포함 X)의 문자만 잘라서 출력함

    }
}
