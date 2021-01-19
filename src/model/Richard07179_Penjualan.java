package model;
import entity.Richard07179_Barang;
import java.util.ArrayList;

public class Richard07179_Penjualan {
    ArrayList <Richard07179_Barang> daftarBarang; 
    double total_harga;
    double sisa_bayar;
    
    public double getTotal_harga() {
        return total_harga;
    }

    public double getSisa_bayar() {
        return sisa_bayar;
    }

    public Richard07179_Penjualan() {
        daftarBarang = new ArrayList();
    }    
    public void tambahBarang(Richard07179_Barang barang){
        daftarBarang.add(barang);
    }
    public void HitungTotalBayar(){
        double tempTotal=0;
        for(int i=0;i<daftarBarang.size();i++){
            int qtyBeli = daftarBarang.get(i).getQty_beli();
            tempTotal += daftarBarang.get(i).getHarga()* qtyBeli;
      
            daftarBarang.get(i).KurangiStock(qtyBeli);   
        }        
        total_harga = tempTotal;   
    }    
    public void Bayar(double bayar){
        if(bayar >= total_harga){
            sisa_bayar = bayar - total_harga;
        }
        else{
            System.out.println("Uang Tidak Mencukupi");
        }    
    }   
}

