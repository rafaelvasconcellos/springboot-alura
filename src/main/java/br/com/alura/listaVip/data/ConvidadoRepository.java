package br.com.alura.listaVip.data;

import br.com.alura.listaVip.model.Convidado;
import org.springframework.data.repository.CrudRepository;

public interface ConvidadoRepository extends CrudRepository<Convidado, Long> {
}
