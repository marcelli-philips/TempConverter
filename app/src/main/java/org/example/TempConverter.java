package org.example;

public class TempConverter {
    private double temperatura;
    private String tipo;

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String calcular() {
        String resultado;
        double tempConvertida;
        if (tipo.equals("F")) {
            tempConvertida = (temperatura * 1.8) + 32;
            resultado = String.format("%.2f °C = %.2f °F", temperatura, tempConvertida);
        } else if (tipo.equals("C")) {
            tempConvertida = (temperatura - 32) * 0.55;
            resultado = String.format("%.2f °F = %.2f °C", temperatura, tempConvertida);
        } else {
            resultado = "Opção inválida";
        }
        return resultado;
    }
}
