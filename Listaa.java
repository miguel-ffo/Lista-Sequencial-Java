
public class Listaa {
	final int MAX = 10;
	Contato[] contatos = new Contato[100];
	
	int tamanho = 0;
	
	public boolean estaVazia() {
		return (tamanho==0);
		
	}
	

	public boolean estaCheia() {
		return (tamanho==contatos.length);
	}
	
	
	public int tamanhoLista() {
		return tamanho;
	}
	
	public Contato Buscar(String nome) {
		int inicio = 0;
		int fim = tamanho - 1;
		
		while(inicio <= fim) {
			int meio = inicio + (fim - inicio)/2;
			
			int comparar = contatos[meio].nome.compareTo(nome);
			if (comparar == 0) {
				return contatos[meio];
			}
			
			if( comparar < 0) {
				inicio = meio + 1;
			}else {
				fim = meio - 1;
			}
		}
		return null;
	}
	
	
	public boolean compara(Contato c1 , Contato c2) {
		return (c1.nome.equals(c2.nome) ) && (c1.telefone.equals(c2.telefone) );
		
	}
	
	public int retornarPosicao(Contato contato) {
		for( int i=0; i< tamanho; i++)
			if (compara(contatos[i], contato ))
				return i;
		return -1;
		
	}
	
	public void deslocarParaEsquerda( int pos) {
		for ( int i = pos; i < (tamanho - 1); i++)
			contatos[i] = contatos[i+1];
		
	}
	
	public void deslocarParaDireita(int pos) {
		for ( int i = tamanho ; i > pos; i--) 
			contatos[i] = contatos[i -1];
						
	}
	
	public Contato removerContato(String nome) {
	    int indiceRemover = -1;
	    for (int i = 0; i < tamanho; i++) {
	        if (contatos[i].getNome().equalsIgnoreCase(nome)) {
	            indiceRemover = i;
	            break;
	        }
	    }

	    if (indiceRemover != -1) {
	        Contato contatoRemovido = contatos[indiceRemover];
	        for (int i = indiceRemover; i < tamanho - 1; i++) {
	            contatos[i] = contatos[i + 1];
	        }
	        contatos[tamanho - 1] = null;
	        tamanho--;
	        System.out.println("Contato removido com sucesso.");
	        return contatoRemovido;
	    } else {
	        System.out.println("Contato não encontrado.");
	        return null;
	    }
	}
	
	public void exibirLista() {
		for ( int i = 0; i < tamanho; i++) {
			System.out.println("\n	Contato " +(i+1)+"\n\n		Nome: "
								+contatos[i].nome 
								+ "\n		telefone: "
								+contatos[i].telefone);
		}
		System.out.println("\n	Total : "+ tamanho);
	}
	public boolean inserirContato (int pos, Contato c1) {
		if ( estaCheia() || (pos > tamanho) || (pos <0 ) )
			return false;
		deslocarParaDireita(pos);
		contatos[pos] = c1;
		tamanho++;
		return true;
	 }
	
	public void ordenarLista() {
		for ( int i = 1;i < tamanho ; i++) {
			Contato chave = contatos[i];
			int j = i - 1;
			
			while ( j>= 0 && contatos[j].nome.compareTo(chave.nome)>0){
				contatos[j + 1] = contatos[j];
				j--;
			}
			contatos [ j + 1] = chave;
			
			
		}
		
	}
	
		
	}
	
		
	
	

