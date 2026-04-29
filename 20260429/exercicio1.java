import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class exercicio1 extends JFrame{
    public exercicio1(){
        setTitle("Primeira janela");

        setSize(800, 600);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);
    }


public static void main(String[] args){
    SwingUtilities.invokeLater(() ->{
        exercicio1 janela = new exercicio1();

        janela.setVisible(true);
    });
}
}
