1. Jelaskan fungsi kode program berikut
```
if (data[j]>data[j+1]){
                    int temp = data[j];
                    data[j]= data[j+1];
                    data[j+1]= temp;
```

KODE ini berfungsi unntuk memeriksa apakah kondisi if( data[j]>data[j+1]) terpenuhi, jika ya , maka vsriable kedua array pada kondisi tersebut harus ditukar

2. Tunjukkan kode program yang merupakan algoritma pencarian nilai minimum pada selection sort!
```
 for (int i=0; i<jumlahdata-1; i++){
            int min_idx = i;
            for (int j=i+1; j<jumlahdata; j++){
                if (data[j]<data[min_idx]){
                    min_idx = j;
                }
            }
            int temp = data[min_idx];
            data[min_idx]= data[i];
            data[i]= temp;
```
3. Pada Insertion sort , jelaskan maksud dari kondisi pada perulangan  
pad ainsertion sortr terdapat nested loop , loop terluar berguna  untuk mengambil data yang ingin diurutkan , sementara loop dalam berfungsi untuk membandingkan data yang diambil dengan semua data pada array

4. Pada Insertion sort, apakah tujuan dari perintah ```data[j+1] = data[j]```

berguna untuk menggeser data jika nilai dari data tersebut memnuhi kondisi 


pertanyyan praktium 2

bubble sort 
1.	Perhatikan perulangan di dalam bubbleSort() di bawah ini:
```
for (int i = 0; i < list_mhs.length - 1; i++) {
            for (int j = 1; j < list_mhs.length - i; j++) {
```

 
a.	Mengapa syarat dari perulangan i adalah i<listMhs.length-1 ?
untuk efisiensi program , dengan mengeliminasi pengecekan data yang berada di urutan terakhir
b.	Mengapa syarat dari perulangan j adalah j<listMhs.length-i ?
c.	Jika banyak data di dalam listMhs adalah 50, maka berapakali perulangan i  akan berlangsung? Dan ada berapa Tahap bubble sort yang ditempuh?
2.	Modifikasi program diatas dimana data mahasiswa bersifat dinamis (input dari keyborad) yang terdiri dari nim, nama, kelas, dan ipk!

```
import java.util.Scanner;

public class mahasiswaDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] Nama = new String[5];
        String[] Nim = new String[5];
        String[] Kelas = new String[5];
        double[] IPK = new double[5];
        
    mahasiswa_berprestasi list = new mahasiswa_berprestasi();
    
    for (int i = 0; i < list.list_mhs.length; i++) {
        System.out.println("Masukkan data mahasiswa ke-" + (i + 1) + ":");
        System.out.print("Nama: ");
        Nama[i] = input.nextLine();
        System.out.print("NIM: ");
        Nim[i] = input.nextLine();
        System.out.print("Kelas: ");
        Kelas[i] = input.nextLine();
        System.out.print("IPK: ");
        IPK[i] = input.nextDouble();
        System.out.println("masukan jurusan ");
        
        input.nextLine(); }
        mahasiswa m1 = new mahasiswa(Nim[0], Nama[0], Kelas[0], IPK[0]);
        mahasiswa m2 = new mahasiswa(Nim[1], Nama[1], Kelas[1], IPK[1]);
        mahasiswa m3 = new mahasiswa(Nim[2], Nama[2], Kelas[2], IPK[2]);
        mahasiswa m4 = new mahasiswa(Nim[3], Nama[3], Kelas[3], IPK[3]);
        mahasiswa m5 = new mahasiswa(Nim[4], Nama[4], Kelas[4], IPK[4]);
```


selection sort

1 Di dalam method selection sort, terdapat baris program seperti di bawah ini
```
  int idxMin=i;
        for (int j=i+1; j<list_mhs.length; j++){
            if (list_mhs[j].ipk<list_mhs[idxMin].ipk){
                idxMin=j;
            }
```

Untuk apakah proses tersebut, jelaskan!

proses ini digunakann untuk menjalankan logika selection , dengan idxMin= 1 sebagai starting point untuk mengambil nilai awal dari suatu array untuk dibandingkan dengan nilai yang lain , kemudian ketika kondisi ```list_mhs[j].ipk<list_mhs[idxMin].ipk ``` bernilai true maka , variable idxMin akan diperbarui dengan nilai J

