import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class configtela extends  JFrame {
    private JTextField brigadeiro;
    private  JTextField pudim;
    private JTextField cookie;
    private  JButton pedir;
    private  JLabel precobrig,precocookie,precopudim;

   private JLabel ftbrigadeiro,ftpudim,ftcookie;
   private  JLabel lojadedoces;
    //transformar em int dps//
    String quantidadebrigadeiro;
    String quantidadecookie;
    String quantidadepudim;
    int pedidopudim;
    int pedidocookie;
    int pedidobrigadeiro;
    int valortotal;
    public configtela  () {
        super("Loja de Doces");
        JPanel painel = new JPanel(null);
        Icon fotobrigadeiro = new ImageIcon(getClass().getResource("brigadeiro.jpeg"));
        ftbrigadeiro= new JLabel(fotobrigadeiro);
        ftbrigadeiro.setBounds(80,80,180,180);
        painel.add(ftbrigadeiro);

        Icon fotocookie = new ImageIcon(getClass().getResource("cookie.jpeg"));
        ftcookie= new JLabel(fotocookie);
        ftcookie.setBounds(80,300,180,180);
        painel.add(ftcookie);
        Icon fotopudim = new ImageIcon(getClass().getResource("pudim.jpeg"));
        ftpudim= new JLabel(fotopudim);
        ftpudim.setBounds(80,520,180,180);
        painel.add(ftpudim);
        precobrig= new JLabel("R$:10,00");

        precobrig.setBounds(300,130,60,60);


        painel.add(precobrig);
        precocookie = new JLabel("R$:15:00");
        precocookie.setBounds(300,330,60,60);
        painel.add(precocookie);
        precopudim= new JLabel("R$:25,00");
        precopudim.setBounds(300,530,60,60);
        painel.add(precopudim);

        brigadeiro = new JTextField(6);
        brigadeiro.setBounds(520,150,100,20);
        painel.add(brigadeiro);

        cookie = new JTextField(6);
        cookie.setBounds(520,370,100,20);
        painel.add(cookie);
        Font fonte = new Font("Times new Roman",1,15);
        pudim = new JTextField(6);
        pudim.setBounds(520,570,100,20);
        painel.add(pudim);

        pedir = new JButton("Pedir");
        pedir.setBounds(500,700,140,50);
        painel.add(pedir);
        ButtonHandler handler = new ButtonHandler();
        pedir.addActionListener(handler);
        lojadedoces= new JLabel("Loja de doces");
        lojadedoces.setBounds(500,20,150,40);
        lojadedoces.setFont(fonte);
        painel.add(lojadedoces);









        add(painel);
    }
    public  void converter(){
        quantidadebrigadeiro = brigadeiro.getText();
        quantidadebrigadeiro = brigadeiro.getText();
        quantidadepudim = pudim.getText();
        quantidadecookie = cookie.getText();
        pedidopudim = Integer.parseInt(quantidadepudim);
        pedidobrigadeiro = Integer.parseInt(quantidadebrigadeiro);
        pedidocookie = Integer.parseInt(quantidadecookie);
        valortotal = ((pedidobrigadeiro * 10) + (pedidocookie * 15) + (pedidopudim * 25));

    }
    private class ButtonHandler implements ActionListener{
        public void actionPerformed (ActionEvent event){
            converter();
            JOptionPane.showMessageDialog(null,"O valor total da sua compra foi de R$"+valortotal+",00");
        }

    }





}