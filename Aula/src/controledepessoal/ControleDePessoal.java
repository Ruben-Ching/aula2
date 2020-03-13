package controledepessoal;

import java.util.ArrayList;

import cargo.Diretor;
import cargo.FuncionarioBase;
import cargo.Vendedor;

public class ControleDePessoal {

	public static void main(String[] args) {
		
		
		Vendedor vendedor1 = new Vendedor("Joao", 1200f, 200f);
		Vendedor vendedor2 = new Vendedor("Maria", 1200f, 200f);
		
		
		Diretor diretor1 = new Diretor("Pedro", 3000f, 500f);
		Diretor diretor2 = new Diretor("Ana", 3000f, 300f);
		
		ArrayList<FuncionarioBase> funcionarios = new ArrayList<>();
		
		funcionarios.add(vendedor1);
		funcionarios.add(vendedor2);
		funcionarios.add(diretor1);
		funcionarios.add(diretor2);
		
		System.out.println("Funcionarios cadastrados");
		
		for (FuncionarioBase funcionario : funcionarios) {
			System.out.println(funcionario.getNome());
		}
		
		
	}
	
}
