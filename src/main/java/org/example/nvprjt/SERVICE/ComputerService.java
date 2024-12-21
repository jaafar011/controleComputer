package org.example.nvprjt.SERVICE;

import org.example.nvprjt.DTO.ComputerDTO;

import java.util.List;

public interface ComputerService {
    public ComputerDTO savecomputer(ComputerDTO computerDTO);
    public List<ComputerDTO> getComputerByProce(String proce);

}
