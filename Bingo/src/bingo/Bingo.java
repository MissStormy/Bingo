// Un asombroso, maravilloso, proyecto de Bingo para navidad, para que ganes a tu tia la fascista
package bingo;

import java.util.*;

/**
 *
 * @authors Lara & Vera & Tinin
 */
public class Bingo {

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
    //Objetos
    public static void main(String[] args) {
        //Variables
        Scanner ent = new Scanner(System.in);
        int opc = 0;

        while (opc != 4) {
            Menu();
            opc = ent.nextInt();
        }

    }

}
