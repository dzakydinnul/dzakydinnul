package Tugas2;
//membuat kelas dosen sebagai sub class dari kelas elemen
class Dosen extends Elemen{
    private int jumlahHariKerja;
    public Dosen(String nama, int jumlahHariKerja){
      super(nama);
      setJumlahHariKerja(jumlahHariKerja);
    }
  
    @Override
    public int getJamSibuk(){
      return jumlahHariKerja*8;
    }
  
    @Override
    public void cekJamSibuk(){
      System.out.println(super.toString()+" adalah seorang Dosen dengan jam sibuk "+getJamSibuk());
    }
  
    public void setJumlahHariKerja(int newJumlahHariKerja){
      if(newJumlahHariKerja>0){
        jumlahHariKerja=newJumlahHariKerja;
      }
    }
  }