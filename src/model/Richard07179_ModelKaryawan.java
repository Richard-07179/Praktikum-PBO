package model;
import entity.Richard07179_Kasir;
import java.util.ArrayList;

public class  Richard07179_ModelKaryawan implements Richard07179_KaryawanInterface {
    public ArrayList <Richard07179_Kasir> dataKasir;
    
    public Richard07179_ModelKaryawan(){
        dataKasir = new ArrayList <>();
    }
    @Override
    public void insert_karyawan(Richard07179_Kasir kasir){
        dataKasir.add(kasir);
    }
    @Override
    public ArrayList<Richard07179_Kasir> getDataKasir() {
        return dataKasir;
    }
    public int cekData(String nama,String password){
        int loop = 0;
        for(int i= 0;i<dataKasir.size();i++){
                if(nama.equals(dataKasir.get(i).getNama()) &&
                    password.equals(dataKasir.get(i).getPassword())){
                    break;
                }
                else{
                    loop++;
                }
            }        
        return loop;
    }    
    public Richard07179_Kasir showDataKaryawan(int index){
        return dataKasir.get(index);
    }
}
