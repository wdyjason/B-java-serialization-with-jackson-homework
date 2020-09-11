package com.thoughtworks.capability.gtb.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonPropertyOrder({"userId", "name"})
public class UserVo {

  @JsonProperty("userId")
  private String id;
  private String name;
}
