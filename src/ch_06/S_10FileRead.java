package ch_06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class S_10FileRead {
    public static void main(String[] args) throws IOException {
        byte[] b = new byte[1024];  // 바이트 배열
        // 이 배열은 파일에서 읽어온 데이터를 저장하기 위해 사용
        FileInputStream input = new FileInputStream("c:/Users/it/Desktop/jump2java/out4.txt");
        // FileInputStream 객체 생성 / 파일에서 데이터를 읽어오는 대상을 지정함

        input.read(b);
        // FileInputStream의 read(byte[] b) 메서드를 호출하여 파일에서 데이터를 읽어와서 b 바이트 배열에 저장

        System.out.println(new String(b)); // 문자열로 바꿔주기
        // b 바이트 배열을 문자열로 변환하여 출력.
        // String(byte[] bytes) 생성자를 사용하여 바이트 배열을 문자열로 변환함
        input.close();
    }
}
