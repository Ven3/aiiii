package cn.ven3.aiiii.model;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class Permission {
    public String id;

    public String object;

    public long created;

    @JSONField(name = "allow_create_engine")
    public boolean allowCreateEngine;

    @JSONField(name = "allow_sampling")
    public boolean allowSampling;

    @JSONField(name = "allow_log_probs")
    public boolean allowLogProbs;

    @JSONField(name = "allow_search_indices")
    public boolean allowSearchIndices;

    @JSONField(name = "allow_view")
    public boolean allowView;

    @JSONField(name = "allow_fine_tuning")
    public boolean allowFineTuning;

    public String organization;

    public String group;

    @JSONField(name = "is_blocking")
    public boolean isBlocking;

}
