package com.example.demo2.model;

import an.awesome.pipelinr.Command;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SampleCommand implements Command<Sample> {
    private String name;
    private String surname;
}
