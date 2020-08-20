package ru.sptlab.candidate.validator.document;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

class Product {

    private final String name;

    @NotNull
    @Size(min = 13, max = 13)
    private final String code;

    public Product(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

}