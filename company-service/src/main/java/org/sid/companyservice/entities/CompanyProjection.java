package org.sid.companyservice.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "fullCompany",types = Company.class)
public interface CompanyProjection {
    public Long getId();
    public String getSiret();
    public String getNic();
    public String getFulladdress();
    public String getCreationdate();
    public String getFullname();
}
