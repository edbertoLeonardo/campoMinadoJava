import br.com.empresa.campoMinado.modelo.Tabuleiro;
import br.com.empresa.campoMinado.visao.TabuleiroConsole;

public class Aplicacao {

	public static void main(String[] args) {

		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);

		new TabuleiroConsole(tabuleiro);

	}
}


