package util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import model.Pessoa;

public class RelatorioPessoas {
    private List<Pessoa> pessoas;

    // Construtor
    public RelatorioPessoas() {
        this.pessoas = new ArrayList<>();
    }

    // Método para adicionar uma pessoa à lista
    public void adicionarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    // Método para gerar e exibir relatório por cidade
    public void exibirRelatorioPorCidade() {
        Map<String, List<Pessoa>> relatorio = relatorioPorCidade();

        StringBuilder mensagem = new StringBuilder();
        mensagem.append("Relatório por cidade:\n\n");

        for (String cidade : relatorio.keySet()) {
            mensagem.append("Cidade: ").append(cidade).append("\n");
            mensagem.append("Pessoas:\n");

            List<Pessoa> pessoasCidade = relatorio.get(cidade);
            for (Pessoa pessoa : pessoasCidade) {
                mensagem.append("- Nome: ").append(pessoa.getNome()).append(", Cargo: ").append(pessoa.getCargo()).append("\n");
                // Adicione mais informações se necessário
            }

            mensagem.append("\n");
        }

        JOptionPane.showMessageDialog(null, mensagem.toString());
    }

    // Método para gerar relatório por cidade
    private Map<String, List<Pessoa>> relatorioPorCidade() {
        Map<String, List<Pessoa>> relatorio = new HashMap<>();
        for (Pessoa pessoa : pessoas) {
            String cidade = pessoa.getCidade();
            if (!relatorio.containsKey(cidade)) {
                relatorio.put(cidade, new ArrayList<>());
            }
            relatorio.get(cidade).add(pessoa);
        }
        return relatorio;
    }

    // Implemente métodos similares para os outros tipos de relatório (por cargo, por sexo, por estado)
}

