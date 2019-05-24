package com.csls.outputtest.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OperacaoBinariaBean {

    @NotNull
    private Integer num1;
    @NotNull
    private Integer num2;

    public Integer soma() {
        return num1 + num2;
    }

    public Integer subt() {
        return num1 - num2;
    }

    public Integer mult() {
        return num1 * num2;
    }

    public Integer divInteira() {
        return num1 / num2;
    }

    public Integer divInteiraResto() {
        return num1 % num2;
    }

    public Float divReal() {
        return (float)num1 / (float)num2;
    }

}
