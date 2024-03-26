package ch_06;

import java.io.PrintWriter;
import java.io.IOException;

public class S_08PrintWrite {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("c:/Users/it/Desktop/jump2java/out3.txt");
        for (int i = 1; i < 11; i++) {
            String data = i + "번째 줄입니다.\r\n";
            pw.println(data); // 파일에 데이터 입력 // println 하면 줄 간격 띄워짐
        }

        pw.close();
    }
}
