package extendsInterface;

public class q_06 {
    public static void main(String[] args) {
        Taxi taxi = new Taxi();

        taxi.start();
        taxi.stop(2500);
    }
}

interface Meter {
    public int BASE_FARE = 3000;
    public abstract void start();
    public abstract void stop(int distance);
    // public abstract는 안 붙여도 되는 것 같음 . .
}
class Taxi implements Meter {
    private int totalDistance;

    @Override
    public void start() {
        System.out.println("운행을 시작합니다.");
    }

    @Override
    public void stop(int distance) {
        totalDistance += distance;
        int fare = BASE_FARE + (totalDistance * 2);
        System.out.println("운행을 종료합니다. 요금은 " + fare + "원 입니다.");
    }
}
