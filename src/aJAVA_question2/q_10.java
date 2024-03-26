package aJAVA_question2;

public class q_10 {
    //BMI = W(kg) / T^2(키-m)

    static class Diet {
        public static void main(String[] args) {

            double w = 81.6;
            double t = 1.76;

            double bmi = calculate(w, t);

            System.out.printf("BMI: %.2f(%.1fkg, %.2fm)\n", bmi, w, t);
            System.out.printf("결과: %s입니다.", result(bmi));
        }

        public static double calculate(double weight, double tall) {
//            double calc = 30.0;

            return weight / (tall * tall);
        }

        public static String result(double bmi) { // 결과를 리턴하는 메서드
            String result = "";
            if (bmi >= 30) {
                result = "비만";
            } else if (bmi >= 25) {
                result = "과체중";
            } else if (bmi >= 18.5) {
                result = "정상";
            } else {
                result = "저체중";
            }
            return result;
        }
    }
}


