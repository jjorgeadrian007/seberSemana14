/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package debersemana15;
import java.util.HashMap;
/**
 *
 * @author Admin
 */
public class DeberSemana15 {

    public static void main(String[] args) {
        
        HashMap <String, Integer> notas = new HashMap<>();
        notas.put("Jorge", 20);
        notas.put("Juan", 17);
        notas.put("Pedro", 16);
        
        for (String clave : notas.keySet()) {
            System.out.println(clave + " " + notas.get(clave)); 
        }
        notas.put("Ana", 15); 
        notas.remove("Pedro"); 
        
        System.out.println("-----------------------");
        System.out.println("Notas actualizadas");
        for (String clave : notas.keySet()) {
            System.out.println(clave + " " + notas.get(clave)); 
        }
        
       
    }
    
}
