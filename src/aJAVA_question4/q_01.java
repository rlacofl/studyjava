package aJAVA_question4;

public class q_01 {
    public static void main(String[] args) {
        Cylinder c = new Cylinder();

        c.r = 4;
        c.h = 5;
        System.out.printf("원기둥의 부피: %.2f\n", c.getVolume());
        System.out.printf("원기둥의 겉넓이: %.2f\n", c.getArea());

    }
}

class Cylinder {
    int r;
    int h;

    double getVolume() {       // 왜 그냥 double이라고 적어 . . . .?
        return Math.PI*r*r*h;
    }

    double getArea() {
        return (Math.PI*r*r*2) + (Math.PI*r*h*2);
    }

}
