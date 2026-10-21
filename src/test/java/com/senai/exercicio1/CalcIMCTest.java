package com.senai.exercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalcIMCTest{
    @Test
    void testarIMC() {
        CalcIMC calc = new CalcIMC();
        double resultado = calc.CalcularIMC(77.85, 1.8);
        assertEquals(24.027777777777775, resultado);
    }
}