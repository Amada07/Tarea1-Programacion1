/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bancoapp;

/**
 *
 * @author Amada
 */
public class BancoApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CuentaBancaria cuenta1 = new CuentaBancaria (123456,500);
        
        System.out.println("Cuenta creada:"+ cuenta1.getNumeroCuenta());
        System.out.println("Saldo Inicial:$" + cuenta1.getSaldo());
   
    cuenta1.depositar(200);
    cuenta1.retirar(100);
    cuenta1.retirar(700);
    
    System.out.println("Saldo Final:$"+ cuenta1.getSaldo());
    }
    
}
