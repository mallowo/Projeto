import java.util.ArrayList;
import java.util.Scanner;

public class Lista 
{

	public static void main(String[] args) 
	{
		//cria o scanner pra poder ler os dados do usu�rio
		Scanner teclado = new Scanner (System.in);
		
		//cria a vari�vel "produto" e seta pra nulo
		String produto = null;
		
		//cria a lista "carrinho"
		ArrayList<String> carrinho = new ArrayList<String>();
		
		//enquanto produto n�o for igual a "sair"
		while (!"sair".equals(produto))
		{
			//o c�digo vai pedir pra inserir um produto na lista
			System.out.println("Adicione um produto na lista ou digite 'sair' para sair: ");
			//ler o input e armazena na vari�vel "produto"
			produto = teclado.next();
			
			//se produto n�o for igual a "sair"
			if (!"sair".equals(produto))
			{	
				//ent�o o produto ser� adicionado a lista "carrinho"
				carrinho.add(produto);
			}
			
		}
		
		System.out.println("");
		
		//ler a lista
		for (String i : carrinho) 
		{
		      System.out.println(i); 
		}
		
		teclado.close();
	
	}
}
