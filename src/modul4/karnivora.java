package modul4;

/**
 *
 * @author Hamba Notebook
 */
public class karnivora {
    public static void main(String[] args) {
       System.out.println("====HEWAN DEFAULT====");
       hewan h = new hewan();
       h.setNama();
       h.setSuara();
       h.setBerat();
       
       System.out.println("====HEWAN KUCING====");
       hewan k = new kucing();
       k.setNama();
       k.setSuara();
       k.setBerat();
       
       System.out.println("====HEWAN SINGA====");
       hewan s = new singa();
       s.setNama();
       s.setSuara();
       s.setBerat();
    }
}
