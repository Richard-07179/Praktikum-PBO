package entity;

public class Richard07179_Barang {
    private String nama,merk,jenis_Barang;
    private double harga;
    private int qty_beli;    
    Richard07179_Stock stock;
    
    public Richard07179_Barang(String nama,String merk,String jenis_Barang,
            Richard07179_Stock stock,double harga){
        this.nama = nama;
        this.merk = merk;
        this.jenis_Barang = jenis_Barang;
        this.harga = harga;
        this.stock = stock;
    }
    
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getMerk(){
        return merk;
    }
    public void setMerk(String merk){
        this.merk = merk;
    }
    public String getJenis_Barang(){
        return jenis_Barang;
    }
    public void setJenis_Barang(String jenis){
        this.jenis_Barang = jenis;
    }
    public double getHarga(){
        return harga;
    }
    public void setHarga(double harga){
        this.harga = harga;
    }
    public Richard07179_Stock getStock(){
        return stock;
    } 
    
    public void KurangiStock(int qty){
       int krg =  stock.getJumlah_Stock() - qty;
       stock.setJumlah_Stock(krg);
    }
    
    public void tambahstock (int qty){
        int tambah = stock.getJumlah_Stock() + qty;
        stock.setJumlah_Stock(tambah);     
    }            
    
    public void setQty_beli(int qty_beli) {
        this.qty_beli = qty_beli;
    }

    public int getQty_beli() {
        return qty_beli;
    }
    
}
