package ch05;

class Animal {
        String name; // 객체 변수 (class 안에 있는 변수쨩)
           // ㄴ> 이거 쓸 때는 this.name 이라고 씀

    public void setName(String name) {   // 문자열 입력 변수가 String name
        // void = 리턴 값이 없다
        this.name = name;  // 메서드 이름
    }
    }
//        public class S02_variable {
//            public static void main(String[] args) {
//
//            Animal cat = new Animal();
//
//                System.out.println(cat.name);
//
//                cat.name = "먀옹이";
//                System.out.println(cat.name);
//                //
//
//            Animal cat2 = new Animal();
//
//                cat2.name = "마옹이";
//                System.out.println(cat2.name);
//
//    }



