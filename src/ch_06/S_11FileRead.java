package ch_06;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class S_11FileRead {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("c:/Users/it/Desktop/jump2java/out.txt"));
        // new FileReader : 문자 단위로 읽는 객체
        while (true) {  // 무한 반복
            String line = br.readLine(); // 한 줄 씩 문자열 읽음
            if (line == null) break;  // while 무한반복문 -> if문 : 더이상 읽을 내용(문자열)이 없으면 반복문 종료(break)
            System.out.println(line); // 읽은 줄 바로바로 출력하기
        }
            br.close(); // 파일 읽은 후 객체종료 ? ? ? ? ?
    }
}
    //파일을 열어 읽은 후에는 항상 스트림을 닫아야 합니다.
    // 스트림을 닫지 않으면 리소스가 제대로 해제되지 않을 수 있습니다.
