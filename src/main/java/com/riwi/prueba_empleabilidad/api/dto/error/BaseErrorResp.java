package com.riwi.prueba_empleabilidad.api.dto.error;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
/*Serializable clase especial para responder por http */
public class BaseErrorResp implements Serializable {
    private String status;
    private Integer code;
}