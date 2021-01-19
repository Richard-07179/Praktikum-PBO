package entity;

public class Richard07179_Karyawan {
    protected String nama,id,password;
    
    public Richard07179_Karyawan(String nama,String id,String password) {
        this.nama = nama;
        this.id = id;
        this.password = password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getId() {
        return id;
    }
    public void setId(String id){
        this.id = id;
    }      
}

