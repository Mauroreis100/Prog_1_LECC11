/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg1_7_valor_path_temp_username_;
import java.io.File;
/**
 *
 * @author mauro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* String path = System.getProperty("path.name");
        String temp = System.getProperty("temp.name"); */
        System.out.println(System.getenv("TEMP"));
         System.out.println(System.getenv("PATH"));
          System.out.println(System.getenv("USERNAME"));
        String username = System.getProperty("user.name"); 
        System.out.print(username);
    }
    
}
