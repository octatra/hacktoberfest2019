package percabangan;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class SwitchCase {
    public static void main(String[] args) {
        int Menu,Makanan,Minuman;
        Scanner m = new Scanner(System.in);
        System.out.println("Pilihan Menu Restoran :");
        System.out.println("------------------------------");
        System.out.println("1. Makanan");
        System.out.println("2. Minuman");
        System.out.print("\nPilih Menu : ");
        Menu = m.nextInt();
        if (Menu > 2) {
            System.out.println("Menu Tidak Tersedia");
        }else{
        switch (Menu) {
            case 1 :
                System.out.println("=========== MENU MAKANAN =============");
                System.out.println("1. Sate Ayam");
                System.out.println("2. Ayam Goreng");
                System.out.println("3. Ayam Betutu");
                System.out.println("4. Ayam Bakar");
                System.out.println("5. Soto Ayam");
                System.out.println("======================================");
                System.out.print("\nPilih Makanan : ");
                Makanan = m.nextInt();
                switch (Makanan) {
                    case 1:
                        System.out.println("Anda Memilih Sate Ayam");
                        break;
                    case 2:
                        System.out.println("Anda Memilih Ayam Goreng");
                        break;
                    case 3:
                        System.out.println("Anda Memilih Ayam Betutu");
                        break;
                    case 4:
                        System.out.println("Anda Memilih Ayam Bakar");
                        break;
                    case 5:
                        System.out.println("Anda Memilih Soto Ayam");
                        break;
                }
                break;
            case 2 :
                System.out.println("=========== MENU MINUMAN =============");
                System.out.println("1. Es Teh");
                System.out.println("2. Es Campur");
                System.out.println("3. Es Kelapa");
                System.out.println("4. Kopi");
                System.out.println("5. Es Jeruk");
                System.out.println("======================================");
                System.out.print("\nPilih Minuman : ");
                Minuman = m.nextInt();
                switch (Minuman) {
                    case 1:
                        System.out.println("Anda Memilih Es Teh");
                        break;
                    case 2:
                        System.out.println("Anda Memilih Es Campur");
                        break;
                    case 3:
                        System.out.println("Anda Memilih Es Kelapa");
                        break;
                    case 4:
                        System.out.println("Anda Memilih Kopi");
                        break;
                    case 5:
                        System.out.println("Anda Memilih Es Jeruk");
                        break;
                }
                break;
        }
        }
        
        
    }
}
