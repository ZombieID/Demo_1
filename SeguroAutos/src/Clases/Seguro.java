/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;


/**
 *
 * @author laboratorio2
 */
public class Seguro {
    private int valorUf;
    private boolean antiguedad;

    private int cantidadAño;
    private final double ufPorAño=0.1;
    private double montoPago;

    public double getMontoPago() {
        return montoPago;
    }
    
    public int getCantidadAño() {
        return cantidadAño;
    }

    public void setCantidadAño(int cantidadAño) {
        this.cantidadAño = cantidadAño;
    }

    public void setMotoPago(double montoPago) {
        this.montoPago = montoPago;
    }
    public int getValorUf() {
        return valorUf;
    }

    public void setValorUf(int valorUf) {
        this.valorUf = valorUf;
    }

    public boolean getAntiguedad() {
        return antiguedad;
    }

    public double getUfPorAño() {
        return ufPorAño;
    }
    
    public void calcularAntiguedad(Vehiculo vehiculo){
        if(this.cantidadAño<11){
            this.antiguedad=true;
        }else{
            this.antiguedad=false;
        }
    }
    public void calcularCantidadAño(Vehiculo vehiculo){
        this.cantidadAño=2019-vehiculo.getAño();
        if(this.cantidadAño==0){
            this.cantidadAño=1;
        }
    }
    public void calcularPago(){
        double monto=0;
        for(int i=0;i<this.cantidadAño;i++){
            monto=(double)(monto+(this.valorUf*this.ufPorAño));
        }
        this.montoPago=monto;
    }
}
