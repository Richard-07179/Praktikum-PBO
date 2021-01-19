package model;
import entity.*;
import java.util.ArrayList;

public class Richard07179_ModelBarang {
    private ArrayList<Richard07179_Barang> dataBarang ;

    public ArrayList<Richard07179_Barang> getDataBarang() {
        return dataBarang;
    }

    public void setDataBarang(ArrayList<Richard07179_Barang> dataBarang) {
        this.dataBarang = dataBarang;
    }

    public Richard07179_ModelBarang() {
        this.dataBarang = new ArrayList<>();
    }
    public void tambahBarang(Richard07179_Barang barang){
        dataBarang.add(barang);
    }
    public void update_barang(int index, Richard07179_Barang barang) {
        dataBarang.set(index, barang);
    }
    public void remove_barang(int index){
        dataBarang.remove(index);
    }
   
}
