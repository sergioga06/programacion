package Array;

import java.util.Scanner;

public class Ejerarray2 {

    public static Scanner entrada = new Scanner(System.in);
    static final int PERSONES = 5;
    static String[] personas = { "Ana", "Juan", "Jose", "Maria", "Noelia" };
    static int[] contador = new int[PERSONES];
    static int[] maxmin = new int [2];
    static int[] tiradas = new int[10];
    static final int ntiradas = 10;

    
    // static int max;
    // static int min;

    public static void main(String[] args) {
        // Ejerarray2.mostrarDatos();
        Ejerarray2.operaciones();
        Ejerarray2.ganadorPerdedor();
        Ejerarray2.informe(/*max, min*/);
        

    }

    public static int generarNumeros() {

        int numeroAleatorios;
        numeroAleatorios = (int) (Math.random() * 5);// numeros del 0 al 4
        return numeroAleatorios;
    }

    public static void operaciones() {
        /*
         *Funcion: Genera la tirada e incrementa la posición 
         */
        int valor;//variable temporal que almacena la posicion generada
        // int tirada = 0;
        for (int i = 0; i < Ejerarray2.ntiradas; i++) {
            valor = generarNumeros();
            Ejerarray2.tiradas[i] = valor;
            // Ejerarray2.contador[ Ejerarray2.tiradas[i] ]++;
            Ejerarray2.contador[valor]++;
        }
    }



    // public static int[] ganadorPerdedor(){
    public static void ganadorPerdedor(){
        int datos[] = new int [2];
        int pmin = 0;
        int pmax = 0;
        int min = contador[0];
        int max = contador[0];
        for (int i=0; i<PERSONES; i++){
            if (contador[i]> max){
                max = contador[i];
                pmax = i;
            }   
            if (contador[i]< min){
                min = contador[i];
                pmin = i;
            } 
        }
    //     datos[0]=pmax;
    //     datos[1]= pmin;
    //     return datos;
        Ejerarray2.maxmin[0]=pmax;
        Ejerarray2.maxmin[1]=pmin;
    }

    public static int ganador(){
        int pmax = 0;
        int max = contador[0];
        for (int i=0; i<PERSONES; i++){
            if (contador[i]> max){
                max = contador[i];
                pmax = i;
            }  
   
        }
        System.out.println(pmax);
        return pmax;
    }

    public static int perdedor(){
        int pmin = 0;
        int min = contador[0];
        for (int i=0; i<PERSONES; i++){
            if (contador[i]< min){
                min = contador[i];
                pmin = i;
            }   
        }
        System.out.println(pmin);
        return pmin;
    }


    

    public static void informe() {

        for (int i = 0; i < Ejerarray2.ntiradas; i++) {

            System.out.print("La tirada " + (i + 1) + " es " + Ejerarray2.personas[tiradas[i]]+" " + tiradas[i] );
            
           
            System.out.print("Siguiente");
            entrada.nextLine();

        }
        for (int i=0; i<Ejerarray2.PERSONES;i++){
            System.out.print(contador[i]+ " ");
        }
        System.out.println();
        // System.out.println("El que mas ha salido " + Ejerarray2.personas[ganador()]);
        // System.out.println("El que menos ha salido " + Ejerarray2.personas[perdedor()]);
        // System.out.println("El que mas ha salido " + Ejerarray2.personas[ ganadorPerdedor()[0] ]);
        // System.out.println("El que menos ha salido " + Ejerarray2.personas[ganadorPerdedor()[1]]);
        // ganadorPerdedor();
        System.out.println("El que mas ha salido " + Ejerarray2.personas[ Ejerarray2.maxmin[0] ]);
        System.out.println("El que menos ha salido " + Ejerarray2.personas[Ejerarray2.maxmin[1]]);

    }
}
