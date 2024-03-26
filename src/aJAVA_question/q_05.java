package aJAVA_question;

public class q_05 {
  public static void main(String[] args) {


    int euro = 52;
    int dollar = 32;

    double euro_1 = 1281.62664;
    double dollar_1 = 1091.70306;

    double euroResult = (euro * euro_1);
    double dollarResult = (dollar * dollar_1);

    double result = Math.round(euroResult + dollarResult);

    System.out.printf(String.format("환전 결과:%.0f원", result));
    // 소수점 뒤에 0 없애고 싶을 땐 %f 이렇게 했으면 중간에 .0 붙여서 %.0f 이렇게 하기
  }
}
