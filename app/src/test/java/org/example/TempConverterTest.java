package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TempConverterTest {

    @Test
    public void testCelsiusParaFahrenheit() {
        TempConverter tempConverter = new TempConverter();
        tempConverter.setTipo("F");
        tempConverter.setTemperatura(0);

        String resultado = tempConverter.calcular();
        assertEquals("0,00 °C = 32,00 °F", resultado);
    }

    @Test
    public void testFahrenheitParaCelsius() {
        TempConverter tempConverter = new TempConverter();
        tempConverter.setTipo("C");
        tempConverter.setTemperatura(212);

        String resultado = tempConverter.calcular();
        assertEquals("212,00 °F = 99,00 °C", resultado);
    }

    @Test
    public void testTipoInvalido() {
        TempConverter tempConverter = new TempConverter();
        tempConverter.setTipo("X");
        tempConverter.setTemperatura(100);

        String resultado = tempConverter.calcular();
        assertEquals("Opção inválida", resultado);
    }
}
