package pbo;

// Inheritance dari Motor
public class MotorBalap extends Motor {
    private String tim;

    // Overriding
    public MotorBalap(String merek, int cc, double kecepatanMaks, String tim) {
        super(merek, cc, kecepatanMaks);
        this.tim = tim;
    }

    // Accessor
    public String getTim() {
        return tim;
    }

    // Mutator
    public void setTim(String tim) {
        this.tim = tim;
    }

    // Polymorphism overriding
    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Tim Balap: " + tim);
    }
}