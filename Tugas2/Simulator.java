//membuat driver class
public class Simulator {
    public static void main(String[] args) {
      Elemen a = new Asdos("Fairuzikun", 24, 1);    //Upcasting
      Elemen b = new Dosen("Raja OP Damanik", 5);  //Upcasting
      Elemen c = new Asdos("Angel Chan", 20, 4);    //Upcasting
      Elemen d = new Mahasiswa("Firman", 20);                   //Upcasting
      Elemen e = new Mahasiswa("Nid to pass this sem", 23);     //Upcasting
      Elemen f = new Dosen("Nivotko", 3);           //Upcasting
  
      /*Baris ke 4 sampai 9 terdiri dari beberapa objek dengan tipe elemen tetapi dengan bentuk yang
       * berbeda, ada yang sebagai asdos,
       * ada sebagai dosen
       * ada sebagai mahasiswa
       * berbagai bentuk dari elemen inilah yang disebut sebagai polimorpisme atau banyak bentuk
       */
  
       // memanggil method ceoJamSibuk() untuk setiap objek
      a.cekJamSibuk();
      b.cekJamSibuk();
      c.cekJamSibuk();
      d.cekJamSibuk();
      e.cekJamSibuk();
      f.cekJamSibuk();
  
      // menjumlahkan jam sibuk setiap objek yang dibuat
      int totalJamSibuk = a.getJamSibuk()+b.getJamSibuk()+c.getJamSibuk()+d.getJamSibuk()+e.getJamSibuk()+f.getJamSibuk();
      // menampilkan total jam sibuk seluruh objek
      System.out.println("Total jam sibuk elemen Fasilkom adalah "+totalJamSibuk);  
    }
  }