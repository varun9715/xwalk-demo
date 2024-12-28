package com.empire.shared.core.models;
import com.fasterxml.jackson.annotation.JsonProperty;

//Defines the common contract for all Sling Models.
public interface BaseComponentModel {
   @JsonProperty
    String getTitle();
   @JsonProperty
    String getDescription();

}
