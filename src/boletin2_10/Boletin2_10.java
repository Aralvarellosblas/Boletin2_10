package boletin2_10;

import java.util.Scanner;

public class Boletin2_10 {

    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        float SueldoFijo, TotalVentas, nkm, dDesp;
        float Comision,Quilomet,Dietas, SueldoBruto,IRPF, SueldoNeto;
        System.out.println("Introduce Sueldo en €");
        SueldoFijo=teclado.nextInt();
        System.out.println("Introduce Total de las ventas en €");
        TotalVentas=teclado.nextInt();
        System.out.println("Introduce el número de km recorridos");
        nkm=teclado.nextInt();
        System.out.println("Introduce la cantidad de dias de desplazamiento");
        dDesp=teclado.nextInt();
        Comision= (TotalVentas * (float)0.5);
        Quilomet= nkm *2;
        Dietas= dDesp *30;
        SueldoBruto= SueldoFijo + Comision + Quilomet + Dietas;
        IRPF= (SueldoBruto *(float)0.18);
        SueldoNeto= (SueldoBruto - IRPF - 36);
        System.out.println(IRPF);
        System.out.println("Sueldo Bruto = "+"€"+SueldoBruto+ "\nSueldo Liquido = "+SueldoNeto+ "€");
        
       
    }
    
}
