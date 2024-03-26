package ch_06;

import java.io.IOException;
import java.io.InputStream;

public class S_01input {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;

        int a;
        int b;
        int c;

        a = in.read();  // 여기서 입력 받아야해서 대기중
        b = in.read();  // 여기서 입력 받아야해서 대기중
        c = in.read();  // 여기서 입력 받아야해서 대기중
        // read()는 한 번에 하나의 바이트만 읽음
        // 콘솔에서 받은 입력을 input에 대입함 (아스키코드가 입력됨)

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        // 사용자가 'abc'라는 문자열을 입력했다면, 'a'의 ASCII 값만 변수 a에 할당될 것이고,
        // 'b'의 ASCII 값은 변수 b에 할당되고, 'c'의 ASCII 값은 변수 c에 할당될 것입니다.
        // 나머지 입력은 무시됩니다.


        // 만약 a, b, c 이외의 다른 문자를 콘솔 창에 입력한다면,
        // 이 코드에서는 다음 입력 대기중인 a, b, c 변수에 해당 문자의 ASCII 값이 할당될 것입니다.
    }
}
