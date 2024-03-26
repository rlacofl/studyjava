package ch_06;

import java.io.FileWriter;
import java.io.IOException;

public class S_07TextWrite {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("c:/Users/it/Desktop/jump2java/out2.txt");
        for (int i = 1; i < 11; i++) {
            String data = i + "번째 줄입니다.\r\n";
            fw.write(data); // 파일에 데이터 입력
        }

        fw.close();
    }
}
