package com.jwt.demo.model.openAi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OpenAIRequest {
    private String model;
    private String prompt;
    private Integer temperature;
    private Integer max_tokens;
    private Integer top_p;
    private Integer frequency_penalty;
    private Integer presence_penalty;
    private List<String> stop;
}
