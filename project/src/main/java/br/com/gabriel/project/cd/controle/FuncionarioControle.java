package br.com.gabriel.project.cd.controle;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.gabriel.project.cd.dominio.DepartamentoRepositorio;
import br.com.gabriel.project.cd.dominio.Funcionario;
import br.com.gabriel.project.cd.dominio.FuncionarioRepositorio;
import br.com.gabriel.project.core.dominio.CidadeRepositorio;

@Controller
public class FuncionarioControle {
	
	private FuncionarioRepositorio funcionarioRepo;
	
	private CidadeRepositorio cidadeRepo;
	
	private DepartamentoRepositorio departamentoRepo;
	
	public FuncionarioControle(FuncionarioRepositorio funcionarioRepo, CidadeRepositorio cidadeRepo, DepartamentoRepositorio departamentoRepo) {
		this.funcionarioRepo = funcionarioRepo;
		this.cidadeRepo = cidadeRepo;
		this.departamentoRepo = departamentoRepo;
	}
	
	@GetMapping("/cd/funcionarios")
	public String Funcionarios(Model model) {
		model.addAttribute("listaFuncionarios", funcionarioRepo.findAll());
		return "cd/funcionarios/index";
	}
	
	@GetMapping("/cd/funcionarios/{id}")
	public String alterarFuncionario(@PathVariable("id") long id, Model model) {
		Optional<Funcionario> funcionarioOpt = funcionarioRepo.findById(id);
		if (funcionarioOpt.isEmpty()) {
			throw new IllegalArgumentException("Funcionário Inválido");
		}
		
		model.addAttribute("funcionario", funcionarioOpt.get());
		model.addAttribute("cidades", cidadeRepo.findAll());
		model.addAttribute("departamentos", departamentoRepo.findAll());
		return "cd/funcionarios/form";
		
	}
	
	@GetMapping("/cd/funcionarios/novo")
	public String NovoFuncionario(Model model) {
		model.addAttribute("funcionario", new Funcionario(""));
		model.addAttribute("cidades", cidadeRepo.findAll());
		model.addAttribute("departamentos", departamentoRepo.findAll());
		return "cd/funcionarios/form";
	}

	@PostMapping("/cd/funcionarios/salvar")
	public String AdicionarFuncionario(@ModelAttribute("funcionario") Funcionario funcionario) {
		funcionarioRepo.save(funcionario);
		return "redirect:/cd/funcionarios";
	}
	
	@GetMapping("/cd/funcionarios/excluir/{id}")
	public String ExcluirFuncionario(@PathVariable("id") long id, Model model) {
		Optional<Funcionario> funcionarioOpt = funcionarioRepo.findById(id);
		if(funcionarioOpt.isEmpty()) {
			throw new IllegalArgumentException("Funcionário Inválido");
		}
		
		funcionarioRepo.delete(funcionarioOpt.get());
		return "redirect:/cd/funcionarios";
		
	}
	
}
