package com.startjobs.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.startjobs.Model.Vaga;
import com.startjobs.Repository.Vagarepository;

@Controller
public class vagaController {

    @Autowired
    private Vagarepository vagasRepository;

    @GetMapping("index")
    public String index() {
        return "index";
    }

    @GetMapping("/vagas")
    public ModelAndView vagas() {
        ModelAndView modelAndView = new ModelAndView("/vagas");
        Iterable<Vaga> vagas = vagasRepository.findAll();
        modelAndView.addObject("vagas", vagas);
        return modelAndView;
    }

    @GetMapping("/recrutador")
    public String recrutador() {
        return "recrutador";
    }

    @PostMapping("/recrutador")
    public String cadastroRecrutador(Vaga vaga) {
        vagasRepository.save(vaga);
        return "/recrutador";
    }

    @GetMapping("vaga-detalhe/{id}")

    public ModelAndView detalheVaga(@PathVariable(name = "id") Long id) {

        Vaga vagas = vagasRepository.getById(id);
        ModelAndView model = new ModelAndView("/candidato");
        model.addObject("vagas", vagas);
        return model;

    }

}
