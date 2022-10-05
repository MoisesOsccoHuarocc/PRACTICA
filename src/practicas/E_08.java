/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicas;
import java.util.Scanner;
/**
 *
 * @author MOISES
 */
public class E_08 {   
 public static void main(String args[]) {
     double descuento=0;
     double montototal=0;
     double venta=0;
     
     Scanner entrada=new Scanner(System.in);
     System.out.println("La compra de la plancha,licuadora, lavadora y cocina es de: ");
     venta=entrada.nextDouble();
     
     System.out.println("La venta es de: "+venta);
     
     if(venta>=1200){
         descuento=venta*0.17;
     }
   
     else{
         if(venta<5000){
             descuento=0;
         }
     }
 System.out.println("El descuento es de: "+descuento);
 
 montototal=venta-descuento;
 
 System.out.println("El monto total de la venta es de: "+montototal);
 
     
     
 
   
    
    
    
}
}
