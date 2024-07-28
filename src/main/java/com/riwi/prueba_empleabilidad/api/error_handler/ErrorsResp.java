    package com.riwi.prueba_empleabilidad.api.error_handler;

    import java.util.List;
    import java.util.Map;

import com.riwi.prueba_empleabilidad.api.dto.error.BaseErrorResp;

import lombok.AllArgsConstructor;
    import lombok.Data;
    import lombok.EqualsAndHashCode;
    import lombok.NoArgsConstructor;
    import lombok.experimental.SuperBuilder;
    
    @EqualsAndHashCode(callSuper = true)
    @Data
    @SuperBuilder
    @AllArgsConstructor
    @NoArgsConstructor
    public class ErrorsResp extends BaseErrorResp{
        private List<Map<String,String>> errors; 
    }