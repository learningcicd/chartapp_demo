package com.chat.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Person {
    private String name;
    private String sex;
    private String dOB;
    private String address;
}
