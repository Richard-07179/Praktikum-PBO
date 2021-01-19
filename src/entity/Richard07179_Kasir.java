package entity;

public class Richard07179_Kasir extends Richard07179_Karyawan{
    public Richard07179_Kasir(String id,String nama,String password){
         super(nama,id,password);
         this.nama = nama;
         this.id = id;
         this.password = password;
    }
    @Override
    public String getNama() {
        return nama;
    }
    @Override
    public void setNama(String nama){
        this.nama = nama;
    }
    @Override
    public String getId() {
        return id;
    }
    @Override
    public void setId(String id){
        this.id = id;
    }      
    @Override
    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String getPassword() {
        return password;
    }
}
