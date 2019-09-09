package br.com.alura.forum.controller;

import br.com.alura.forum.dto.TopicoDto;
import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Subcategoria;
import br.com.alura.forum.modelo.Topico;
import br.com.alura.forum.modelo.Usuario;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


/**
 * @author george on 08/09/2019
 * @project forum
 */
@RestController
public class TopicosController {

    @RequestMapping("/topicos")
    public List<TopicoDto> lista() {
        Topico topico = new Topico("Duvida", "Duvida com spring boot",
                new Curso("spring", new Subcategoria()), new Usuario());

        return TopicoDto.converter(Arrays.asList(topico, topico, topico));
    }

}
