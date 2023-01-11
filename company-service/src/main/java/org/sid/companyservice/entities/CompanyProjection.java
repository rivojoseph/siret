package org.sid.companyservice.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.rest.core.config.Projection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Projection(name = "fullCompany",types = Company.class)
public interface CompanyProjection {
    public Long getId();
    public String getSiret();
    public String getNic();
    public String getFulladdress();
    public String getCreationdate();
    public String getFullname();
}
