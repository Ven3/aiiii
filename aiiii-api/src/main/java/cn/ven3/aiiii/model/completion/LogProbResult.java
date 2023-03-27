package cn.ven3.aiiii.model.completion;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class LogProbResult {

    List<String> tokens;

    @JSONField(name = "token_logprobs")
    List<Double> tokenLogprobs;

    @JSONField(name = "top_logprobs")
    List<Map<String, Double>> topLogprobs;

    List<Integer> textOffset;
}
