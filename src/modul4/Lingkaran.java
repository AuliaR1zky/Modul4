package modul4;

/**
 *
 * @author Hamba Notebook
 */
public class Lingkaran extends bangunDatar {
    private double r;
    
    public Lingkaran(double r) {
        this.r = r;
    }
    @Override
    public double hitungKeliling() {
        return 2*3.14*r;
    }
    @Override
    public double hitungLuas() {
        return 3.14*r*r;
    }
}
