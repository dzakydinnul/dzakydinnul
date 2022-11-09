public class VirtualDemo {
     public static void main(String[] args) {
        
    Gaji s = new Gaji("Wahyu", "Kubar", 3, 5000.00); //membuat objek kelas gaji
    Pegawai e = new Gaji("ini Nama", "Samarinda", 2, 2500.00); // upcasting dan juga membentuk polymorphism
    /*Output dari program tersebut dalam konstruktor gaji terdapat kode super yang mengakses 
    konstruktor pada parent class. Maka, kalimat "Menyusun pengawai" ditampilkan
    dua kali dalam output */
    System.out.println("Memanggil mailCheck Berdasaran Referensi Gaji --");
    s.mailCheck();
    System.out.println("\nMemanggil mailCheck Berdasarkan referensi Pegawai --");
    e.mailCheck();
}

    
}
