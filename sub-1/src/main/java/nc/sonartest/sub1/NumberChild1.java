package nc.sonartest.sub1;

public class NumberChild1 {

    public Integer integer = 7;

    public String returnA() {
        return "A";
    }

    public String returnB() {
        Integer i = null;
        if(integer != null) {
            i = integer;
        }
        return "B" + i.toString();
    }

    public static void main(String ... args) {
        System.out.println("kobra");
    }
}
