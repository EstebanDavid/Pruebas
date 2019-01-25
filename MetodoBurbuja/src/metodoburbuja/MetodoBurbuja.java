package metodoburbuja;

import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class MetodoBurbuja {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);

     MetodoBurbuja ordenar = new MetodoBurbuja();
        int num[] = {4,9,3,5,1,2};
        ordenar.ordenar(num);
        for (int i = 0; i < num.length; i++) {
            int j = num[i];
            System.out.println(" - " + j);
        }
    }
    
    public void ordenar(int[] array){
        int aux;
        boolean cambio = false;
        while (true) {            
            cambio = false;
            for (int i = 1; i < array.length; i++) {
                if(array[i]<array[i-1]){
                    aux = array[i];
                    array[i]=array[i-1];
                    array[i-1]=aux;
                    cambio = true;
                }
            }
            if(cambio==false){
                break;
            }
        }
    }
}


  
