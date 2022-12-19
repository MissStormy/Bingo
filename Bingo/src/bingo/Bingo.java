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
        int[][] bloqueadas = new int [3][9];
        for (int i = 0; i < bloqueadas.length; i++) {
            for (int j = 0; j < 4;) {//Generamos las 4 casillas que estaran bloaqueadas en cada linea, con cuidado al crear la tercera linea de que no haya ninguna columna entera bloqueada
                int casilla = (int) (Math.random()*9);
                if (bloqueadas[i][casilla]==0 && (bloqueadas[1][casilla] == 0 | bloqueadas[2][casilla] == 0)){
                    bloqueadas[i][casilla]=1;
                    i++;
                }
            }
        }
        for (int i = 0; i < carton.length; i++) {   //Generamos los numeros que se pondran en las casillas libres y los establecemos
            int[] columna = {10,10,10};
            if (i>0){                               //generamos los numeros de la columna
                for (int j = 0; j < columna.length;) {
                    int num = (int) (Math.random()*9);
                    if (num != columna[0] && num != columna[1] && num != columna[2]){
                        columna[j]=num;
                    }
                }
                }else{
                    for (int j = 0; j < columna.length;) {
                    int num = (int) (Math.random()*8)+1;
                    if (num != columna[0] && num != columna[1] && num != columna[2]){
                        columna[j]=num;
                    }
                }
            }
                int[] pos = new int [columna.length]; //Ordenamos los numeros de la columna de menor a mayor
                for (int j = 0; j < columna.length; j++){
                    pos[j]=0;
                    for(int k = 0; k < columna.length; k++){
                        if ((k != j) && (columna[k]<columna[j])){
                            pos[j]++;
                        }
                    }
                }
                int temp;
                for (int j = 0; j < columna.length; j++) {
                    //to do: ACABAR ESTA MIERDA
                }
                for (int j = 0; j < carton[i].length; j++) {
                    if (bloqueadas[i][j]==0){
                        carton[i][j]=columna[j]+i*10;
                    }
                }
        }
        return null;
    }

    public static void Mos_Carton() {//mostramos el carton con los numeros que ya nos han salido y los que no, buscar como hacerlo con JAVAFX

    }

    public static int Bola() {//sacamos la bola y la cantamos como los niños de san ildefonso
        int bola;
        Random rand = new Random();
        
        System.out.println("El bombo esta girando...");
        System.out.println("La bola esta saliendo...");
        bola = rand.nextInt(90)+1;
        System.out.println("La bola es: " + bola);
        return bola;
    }

    public static void Saludo() {
        System.out.println(GREEN +"     _____ _"+ PURPLE +"      __________________ _\n"
                + PURPLE +"\\-------"+ GREEN +"              ---- -\n"
                + PURPLE +" \\"+ CYAN +"#####################################\n"
                + PURPLE +" .\\"+CYAN+"#                     "+PURPLE+"|---------|  "+CYAN+"#\n"
                + PURPLE +"  \\\\"+CYAN+"#      "+PURPLE+"LARA          | MISSING |  "+CYAN+"# .\n"
                + PURPLE+"   ||"+CYAN+"#	     "+GREEN+"TININ            "+PURPLE+"·       "+CYAN+"#  \n"
                + PURPLE+"  //"+CYAN+"#           "+PURPLE+"VERA     |    /    |  "+CYAN+"# "+PURPLE+" |\n"
                + CYAN+"   #                     "+PURPLE+"|---------|  "+CYAN+"#"+PURPLE+"| |\n"
                + CYAN+"  #####################################"+PURPLE+"| |\n"
                + PURPLE+"        ______ ------------------------| |\n"
                + PURPLE+"                  "+GREEN+"---- -     "+PURPLE+"------------|");
    }

    //Objetos
    public static void main(String[] args) {
        //Variables
        Scanner ent = new Scanner(System.in);
        
        int[] bolas;
        int opc = 0;
        int[][] carton1 = new int [3][9];
        Saludo(); //esto solo aparece una vez al principio
        
        while (opc != 4) {
            Menu();
            opc = ent.nextInt();
            switch(opc){
                case 1:
                    Gen_Carton(carton1);
                    break;
                case 2:
                    Mos_Carton();
                    break;
                case 3:
                    Bola();
                    break;
                case 4:
                    break;
                default:
                    break;
            }
        }

    }

}
