package cn.ven3.aiiii.model;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class Usage {
    @JSONField(name = "prompt_tokens")
    long promptTokens;

    @JSONField(name = "completion_tokens")
    long completionTokens;

    @JSONField(name = "total_tokens")
    long totalTokens;
}
