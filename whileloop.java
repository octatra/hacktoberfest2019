package looping;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class whileloop {
    public static void main(String[] args) {
        int i, awal, akhir;
        Scanner Nilai = new Scanner(System.in);
        System.out.println("========================");
        System.out.print("Masukan Nilai Awal : ");
        awal = Nilai.nextInt();
        System.out.print("Masukan Nilai Akhir : ");
        akhir = Nilai.nextInt();
        i = awal;
        System.out.println("========================");
        System.out.println("\nDeret Bilangan Dari Nilai Awal = "+awal +" dan Nilai Akhir = "+akhir+" Adalah ");
           
           while(i<=akhir){
               System.out.println("Deret Bilangan = "+i);
               i++;
           }
           
    }
    
}
