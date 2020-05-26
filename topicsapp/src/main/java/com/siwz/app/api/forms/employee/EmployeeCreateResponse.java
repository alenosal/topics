package com.siwz.app.api.forms.employee;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.siwz.app.api.forms.ResponseForm;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class EmployeeCreateResponse implements ResponseForm {

    @Schema(description = "Employee Id",
            example = "69")
    @JsonProperty
    @NotNull
    private Long employeeId;
}
