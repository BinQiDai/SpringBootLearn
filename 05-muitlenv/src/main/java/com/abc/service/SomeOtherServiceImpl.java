package com.abc.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @desc:
 * @author: BinQi.Dai
 * @date: 2020/12/23
 */
@Service
@Profile("pro")
public class SomeOtherServiceImpl implements SomeService {

    @Override
    public String hello() {
        return "hello pro";
    }
}
