import javax.swing.JOptionPane;

public class Input02 {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null,
                "Você ganhou 5mil reais clique aqui para receber",
                "Blaze",
                0);

        
        String input1 = (String)JOptionPane.showInputDialog(null,
                "Cachorro ou gato?",
                "Isso ou aquilo",
                2,
                null,
                null,
                "Escreva aqui.");
        
        
        String[] acceptableValues = {"Neymar", "Messi", "Cristiano ronaldo"};
        String input2 = (String)JOptionPane.showInputDialog(null,
                "Qual você prefere?",
                "GOAT",
                2,
                null,
                acceptableValues,
                acceptableValues[1]);
                
    }
}
