package org.sid.companyservice.web;

import lombok.AllArgsConstructor;
import org.sid.companyservice.entities.Company;
import org.sid.companyservice.model.CompanyModel;
import org.sid.companyservice.repository.CompanyRerpository;
import org.sid.companyservice.services.ClientrestService;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class CompanyController {
    private CompanyRerpository companyRerpository;
    private ClientrestService clientrestService;
    @GetMapping("/siret/{nuberSiret}")
    public Company saveCompan(@PathVariable Long nuberSiret){
        CompanyModel cm = clientrestService.getSiretById(nuberSiret);
        Company c = new Company();
        c.setNic(cm.getNic());
        c.setSiret(cm.getSiret());
        c.setCreationdate(cm.getCreationdate());
        c.setFullname(cm.getFullname());
        c.setFulladdress(cm.getFulladdress());
        return companyRerpository.save(c);
    }
    @GetMapping("/companys/}")
    public PagedModel<Company> allCompany(){
        return (PagedModel<Company>) companyRerpository.findAll();
    }
    @GetMapping("/company/{id}")
    public Company getCompanyById(@PathVariable Long id){
        return companyRerpository.getById(id);
    }
    @DeleteMapping("/company/{id}")
    public void delete(@PathVariable Long id){
        companyRerpository.deleteById(id);
    }
    @PatchMapping("/company/{id}")
    public void update(@PathVariable Long id,@RequestBody Company company){
        company.setId(id);
        companyRerpository.save(company);
    }
}
