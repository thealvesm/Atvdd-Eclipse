import javax.swing.JOptionPane;
import model.Pessoa;
import util.RelatorioPessoas;

public class Main {
    public static void main(String[] args) {
        RelatorioPessoas relatorio = new RelatorioPessoas();

        while (true) {
            // Coletando informações da pessoa
            String nome = JOptionPane.showInputDialog("Qual seu nome?");
            String cargo = JOptionPane.showInputDialog("Qual seu cargo?");
            String habilidades = JOptionPane.showInputDialog("Quais suas habilidades?");
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade?"));
            char sexo = JOptionPane.showInputDialog("Qual seu sexo? (M ou F)").toUpperCase().charAt(0);
            String endereco = JOptionPane.showInputDialog("Qual seu endereço?");
            String cidade = JOptionPane.showInputDialog("Qual sua cidade?");
            String estado = JOptionPane.showInputDialog("Qual seu estado?");

            // Criando uma nova pessoa com as informações fornecidas
            Pessoa pessoa = new Pessoa(nome, cargo, habilidades, idade, sexo, endereco, cidade, estado);

            // Adicionando a pessoa ao relatório
            relatorio.adicionarPessoa(pessoa);

            // Perguntar ao usuário se deseja adicionar outra pessoa
            int opcao = JOptionPane.showConfirmDialog(null, "Deseja adicionar outra pessoa?", "Nova Pessoa", JOptionPane.YES_NO_OPTION);
            if (opcao == JOptionPane.NO_OPTION) {
                break;
            }
        }

        // Exibir o relatório por cidade
        relatorio.exibirRelatorioPorCidade();
        
        
    }
}
