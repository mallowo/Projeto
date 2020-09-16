import java.util.ArrayList;
import java.util.Scanner;

public class Lista 
{

	public static void main(String[] args) 
	{
		//cria o scanner pra poder ler os dados do usuário
		Scanner teclado = new Scanner (System.in);
		
		//cria a variável "produto" e seta pra nulo
		String produto = null;
		
		//cria a lista "carrinho"
		ArrayList<String> carrinho = new ArrayList<String>();
		
		//enquanto produto não for igual a "sair"
		while (!"sair".equals(produto))
		{
			//o código vai pedir pra inserir um produto na lista
			System.out.println("Adicione um produto na lista ou digite 'sair' para sair: ");
			//ler o input e armazena na variável "produto"
			produto = teclado.next();
			
			//se produto não for igual a "sair"
			if (!"sair".equals(produto))
			{	
				//então o produto será adicionado a lista "carrinho"
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
