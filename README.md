# Bingo

ENUNCIADO DE LA PRÁCTICA:

En el juego de nuestro bingo el bombo será el ordenador y sacará númerosaleatorios (hasta el 90 que es el máximo de números) y los cartones lostendremos que generar nosotros con números aleatorios también. En el juegodel bingo una partida consiste en extraer las bolas del bombo al azar y cantarsu respectiva numeración. Nuestro programa tiene que ser capaz de validar siel número cantado se encuentra en nuestro cartón y “tacharlo”. Al completaruna línea horizontal en un cartón, el programa deberá mostrar "línea". Cuandose consigue tachar todos los números del cartón, se tendrá que mostrar "bingo"y se dará opción de jugar otra partida o abandonar el programa.El cartón de un bingo está dispuesto de la siguiente manera:

![image](https://user-images.githubusercontent.com/111749007/208056977-94edb010-bfe6-407c-a087-5095d504f2aa.png)

  ● 9 columnas, en la primera de ellas hay números del 1 al 9, en lasegunda del 10 al 19, en la tercera del 20 al 29, así sucesivamente.

  ● Tenemos 3 filas.

  ● El total de números del cartón serán 15 y el resto (casillas azules) serán casillas vacías (se puede representar con ceros, asteriscos, XX, etc.)

  ● Por cada fila hay 5 números.

El programa contará con un menú:

1. Generar cartón (generará un cartón nuevo, con la disposición de losnúmeros y posiciones vacías/nulas aleatorias, máximo 2 números porcolumna, mínimo 1 número por columna)
3. Mostrar estado del cartón (pintará el estado del cartón según han idosaliendo los números).
4. Sacar bola. (el programa genera el número aleatorio y según nuestro cartón, el programa nos avisará si has hecho línea, o has cantado bingo).
5. Salir.
