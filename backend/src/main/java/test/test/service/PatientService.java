package test.test.service;


import test.test.entity.DTO.PatientDTO;
import test.test.entity.Patient;
import test.test.repository.PatientRepo;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public interface PatientService extends GenericService<Patient, PatientDTO, UUID, PatientRepo> {
   List<PatientDTO> findByOrderByFullNameAsc();

}
