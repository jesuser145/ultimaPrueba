package com.politecnicomalaga;

public class Sumatorio {
    public int sumatorio(int[] numeros){
        int sumatorio = 0;
        for (int i=0; i<numeros.length;i++)
            sumatorio += numeros[i];
        return sumatorio;
    }
}
