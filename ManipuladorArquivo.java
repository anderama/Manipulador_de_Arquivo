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
		String line = "";
		while (true) {
			if (line != null) {
				System.out.println(line);
				
			} else {
				
				break;				
			}
			
			line = buffRead.readLine();
		}
		buffRead.close();
	}
	
	public static void escritor(String path) throws IOException {
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
		String line = "";
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o que deseja escrever no arquivo: ");
		line = input.nextLine();
		buffWrite.append(line + "\n");
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
