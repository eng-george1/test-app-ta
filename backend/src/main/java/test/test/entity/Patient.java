package test.test.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@Data
@Table(name = "patients")
public class Patient {

    @Id
    private Long id;
    private String number;
    private boolean isAnOut;
    private String fullName;

    private String emailAddress;
    private String contactPhoneNumber;
    private String dateOfBirth;

}
