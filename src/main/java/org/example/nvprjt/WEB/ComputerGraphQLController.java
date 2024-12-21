package org.example.nvprjt.WEB;

import lombok.AllArgsConstructor;
import org.example.nvprjt.DTO.ComputerDTO;
import org.example.nvprjt.MAPPER.ComputerMapper;
import org.example.nvprjt.SERVICE.ComputerService;
import org.example.nvprjt.dao.entities.Computer;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@AllArgsConstructor
@Controller
public class ComputerGraphQLController {
    ComputerService computerService;
    ComputerMapper computerMapper;

    @MutationMapping
    public ComputerDTO saveComputer(@Argument ComputerDTO Computer){
        return computerService.savecomputer(Computer);
    }
    @QueryMapping
    public List<ComputerDTO> getComputerByProce(@Argument String proce){
        return computerService.getComputerByProce(proce);
    }

}
