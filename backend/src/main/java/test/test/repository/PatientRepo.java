package test.test.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import test.test.entity.Patient;

import java.util.List;
import java.util.UUID;


@Repository
public interface PatientRepo extends PagingAndSortingRepository<Patient, UUID> {
    List<Patient> findByOrderByFullNameAsc();
}