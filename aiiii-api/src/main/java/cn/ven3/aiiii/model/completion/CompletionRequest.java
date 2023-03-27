package cn.ven3.aiiii.model.completion;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;


@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CompletionRequest {

    @Builder.Default
    String model = "text-davinci-003";

    String prompt;

    String suffix;

    @JSONField(name = "max_tokens")
    Integer maxTokens;

    @Builder.Default
    Double temperature = Double.valueOf(0.7);

    @JSONField(name = "top_p")
    @Builder.Default
    Double topP = Double.valueOf(1);

    Integer n;

    Boolean stream;

    Integer logprobs;

    Boolean echo;

    List<String> stop;

    @JSONField(name = "presence_penalty")
    @Builder.Default
    Double presencePenalty = Double.valueOf(0);

    @JSONField(name = "frequency_penalty")
    @Builder.Default
    Double frequencyPenalty = Double.valueOf(0);

    @JSONField(name = "best_of")
    @Builder.Default
    Integer bestOf = Integer.valueOf(1);

    @JSONField(name = "logit_bias")
    Map<String, Integer> logitBias;

    String user;
}
