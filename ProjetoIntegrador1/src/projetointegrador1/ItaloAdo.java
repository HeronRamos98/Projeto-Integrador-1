/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetointegrador1;
import java.util.Scanner;
/**
 *
 * @author heron
 */
public class ItaloAdo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float  n1;
        System.out.println("==============================================");
        System.out.println("Calculo de consumo de Àgua em São Paulo por m³");
        System.out.println("   o valor já esta calculando água e esgoto ");
        System.out.println("==============================================");
        System.out.println("Digite a Quantidade de m³ consumido(EX:6,0)");
        n1 = sc.nextFloat();
        if ( n1>0 && n1<10){
            System.out.println("O consumo sera minimo no valor de 58,00 Reais");
        //De 0 a 10 - Água R$ 29,00 / Esgoto R$29,00 (valor mínimo)
        }else{
            
            if(n1>11 && n1<20){
                System.out.println("valor é " + ((29+(10-5)*4.54))*2+" Reais");
                //De 11 a 20 - Água R$ 4,54 por m3 / Esgoto R$ 4,54 por m3
            }else{
                if(n1>21 && n1<50){
                    System.out.println("valor é " + ((29+10*4.54+(27-20)*11.33))*2+" Reais");
                    //De 21 a 50 - Água R$ 11,33 por m3 / Esgoto R$ 11,33 por m3
                }else{ 
                    if (n1>51){
                        System.out.println("valor é "+  (29+10*4.54+30*11.33+(55-50)*12.48)*2+" Reais");
                        //Acima de 50 - Água R$ 12,48 por m3 / Esgoto R$ 12,48 por m3
                    }else{
                    }
        System.out.println("==============================================");
                }
            }
            
        }
       
        
    }
    
}

// teste git