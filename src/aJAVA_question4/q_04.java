package aJAVA_question4;

public class q_04 {
    public static void main(String[] args) {

        Cube a = new Cube(3);
        Cube b = new Cube(5);

        System.out.printf("정육면체 a의 부피: %d, 겉넓이: %d\n", a.volume(), a.area());
        System.out.printf("정육면체 b의 부피: %d, 겉넓이: %d\n", b.volume(), b.area());
    }
}


class Cube {
    int length;

    public Cube(int i) {
        length = i;
    }




    public int volume() {
        int v = length*length*length;
        return v;
    }

    public int area() {
        int a = 6*length*length;
        return a;
    }
}
