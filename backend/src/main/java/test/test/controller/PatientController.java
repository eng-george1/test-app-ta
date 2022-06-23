package test.test.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import test.test.entity.DTO.PatientDTO;
import test.test.service.PatientService;

import java.util.List;

@RestController

@RequestMapping(value="api/v1/patients")
@AllArgsConstructor
@CrossOrigin
public class PatientController {
    private final PatientService patientService;
    @GetMapping("/sortedname")
    public List<PatientDTO> findByOrderByFullNameAsc(){
        return patientService.findByOrderByFullNameAsc();
    }
}
