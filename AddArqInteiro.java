import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AddArqInteiro {

	public static void main(String[] args) throws IOException {
		Scanner s;

		TreeMap<Integer, String> map = new TreeMap<Integer, String>();

		s = new Scanner(new File("c:\\teste/ArqInteiro.txt"));
		FileInputStream entrada = new FileInputStream("c:\\teste/ArqInteiro.txt");
		InputStreamReader entradaFormatada = new InputStreamReader(entrada);
		try (BufferedReader entradaString = new BufferedReader(entradaFormatada)) {
			String linha = entradaString.readLine();
			while (linha != null) {
				System.out.println(linha);
				linha = entradaString.readLine();
			}
		} catch (FileNotFoundException e) {
			throw e;
		} catch (IOException e) {

			e.printStackTrace();

		}
		entrada.close();

		// Inserir dados no arquivo.
		FileOutputStream arq = new FileOutputStream("c:\\teste/ArqInteiro.txt");
		DataOutputStream gravarArq = new DataOutputStream(arq);

		System.out.printf("Informe o código a ser inserido no arquivo:\n");
		String nome = s.nextLine();

		gravarArq.writeUTF(nome);

		arq.close();

	}

}