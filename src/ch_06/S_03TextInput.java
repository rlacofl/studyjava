package ch_06;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class S_03TextInput {
    public static void main(String[] args) throws IOException {

    InputStream in = System.in;
    InputStreamReader reader = new InputStreamReader(in);
    // 처음에 받은 바이트(아스키 코드)를 reader가 문자로 읽어줌

    char[] a = new char[3];
    reader.read(a);

        System.out.println(a);

    }
}
