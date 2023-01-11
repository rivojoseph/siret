package org.sid.companyservice.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RefreshScope
public class SiretConfigController {
    @Value("${siret.params.p1}")
    private String p1;
    @Value("${siret.params.p2}")
    private String p2;
    @Value("${siret.params.p3}")
    private String p3;
    @Value("${siret.params.p4}")
    private String p4;
    @Value("${siret.params.p5}")
    private String p5;
    @GetMapping("/params")
    public Map<String,String> params(){
        return Map.of("p1",p1,"p2",p2,"p3",p3,"p4",p4,"p5",p5);
    }
}
