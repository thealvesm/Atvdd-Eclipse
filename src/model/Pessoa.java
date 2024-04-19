package model;

public class Pessoa {
    private String nome;
    private String cargo;
    private String habilidades;
    private int idade;
    private char sexo;
    private String endereco;
    private String cidade;
    private String estado;

    // Construtor
    public Pessoa(String nome, String cargo, String habilidades, int idade, char sexo, String endereco, String cidade, String estado) {
        this.nome = nome;
        this.cargo = cargo;
        this.habilidades = habilidades;
        this.idade = idade;
        this.sexo = sexo;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
    }

    // Getters e setters
    // Implemente os métodos getters e setters para todos os atributos
    // Exemplo:
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

	public String getCidade() {
		return null;
	}

	public Object getCargo() {
		return null;
	}

	public String getCidade1() {
		return null;
	}

    // Você precisa implementar os getters e setters para todos os outros atributos
}
