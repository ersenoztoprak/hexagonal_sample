package com.example.demo2.controller;

import an.awesome.pipelinr.Pipeline;
import com.example.demo2.model.SampleCommand;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sample")
@RequiredArgsConstructor
public class DemoController {

    private final Pipeline pipeline;

    @GetMapping
    public void sample() {
        var sampleCommand = SampleCommand.builder().name("ersen").surname("oztoprak").build();
        var sample =  pipeline.send(sampleCommand);
        System.out.println(sample.getMessage());
    }
}
