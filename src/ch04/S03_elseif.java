package ch04;

import java.util.ArrayList;

public class S03_elseif {
    public static void main(String[] args) {
        
        boolean hasCard = true;  // false 면 걸어가세요 나옴(else)

        ArrayList<String> pocket = new ArrayList<String>();
        pocket.add("paper");
        pocket.add("cellphone");
        
        if (pocket.contains("money")) {
            System.out.println("택시타1");
        } else if (hasCard) {
            System.out.println("택시타2");
        } else {
            System.out.println("걸어가세요");
        }
    }
}
