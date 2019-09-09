package br.com.alura.forum.controller;

import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Subcategoria;
import br.com.alura.forum.modelo.Topico;
import br.com.alura.forum.modelo.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;


/**
 * @author george on 08/09/2019
 * @project forum
 */
@Controller
public class TopicosController {

    @RequestMapping("/topicos")
    @ResponseBody
    public List<Topico> lista() {
        Topico topico = new Topico("Duvida", "Duvida com spring",
                new Curso("spring", new Subcategoria()), new Usuario());

        return Arrays.asList(topico, topico, topico);
    }

}
