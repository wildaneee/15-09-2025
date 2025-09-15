import java.util.Scanner;

public class TotalHargaBuku {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int harga;
        int total = 0;

        System.out.println("Masukkan harga buku (ketik 0 untuk selesai): ");
        harga = input.nextInt();

        while (harga != 0) {
            total += harga;
            System.out.println("Masukkan harga buku berikutnya (0 untuk selesai): ");
            harga = input.nextInt();
        }

        System.out.println("Total harga semua buku: " + total);
        input.close();
    }
}
