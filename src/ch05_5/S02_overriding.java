package ch05_5;

class Cat {
    void sound() {
        System.out.println("마옹");
    }
}

class houseCat extends Cat {
    void sound() {
        System.out.println("먀옹");
    }
}

class roadCat extends Cat {
    void sound() {
        System.out.println("냐옹");
    }
}



public class S02_overriding {
    public static void main(String[] args) {
        houseCat cat1 = new houseCat();  // 집꼬양이
        roadCat cat2 = new roadCat();    // 길꼬양이


        cat1.sound();  // 먀옹
        cat2.sound();  // 냐옹
    }
}
