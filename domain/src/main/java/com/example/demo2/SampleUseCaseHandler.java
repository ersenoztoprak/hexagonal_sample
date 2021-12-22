package com.example.demo2;

import an.awesome.pipelinr.Command;
import com.example.demo2.model.Sample;
import com.example.demo2.model.SampleCommand;
import com.example.demo2.port.SamplePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SampleUseCaseHandler implements Command.Handler<SampleCommand, Sample> {

    private final SamplePort samplePort;
    @Override
    public Sample handle(SampleCommand command) {
        var portMsg = samplePort.sample();
        return Sample.builder().message(portMsg + " " + command.getName() + " " + command.getSurname()).build();
    }
}
