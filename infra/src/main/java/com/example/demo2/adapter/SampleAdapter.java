package com.example.demo2.adapter;

import com.example.demo2.port.SamplePort;
import org.springframework.stereotype.Component;

@Component
public class SampleAdapter implements SamplePort {

    @Override
    public String sample() {
        return "Sn. ";
    }
}
