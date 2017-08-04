package com.car.rental.model.car;

import java.math.BigDecimal;

/**
 * Created by sindhya on 8/4/17.
 */
public class Policy {
    private String policyName;
    private BigDecimal price;

    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
