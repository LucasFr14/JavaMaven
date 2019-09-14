package Lucas.Franca;

public class Nota {
	private Double nota;
	
	public Nota(Double nota) {
		if (nota<0.0 || nota>10.0) {
			throw new RuntimeException("Nota do aluno precisa estar entre 0 e 10");
		}
		this.nota = nota;
	}
	public Double getNota() {
		return nota;
	}
}
