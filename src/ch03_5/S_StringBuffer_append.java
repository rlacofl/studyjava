package ch03_5;

public class S_StringBuffer_append {
    public static void main(String[] args) {

        // StringBuffer 객체를 만들어서 문자열 추가
        StringBuffer sb = new StringBuffer();  // 객체 생성 방법 (new 키워드 사용)
                        // 버퍼 객체 sb 생성
        sb.append("hello");  // 문자열 추가
        sb.append(" ");  // 문자열 추가
        sb.append("jump to java");  // 문자열 추가
        String result = sb.toString(); // toString: 만들어진 문자열을 한꺼번에 모아서 리턴하는 애
        System.out.println(result);

        // 문자열을 더하기(+)로 추가
        result = ""; // 결과를 빈 문자열로 만들어줌
        result += "hello"; // += : result = result + hello

        result += " ";
        result += "jump to java";

        System.out.println(result);
    }
}
