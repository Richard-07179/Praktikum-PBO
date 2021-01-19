package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class Richard07179_GUIDataBarang {    
    JFrame databarang = new JFrame();
    JTable tabelbarang = new JTable();
    JScrollPane scrollbarang = new JScrollPane(tabelbarang);
    JButton tambah,hapus,update,back;
    JLabel judul,nama,jenisBarang,merk,harga,stock;
    JTextField textNamaBarang,textJenis_Barang,textMerkBarang,textHarga_Barang,textStock_Barang;
    
    int indexRowClicked = -1;
    public Richard07179_GUIDataBarang(){
        databarang.setSize(680,630);
        databarang.setLayout(null);
        databarang.getContentPane().setBackground(Color.LIGHT_GRAY);
        judul = new JLabel("Data Barang");
        judul.setBounds(210, 10, 600, 50);
        judul.setFont(new Font("Times New Roman",Font.BOLD,40));
        databarang.add(judul);
        
        nama = new JLabel("Nama Barang");
        nama.setBounds(50, 60, 150, 50);
        nama.setFont(new Font("Times New Roman",Font.BOLD,20));
        databarang.add(nama);
        
        textNamaBarang = new JTextField();
        textNamaBarang.setBounds(190, 75, 150, 25);
        databarang.add(textNamaBarang);
        
        merk = new JLabel("Merk Barang");
        merk.setBounds(50, 100, 150, 50);
        merk.setFont(new Font("Times New Roman",Font.BOLD,20));
        databarang.add(merk);
        
        textMerkBarang = new JTextField();
        textMerkBarang.setBounds(190, 115, 150, 25);
        databarang.add(textMerkBarang);
        
        jenisBarang = new JLabel("Jenis Barang");
        jenisBarang.setBounds(50, 140, 150, 50);
        jenisBarang.setFont(new Font("Times New Roman",Font.BOLD,20));
        databarang.add(jenisBarang);
        
        textJenis_Barang = new JTextField();
        textJenis_Barang.setBounds(190, 155, 150, 25);
        databarang.add(textJenis_Barang);
        
        stock = new JLabel("Stock Barang");
        stock.setBounds(50, 180, 150, 50);
        stock.setFont(new Font("Times New Roman",Font.BOLD,20));
        databarang.add(stock);
        
        textStock_Barang = new JTextField();
        textStock_Barang.setBounds(190, 195, 150, 25);
        databarang.add(textStock_Barang);
        
        harga = new JLabel("Harga Barang");
        harga.setBounds(50, 220, 150, 50);
        harga.setFont(new Font("Times New Roman",Font.BOLD,20));
        databarang.add(harga);
        
        textHarga_Barang = new JTextField();
        textHarga_Barang.setBounds(190, 235, 150, 25);
        databarang.add(textHarga_Barang);
        
        tambah = new JButton("Tambah");
        tambah.setBounds(400, 70, 100, 30);
        tambah.setBackground(Color.WHITE);
        databarang.add(tambah);
        
        hapus = new JButton("Hapus");
        hapus.setBounds(400, 110, 100, 30);
        hapus.setBackground(Color.WHITE);
        databarang.add(hapus);
        
        update = new JButton("Update");
        update.setBounds(400, 150, 100, 30);
        update.setBackground(Color.WHITE);
        databarang.add(update);
        
        back = new JButton("Back");
        back.setBounds(70, 490, 100, 30);
        back.setBackground(Color.RED);
        databarang.add(back);
        
        scrollbarang.setBounds(30, 270, 600, 200);
        tabelbarang.setModel(Richard07179_Allobjctrl.transaksi.daftarbarang());
        databarang.add(scrollbarang);
        
        databarang.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        databarang.setVisible(true);
        databarang.setLocationRelativeTo(null);
        
        tambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try{
                    String nama = textNamaBarang.getText();
                    String merk = textMerkBarang.getText();
                    String jenisbarang = textJenis_Barang.getText();
                    int stock_brg =  Integer.parseInt(textStock_Barang.getText());
                    double harga_brg = Double.parseDouble(textHarga_Barang.getText());
                    
                    Richard07179_Allobjctrl.transaksi.InsertBarang(nama, merk, jenisbarang, stock_brg, harga_brg); 
                    JOptionPane.showMessageDialog(null, "Barang Berhasil Ditambahkan", "information", JOptionPane.INFORMATION_MESSAGE);
                    kosong();
                }catch(Exception exception){
                    JOptionPane.showMessageDialog(null, "Barang Gagal Ditambahkan", "information", JOptionPane.INFORMATION_MESSAGE);
                }
                tabelbarang.setModel(Richard07179_Allobjctrl.transaksi.daftarbarang());
            }
        });
        hapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                Richard07179_Allobjctrl.transaksi.hapusBarang(indexRowClicked);
                
                tabelbarang.setModel(Richard07179_Allobjctrl.transaksi.daftarbarang());
                JOptionPane.showMessageDialog(null, "Data Telah Dihapus!");
                kosong();
            }
        });
        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                String nama = textNamaBarang.getText();                    
                String merk = textMerkBarang.getText();
                String jenis = textJenis_Barang.getText();
                int stok_barang =Integer.parseInt(textStock_Barang.getText());
                double harga_barang = Double.parseDouble(textHarga_Barang.getText());

                Richard07179_Allobjctrl.transaksi.updateBarang(indexRowClicked, nama,merk,jenis,stok_barang,harga_barang);
                kosong();
                tabelbarang.setModel(Richard07179_Allobjctrl.transaksi.daftarbarang());
                
            }
        });
        tabelbarang.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                
                indexRowClicked = tabelbarang.getSelectedRow();
                textNamaBarang.setText(Richard07179_Allobjctrl.transaksi.daftarbarang().getValueAt(indexRowClicked, 0).toString());
                textMerkBarang.setText(Richard07179_Allobjctrl.transaksi.daftarbarang().getValueAt(indexRowClicked, 1).toString());
                textJenis_Barang.setText(Richard07179_Allobjctrl.transaksi.daftarbarang().getValueAt(indexRowClicked, 2).toString());
                textStock_Barang.setText(Richard07179_Allobjctrl.transaksi.daftarbarang().getValueAt(indexRowClicked, 3).toString());
                textHarga_Barang.setText(Richard07179_Allobjctrl.transaksi.daftarbarang().getValueAt(indexRowClicked, 4).toString());
            }
        });
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Richard07179_GUIMenu gui = new Richard07179_GUIMenu();
                databarang.dispose();
            }
        });
    }
    void kosong(){
        textNamaBarang.setText(null);
        textMerkBarang.setText(null);
        textJenis_Barang.setText(null);
        textStock_Barang.setText(null);
        textHarga_Barang.setText(null);
    }
}