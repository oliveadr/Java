package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {  
    public static void main(String[] args) {
        /*  String nome = "Josmar";
         *   float nota = 3.5f;
         *  System.out.println("A nota é: " + nota );
         *  System.out.printf("a nota é %.2f \n", nota); o f é de formatado
         *  System.out.format("a nota de %s é de %.2f \n", nome, nota);
        */
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();
        System.out.format("a nota de %s é de %.2f \n", nome, nota);
    }
    
}
