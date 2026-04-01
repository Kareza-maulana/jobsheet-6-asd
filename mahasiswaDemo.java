public class mahasiswaDemo {
    public static void main(String[] args) {
        // Membuat objek dari class pengelola
    mahasiswa_berprestasi list = new mahasiswa_berprestasi(); 
        mahasiswa m1 = new mahasiswa("123", "Rina", "2A", 3.8);      
        mahasiswa m2 = new mahasiswa("124", "Ayu", "2A", 3.5);
        mahasiswa m3 = new mahasiswa("125", "Sofi", "2A", 3.1);
        mahasiswa m4 = new mahasiswa("126", "Sita", "2A", 3.9);
        mahasiswa m5 = new mahasiswa("127", "Miki", "2A", 3.7);

        // Memasukkan kelima mahasiswa ke dalam daftar listMhs
         list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        // Menampilkan urutan asli saat data dimasukkan
        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        // Melakukan proses pengurutan lalu menampilkannya kembali
        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (ASC) : ");
        list.selectionSort();
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (ASC) : ");
        list.insertionSort();
        list.tampil();
    }
}
    