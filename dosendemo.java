import java.util.Scanner;


public class dosendemo {
    public static void main(String[] args) {
        datadosen list = new datadosen();

        Scanner input = new Scanner(System.in);

        System.out.println("====MASUKAN DATA DOSEN====");
        for (int i = 0; i < list.list_dosen.length; i++) {
            System.out.println("Masukkan data dosen ke-" + (i + 1) + ":");
            System.out.print("Kode Dosen: ");
            String kode = input.nextLine();
            System.out.print("Nama Dosen: ");
            String nama = input.nextLine();
            System.out.print("Usia Dosen: ");
            int usia = input.nextInt();
            System.out.print("Jenis Kelamin Dosen (true untuk Laki-laki, false untuk Perempuan): ");
            boolean jenis_kelamin = input.nextBoolean();
            input.nextLine(); // Membersihkan buffer setelah membaca boolean

            dosen d = new dosen(kode, nama, usia, jenis_kelamin);
            list.tambah(d);
        }
        input.close();

        System.out.println("Data Dosen sebelum sorting: ");
        list.tampil();

        System.out.println("Data Dosen setelah sorting berdasarkan usia (DESC) : ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data Dosen setelah sorting berdasarkan usia (ASC) : ");
        list.selectionSort();
        list.tampil();

        System.out.println("Data Dosen setelah sorting berdasarkan usia (ASC) : ");
        list.insertionSort();
        list.tampil();
    }
}
