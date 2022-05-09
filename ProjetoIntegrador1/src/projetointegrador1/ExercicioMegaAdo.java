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
public class ExercicioMegaAdo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float valorUnitario;
        int unidade;
        float total;
        System.out.println("Digite o valor da Unidade");
        valorUnitario = input.nextFloat();
        System.out.println("Digite a quantidade de Produtos");
        unidade = input.nextInt();
        total = (unidade * valorUnitario);
        if (unidade < 10) {
            System.out.printf("Valor a Pagar" + total + "\n");
        } else { 
            System.out.println(" Valor a Pagar "  +  (total - ( total * 0.10)));

        // Print F , linguagem C. É necessário colocar o \n para obter a mesma funcionalidade do println
    
    }
}
}