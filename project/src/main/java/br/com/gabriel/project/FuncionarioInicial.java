package br.com.gabriel.project;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import br.com.gabriel.project.cd.dominio.Departamento;
import br.com.gabriel.project.cd.dominio.DepartamentoRepositorio;
import br.com.gabriel.project.cd.dominio.Funcionario;
import br.com.gabriel.project.cd.dominio.FuncionarioRepositorio;
import br.com.gabriel.project.core.dominio.Cidade;
import br.com.gabriel.project.core.dominio.CidadeRepositorio;

@Component
@Transactional
public class FuncionarioInicial implements CommandLineRunner {
	
	@Autowired
	private FuncionarioRepositorio funcionarioRepo;
	
	@Autowired
	private CidadeRepositorio cidadeRepo;
	
	@Autowired
	private DepartamentoRepositorio departamentoRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		Cidade cidade1 = new Cidade("Mogi das Cruzes", "SP");
		Cidade cidade2 = new Cidade("Belo Horizonte", "MG");
		
		cidadeRepo.save(cidade1);
		cidadeRepo.save(cidade2);
		cidadeRepo.flush();
		
		Departamento depart1 = new Departamento("Recursos Humanos");
		Departamento depart2 = new Departamento("Tecnologia da Informação");
		Departamento depart3 = new Departamento("Administração");
		Departamento depart4 = new Departamento("Segurança de Trabalho");
		
		departamentoRepo.save(depart1);
		departamentoRepo.save(depart2);
		departamentoRepo.save(depart3);
		departamentoRepo.save(depart4);
		departamentoRepo.flush();
		
		Funcionario f1 = new Funcionario("Hitoshi");
		f1.setEmail("hitoshi.yokogawa@gmail.com");
		f1.setTelefone("11989877709");
		f1.setCidade(cidade1);
		f1.setDepartamento(depart1);
		Funcionario f2 = new Funcionario("Marcelo");
		f2.setEmail("marcelo.kiyoshi@hotmail.com");
		f2.setTelefone("11989877709");
		f2.setCidade(cidade2);
		f2.setDepartamento(depart2);
		
		funcionarioRepo.save(f1);
		funcionarioRepo.save(f2);
		
		
		
	}
	
	
	
}
