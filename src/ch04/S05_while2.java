package ch04;

public class S05_while2 {
    public static void main(String[] args) {
        // loop (무한 루프)
//        while (true) {
//            <수행할 문장 1>;
//            <수행할 문장 1>;
//            <수행할 문장 1>;
//             ㄴ> 이런식으로 ..
//        }

//        무한 코딩 예 .
//            while (true) {
//                System.out.println("어쩌고저쩌고");
//            }


        // break (while문 빠져나가기)
        int coffee = 10;
        int money = 300;

        while (money > 0) {
            System.out.println("돈 받앗으니까 커피를 드리겟음");
            coffee--;

            System.out.println("남은 커피 양은 " + coffee + "임.");

            if (coffee == 0) {
                System.out.println("커피 다팔았음 그만 팔아");
                break;
            }
        }
    }
}
