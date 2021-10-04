package br.com.mybank.cliente.cliente.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.validation.constraints.Email;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class EmailDTO {
        @JsonProperty
        private String ownerRef;
        @JsonProperty
        @Email
        private String emailFrom;
        @JsonProperty
        @Email
        private String emailTo;
        @JsonProperty
        private String subject;
        @JsonProperty
        private String text;


    }
