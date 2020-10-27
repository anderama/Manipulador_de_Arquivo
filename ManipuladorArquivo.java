package TesteComplementar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ManipuladorArquivo {

	public static void leitor(String path) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		String linha = "";
		while (true) {
			if (linha != null) {
				System.out.println(linha);
				
			} else {
				
				break;				
			}
			
			linha = buffRead.readLine();
		}
		buffRead.close();
	}
	
	public static void escritor(String path) throws IOException {
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
		String linha = "";
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o que deseja escrever no arquivo: ");
		linha = input.nextLine();
		buffWrite.append(linha + "\n");
		buffWrite.close();
		input.close();
	}
	
	public static boolean delete(File file) {
        try {
            boolean deleted = file.delete();
            String message = deleted ? "Arquivo excluído!" : "Erro. Não foi possível deletar o arquivo";
            System.out.println(message);
            return deleted;
        } catch (SecurityException exception) {
            System.out.println("SecuriyException was thrown");
            return false;
        }
    }
}
