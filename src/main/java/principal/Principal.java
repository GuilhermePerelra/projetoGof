package principal;
import interfaces.IInventario;
import model.Jogador;
import proxy.InventarioProxy;
import repository.InventarioRepository;
import repository.JogadorRepository;
// import interfaces.IJogadorRepository; // Descomente caso tenha mantido a interface para o DIP

/**
 * GoF: Client
 * Classe Principal que orquestra a injeção de dependências e testa o padrão Proxy.
 */
public class Principal {
    public static void main(String[] args) {
        System.out.println("--- SISTEMA DE JOGO INICIADO ---\n");

        // 1. Instanciamos os repositórios (nossa camada de acesso a dados)
        InventarioRepository inventarioRepo = new InventarioRepository();
        JogadorRepository jogadorRepo = new JogadorRepository();

        // 2. Criamos o Proxy para o inventário.
        // O Proxy é criado, mas a consulta pesada no banco de dados AINDA NÃO ocorre.
        IInventario inventarioProxy = new InventarioProxy(1L, inventarioRepo);

        // 3. Criamos o Jogador injetando o Proxy (Dependency Inversion)
        // O Jogador interage com o Proxy achando que é o inventário real.
        Jogador jogador = new Jogador(1L, "Nagafe", inventarioProxy);

        // 4. Guardando as informações cadastrais leves no banco
        System.out.println("Salvando o progresso do novo jogador...");
        jogadorRepo.salvar(jogador);

        // 5. Simulando a gameplay
        System.out.println("--- GAMEPLAY ---");
        System.out.println("O jogador '" + jogador.getNome() + "' iniciou a partida.");
        System.out.println("Explorando a masmorra...");
        System.out.println("O jogador decide abrir a mochila para checar o peso dos itens...\n");

        // 6. O cálculo de peso é requisitado.
        // SOMENTE AGORA o Proxy intercepta a chamada e vai ao banco de dados carregar
        // a Espada Longa, o Arco Élfico, o Machado Bárbaro, o Cajado e a Poção!
        int pesoTotal = jogador.getInventario().pesoTotal();

        System.out.println("\nPeso total do inventário atual: " + pesoTotal + " kg");
    }
}