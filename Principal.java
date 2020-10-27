package TesteComplementar;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws IOException {
		int menu;
		String path = "Arquivo.txt";
		File arquivo = new File(path);
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("-----------MENU-----------\n" + "Escolha uma opção:\n");
		System.out.println("1: Insira algum texto no arquivo: \n" +
		"2: Exiba o nome do arquivo: \n" + "3: Delete o arquivo");
		
		menu = entrada.nextInt();
		
		
		switch (menu) {
		case 1:
			ManipuladorArquivo.escritor(path);
			break;
		case 2:
			ManipuladorArquivo.leitor(path);
			break;
		case 3:
			ManipuladorArquivo.delete(arquivo);
			break;
		default:
			System.out.println("Digite um valor válido!");
		}
		
		entrada.close();
	}

}
