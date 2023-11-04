package com.startjobs.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.startjobs.Model.Candidato;
import com.startjobs.Model.Vaga;
import com.startjobs.Repository.Candidatorepository;
import com.startjobs.Repository.Vagarepository;

@Controller
public class candidatoController {
    @Autowired

    private Vagarepository vagarepository;

    @Autowired

    private Candidatorepository candidatorepository;

    @GetMapping("/candidato")
    public String candidato() {
        return "/candidato";
    }

    @PostMapping("vaga-detalhe/{id}")
    public String cadastrarCandidato( @PathVariable(name = "id") Long id, Candidato candidato) {
        Vaga vaga = vagarepository.getById(id);
        candidato.setVaga(vaga);
        return "redirect:/vaga-detalhe/{id}";
    }
 
}

