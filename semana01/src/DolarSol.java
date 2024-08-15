import javax.swing.*;

public class DolarSol {
    public static void main(String[] args) {
        double montoDolares, montoSoles, valorDolarSol = 3.72;

        montoDolares = Double.parseDouble(JOptionPane.showInputDialog("Ingrese monto en dólares:"));
        montoSoles = montoDolares * valorDolarSol;

        JOptionPane.showMessageDialog(null, String.format("$%,.2f = S/%.2f  ",montoDolares,montoSoles));
    }
}
