package com.example.war.controller;

import com.example.war.model.Invoice;
import com.example.war.rep.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@CrossOrigin(origins = "*")
@RestController
public class InvoiceRestController {
    private final InvoiceRepository invoiceRepository;
    private final RestTemplate restTemplate;

    @Autowired
    public InvoiceRestController(InvoiceRepository invoiceRepository, RestTemplate restTemplate) {
        this.invoiceRepository = invoiceRepository;
        this.restTemplate = restTemplate;
    }


    @PostMapping("/invoice")
    public Invoice postProduct(@RequestBody Invoice invoice) {
        System.out.println("hello");
        Object p = restTemplate.getForObject("http://PRODUCT-SERVICE/prod", Object.class);
        System.out.println(p);
        return invoiceRepository.save(invoice);
    }


}
