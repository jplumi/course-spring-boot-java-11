package com.educandoweb.course.entities.enums;

import com.educandoweb.course.entities.Order;

public enum OrderStatus {
    WAITING_PAYMENT("WP"),
    PAID("P"),
    SHIPPER("S"),
    DELIVERED("D"),
    CANCELED("S");

    private String code;

    private OrderStatus(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
