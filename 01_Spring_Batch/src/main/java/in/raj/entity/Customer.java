package in.raj.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "CUSTOMER_INFO")
public class Customer {
    @Id
    @Column(name = "CUSTOMER_ID")
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private String contactNo;
    private String country;
    private String dob;
}
