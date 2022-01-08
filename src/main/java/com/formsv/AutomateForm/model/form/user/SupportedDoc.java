package com.formsv.AutomateForm.model.form.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@AllArgsConstructor
@Getter
@Setter
@Document(collation = "supportedDoc")
public class SupportedDoc {
    @Id
    private String _id;
    @Indexed(unique = true)
    private String name;
}
