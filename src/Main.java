import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner tc = new Scanner(System.in);
		
		ArrayList<Cao> cachorro = new ArrayList<>();
		
		int opc;
		int countF=0;
		int countM=0;
		
		do{
			System.out.println("1- Cadastrar: \n2- Remover\n3- Listar\n4- Excluir por nome semelhante\n5- Excluir por nome igual\n6- Excluir por pedegree\n7- Listar por pedegree\n8- Listar por raça\n9- Listar por Nome Semelhante");
			System.out.println("Numero de cae cadastrados "+cachorro.size());
			for(int i=0; i<cachorro.size(); i++){
				if((cachorro.get(i).getSexo()=='f')||(cachorro.get(i).getSexo()=='F')){
					countF++;
				}
			}
			System.out.println("Numero de femea cadastradas "+countF);
			for(int i=0; i<cachorro.size(); i++){
				if((cachorro.get(i).getSexo()=='m')||(cachorro.get(i).getSexo()=='M')){
					countM++;
				}
			}
			countM=cachorro.size()-countF;
			System.out.println("Numero de machos cadastradas "+ countM);

			opc=tc.nextInt();
			
			switch(opc){
			
			case 1:{
					String nome;
					System.out.println("Informe um nome");
					nome=tc.next();
					Cao c1 = new Cao(nome);
					if(cachorro.contains(c1)){
						System.out.println("Já tem animal com os mesmo dados");
					}
					else{
						c1.ler();
						cachorro.add(c1);
					}
				break;
			}
			case 2:{
				String nome;
				System.out.println("Informe um nome:");
				nome=tc.next();
				Cao c1 = new Cao(nome);
				if(cachorro.contains(c1)){
					cachorro.remove(c1);
					System.out.println("Removido com Sucesso!");
				}
				else{
					System.out.println("Nome nao encontrado:");
				}
				break;
			}
			case 3:{
				String nome;
				System.out.println("Informe um nome");
				nome=tc.next();
				Cao c1 = new Cao(nome);
				int posicao = cachorro.indexOf(c1);
				if(posicao == -1){
					System.out.println("Nome não encontrado");
				}else{
				System.out.println(cachorro.get(posicao).toString());
				}
			break;	
			}
			
			case 4:{
				String nome;
				System.out.println("Digite o nome do cachoro");
				nome=tc.next();
				Cao c1 = new Cao(nome);
				for(int i = 0; i<cachorro.size(); i++){
					if(c1.comparaNome(cachorro.get(i).getNome())){
					cachorro.remove(i);
					System.out.println("Nome semelhante removido");
					}
				}
				break;
			}
			case 5:{
				String nome;
				System.out.println("Informe um nome");
				nome=tc.next();
				Cao c1 = new Cao(nome);
				if(cachorro.contains(c1)){
					int posicao = cachorro.indexOf(c1);
					cachorro.remove(posicao);
					System.out.println("Animal excluido com sucesso ");
				}
				else{
					System.out.println("Nome não encontrado");
				}
				break;
			}
			
			case 6:{
				for(int i=0; i<cachorro.size(); i++){
					if((cachorro.get(i).getPedigree())==('s')||(cachorro.get(i).getPedigree())==('S')){
						cachorro.remove(i);
						System.out.println("Removido com sucesso");
					}else{
						System.out.println("Não há cachorro com pedegree cadastrado");
					}
				}
				break;
			}
			case 7:{
				for(int i=0; i<cachorro.size(); i++){
					if((cachorro.get(i).getPedigree())==('s')||(cachorro.get(i).getPedigree())==('S')){
						System.out.println(cachorro.get(i).toString());
					}
					else{
						System.out.println("Não existe cachorro com pedegree cadastrados");
					}
				}
				break;
			}
			case 8:{
				String raca;
				System.out.println("Informe uma raca");
				raca=tc.next();
				for(int i=0; i<cachorro.size(); i++){
					if(cachorro.get(i).getRaca().equals(raca)){
						System.out.println(cachorro.get(i).toString());
					}
					else{
						System.out.println("Raca não encontrada");
					}
				}
			}
			case 9:{
				String nome;
				System.out.println("Informe um nome");
				nome=tc.next();
				Cao c1 = new Cao(nome);
				for(int i=0; i<cachorro.size(); i++){
					if(c1.comparaNome(cachorro.get(i).getNome())){
						System.out.println(cachorro.toString());
					}
					else{
						System.out.println("Nome não encontrado:");
					}
				}
				
				break;
			}
			
			
			}
			
		}while(opc!=10);
		
	}

}
