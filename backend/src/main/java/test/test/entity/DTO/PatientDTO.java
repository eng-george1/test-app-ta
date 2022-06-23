package test.test.entity.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatientDTO {


    private Long id;
    private String number;
    private boolean isAnOut;
    private String fullName;

    private String emailAddress;
    private String contactPhoneNumber;
    private String dateOfBirth;

}
