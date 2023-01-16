package com.bulbul.boilerplate.common.loader;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccessRightJsonObject {
    Integer id;
    @JsonProperty("action_id")
    Integer actionId;
    @JsonProperty("submodule_item_id")
    Integer submoduleItemId;
}
