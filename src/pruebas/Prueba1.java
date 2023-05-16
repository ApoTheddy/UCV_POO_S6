package pruebas;

import controller.FormulaController;

public class Prueba1 {

    public static void main(String[] args) {
        FormulaController frm_ctrl = new FormulaController();

        double sumatoria = frm_ctrl.calcular_sumatoria_simple(5);
        System.out.println("sumatoria: " + sumatoria);
    }

}
