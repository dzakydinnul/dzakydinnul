package Tugas2;
// membuat kela Asdos yang merupakan subclass dari kelas mahasiswa
class Asdos extends Mahasiswa{
    private int jamNgasdos;
  
    public Asdos(String nama, int sks, int jamNgasdos){
      super(nama, sks);
      setJamNgasdos(jamNgasdos);
    }
  
    @Override
    public int getJamSibuk(){
      return jamNgasdos+super.getJamSibuk();
    }
  
    @Override
    public void cekJamSibuk(){
      System.out.println(super.toString()+" adalah seorang Asdos dengan jam sibuk "+getJamSibuk());
    }
  
    public void setJamNgasdos(int newJamNgasdos){
      if(newJamNgasdos>0){
        jamNgasdos = newJamNgasdos;
      }
    }
    
  }