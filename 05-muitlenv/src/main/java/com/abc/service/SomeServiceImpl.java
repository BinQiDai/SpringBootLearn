package com.abc.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @desc:
 * @author: BinQi.Dai
 * @date: 2020/12/23
 */
@Service
@Profile("dev")
public class SomeServiceImpl implements SomeService {

    @Override
    public String hello() {
        return "hello dev";
    }
}
