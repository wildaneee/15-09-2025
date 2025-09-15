import java.util.Scanner;

public class TebakAngka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angkaRahasia = 7;
        int tebakan;

        System.out.println("Permainan Tebak Angka (antara 1 - 10)");
        
        do {
            System.out.print("Masukkan tebakan Anda: ");
            tebakan = input.nextInt();

            if (tebakan < angkaRahasia) {
                System.out.println("Terlalu kecil!");
            } else if (tebakan > angkaRahasia) {
                System.out.println("Terlalu besar!");
            } else {
                System.out.println("Selamat, tebakan Anda benar!");
            }
        } while (tebakan != angkaRahasia);

        input.close();
    }
}
