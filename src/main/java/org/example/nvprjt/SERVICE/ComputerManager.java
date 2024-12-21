package org.example.nvprjt.SERVICE;

import org.example.nvprjt.DTO.ComputerDTO;
import org.example.nvprjt.dao.entities.Computer;
import org.example.nvprjt.MAPPER.ComputerMapper;
import org.example.nvprjt.dao.repositories.ComputerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ComputerManager implements ComputerService{
    @Autowired
    private ComputerRepository computerRepository;
    @Autowired
    private  ComputerMapper computerMapper;
    @Override
    public ComputerDTO savecomputer(ComputerDTO computerDTO) {
        Computer computer =computerMapper.fromComputerDtoToComputer(computerDTO);
        computerRepository.save(computer);
       computerDTO= computerMapper.fromComputerToComputerDto(computer);

        return computerDTO;
    }

    @Override
    public List<ComputerDTO> getComputerByProce(String proce) {
        List<Computer> computers = computerRepository.findByProce(proce);
        List<ComputerDTO> computersDtos = new ArrayList<>();
        for (Computer computer : computers) {
            computersDtos.add(computerMapper.fromComputerToComputerDto(computer));
        }
        return computersDtos;
    }
}
