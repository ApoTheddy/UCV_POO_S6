package controller;

import java.util.Map;
import service.FormulaService;

public class FormulaController {

    FormulaService formulas_service = new FormulaService();

    public Map<String,Double> calcular_sumatoria_simple(int N) {
        return formulas_service.calcular_sumatoria_simple(N);
    }

    public double calcular_sumatoria_doble(int N) {
        return formulas_service.calcular_sumatoria_doble(N);
    }

    public Map<String, String> generar_vectores(int N) {
        return formulas_service.generar_vectores(N);
    }

}
