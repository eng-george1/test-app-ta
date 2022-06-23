package test.test.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import test.test.entity.DTO.PatientDTO;
import test.test.entity.Patient;
import test.test.repository.PatientRepo;
import test.test.service.GenericService;
import test.test.service.PatientService;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService {

   private final PatientRepo patientRepo;
   @Override
   public PatientRepo getRepo() {
      return patientRepo;
   }

   @Override
   public Class<PatientDTO> getDTOType() {
      return PatientDTO.class;
   }

   @Override
   public Class<Patient> getTType() {
      return Patient.class;
   }
   public List<PatientDTO> findByOrderByFullNameAsc(){
      return convertEntity( patientRepo.findByOrderByFullNameAsc());
   }
}
