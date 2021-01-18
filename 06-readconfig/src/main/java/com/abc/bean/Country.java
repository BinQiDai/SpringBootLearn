package com.abc.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @desc:
 * @author: BinQi.Dai
 * @date: 2020/12/23
 */
@Component
@PropertySource(value = "classpath:custom.properties",encoding = "utf-8")
@ConfigurationProperties("abc.country")
public class Country {
    private List<String> cities;

    public List<String> getCities() {
        return cities;
    }

    public void setCities(List<String> cities) {
        this.cities = cities;
    }
}
