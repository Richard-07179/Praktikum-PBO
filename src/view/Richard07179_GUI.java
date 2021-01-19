package view;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Richard07179_GUI {
    JFrame Tampilan_awal = new JFrame();
    JLabel login,top;
    JTextField textnama;
    JLabel labelnama,labelpassword;
    JButton masuk;
    JPasswordField passwordlogin;
    
    public Richard07179_GUI(){
        Tampilan_awal.setSize(700, 400);
        Tampilan_awal.setLayout(null);
        Tampilan_awal.getContentPane().setBackground(Color.RED);
        top = new JLabel("BENGKEL RAJAWALI MOTOR");
        top.setBounds(50, 10, 600, 50);
        top.setFont(new Font("Times New Roman",Font.BOLD,40));
        Tampilan_awal.add(top);
        
        login = new JLabel("Login Kasir");
        login.setBounds(280, 50, 300, 100);
        login.setFont(new Font("Times New Roman",Font.BOLD,30));
        Tampilan_awal.add(login);
        
        labelnama = new JLabel("Nama");
        labelnama.setBounds(335, 90, 100, 100);
        labelnama.setFont(new Font("Times New Roman",Font.BOLD,20));
        Tampilan_awal.add(labelnama);
        
        textnama = new JTextField();
        textnama.setBounds(270, 155, 180, 20);
        Tampilan_awal.add(textnama);
        
        labelpassword = new JLabel("Password");
        labelpassword.setBounds(320, 135, 100, 100);
        labelpassword.setFont(new Font("Times New Roman",Font.BOLD,20));
        Tampilan_awal.add(labelpassword);
        
        passwordlogin = new JPasswordField();
        passwordlogin.setBounds(270, 200, 180, 20);
        Tampilan_awal.add(passwordlogin);
        
        masuk = new JButton("Login");
        masuk.setBounds(310, 240, 100, 30);
        masuk.setBackground(Color.white);
        Tampilan_awal.add(masuk);
        
        Tampilan_awal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Tampilan_awal.setVisible(true);
        Tampilan_awal.setLocationRelativeTo(null);
    
        masuk.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){ 
                try{ 
                    Richard07179_Allobjctrl.Kasir.dataKasir(); 
                    Richard07179_Allobjctrl.Kasir.login(textnama.getText(), passwordlogin.getText());
                    String nama = Richard07179_Allobjctrl.Kasir.showKasir().getNama();
                    JOptionPane.showMessageDialog(null, "Selamat datang "+nama,"information", JOptionPane.INFORMATION_MESSAGE);
                    Richard07179_GUIMenu Menu = new Richard07179_GUIMenu();
                    Tampilan_awal.dispose();
                }catch(Exception exception){
                    JOptionPane.showMessageDialog(null, "id atau nama salah", "information", JOptionPane.INFORMATION_MESSAGE);
                    kosong();         
                } 
            }
        });
    }
    void kosong(){
    textnama.setText(null);
    passwordlogin.setText(null);
    }                    
}
