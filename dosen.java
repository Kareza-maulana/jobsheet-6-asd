public class dosen {
    String kode,nama;
    int usia;
    boolean jenis_kelamin;

    dosen(){

    }

    dosen(String kode, String nama, int usia, boolean jenis_kelamin){
        this.kode = kode;
        this.nama = nama;
        this.usia = usia;
        this.jenis_kelamin = jenis_kelamin;
    }

    void tampilkaninfodosen(){
        System.out.println("Kode Dosen : " + kode);
        System.out.println("Nama Dosen : " + nama);
        System.out.println("Usia Dosen : " + usia);
        System.out.println("Jenis Kelamin Dosen : " + (jenis_kelamin ? "Laki-laki" : "Perempuan"));
    }


}
