package aJAVA_question3;

import java.util.ArrayList;

public class q_08 {

//    topIndex() 메서드 완성 /

    static class topScore {
        public static void main(String[] args) {

            String[] name = {"Elena", "Suzie", "John", "Emily", "Neda", "Kate", "Alex", "Daniel", "Hamilton"};
            int[] score = {65, 74, 23, 75, 68, 96, 88, 98, 54};

            int i = topIndex(score);
//            int max = score[0];

            System.out.printf("1등 : %s(%d점)", name[i], score[i]);
        }

//        public static int topIndex(int[] best) {
//
//            int max = best[0];
//            for (int i = 0; i < best.length; i++) {
//                if (best[i] > max) {
//                    max = best[i];
//                }
//            }

            public static int topIndex(int[] best) {

                int max = 0;
                for (int i = 0; i < best.length; i++) {
                    if (best[i] > best[max]) {
                        max = i;
                    }
                }
                
//            ArrayList choose = new ArrayList(best);
//            choose.add(65);
//            choose.add(74);
//            choose.add(23);
//            choose.add(75);
//            choose.add(68);
//            choose.add(96);
//            choose.add(88);
//            choose.add(98);
//            choose.add(54);
//            System.out.println(choose.get(9));

            return 0;
        }
    }
}
