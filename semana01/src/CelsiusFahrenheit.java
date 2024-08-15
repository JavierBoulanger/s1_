import javax.swing.*;

public class CelsiusFahrenheit {

    public static void main(String[] args) {
        double gradosC, gradosF;

        gradosC = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los °C:"));
        gradosF = (gradosC * 9 / 5) + 32;

        JOptionPane.showMessageDialog(null, String.format("%.2f °C = %.2f °F ",gradosC,gradosF));
    }
}
