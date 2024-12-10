package ejercicios.repaso;

import java.util.ArrayList;

public class principalAejerc {
    public static void main(String[] args) {

ArrayList<Integer>lista = new ArrayList<Integer>();
lista.add(5);
lista.add(7);
lista.add(3);

int numero =0;

System.out.println(lista);

for(int i=0;i<lista.size();i++){

    System.out.println(lista.get(i));
    
                                       
        if (lista.get(i)>numero){
    
        numero=lista.get(i);}
                 
        }

        System.out.println("el numero mas grande del array es: "+(numero));
             }	
        }
    
