package polymorphism;

public class Float extends Number{
    private float pFloat;

    public Float(float pFloat) {
        this.pFloat = pFloat;
    }

    public float getpFloat() {
        return pFloat;
    }

    public void setpFloat(float pFloat) {
        this.pFloat = pFloat;
    }

    @Override
    public void printed() {
        System.out.println("Float: " + this.pFloat);
    }
}
