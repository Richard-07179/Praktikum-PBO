package controller;
import entity.Richard07179_Kasir;
import java.util.ArrayList;


public class Richard07179_KasirController {

    public Richard07179_KasirController() {
    }
    int Login = 0;
    public void dataKasir(){
        String id[] = {"01"};
        String nama [] = {"Richard"};
        String password[] = {"07179"};
        for(int i=0;i<id.length;i++){
            Richard07179_AllObject.daftarKaryawan.insert_karyawan(new Richard07179_Kasir(id[i],nama[i],password[i]));
        }
    }

    public void login(String nama,String password){
        Login = Richard07179_AllObject.daftarKaryawan.cekData(nama, password);
    }
    
    public ArrayList<Richard07179_Kasir> getDaftarKaryawan(){
        return Richard07179_AllObject.daftarKaryawan.getDataKasir();
    }
    public Richard07179_Kasir showKasir() {
        return Richard07179_AllObject.daftarKaryawan.showDataKaryawan(Login);
    }
    
}
