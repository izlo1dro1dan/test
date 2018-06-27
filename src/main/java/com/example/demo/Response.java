package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response {
    @JsonProperty("newName")
    public String newName;
    @JsonProperty("order")
    public ResponseOrder responseOrder;

}
