// Un asombroso, maravilloso, proyecto de Bingo para navidad, para que ganes a tu tia la fascista
package bingo;

import java.util.*;

/**
 *
 * @authors Lara & Vera & Tinin
 */
public class Bingo {
    public static final String BLACK = "\033[0;30m";   // BLACK
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static final String WHITE = "\033[0;37m";   // WHITE
    //Funciones
    public static void Menu() {
        System.out.println("Bienvenido al bingo");
        System.out.println("-------------------");
        System.out.println("1. Generar carton");
        System.out.println("2. Mostrar carton");
        System.out.println("3. Sacar bola");
        System.out.println("4. Salir");
        
    }
    public static int Gen_Carton(){
        return 0;
    }
    public static void Mos_Carton(){
        
    }
    public static int Bola(){
        return 0;
    }
    public static void Saludo(){
        
    }
    //Objetos
    public static void main(String[] args) {
        //Variables
        Scanner ent = new Scanner(System.in);
        int opc = 0;
        Saludo();
        while (opc != 4) {
            //Menu();
            opc = ent.nextInt();
        }

    }

}
