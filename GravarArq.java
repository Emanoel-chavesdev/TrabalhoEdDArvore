import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class GravarArq {
  private static Formatter saida;

    public static void main(String[] args) {
      abrirArquivo();
      adicionarDados();
      fecharArquivo();
    }

    public static void abrirArquivo() {
      try {
        saida = new Formatter("c:\\teste/ArqInteiro.txt");
      }
      catch (SecurityException securityException) {
        System.err.println("Não é possível escrever no arquivo. Finalizando.");
        System.exit(1);
      }
      catch (FileNotFoundException fileNotFoundException) {
        System.err.println("Erro ao abrir o arquivo. Finalizando.");
        System.exit(1);
      }
   }

    public static void adicionarDados() {
      Scanner entrada = new Scanner(System.in);
      System.out.printf("%s%n","Entre com o código do produto e nome do item para cadastro:");
      System.out.printf("%s%n","Para salvar os dados inseridos pressione Ctrl+Z:");
      while (entrada.hasNext()) {
        try {
          saida.format("%d %s %n", entrada.nextInt(),entrada.next());
        }
        catch (FormatterClosedException formatterClosedException) {
          System.err.println("Erro ao escrever no arquivo. Finalizando.");
          break;
        }
        catch (NoSuchElementException elementException) {
          System.err.println("Entrada inválida. Tente novamente.");
          entrada.nextLine(); 
        }
        System.out.print("Entre com o próximo código e item:\n");
      } 
    } 
    public static void fecharArquivo() {
      if (saida != null)
        saida.close();
    }
} 