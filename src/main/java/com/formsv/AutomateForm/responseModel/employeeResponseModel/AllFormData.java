package com.formsv.AutomateForm.responseModel.employeeResponseModel;

import com.formsv.AutomateForm.model.form.Form;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AllFormData {
    private List<Form> data;
}
