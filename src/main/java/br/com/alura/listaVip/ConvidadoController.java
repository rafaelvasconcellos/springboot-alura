package br.com.alura.listaVip;

import br.com.alura.listaVip.data.ConvidadoRepository;
import br.com.alura.listaVip.model.Convidado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConvidadoController {

    @Autowired
    private ConvidadoRepository repository;

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("convidados")
    public String listaConvidados(Model model)
    {
        Iterable<Convidado> convidados = repository.findAll();
        model.addAttribute("convidados", convidados);

        return "listaconvidados";
    }
}
