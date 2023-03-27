package cn.ven3.aiiii.model.completion;

import lombok.Data;

@Data
public class CompletionChoice {

    String text;

    Integer index;

    LogProbResult logprobs;

    String finish_reason;
}
