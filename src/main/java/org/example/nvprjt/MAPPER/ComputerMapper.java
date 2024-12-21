package org.example.nvprjt.MAPPER;

import org.example.nvprjt.DTO.ComputerDTO;
import org.example.nvprjt.dao.entities.Computer;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;


@Component
public class ComputerMapper {
    private final ModelMapper mapper= new ModelMapper();

    public Computer fromComputerDtoToComputer(ComputerDTO computerDto){
        Computer computer= mapper.map(computerDto,Computer.class);

        return computer;}

    public ComputerDTO fromComputerToComputerDto(Computer computer){
        return mapper.map(computer, ComputerDTO.class);}
}
