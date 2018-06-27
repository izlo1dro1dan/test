package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Request {
    @JsonProperty("name")
    public String name;
    @JsonProperty("order")
    public RequestOrder requestOrder;
}
