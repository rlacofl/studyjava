package ch_06;

import java.io.FileOutputStream;
import java.io.IOException;

public class S_09FileWriteAdd {
    public static void main(String[] args) throws IOException {
        // 파일 만들기
    FileOutputStream output = new FileOutputStream("c:/Users/it/Desktop/jump2java/out.txt",true);
        // 파일 쓰기
        for (int i = 1; i < 21; i++) {
            String data = i + "번째 줄입니다.\r\n";
            // \r\n은 한 줄 띄운 뒤 첫번재 위치로 감
            output.write(data.getBytes()); // 파일에 데이터 입력
        }

    output.close();
    // 파일 관련해서는 예외처리가 많음.
    }
}
