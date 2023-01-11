package org.sid.companyservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class CompanyModel {
    private String siret;
    private String nic;
    private String fulladdress;
    private String creationdate;
    private String fullname;
}
