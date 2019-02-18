package nc.sonartest;

import nc.sonartest.sub1.NumberChild1;

public class Number1 {

    final NumberChild1 numberChild1 = new NumberChild1();

    public String returnA() {
        return numberChild1.returnA();
    }

    public String returnB() {
        return numberChild1.returnB();
    }

    public static void main(String... args) {

    }
}
