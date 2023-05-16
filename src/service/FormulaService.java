package service;

import java.util.Arrays;
import java.util.Map;

public class FormulaService {

    public double calcular_sumatoria_simple(int N) {
        double num = 3.0, anterior = 0.0, suma = 0.0, division = 0.0;
        int it = 0;

        do {
            it++;
            suma += anterior;
            division = num / it;
            anterior = division;
        } while (it <= N);
        return suma;
    }

    public double calcular_sumatoria_doble(int N) {
        double num = 3.0, anterior = 0.0, sumatoria = 0.0, division = 0.0;
        int it = 0;

        do {
            it += 2;
            sumatoria += anterior;
            division = num / it;
            anterior = division;
        } while (it <= (2 * N));

        return sumatoria;
    }

    public static Map<String, String> generar_vectores(int N) {

        int vector1[] = new int[N];
        int vector2[] = new int[N];
        int vectorSuma[] = new int[N];
        String elementosComun = "";

        for (int i = 0; i < N; ++i) {
            vector1[i] = generateRandomNumber(10, 50);
            vector2[i] = generateRandomNumber(10, 50);
        }

        // Suma de vectores
        for (int i = 0; i < N; ++i) {
            vectorSuma[i] = vector1[i] + vector2[i];
        }

        // Elementos en comun
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N; ++j) {
                if (vector1[i] == vector2[j]) {
                    elementosComun += "Valor: " + vector1[i] + "\nPosicion en el vector1: " + i + "\nPosicion en el vector2: " + j + "\n\n";
                }
            }
        }

        Map<String, String> valores = Map.of(
                "vector1", Arrays.toString(vector1),
                "vector2", Arrays.toString(vector2),
                "vector_suma", Arrays.toString(vectorSuma),
                "elementos_comun", elementosComun);

        return valores;
    }

    public static int generateRandomNumber(int min, int max) {
        return (int) Math.round((Math.random() * (max - min) + min));
    }

}
