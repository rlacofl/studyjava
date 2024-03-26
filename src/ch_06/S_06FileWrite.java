package ch_06;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class S_06FileWrite {
    public static void main(String[] args) throws IOException {
        // 파일 만들기
    FileOutputStream output = new FileOutputStream("c:/Users/it/Desktop/jump2java/out.txt");
    // 아무것도 안 적으면 현재 프로젝트 내에 만들어짐 ("out.txt") 자동으로 앞에 이 파일의 폴더 주소가 들어감

        // 파일 쓰기
        for (int i = 1; i < 11; i++) {
            String data = i + "번째 줄입니다.\r\n";
            // \r\n은 한 줄 띄운 뒤 첫번재 위치로 감
            output.write(data.getBytes()); // 파일에 데이터 입력
        }
        // 결과 :
        //1번째 줄입니다.
        //2번째 줄입니다.
        //3번째 줄입니다.
        //4번째 줄입니다.
        //5번째 줄입니다.
        //6번째 줄입니다.
        //7번째 줄입니다.
        //8번째 줄입니다.
        //9번째 줄입니다.
        //10번째 줄입니다.

    output.close();
    // 파일 관련해서는 예외처리가 많음.
    }
}
