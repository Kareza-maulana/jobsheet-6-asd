public class sort {
    int[] data ;
    int jumlahdata;

    public sort(int Data[], int jumlah){
        jumlahdata= jumlah;
        data= new int [jumlah];
        for (int i=0; i<jumlahdata; i++){
            data[i]=Data[i];
        }
    }

    void bubbleSort(){
        for (int i=0; i<jumlahdata-1; i++){
            for (int j=0; j<jumlahdata-1-i; j++){
                if (data[j]>data[j+1]){
                    int temp = data[j];
                    data[j]= data[j+1];
                    data[j+1]= temp;
                }
            }
        }
    }

    void selectionSort(){
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
        }
    }

    void insertionSort(){
        for (int i=1; i<jumlahdata; i++){
            int key = data[i];
            int j = i-1;
            while (j>=0 && data[j]>key){
                data[j+1]= data[j];
                j= j-1;
            }
            data[j+1]= key;
        }
    }

    void tampil(){
        for (int i=0; i<jumlahdata; i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int Data[]={64, 34, 25, 12, 22, 11, 90};
        int jumlah= Data.length;
        sort ob = new sort(Data, jumlah);
        System.out.println("Data sebelum diurutkan:");
        ob.tampil();
        ob.bubbleSort();
        System.out.println("Data setelah diurutkan:");
        ob.tampil();

            int Data2[]={64, 25, 12, 22, 11};
            sort ob2 = new sort(Data2, Data2.length);
            System.out.println("Data sebelum diurutkan (bubble sort):");
            ob2.tampil();
            ob2.selectionSort();
            System.out.println("Data setelah diurutkan:");
            ob2.tampil();

            int Data3[]={12, 11, 13, 5, 6};
            sort ob3 = new sort(Data3, Data3.length);
            System.out.println("Data sebelum diurutkan (insertion sort):");
            ob3.tampil();
            ob3.insertionSort();
            System.out.println("Data setelah diurutkan (insertion sort):");
            ob3.tampil();
    }
    
}
