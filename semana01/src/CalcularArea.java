import javax.swing.*;

public class CalcularArea {
    public static void main(String[] args) {
        double area = 0;
        String[] opciones = {"Círculo", "Cuadrado", "Rectángulo", "Triángulo"};

        int opc = JOptionPane.showOptionDialog(null, "¿Qué figura desea para calcular su área?", "Calcular área", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
        String figura= opciones[opc];

        switch (opc) {
            case 0-> {
                double r = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio en m:"));
                area = Math.PI * Math.pow(r,2);
            }
            case 1-> {
                double l = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado en m:"));
                area = l * l;
            }
            case 2-> {
                double b = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base en m:"));
                double a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura en m:"));
                area = b * a;
            }
            case 3-> {
                double b = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base en m:"));
                double a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura en m:"));
                area = (b * a) / 2;
            }
        }
        JOptionPane.showMessageDialog(null, String.format("El área del %s es %.2f m2",figura,area));
    }
}
