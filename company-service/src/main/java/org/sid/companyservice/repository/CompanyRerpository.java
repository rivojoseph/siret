package org.sid.companyservice.repository;


import org.sid.companyservice.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CompanyRerpository extends JpaRepository<Company,Long> {
}
