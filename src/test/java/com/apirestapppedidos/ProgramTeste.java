package com.apirestapppedidos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import javax.swing.JOptionPane;

import com.apirestapppedidos.domain.Categoria;

public class ProgramTeste {

	public static void main(String[] args) {

				
		int continua = 1;
	     
		Set<String> categorias = new HashSet<>();

		Scanner scan = new Scanner(System.in);

		while (continua == 1) {
			
			System.out.print("Digite seu nome: ");
			String entrada = scan.next();

			
			System.out.print("Se continua digite 1, senão 0!");
			continua = scan.nextInt();
			
			Categoria categoria = new Categoria(); 
			categoria.setNome(entrada);
			
			categorias.add(categoria.getNome());
			

			if (continua != 1) {
				continua = 0;
			} 

		}

		Iterator<String> iterator = categorias.iterator();
			
		while (iterator.hasNext()) {
				
			System.out.println(iterator.next());
		}
			
	}

}
