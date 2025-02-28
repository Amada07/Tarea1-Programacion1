/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancoapp;

/**
 *
 * @author Amada
 */
public class CuentaBancaria {
    //Atributos privados
    private int numeroCuenta;
    private double saldo;
    
    public CuentaBancaria(int numeroCuenta, double saldoInicial){
        this.numeroCuenta=numeroCuenta;
        this.saldo = ( saldoInicial >= 0)? saldoInicial:0;
    
        }
    
    //Metodo para depositar
    public void depositar(double cantidad){
        if(cantidad > 0){
            saldo +=cantidad;
            System.out.println("Deposito exitoso: $"+ cantidad);
        }else{
            System.err.println("Error:La cantidad a depositar debe ser positivo");
        }
    }
    
    //Metodo para retirar
    public void retirar(double cantidad){
        if(cantidad > 0 && cantidad <=saldo){
            saldo -=cantidad;
            System.out.println("Retiro exitoso:$" + cantidad);
        }else{
           System.err.println("Error: Retiro invalido.Fondos insuficientes");
        }
    }

    //Metodo consultar saldo 
    public double getSaldo(){
        return saldo;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    
    //Metodo para obtener numero de cuenta
    public int getNumeroCuenta(){
        return numeroCuenta;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
