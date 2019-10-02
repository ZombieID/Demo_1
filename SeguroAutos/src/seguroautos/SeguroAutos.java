/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguroautos;

import Clases.Vehiculo;
import Clases.Seguro;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author laboratorio2
 */
public class SeguroAutos {



    /**
     * @param args the command line arguments
     */
    static ArrayList<Vehiculo> listaAutos = new ArrayList<Vehiculo>();
    public static void main(String[] args) {
        Vehiculo auto1=new Vehiculo();
        Seguro seguro=new Seguro();
        solicitarYCapturarDatos(auto1,seguro);
        Calculos(seguro,auto1);
        mostrarDatos(seguro);
        
    }    
    
    
    private static void solicitarYCapturarDatos(Vehiculo auto1,Seguro seguro) {

            solicitarMarca();auto1.setMarca(capturarMarca());
            solicitarModelo();auto1.setModelo(capturarModelo());
            solicitarAño();auto1.setAño(capturarAño());
            solicitarValorUf();seguro.setValorUf(capturarValorUf());
        
    }

    

    private static void solicitarMarca() {
        System.out.print("Ingrese Marca :");
    }
    private static String capturarMarca() {
        Scanner scan=new Scanner(System.in);
        String marca = scan.nextLine();
        return marca;
    }

    private static void solicitarModelo() {
        System.out.print("Ingrese Modelo :");
    }
    private static String capturarModelo() {
        Scanner scan=new Scanner(System.in);
        String modelo=scan.nextLine();
        return modelo;
    }

    private static void solicitarValorUf() {
        System.out.print("Ingrese valor UF :");
    }
    private static int capturarValorUf() {
        Scanner scan=new Scanner(System.in);
        int uf=scan.nextInt();
        return uf;
    }

    private static void solicitarAño() {
        System.out.print("Ingrese año del Vehiculo :");
    }
    private static int capturarAño() {
        Scanner scan=new Scanner(System.in);
        int año=scan.nextInt();
        return año;
    }    

    private static void Calculos(Seguro seguro,Vehiculo vehiculo) {
        seguro.calcularCantidadAño(vehiculo);
        seguro.calcularAntiguedad(vehiculo);
        seguro.calcularPago();
    }
    private static void mostrarDatos(Seguro seguro){
        if(seguro.getAntiguedad()){
            System.out.println("**********************************************");
            System.out.println("Monto a Pagar :"+seguro.getMontoPago()+"$");
            System.out.println("**********************************************");
        }else{
            System.out.println("Auto con mas de 10 años ("+seguro.getCantidadAño()+ ") no asegurable");
        }
    }
}
