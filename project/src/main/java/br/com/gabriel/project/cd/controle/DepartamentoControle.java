package br.com.gabriel.project.cd.controle;

import java.lang.StackWalker.Option;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.gabriel.project.cd.dominio.Departamento;
import br.com.gabriel.project.cd.dominio.DepartamentoRepositorio;

@Controller
public class DepartamentoControle {
	
	private DepartamentoRepositorio departamentoRepo;
	
	public DepartamentoControle(DepartamentoRepositorio departamentoRepo) {
		this.departamentoRepo = departamentoRepo;
	}
	
	@GetMapping("/cd/departamentos")
	public String Departamentos(Model model) {
		model.addAttribute("listaDepartamentos", departamentoRepo.findAll());
		return "cd/departamentos/departamentos";
	}
	
	@GetMapping("/cd/departamentos/novo")
	public String NovoDepartamento(Model model) {
		model.addAttribute("departamento", new Departamento(""));
		return "cd/departamentos/form";
	}
	
	@PostMapping("/cd/departamentos/salvar")
	public String AdicionarDepartamento(@ModelAttribute("departamento") Departamento departamento) {
		departamentoRepo.save(departamento);
		return "redirect:/cd/departamentos";
	}
	
	@GetMapping("/cd/departamentos/{id}")
	public String AlterarDepartamento(@PathVariable("id") long id, Model model) {
		Optional<Departamento> departamentoOpt = departamentoRepo.findById(id);
		if(departamentoOpt.isEmpty()) {
			throw new IllegalArgumentException("Departamento Inválido");
		}
		
		model.addAttribute("departamento", departamentoOpt.get());
		return "cd/departamentos/form";
	}
	
	@GetMapping("/cd/departamentos/excluir/{id}")
	public String ExcluirDepartamento(@PathVariable("id") long id, Model model) {
		Optional<Departamento> departamentoOpt = departamentoRepo.findById(id);
		if(departamentoOpt.isEmpty()) {
			throw new IllegalArgumentException("Departamento Inválido");
		}
		
		departamentoRepo.delete(departamentoOpt.get());
		return "redirect:/cd/departamentos";
	}
	
	
}
