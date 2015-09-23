import java.util.Scanner;

public class Cao {
	
	private String nome;
	private String raca;
	private int idade;
	private char sexo;
	private char pedigree;
	private char premiacao;
	
	Scanner tc = new Scanner(System.in);

	
	public Cao (String nome){
		while(nome.length()<2){
			System.out.println("Nome invalido");
			System.out.println("Informe um nome");
			nome=tc.next();
		}
		this.setNome(nome);
		}
	
	public void ler(){
		System.out.println("Informe a Raça");
		this.setRaca(tc.next());
		System.out.println("Informe a idade:");
		this.setIdade(tc.nextInt());
		System.out.println("Informe o Sexo (M/F)");
		this.setSexo(tc.next().charAt(0));
		System.out.println("Informe se tem premiacao (S/N)");
		this.setPremiacao(tc.next().charAt(0));
		System.out.println("Informe se tem pedegree: (S/N)");
		this.setPedigree(tc.next().charAt(0));
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		while((sexo)!='f'&& (sexo)!='F'&&(sexo)!='M'&&(sexo)!='m'){
			System.out.println("Formato nao aceito");
			System.out.println("Informe se tem Sexo: (M/F)");
			sexo=tc.next().charAt(0);
		 }
		 this.sexo = sexo;
	}
	public char getPedigree() {
		return pedigree;
	}
	public void setPedigree(char pedigree) {
			
	
		
		while((pedigree)!='s'&& (pedigree)!='S'&&(pedigree)!='N'&&(pedigree)!='n'){
			System.out.println("Formato nao aceito");
			System.out.println("Informe se tem pedegree: (S/N)");
			pedigree=tc.next().charAt(0);
					
	
		}
		this.pedigree = pedigree;
	}
	public char getPremiacao() {
		return premiacao;
	}
	public void setPremiacao(char premiacao) {
		while((premiacao)!='s'&& (premiacao)!='S'&&(premiacao)!='N'&&(premiacao)!='n'){
			System.out.println("Formato nao aceito");
			System.out.println("Informe se tem Premiação: (S/N)");
			premiacao=tc.next().charAt(0);
					
	
		}
		this.premiacao = premiacao;
	}
	
	public boolean comparaNome(String nome){
		if(nome.length()<4){
			System.out.println("Numero de caracteres insuficiente");
			return false;
		}else{
		if(nome.substring(0,4).equals(this.nome.substring(0, 4))){
			System.out.println("Nome parecido");
			}
		return true;	

	}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cao other = (Cao) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cao [nome=" + nome + ", raca=" + raca + ", idade=" + idade + ", sexo=" + sexo + ", pedigree=" + pedigree
				+ ", premiacao=" + premiacao + "]";
	}

	
	

	
	
	

}
