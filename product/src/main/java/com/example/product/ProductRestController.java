package com.example.product;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@CrossOrigin(origins = "*")
@RestController
public class ProductRestController {



    @GetMapping("/prod")
    public Object postProduct() {
        Map<String, String> map = new HashMap<>();
        map.put("name", "akshu");
        map.put("gender", "female");
        return map;
    }


}
