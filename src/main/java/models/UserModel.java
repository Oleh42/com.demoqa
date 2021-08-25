package models;

import lombok.Data;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Data
public class UserModel {
    private String fullName;
    private String email;
    private String currentAddress;
    private String permanentAddress;
}
