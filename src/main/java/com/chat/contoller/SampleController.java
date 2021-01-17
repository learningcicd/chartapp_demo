package com.chat.contoller;

import com.chat.model.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/sample")
public class SampleController {

    @Value("${name:cannot f}")
    private String name;

    @Value("${sex}")
    private String sex;

    @Value("${dOB}")
    private String dOB;

    @Value("${address}")
    private String address;

    @GetMapping
    public ResponseEntity<Person> getInfo() {
        return ResponseEntity.accepted().body(Person.builder()
                .name(name)
                .sex(sex)
                .dOB(dOB)
                .address(address)
                .build());
    }
}
