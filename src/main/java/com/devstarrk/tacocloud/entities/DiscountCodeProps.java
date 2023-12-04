package com.devstarrk.tacocloud.entities;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Component
@ConfigurationProperties(prefix="taco.discount")
@Data
public class DiscountCodeProps {

    private Map<String, Integer> codes = new HashMap<>();

}
