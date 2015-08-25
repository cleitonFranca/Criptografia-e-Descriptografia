public class Descriptografia {
/*
Uma empresa de grande porte quer transmitir dados via internet, mas está preocupada com a possibilidade de seus telefones estarem grampeados. Ela pediu para você escrever um programa que criptografe os dados de modo que estes possam
ser transmitidos mais seguramente. Todos os dados são transmitidos como inteiros de quatro dígitos. Seu aplicativo deve ler um inteiro de quatro dígitos inserido pelo usuário e criptográfa-lo desta maneira: Substitua cada dígito pelo resultado da adição de 7 ao dígito e obtendo o resto depois da visão do novo valor por 10. Troque então o primeiro dígito pelo terceiro e o segundo dígito pelo quarto. Então imprima o inteiro criptográfado. Escreva um outro aplicativo separado que receba como entrada um inteiro de quatro dígitos criptografado e o descriptografe para forma o número original.
*/


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		int dado;
		
		System.out.println("Digite um dado de quatro digitos a ser descriptografado: ");
		dado = leitor.nextInt();
		descriptografa(dado);
		
	}
	public static void descriptografa(int dado)
	{
		int primeiro, segundo, terceiro, quarto;
		quarto = ((dado%10)+3);
		dado = dado/10;
		terceiro = ((dado%10)+3);
		dado /= 10;
		segundo =((dado%10)+3);
		dado /= 10;
		primeiro = ((dado%10)+3);
		System.out.println(""+terceiro+""+quarto+""+primeiro+""+segundo);
		
	}
}
