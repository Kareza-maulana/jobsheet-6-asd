
public class datadosen {
    dosen list_dosen[] = new dosen[5];
    int index;

    void tambah(dosen d){
        if (index < list_dosen.length){
            list_dosen[index] = d;
            index++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil(){
        for (dosen d : list_dosen){
            d.tampilkaninfodosen();
            System.out.println("-------------------------");
        }
    }

    void bubbleSort(){
        for (int i = 0; i < list_dosen.length - 1; i++) {
            for (int j = 1; j < list_dosen.length - i; j++) {
                // Tanda '>' digunakan agar data yang lebih besar digeser ke kiri (depan)
                if (list_dosen[j].usia > list_dosen[j - 1].usia) {
                    // Proses penukaran posisi objek (Swap)
                    dosen tmp = list_dosen[j];
                    list_dosen[j] = list_dosen[j - 1];
                    list_dosen[j - 1] = tmp;
                }
            }
        }
    }

    void selectionSort(){
        for (int i=0; i<list_dosen.length-1; i++){
            int idxMin=i;
            for (int j=i+1; j<list_dosen.length; j++){
                if (list_dosen[j].usia<list_dosen[idxMin].usia){
                    idxMin=j;
                }
            }
            dosen tmp = list_dosen[idxMin];
            list_dosen[idxMin]=list_dosen[i];
            list_dosen[i]=tmp;
        }
    }

    void insertionSort(){
        for (int i=1; i<list_dosen.length; i++){
            dosen key = list_dosen[i];
            int j = i-1;
            while (j>=0 && list_dosen[j].usia>key.usia){
                list_dosen[j+1]= list_dosen[j];
                j= j-1;
            }
            list_dosen[j+1]= key;
        }
    }


    
}
