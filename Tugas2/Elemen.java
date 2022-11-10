package Tugas2;
//membuat kelas Elemen sebagai parent class
public abstract class Elemen {
    private String nama;
    public  Elemen(String nama){
      this.nama=nama;
    }
  
    public String toString(){
      return nama;
    }
    public abstract int getJamSibuk();
    public abstract void cekJamSibuk();
  }