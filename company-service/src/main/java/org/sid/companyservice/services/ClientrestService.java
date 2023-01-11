package org.sid.companyservice.services;

import org.sid.companyservice.FeignClientconfig.FeingClientConfig;
import org.sid.companyservice.model.CompanyModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "siret",configuration = FeingClientConfig.class,url = " https://api.insee.fr/entreprises/sirene/V3/siret")
public interface ClientrestService {
    @GetMapping(value = "/companys/{id}")
    public CompanyModel getSiretById(@PathVariable Long id);
}
