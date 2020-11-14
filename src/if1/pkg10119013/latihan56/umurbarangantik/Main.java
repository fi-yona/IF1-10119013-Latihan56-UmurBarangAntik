/*
 * NAMA  : Fiona Avila Putri
 * NIM   : 10119013
 * KELAS : IF1 2019/2020 (PBO1)
 */



package if1.pkg10119013.latihan56.umurbarangantik;

/**
 *
 * @author Fiona Avila
 */


public class Main {

    public static void main(String[] args) {
        Radio oo1 = new Radio(234);
        oo1.setName("Radio AM");
        System.out.println("Nama barang antik : " + oo1.getName());
        oo1.tampilUmur();
    }
    
}
