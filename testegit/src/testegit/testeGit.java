package testegit;

import java.util.Scanner;

public class testeGit {

		public static void main(java.lang.String[] args) {
			  Scanner teclado = new Scanner (System.in);
			  System.out.println("Informe seu nome completo: ");
			  java.lang.String nome= teclado.nextLine();
			  teclado.close();

			    java.lang.String primeiro = "";
			    java.lang.String meio = " ";
		    	java.lang.String ultimo = "";

			    java.lang.String[] nomes = nome.split(meio,' ');

			    primeiro = nomes[0];

			for (int i = 1; i < nomes.length - 1; i++){
			  if (!nomes[i].toLowerCase().equals("de") && !nomes[i].toLowerCase().equals("da") && !nomes[i].toLowerCase().equals("do") && !nomes[i].toLowerCase().equals("das") && !nomes[i].toLowerCase().equals("dos")){
			meio += nomes[i].substring(0, 1);
			meio += ". "; 
			  }
			}

			 System.out.println("Seu nome é: ");
			 System.out.print(nome = primeiro + meio + ultimo);
			 System.out.print(ultimo= nomes[nomes.length-1]);


	}

}
