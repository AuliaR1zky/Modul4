
package modul4;

/**
 *
 * @author Hamba Notebook
 */
public class kucing extends hewan {
     @Override
     void setNama() {
          String kucing = "Carberus";
    System.out.println("Nama kucing: " + kucing);
}    
void setSuara() {
    String suara = "Miaw Meow Meong";
    System.out.println("suara kucing: " + suara);
}
void setBerat() {
    double berat = 2.0;
    System.out.println("berat kucing: " + berat +" Kg");
     }
}
