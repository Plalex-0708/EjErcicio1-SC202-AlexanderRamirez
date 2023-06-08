package ejercicio1_sc202_alexanderramirez;

import javax.swing.JOptionPane;

public class Ejercicio1_SC202_AlexanderRamirez {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bienvenida Empresa X");
        int NEmployees = Integer.parseInt(JOptionPane.showInputDialog("Digite La cantidad de empleados que hay en su empresa"));
double Salaries = 0;
        for (int i = 0; i < NEmployees; i++) {
double intro = Double.parseDouble(JOptionPane.showInputDialog("Introdusca salario Correspecto a persona"));
Salaries = Salaries + intro;
        }
       double SEM = Salaries * 0.0925;
       double IVM = Salaries * 0.0508;
       
       double Final = SEM+ IVM;
       
       JOptionPane.showMessageDialog(null, "Su empresa debera abonar a la CCSS el Monto de " + Final + " por concepto de SEM y IVM");
    }

}
