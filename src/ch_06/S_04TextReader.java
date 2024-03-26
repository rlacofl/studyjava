package ch_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class S_04TextReader {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
        // 큰 데이터 읽을 때 사용

        String a = br.readLine();
        // 여러 긴 문장을 읽을 때 BufferedReader 사용하기
        System.out.println(a);

    }
}
