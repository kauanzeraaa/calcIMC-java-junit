package com.senai.exercicio1;

public class CalcIMC{
    private double peso;
    private double altura;
    private double resultado;

    public CalcIMC(){

    }

    public double getPeso(){
        return this.peso;
    }
    public void setPeso(double p){
        this.peso = p;
    }

    public double getAltura(){
        return this.altura;
    }
    public void setAltura(double a){
        this.altura = a;
    }

    public double getResultado(){
        return this.resultado;
    }
    public void setResultado(double r){
        this.resultado = r;
    }

    public double CalcularIMC(double peso, double altura){
        setResultado(peso / (altura *altura));

        return this.resultado;
    }
}