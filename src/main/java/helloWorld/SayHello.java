package helloWorld;

public class SayHello {

    private final String personName;
    private int lucckyNumber;

    public SayHello(String personName, int lucckyNumber) {
        this.personName = personName;
        this.lucckyNumber = lucckyNumber;
    }

    public String getPersonName() {
        return personName;
    }

    public int getLucckyNumber() {
        return lucckyNumber;
    }
}