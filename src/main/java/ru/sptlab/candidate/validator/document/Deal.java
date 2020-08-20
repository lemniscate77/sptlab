package ru.sptlab.candidate.validator.document;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

public class Deal {

    @NotNull
    @Size(min = 9, max = 9)
    private final String seller;

    @NotNull
    @Size(min = 9, max = 9)
    private final String customer;

    @NotNull
    private final List<@Valid Product> products;

    public Deal(String seller, String customer, List<Product> products) {
        this.seller = seller;
        this.customer = customer;
        this.products = products;
    }

    public String getSeller() {
        return seller;
    }

    public String getCustomer() {
        return customer;
    }

    public List<Product> getProducts() {
        return products;
    }
}