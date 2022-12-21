// Un asombroso, maravilloso, proyecto de Bingo para navidad, para que ganes a tu abuela
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

    public static void Menu() {
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println(PURPLE + "-----------------------------");
        System.out.println(CYAN + "<<< Bienvenido al bingo >>>");
        System.out.println(PURPLE + "------------\\(8)/------------");
        System.out.println("1. Generar carton");
        System.out.println("2. Mostrar carton");
        System.out.println("3. Sacar bola");
        System.out.println("4. Salir");

    }

    public static int[][] Gen_Carton(int[][] carton) {//esto tiene que generar un carton para la abuela, tendriamos que poner alguna comprobacion para
        //que no se pueda sacar mas de uno hasta que no se haya acabado el juego
        int[][] bloqueadas = new int[3][9];
        for (int i = 0; i < bloqueadas.length; i++) {
            for (int j = 0; j < 4;) {//Generamos las 4 casillas que estaran bloaqueadas en cada linea, con cuidado al crear la tercera linea de que no haya ninguna columna entera bloqueada
                int casilla = (int) (Math.random() * 9);
                if (bloqueadas[i][casilla] == 0 && (bloqueadas[1][casilla] == 0 | bloqueadas[2][casilla] == 0)) {
                    bloqueadas[i][casilla] = 1;
                    j++;
                }
            }
        }
        for (int i = 0; i < carton.length; i++) {   //Generamos los numeros que se pondran en las casillas libres y los establecemos
            int[] columna = {10, 10, 10};
            if (i > 0) {                               //generamos los numeros de la columna
                for (int j = 0; j < columna.length;) {
                    int num = (int) (Math.random() * 9);
                    if (num != columna[0] && num != columna[1] && num != columna[2]) {
                        columna[j] = num;
                        j++;
                    }
                }
            } else {
                for (int j = 0; j < columna.length;) {
                    int num = (int) (Math.random() * 8) + 1;
                    if (num != columna[0] && num != columna[1] && num != columna[2]) {
                        columna[j] = num;
                        j++;
                    }
                }
            }
            for (int j = 0; j < columna.length;) { //Ordenamos los numeros de la columna de menor a mayor
                int pos = 0;
                for (int k = 0; k < columna.length; k++) {
                    if (columna[j] > columna[k]){
                        pos++;
                    }
                }
                if (pos>j){
                    int temp = columna[pos];
                    columna[pos]=columna[j];
                    columna[j]=temp;
                }else if(pos == j){
                    j++;
                }
            }
            for (int j = 0; j < carton.length; j++) {
                if (bloqueadas[i][j] == 0) {
                    carton[i][j] = columna[j] + i * 10;
                }
            }
        }
        return carton;
    }

    public static void Mos_Carton() {//mostramos el carton con los numeros que ya nos han salido y los que no, buscar como hacerlo con JAVAFX

    }

    public static int Bola(int bola, int[] bolas, int b) {//sacamos la bola y la cantamos como los niños de san ildefonso

        System.out.println("El bombo esta girando...");
        System.out.println("La bola esta saliendo...");

        System.out.println("La bola es: " + bola);
        for (b = 0; b < 89; b++) {
            if (bola == bolas[b]) {
                bolas[b] = 0;
                //return bolas[b];
            }else if(bolas[b]==0){
                bola++;
                if(bola>89){
                    bola = 1;
                }
            }
        }
        //for (b = 0; b < 89; b++) {
        //    System.out.println(bolas[b]);
        //}

        return bola;
    }
    public static void Mostrar_Num(int[] bolas){
        for(int i=0;i<89;i++){
            System.out.println(bolas[i]);
        }
        
    }
    public static void Saludo() {
        System.out.println(GREEN + "     _____ _" + PURPLE + "      __________________ _\n"
                + PURPLE + "\\-------" + GREEN + "              ---- -\n"
                + PURPLE + " \\" + CYAN + "#####################################\n"
                + PURPLE + " .\\" + CYAN + "#                     " + PURPLE + "|---------|  " + CYAN + "#\n"
                + PURPLE + "  \\\\" + CYAN + "#      " + PURPLE + "LARA          | MISSING |  " + CYAN + "# .\n"
                + PURPLE + "   ||" + CYAN + "#	     " + GREEN + "TININ            " + PURPLE + "·       " + CYAN + "#  \n"
                + PURPLE + "  //" + CYAN + "#           " + PURPLE + "VERA     |    /    |  " + CYAN + "# " + PURPLE + " |\n"
                + CYAN + "   #                     " + PURPLE + "|---------|  " + CYAN + "#" + PURPLE + "| |\n"
                + CYAN + "  #####################################" + PURPLE + "| |\n"
                + PURPLE + "        ______ ------------------------| |\n"
                + PURPLE + "                  " + GREEN + "---- -     " + PURPLE + "------------|");
    }

    //Objetos
    public static void main(String[] args) {
        //Variables
        Scanner ent = new Scanner(System.in);
        Random rand = new Random();

        int[] bolas = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44,
            45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89};
        int opc = 0;
        int i;
        int bola;
        int[][] carton1 = new int[3][9];
        Saludo(); //esto solo aparece una vez al principio

        while (opc != 4) {
            Menu();
            opc = ent.nextInt();
            switch (opc) {
                case 1:
                    Gen_Carton(carton1);
                    break;
                case 2:
                    Mos_Carton();
                    break;
                case 3:
                    int b = 0;
                    bola = rand.nextInt(90) + 1;
                    Bola(bola, bolas, b);

                    break;
                case 4:
                    break;
                case 5:
                    Mostrar_Num(bolas);
                default:
                    break;
            }
        }

    }

}
