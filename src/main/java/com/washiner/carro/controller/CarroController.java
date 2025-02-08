package com.washiner.carro.controller;

import com.washiner.carro.model.CarroModel;
import com.washiner.carro.service.CarroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/carro")
public class CarroController {

    private final CarroService carroService;

    public CarroController(CarroService carroService){
        this.carroService = carroService;
    }

    @PostMapping
    public CarroModel salvarCarro(@RequestBody CarroModel carroNovo){
        return carroService.salvarCarro(carroNovo);
    }

    @GetMapping
    public List<CarroModel> listarCarro(){
       return carroService.listarCarros();
    }

    @GetMapping("/{id}")
    public Optional<CarroModel> salvarPorId(@PathVariable Long id){
        return carroService.salvarCarroBanco(id);
    }

    @PutMapping("/{id}")
    public CarroModel atualizar(@PathVariable Long id, @RequestBody CarroModel carroAtual){
        return carroService.atualizarCarro(id, carroAtual);
    }

    @DeleteMapping("/{id}")
    public String deletarCarro(@PathVariable Long id){
        carroService.deletarCarro(id);
        System.out.println("carro deletado do banco !!");
        return "Carro deletado com sucesso !!";
    }

}
