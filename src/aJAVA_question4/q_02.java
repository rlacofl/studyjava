package aJAVA_question4;

public class q_02 {
    public static void main(String[] args) {

        Food chicken = new Food("치킨", 18000);
        Food pizza = new Food("피자", 28000);
        Food sushi = new Food("초밥", 22000);

        Food[] foods = {chicken, pizza, sushi};

        for (int i = 0; i < foods.length; i++) {
            System.out.println(foods[i].toString());
        }

    }
}


class Food {
    String name;
    int price;
    public Food(String foodi, int p) {
        name = foodi;
        price = p;
    }

    // ?
    public String toString() {
        return String.format("Food { name: %s, price: %d원 }", name, price);
    }
}