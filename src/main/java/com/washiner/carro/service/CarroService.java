package com.washiner.carro.service;

import com.washiner.carro.model.CarroModel;
import com.washiner.carro.repository.CarroRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarroService {

    private final CarroRepository carroRepository;

    public CarroService(CarroRepository carroRepository){
        this.carroRepository = carroRepository;
    }

    public CarroModel salvarCarro(CarroModel carroSavo){
        return carroRepository.save(carroSavo);
    }

    public List<CarroModel> listarCarros(){
        return carroRepository.findAll();
    }

    public Optional<CarroModel> salvarCarroBanco(Long id){
        return  carroRepository.findById(id);
    }

    public CarroModel atualizarCarro(Long id, CarroModel carroAtualizado){
        carroAtualizado.setId(id);
        return  carroRepository.save(carroAtualizado);
    }

    public void deletarCarro(Long id){
        carroRepository.deleteById(id);
    }

}
