package view;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class Richard07179_GUITransaksi {
    JFrame transaksi = new JFrame();
    JTable tabelbarang = new JTable();
    JScrollPane scrollbarang = new JScrollPane(tabelbarang);
    JButton bayar,back,total_harga;
    JLabel judul,labelNamaBarang,jumlah,kembalian,totalharga,LabelBayar;
    JTextField textNama,textQty,textBayar,textTotalHarga,textKembalian;
    
    
    int indexRowClicked = -1;
    public Richard07179_GUITransaksi(){
        transaksi.setSize(680,630);
        transaksi.setLayout(null);
        transaksi.getContentPane().setBackground(Color.LIGHT_GRAY);
        judul = new JLabel("Transaksi Penjualan");
        judul.setBounds(210, 10, 600, 50);
        judul.setFont(new Font("Times New Roman",Font.BOLD,40));
        transaksi.add(judul);
        
        labelNamaBarang = new JLabel("Nama Barang");
        labelNamaBarang.setBounds(50, 60, 150, 50);
        labelNamaBarang.setFont(new Font("Times New Roman",Font.BOLD,20));
        transaksi.add(labelNamaBarang);
        
        textNama = new JTextField();
        textNama.setBounds(190, 75, 150, 25);
        transaksi.add(textNama);
        
        jumlah = new JLabel("Qty Beli");
        jumlah.setBounds(50, 100, 150, 50);
        jumlah.setFont(new Font("Times New Roman",Font.BOLD,20));
        transaksi.add(jumlah);        
                        
        textQty = new JTextField();
        textQty.setBounds(190, 115, 150, 25);
        transaksi.add(textQty);
                         
        total_harga = new JButton("Hitung Total Harga");
        total_harga.setBounds(400, 70, 250, 30);
        total_harga.setFont(new Font("Times New Roman",Font.BOLD,20));
        transaksi.add(total_harga);
        
        totalharga = new JLabel("Total Harga");
        totalharga.setBounds(50, 140, 150, 50);
        totalharga.setFont(new Font("Times New Roman",Font.BOLD,20));
        transaksi.add(totalharga);
        
        textTotalHarga = new JTextField();
        textTotalHarga.setBounds(190, 155, 150, 25);
        transaksi.add(textTotalHarga);
        
        bayar = new JButton("Bayar");
        bayar.setBounds(400, 110, 100, 30);
        bayar.setFont(new Font("Times New Roman",Font.BOLD,20));
        transaksi.add(bayar);
        
        LabelBayar = new JLabel("Jumlah Bayar");
        LabelBayar.setBounds(50, 180, 150, 50);
        LabelBayar.setFont(new Font("Times New Roman",Font.BOLD,20));
        transaksi.add(LabelBayar);
        
        textBayar = new JTextField();
        textBayar.setBounds(190, 195, 150, 25);
        transaksi.add(textBayar);
        
        kembalian = new JLabel("Kembalian");
        kembalian.setBounds(50, 220, 150, 50);
        kembalian.setFont(new Font("Times New Roman",Font.BOLD,20));
        transaksi.add(kembalian);
        
        textKembalian = new JTextField();
        textKembalian.setBounds(190, 235, 150, 25);
        transaksi.add(textKembalian);
                
        back = new JButton("Back");
        back.setBounds(70, 490, 100, 30);
        back.setBackground(Color.RED);
        transaksi.add(back);
        
        scrollbarang.setBounds(30, 270, 600, 200);
        tabelbarang.setModel(Richard07179_Allobjctrl.transaksi.daftarbarang());
        transaksi.add(scrollbarang);
        
        transaksi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        transaksi.setVisible(true);
        transaksi.setLocationRelativeTo(null);
        
        
        bayar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                double uang_bayar =  Double.parseDouble(textBayar.getText());
                Richard07179_Allobjctrl.transaksi.bayarPenjualan(uang_bayar);
                double sisa_bayar = Richard07179_Allobjctrl.transaksi.getSisaBayar();
                textKembalian.setText(String.valueOf(sisa_bayar));
                
            }
        });
        
        total_harga.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                int jumlah_item =  Integer.parseInt(textQty.getText());                
                Richard07179_Allobjctrl.transaksi.getDataBarang().get(indexRowClicked).setQty_beli(jumlah_item);
                Richard07179_Allobjctrl.transaksi.tambahBarangPenjualan(indexRowClicked);
                Richard07179_Allobjctrl.transaksi.hitungTotal();
                double total_harga = Richard07179_Allobjctrl.transaksi.getTotalHarga();
                textTotalHarga.setText(String.valueOf(total_harga));
                  
            }
        });

        tabelbarang.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){      
                indexRowClicked = tabelbarang.getSelectedRow();
                textNama.setText(Richard07179_Allobjctrl.transaksi.daftarbarang().getValueAt(indexRowClicked, 0).toString());                        
                
            }
        });
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Richard07179_GUIMenu gui = new Richard07179_GUIMenu();
                transaksi.dispose();
            }
        });
    }
    void kosong(){
        textNama.setText(null);//settext null semua
        textQty.setText(null);
        textKembalian.setText(null);
        textBayar.setText(null);
        textTotalHarga.setText(null);
    }
}