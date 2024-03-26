package aJAVA_question4;

public class q_03 {
    public static void main(String[] args) {
        Miner malon = new Miner("말런");
        Miner gloria = new Miner("글로리아");

    malon.mine();
    malon.mine();
    malon.mine();
    gloria.mine();
    gloria.mine();

        System.out.println(malon.toString());
        System.out.println(gloria.toString());

    }
}


class Miner {
    String name;
    int coins;

    public Miner(String n) {
        name = n;
        coins = 0;
    }

    public String toString() {  // 메서드 1
        return String.format("Miner { name: %s, coins: %d }", name, coins);
    }

    public void mine() {     // 메서드 2
        coins += 1;
    }

}
