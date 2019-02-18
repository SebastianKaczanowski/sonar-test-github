package nc;

public class GeneratedShouldNotBeAnalysed {

    public Integer integer = 7;

    public String returnA() {
        return "A";
    }

    public String returnB() {
        Integer i = null;
        if(integer != null) {
            i = integer;
        }
        return "B" + i.toString() + "oho";
    }

}
