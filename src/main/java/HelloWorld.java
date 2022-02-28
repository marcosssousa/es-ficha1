import javax.swing.*;

public class HelloWorld extends JFrame{
    private JLabel lblmessagem;
    private JPanel painel;

    public HelloWorld(){
        setContentPane(painel);
        pack();
    }

    public static void main(String[] args){
        new HelloWorld().setVisible(true);
    }
}
