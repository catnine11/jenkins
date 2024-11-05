package com.edu.jenkins.dto;

import lombok.*;

@NoArgsConstructor
@RequiredArgsConstructor
@Setter
@Getter
@ToString
public class CalculatorDTO {

    // final 붙었을때 RequiredArgsConstructor 와 동작

    @NonNull
    private Integer num1;
    @NonNull
    private Integer num2;
    private Integer sum;
}
