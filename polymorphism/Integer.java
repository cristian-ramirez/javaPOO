package polymorphism;

public class Integer extends Number{
    private int pInteger;

    public Integer(int pInteger) {
        this.pInteger = pInteger;
    }

    public int getpInteger() {
        return pInteger;
    }

    public void setpInteger(int pInteger) {
        this.pInteger = pInteger;
    }
    
    @Override
    public void printed() {
        System.out.println("Interger: " + this.pInteger);
    }
}
