package br.com.gabriel.project.cd.controle;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.gabriel.project.core.dominio.Cidade;
import br.com.gabriel.project.core.dominio.CidadeRepositorio;

@Controller
public class CidadeControle {

	private CidadeRepositorio cidadeRepo;
	
	public CidadeControle(CidadeRepositorio cidadeRepo) {
		this.cidadeRepo = cidadeRepo;
	}
	
	@GetMapping("/cd/cidades")
	public String Cidades(Model model){
		model.addAttribute("listaCidades", cidadeRepo.findAll());
		return "cd/cidades/cidades";
	}
	
	@GetMapping("/cd/cidades/novo")
	public String NovaCidade(Model model) {
		model.addAttribute("cidade", new Cidade ("", ""));
		return "cd/cidades/form";
	}
	
	@PostMapping("/cd/cidades/salvar")
	public String AdicionarCidade(@ModelAttribute("cidade") Cidade cidade) {
		cidadeRepo.save(cidade);
		return "redirect:/cd/cidades";
	}
	
	@GetMapping("/cd/cidades/{id}")
	public String AlterarCidade(@PathVariable("id") long id, Model model) {
		Optional<Cidade> cidadeOpt = cidadeRepo.findById(id);
		if(cidadeOpt.isEmpty()) {
			throw new IllegalArgumentException("Cidade Inválida)");
		}
		
		model.addAttribute("cidade", cidadeOpt.get());
		return "cd/cidades/form";
		
	}
	
	@GetMapping("/cd/cidades/excluir/{id}")
	public String ExcluirCidade(@PathVariable("id") long id, Model model) {
		Optional<Cidade> cidadeOpt = cidadeRepo.findById(id);
		
		if(cidadeOpt.isEmpty()) {
			throw new IllegalArgumentException("Cidade Inválida ( Não Encontrada :( )");
		}
		
		cidadeRepo.delete(cidadeOpt.get());
		return "redirect:/cd/cidades";
	}
	
}
