package controller;
import entity.Richard07179_Barang;
import entity.Richard07179_Stock;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Richard07179_TransaksiController {
    public void InsertBarang(String nama,String merk,String jenis_barang,int stok,double harga_barang){
        Richard07179_Stock stock = new Richard07179_Stock(stok);    
        Richard07179_AllObject.dataBarang.tambahBarang(new Richard07179_Barang(nama,merk,jenis_barang,stock,harga_barang));   
    }
    public void updateBarang(int index,String nama,String merk,String jenis_barang,int stok,double harga_barang){
        Richard07179_Stock stock = new Richard07179_Stock(stok);
        Richard07179_AllObject.dataBarang.update_barang(index,new Richard07179_Barang(nama,merk,jenis_barang,stock,harga_barang));
    }
    
    public void hapusBarang(int index){
        Richard07179_AllObject.dataBarang.remove_barang(index);
    }
    public ArrayList<Richard07179_Barang> getDataBarang(){
        return Richard07179_AllObject.dataBarang.getDataBarang();
    }
    public void tambahBarangPenjualan(int nomorBarang){
        Richard07179_AllObject.penjualan.tambahBarang(Richard07179_AllObject.dataBarang.getDataBarang().get(nomorBarang)); 
    }
    public void hitungTotal(){
        Richard07179_AllObject.penjualan.HitungTotalBayar();
    }    
    public void bayarPenjualan(double bayar){
        Richard07179_AllObject.penjualan.Bayar(bayar);
    }
    public double getTotalHarga(){
        return Richard07179_AllObject.penjualan.getTotal_harga();
    }    
    public double getSisaBayar(){
        return Richard07179_AllObject.penjualan.getSisa_bayar();
    }
    public DefaultTableModel daftarbarang(){
        DefaultTableModel dtmdaftarbarang = new DefaultTableModel();
        Object[] kolom = {"Nama Barang","Merk Barang","Jenis Barang","Stock","Harga Barang"};
        dtmdaftarbarang.setColumnIdentifiers(kolom);
        int size = Richard07179_AllObject.dataBarang.getDataBarang().size();
        for(int i=0; i<size; i++){
            Object [] data = new Object[5];
            data[0] = Richard07179_AllObject.dataBarang.getDataBarang().get(i).getNama();
            data[1] = Richard07179_AllObject.dataBarang.getDataBarang().get(i).getMerk();
            data[2] = Richard07179_AllObject.dataBarang.getDataBarang().get(i).getJenis_Barang();
            data[3] = Richard07179_AllObject.dataBarang.getDataBarang().get(i).getStock().getJumlah_Stock();
            data[4] = Richard07179_AllObject.dataBarang.getDataBarang().get(i).getHarga();
            dtmdaftarbarang.addRow(data);
        }
    return dtmdaftarbarang;
    }
    
}
