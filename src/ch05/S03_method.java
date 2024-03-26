package ch05;


public class S03_method {
    public static void main(String[] args) {

        Animal cat = new Animal();
        cat.setName("cute");  // 메소드 호출

        System.out.println(cat.name);


        Animal dog = new Animal();
        dog.setName(("happy"));
        System.out.println(dog.name);


        // 클래스로 객체들을 만들면 그 객체들은 전부 독립적인 객체들임
        // 막 몇 백개를 만들어도 걔네는 다 독립적인 애들임
        // 객체들의 값이 독립적으로 유지되기 때문에 "객체지향적이다" 가 가능한것.
    }
}
