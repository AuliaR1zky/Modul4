
package modul4;

/**
 *
 * @author Hamba Notebook
 */
public class bujurSangkar extends bangunDatar {
    private double sisi;
    
    public bujurSangkar(double sisi) {
        this.sisi = sisi;
    }
    public double hitungKeliling() {
        return 4* sisi;
    }
    public double hitungLuas() {
        return sisi * sisi;
    }
    
}
