package aJAVA_question3;

public class q_02 {
    public static void main(String[] args) {
////        String[] city = {"seoul", "busan", "incheon", "dejun", "degu"};
//        String[] count = {"599", "51", "46", "43", "27"};
//
//        ArrayList<String> city = new ArrayList<>(Arrays.asList("seoul", "busan", "incheon", "dejun", "degu"));
//            for (String number = city) {
//        //        for (int i = 0; i < city.length; i++) {
//            for (int j = 0; j < count.length; j++) {
//            }
//                System.out.printf( count +":"+ count[j] +"명\n");
//        }

        String[] city = {"seoul", "busan", "incheon", "dejun", "degu"};
        int[] count = {599, 51, 46, 43, 27};

        for (int i = 0; i < city.length; i++) {
                System.out.println(city[i] + ":" + count[i] + "명");
            }
        }

    }



