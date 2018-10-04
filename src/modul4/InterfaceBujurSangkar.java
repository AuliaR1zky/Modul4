package modul4;

/**
 *
 * @author Hamba Notebook
 */
public class InterfaceBujurSangkar implements InterfaceBangunDatar {
    private double sisi;
    
    public InterfaceBujurSangkar(double sisi) {
        this.sisi = sisi;
    }
    
    @Override
    public double hitungKeliling() {
        return sisi*4;
    }
    
    @Override
    public double hitungLuas() {
        return sisi*sisi;
    }
            
    
}
