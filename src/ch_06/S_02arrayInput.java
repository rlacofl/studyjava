package ch_06;

import java.io.IOException;
import java.io.InputStream;

public class S_02arrayInput {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;

        byte[] a = new byte[3]; //1바이트 배열 3개 생성 ? 그냥 3행
        in.read(a);

        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
    }
}
