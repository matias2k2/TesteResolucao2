package resolucoes2;

import org.json.JSONObject;
import org.json.JSONArray;

public class Caso3 {

    public static void main(String[] args) {
        String jsonString = """
                    {
                        "faturamentoMensal": [
                            1200.50, 2000.75, 0, 1800.40, 0, 5000.30, 1700.60,
                            400.10, 3000.50, 0, 2500.80, 3200.90, 0, 0, 1200.90
                        ]
                    }
                """;

        JSONObject json = new JSONObject(jsonString);
        JSONArray faturamentoArray = json.getJSONArray("faturamentoMensal");

        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;
        double soma = 0;
        int diasComFaturamento = 0;

        for (int i = 0; i < faturamentoArray.length(); i++) {
            double valor = faturamentoArray.getDouble(i);
            if (valor > 0) {
                soma += valor;
                diasComFaturamento++;
                if (valor < menor) {
                    menor = valor;
                }
                if (valor > maior) {
                    maior = valor;
                }
            }
        }

        double media = soma / diasComFaturamento;
        int diasAcimaDaMedia = 0;

        for (int i = 0; i < faturamentoArray.length(); i++) {
            double valor = faturamentoArray.getDouble(i);
            if (valor > media) {
                diasAcimaDaMedia++;
            }
        }

        System.out.println("Menor valor de faturamento: " + menor);
        System.out.println("Maior valor de faturamento: " + maior);
        System.out.println("Dias com faturamento superior à média: " + diasAcimaDaMedia);
    }
}
