package extendsInterface;

public class q_03 {
    public static void main(String[] args) {
        KRW krw = new KRW(1500, "원");
        USD usd = new USD(100.50, "달러");
        EUR eur = new EUR(260.87, "유로");
        JPY jpy = new JPY(1400, "엔");

        Currency[] currencies = {krw, usd, eur, jpy};

        for (Currency c : currencies) {
            System.out.println(c.toString());
        } //iter 쓰면 향상된 for 문 양식 바로 나옴
    }
}

class Currency {
    double amount;
    String notation;

    public Currency(double amount, String notation) { // 입력변수가 있는 생성자, 디폴트가 아니기 때문.
        this.amount = amount;
        this.notation = notation;
    }

    public String toString() {
        return String.format("%s : %.2f %s", getClass().getSimpleName(), amount, notation);
    }
    // 객체가 속한 클래스의 이름을 반환하는 Java의 메서드입니다. 이 메서드는 Object 클래스의 메서드이며,
    // 모든 자바 객체에서 사용할 수 있습니다.
}

class KRW extends Currency {
    public KRW (double amount, String notation) {
        super(amount, notation);
    }
}
class USD extends Currency {
    public USD (double amount, String notation) {
        super(amount, notation);
    }
}

class EUR extends Currency {
    public EUR (double amount, String notation) {
        super(amount, notation);
    }
}
class JPY extends Currency {
    public JPY (double amount, String notation) {
        super(amount, notation);
    }
}

