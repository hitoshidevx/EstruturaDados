package br.com.gabriel.project.cd.dominio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartamentoRepositorio extends JpaRepository<Departamento, Long>{

}
