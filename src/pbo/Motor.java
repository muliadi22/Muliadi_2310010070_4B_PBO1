package pbo;

// Class induk
public class Motor {
    // Atribut(dengan enkapsulasi)
    private String merek;
    private int cc;
    private double kecepatanMaks;

    // Constructor
    public Motor(String merek, int cc, double kecepatanMaks) {
        this.merek = merek;
        this.cc = cc;
        this.kecepatanMaks = kecepatanMaks;
    }

    // Accessor
    public String getMerek() {
        return merek;
    }

    public int getCc() {
        return cc;
    }

    public double getKecepatanMaks() {
        return kecepatanMaks;
    }

    // Mutator
    public void setMerek(String merek) {
        this.merek = merek;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public void setKecepatanMaks(double kecepatanMaks) {
        this.kecepatanMaks = kecepatanMaks;
    }

    // Polymorphism (method bisa dioverride)
    public void tampilInfo() {
        System.out.println("Merek: " + merek);
        System.out.println("CC: " + cc);
        System.out.println("Top Speed: " + kecepatanMaks + " km/jam");
    }
}