import java.util.Scanner;

public class ListaSequencial {

	public static void main(String[] args) {
		
		 Scanner ler = new Scanner(System.in);
		
 		 Listaa lista_sequencial = new Listaa();
 		
// 		 Contato c1 = new Contato();
// 		 c1.nome = "Goku";
// 		 c1.telefone= "1111-1111";
// 		 
// 		 Contato c2 = new Contato();
// 		 c2.nome = "Gohan";
// 		 c2.telefone="2222-2222";
// 		 
// 		 Contato c3 = new Contato();
// 		 c3.nome="Goten";
// 		 c3.telefone="3333-3333";
// 		 
// 		 Contato c4 = new Contato();
// 		 c4.nome="Bulma";
// 		 c4.telefone="4444-4444";
// 		 
// 		 lista_sequencial.inserirContato(0,c1);
// 		 lista_sequencial.inserirContato(1,c2);
// 		 lista_sequencial.inserirContato(2,c3);
// 		 lista_sequencial.inserirContato(2,c4);
// 		 
// 		
// 		 
// 		 lista_sequencial.exibirLista();
// 		 
// 		 System.out.println("\n\nDigito qual contato remover: ");
// 		 int remov = entrada.nextInt();
// 		 
// 		 lista_sequencial.remover(remov -1);
// 		 
// 		 lista_sequencial.exibirLista();
// 		 
// 		 
// 		 System.out.println("Qual contato buscar: ");
// 		 int busc = entrada.nextInt();
//
// 			
// 		 
// 		 System.out.println("\n\nNome do elemento da terceira posição é " + lista_sequencial.buscar(2).nome);
// 		 
// 		 System.out.println("Posição do contato gohan é: "+ lista_sequencial.retornarPosicao(c2));
 		
 		 
		 System.out.println("\n\nA lista esta vazia? "+ lista_sequencial.estaVazia());
		 System.out.println("A lista esta cheia? "+ lista_sequencial.estaCheia());
		 System.out.println("A lista tem "+ lista_sequencial.tamanhoLista() + " elementos");
		 	
		 int pos = 0;
		 int opcao = 0;
		 while (opcao != 5) {
			  System.out.println("\nAções: \n\n1 - Inserir\n2 - Buscar\n3 - Remover\n4 - Mostrar Lista\n5 - Sair\n");
		  	  opcao = ler.nextInt();
		
			 switch (opcao) {
			 case 1:
				 while ( true ) {
				 
				 System.out.println("\nInserindo Contato ");
				
				 
				 System.out.println("Nome: ");
				 String nome = ler.next();
				 
				 System.out.println("Telefone: ");
				 String telefone = ler.next();
				 
				 Contato novoContato = new Contato (nome,telefone);
				 
				 
				 
				 if (lista_sequencial.inserirContato(pos, novoContato)) {
					 System.out.println("\nContato Salvo!");
					 
				 }else {
				 
					 System.out.println("\n\nLista Cheia!!");
					 break;
				 }
				 
				 pos++;
				 
				 
				
				 
				 
				 System.out.println("(Continuar inserindo? (S/N)");
				 String continuar = ler.next();
				 
				 if (continuar.equalsIgnoreCase("N")) {
					 break;
				 }
				 
				
				 
			 }
				 break;
			 case 2:
				 
				 while ( true ) {
					 System.out.println("	Buscar Contatos:\n");
			
					 System.out.println("Nome: ");
					 String contatobuscar = ler.next();
			 
					 Contato contatoEncontrado = lista_sequencial.Buscar(contatobuscar);
			 
					 if (contatoEncontrado != null) {
						 System.out.println("	Contato encontrado: \n\n	Nome: "+ contatoEncontrado.nome + "\n	Telefone: " + contatoEncontrado.telefone);
					 }else {
						 System.out.println("	Contato inexistente ou nome errado.");
					 }
			 
					 System.out.println("\n	(Continuar buscando? (S/N)");
					 String continuar = ler.next();
			 
					 if (continuar.equalsIgnoreCase("N")) {
						 break;
					 }
				 }
				 break;

			 case 3:
				  while( true ) {
					  	System.out.println("    Remover Contatos: \n");
			 
					  		System.out.println("Nome: ");
					  		String nomeDoContato = ler.next();
			 
			
					  		Contato contatoEncontrado = lista_sequencial.removerContato(nomeDoContato);

			 
					  		
					  		System.out.println("\n	(Continuar removendo? (S/N)");
					  		String continuar = ler.next();
			 
					  		if (continuar.equalsIgnoreCase("N")) {
					  			break;
					  		}
				  }
				break;
			 
				case 4:
					System.out.println("Exibindo Lista:\n");
					
					 lista_sequencial.ordenarLista();
					 lista_sequencial.exibirLista();
					break;
					
				case 5: 
					System.out.println("Saindo do Programa...");
					break;
				  } 
			 break;
		 
			 
		  }
			 
			 
			 
			
		 
		 
		 
		 
		
			
		
			} 

					 
}
