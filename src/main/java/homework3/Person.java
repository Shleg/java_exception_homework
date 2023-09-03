package homework3;

import lombok.Data;
@Data
public class Person {

    private String lastName;
    private String firstName;
    private String middleName;
    private String birthDate;
    private long phoneNumber;
    private char gender;

    public Person(String lastName, String firstName, String middleName, String birthDateStr, long phoneNumber, char gender) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthDate = birthDateStr;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }
}
