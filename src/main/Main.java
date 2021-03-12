
package main; //Evan Jahzeel Ku canche 19070048
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
    int option=0;
    Double valorreal, valoraprox;
    Errores error;
    do{
        try{
            option=Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Menú de Opciones para calculo de errores"
                        + "1. Error absoluto\n"
                        + "2. Error relativo\n"
                        + "3. Error relativo porcentual\n"
                        + "4.Salir"));
            switch(option){
                case 1:
                    valorreal = Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese el valor real"));
                        valoraprox = Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese el valor aproximado"));
                        error = new Errores(valorreal, valoraprox);
                        JOptionPane.showMessageDialog(null, "el resultado es " + error.ErrorAbsoluto(), "Error absoluto", JOptionPane.INFORMATION_MESSAGE);
                        break;
                case 2:
                    valorreal = Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese el valor real"));
                        valoraprox = Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese el valor aproximado"));
                        error = new Errores(valorreal, valoraprox);
                        JOptionPane.showMessageDialog(null, "el resultado es " + error.ErrorRelativo(), "Error relativo", JOptionPane.INFORMATION_MESSAGE);
                        break;
                case 3:
                    valorreal = Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese el valor real"));
                        valoraprox = Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese el valor aproximado"));
                        error = new Errores(valorreal, valoraprox);
                        JOptionPane.showMessageDialog(null, "el resultado es " + error.ErrorRelativoPorcentual() + "%", "Error relativo porcentual", JOptionPane.INFORMATION_MESSAGE);
                        break;
                case 4:
                        option = 4;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "opcion incorrecta", null, JOptionPane.ERROR_MESSAGE);
                        break;
            
            } 
        }catch (NumberFormatException k){
                }  
    
     } while (option != 4);
    }
}
