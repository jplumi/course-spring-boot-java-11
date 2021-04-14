package com.educandoweb.course.entities.enums;

import com.educandoweb.course.entities.Order;

public enum OrderStatus {
    WAITING_PAYMENT("WP"),
    PAID("P"),
    SHIPPER("S"),
    DELIVERED("D"),
    CANCELED("S");

    private String code;

    OrderStatus(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public static OrderStatus valueOfCode(String code) {
        for(OrderStatus value : OrderStatus.values()) {
            if(value.getCode().equals(code)){
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid OrderStatus code");
    }
}
