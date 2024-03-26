package aJAVA_question4;

public class q_06 {
    public static void main(String[] args) {
        Menu j1 = new Menu("짜장", 4900);
        Menu j2 = new Menu("짬뽕", 5900);
        Menu j3 = new Menu("탕수육", 13900);

        Menu[] menuArr = {j1, j2, j3};

        System.out.printf("주문 합계 : %d원", Menu.totalPrice());
    }
}

    class Menu {
        String name;
        int price;

        public Menu(String n, int p) {
            name = n;
            price = p;
        }

        public static int totalPrice() {
            int j1 = 4900;
            int j2 = 5900;
            int j3 = 13900;
            int result = j1 + j2 + j3;
            return result;
    }
}

// 클래스 메서드 = static 메서드 ??
// static은 한 번 만들어지면 그 값이 변하지 않음