package escola;

public class App {
	public static void main(String[] args) {
		
	Aluno aluno1 = new Aluno("Gabriel Lopes", 1025698.7);
	Aluno aluno2 = new Aluno("Lucas Fran�a", 1822433.2);
	Aluno aluno3 = new Aluno("Lucas Nakasima", 1456328.1);
	
	Nota nota1 = new Nota(5.6);
	Nota nota2 = new Nota(7.2);
	Nota nota3 = new Nota(9.0);
	
	Avalia��o avalia��o1 = new Avalia��o("Matem�tica");
	Avalia��o avalia��o2 = new Avalia��o("Portug�s");
	Avalia��o avala��o3 = new Avalia��o("Ed. F�sica");
	
	ExibirAvalia��o(avalia��o1);
	ExibirAluno(aluno1, nota1);
	
	ExibirAvalia��o(avalia��o2);
	ExibirAluno(aluno2, nota2);
	
	ExibirAvalia��o(avala��o3);
	ExibirAluno(aluno3, nota3);
		
		
	}
    
    public static void ExibirAluno(Aluno aluno, Nota nota) {
    	System.out.println("Nome luno:" + aluno.getNome() + "numero:" + aluno.getNumero() + "NOta" + nota.getNota() );
    	System.out.println("-------------------------------");
    }
    public static void ExibirAvalia��o(Avalia��o avalia��o) {
    	System.out.println("Prova: " + avalia��o.getAvaliacao());
    }
}
