package view;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Richard07179_GUIMenu {
    JFrame Tampilan_Menu ;
    JButton dataBarang,transaksi,back ;
    JLabel judul,menu;
    
    public Richard07179_GUIMenu(){
        Tampilan_Menu = new JFrame(); ;
        Tampilan_Menu.setSize(700, 400);
        Tampilan_Menu.setLayout(null);
        Tampilan_Menu.getContentPane().setBackground(Color.RED);
        judul = new JLabel("BENGKEL RAJAWALI MOTOR");
        judul.setBounds(50, 10, 600, 50);
        judul.setFont(new Font("Times New Roman",Font.BOLD,40));
        Tampilan_Menu.add(judul);
        
        menu = new JLabel("MENU PILIHAN");
        menu.setBounds(260, 50, 400, 100);
        menu.setFont(new Font("Times New Roman",Font.BOLD,30));
        Tampilan_Menu.add(menu);
        
        dataBarang = new JButton("Data Barang");
        dataBarang.setBounds(270, 150, 200, 30);
        dataBarang.setBackground(Color.white);
        Tampilan_Menu.add(dataBarang);
        
        transaksi = new JButton("Transaksi");
        transaksi.setBounds(270, 200, 200, 30);
        transaksi.setBackground(Color.white);
        Tampilan_Menu.add(transaksi);
         
        back = new JButton("back");
        back.setBounds(50, 300, 100, 30);
        back.setBackground(Color.GRAY);
        Tampilan_Menu.add(back); 
        
        Tampilan_Menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Tampilan_Menu.setVisible(true);
        Tampilan_Menu.setLocationRelativeTo(null);
        
        back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                Tampilan_Menu.dispose();
                Richard07179_GUI tampilanAwal = new Richard07179_GUI();
            }
        });
        
        dataBarang.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                Tampilan_Menu.dispose();
                Richard07179_GUIDataBarang input = new Richard07179_GUIDataBarang();
            }
        });
        
        transaksi.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                Tampilan_Menu.dispose();
                Richard07179_GUITransaksi update = new Richard07179_GUITransaksi();
            }
        });
        
        
    }
}
