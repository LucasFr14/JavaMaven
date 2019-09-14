package Lucas.Franca;


public class App 
{
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Gabriel Lopes", 1025698.7);
		Aluno aluno2 = new Aluno("Lucas França", 1822433.2);
		Aluno aluno3 = new Aluno("Lucas Nakasima", 1456328.1);
		
    	Nota nota1 = new Nota(5.6);
		Nota nota2 = new Nota(7.2);
		Nota nota3 = new Nota(9.0);
		
		Avaliação avaliação1 = new Avaliação("Matemática");
		Avaliação avaliação2 = new Avaliação("Portugês");
		Avaliação avalação3 = new Avaliação("Ed. Física");
		
		ExibirAvaliação(avaliação1);
		ExibirAluno(aluno1, nota1);
		
		ExibirAvaliação(avaliação2);
		ExibirAluno(aluno2, nota2);
		
		ExibirAvaliação(avalação3);
		ExibirAluno(aluno3, nota3);
		
		
	}
    
    public static void ExibirAluno(Aluno aluno, Nota nota) {
    	System.out.println("Nome luno:" + aluno.getNome() + " RA: " + aluno.getNumero() + " Nota: " + nota.getNota() );
    	System.out.println("------------------------------------------------");
    }
    public static void ExibirAvaliação(Avaliação avaliação) {
    	System.out.println("Prova: " + avaliação.getAvaliacao());
    }
}
