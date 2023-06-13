package universitas;

public class MahasiswaBeraksi {
    public static void main(String[] args) {
        Mahasiswa rizky = new Mahasiswa(" 2110010134 ","Muhammad Rizky"," TI ");
        
        System.out.println("Nama Mahsiswa : "+rizky.getNpm());
        System.out.println("Nama Mahsiswa : "+rizky.getNama());
        System.out.println("Nama Mahsiswa : "+rizky.getProdi());
        
        System.out.println("Detail Mahasiswa :"+rizky.getDetail());
    }
    
}
