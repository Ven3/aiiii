package cn.ven3.aiiii.model.response;

import lombok.Data;

import java.util.List;

@Data
public class OpenAiResponse<T> {
    public List<T> data;

    public String object;
}
