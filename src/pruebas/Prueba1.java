package pruebas;

import java.util.Map;

import controller.FormulaController;

public class Prueba1 {

    public static void main(String[] args) {
        FormulaController frm_ctrl = new FormulaController();
        

        Map<String,String> vectores = frm_ctrl.generar_vectores(8);
        System.out.println("vector1: " + vectores.get("vector1"));
        System.out.println("vector2: " + vectores.get("vector2"));
        System.out.println("vector_suma: " + vectores.get("vector_suma"));
        System.out.println("elementos_comun: " + vectores.get("elementos_comun"));

        System.out.println(frm_ctrl.calcular_sumatoria_simple(5).get("termino_n"));
    }

}
