package escola;

public class Aluno {
	private String nome;
	private Double numero;
	
	public Aluno(String nome, Double numero) {
		this.nome = nome;
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public Double getNumero() {
		return numero;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setNumero(Double numero) {
		this.numero = numero;
	}
}
