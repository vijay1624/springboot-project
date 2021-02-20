package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

@RestController
public class IndiaController {
    public static final Logger log = LoggerFactory.getLogger(IndiaController.class);

    @Autowired
    IndiaRepository indiaRepository;

    @PostMapping("/createPlayer")
    public String createPlayer(@RequestBody India india) {
        indiaRepository.save(india);
        return "player added successfully";
    }

    @GetMapping("/getAllPlayers")
    public List<India> getAllPlayers() {
        List<India> indiaList = new LinkedList<>();
        Iterable<India> iterable = indiaRepository.findAll();
        iterable.forEach(indiaList::add);
        return indiaList;

    }

}
