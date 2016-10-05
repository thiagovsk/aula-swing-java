import javax.swing.*;

public class PanelSimples {
    public static void main(String[] args) {
        String nome;
        int reposta;
        nome = JOptionPane.showInputDialog("Qual é o seu nome?");
        reposta = JOptionPane.showConfirmDialog(null, "O seu nome é " + nome + "????");
        // como pegar a resposta?
        if (reposta == JOptionPane.CANCEL_OPTION){
            JOptionPane.showInputDialog("Cancelou?");
        }
    }
}
