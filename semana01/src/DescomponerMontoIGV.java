import javax.swing.*;

public class DescomponerMontoIGV {
    public static void main(String[] args) {
        double montoTotal, igv, montoSinIgv;

        montoTotal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto total:"));

        if (montoTotal > 0) {
            igv = montoTotal * 0.18;
            montoSinIgv = montoTotal - igv;
            JOptionPane.showMessageDialog(null, String.format("Monto: %,.2f\nIGV: %,.2f\nTotal a pagar: %,.2f", montoSinIgv, igv, montoTotal));
        } else
            JOptionPane.showMessageDialog(null, "Ingrese un monto válido");
    }
}
