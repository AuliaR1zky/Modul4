package modul4;

import java.util.Scanner;

/**
 *
 * @author Hamba Notebook
 */
public class Tugas1 {

    double t, b;
    double bbi;
    String bbn;

    void show() {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan tinggi badan : ");
        t = input.nextDouble();
        System.out.println("Masukkan berat badan : ");
        b = input.nextDouble();

        bbi = (t - 100) * 0.9;
        System.out.println("berat badan ideal : " + bbi);

        if ((b >= (bbi + (bbi * 0.1))) && (b < (bbi + (bbi * 0.2)))) {
            bbn = "kelebihan berat badan";
        } else if (b >= (bbi + (bbi * 0.2))) {
            bbn = "kegemukan";
        } else if (b <= (bbi - (bbi * 0.1))) {
            bbn = "kurus";
        } else {
            bbn = "normal";
        }
        System.out.println("keterangan : " + bbn);
    }

    public static void main(String[] args) {
        Tugas1 lat37 = new Tugas1();
        lat37.show();
    }

}
