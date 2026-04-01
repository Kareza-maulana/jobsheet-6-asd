public class mahasiswa_berprestasi {
        mahasiswa[] list_mhs =new mahasiswa[5];
        int idx;

         void tambah(mahasiswa m) {
        if (idx < list_mhs.length) {
            list_mhs[idx]= m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }
    void tampil() {
        for (mahasiswa m : list_mhs) {
            m.tampilkaninfo();
            System.out.println("-------------------------");
        }
    }
    void bubbleSort() {
        for (int i = 0; i < list_mhs.length - 1; i++) {
            for (int j = 1; j < list_mhs.length - i; j++) {
                // Tanda '>' digunakan agar data yang lebih besar digeser ke kiri (depan)
                if (list_mhs[j].ipk > list_mhs[j - 1].ipk) {
                    // Proses penukaran posisi objek (Swap)
                    mahasiswa tmp = list_mhs[j];
                    list_mhs[j] = list_mhs[j - 1];
                    list_mhs[j - 1] = tmp;
                }
            }
        }
    }


    void selectionSort(){
    for (int i=0; i<list_mhs.length-1; i++){
        int idxMin=i;
        for (int j=i+1; j<list_mhs.length; j++){
            if (list_mhs[j].ipk<list_mhs[idxMin].ipk){
                idxMin=j;
            }
        }
        mahasiswa tmp = list_mhs[idxMin];
        list_mhs[idxMin]=list_mhs[i];
        list_mhs[i]=tmp;
    }
}


    void insertionSort(){
        for (int i=1; i<list_mhs.length; i++){
            mahasiswa key = list_mhs[i];
            int j = i-1;
            while (j>=0 && list_mhs[j].ipk>key.ipk){
                list_mhs[j+1]= list_mhs[j];
                j= j-1;
            }
            list_mhs[j+1]= key;
        }
    }
}


