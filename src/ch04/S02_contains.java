package ch04;

import java.util.ArrayList;

public class S02_contains {
    public static void main(String[] args) {
        
        ArrayList<String> pocket = new ArrayList<String>();
        
        pocket.add("paper");
        pocket.add("cellphone");
        pocket.add("money");

        if (pocket.contains("money")) {
            System.out.println("택시타");
        } else {
            System.out.println("걸어가");
        }
        
    }
}
