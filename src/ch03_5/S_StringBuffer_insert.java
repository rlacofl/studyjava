package ch03_5;

public class S_StringBuffer_insert {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("jump to java");
        sb.insert(0, "hello ");
        // 위치에서 0번째에 문자열 hello를 추가해라 
        // 원하는 위치에 문자열 입력

        System.out.println(sb.toString());
    }
}
