import javax.swing.*;

public class OperacionMatematica {
    public static void main(String[] args) {
        double a, b, c;

        a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese valor para a:"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Ingrese valor para b:"));
        c = Double.parseDouble(JOptionPane.showInputDialog("Ingrese valor para c:"));

        double discriminante = Math.pow(b, 2) - 4 * a * c;

        if (discriminante >= 0)
            JOptionPane.showMessageDialog(null,  String.format("El discriminante es %.2f",discriminante));
        else
            JOptionPane.showMessageDialog(null, "No hay solución en los reales.");
    }
}
