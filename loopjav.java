package looping;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class dowhilelopp {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int i, awal, akhir;
        System.out.print("Masukan Nilai Awal : ");
        awal = n.nextInt();
        System.out.print("Masukan Nilai Akhir : ");
        akhir = n.nextInt();
        i = awal;
        do{
            System.out.println(i);
            i++;
        }while(i<=akhir);
        
    }
    
}
