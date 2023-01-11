package org.sid.companyservice.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Company {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String siret;
    private String nic;
    private String fulladdress;
    private String creationdate;
    private String fullname;
}
