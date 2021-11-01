package models;

import lombok.Data;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Data
public class RegistrationModel {
    private String firstName;
    private String lastName;
    private String userEmail;
    private String userNumber;
    private String dateOfBirth;
    private String subject;
    private String currentAddress;

}
