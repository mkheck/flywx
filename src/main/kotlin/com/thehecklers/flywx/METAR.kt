package com.thehecklers.flywx

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
class METAR(@JsonProperty("flight_rules") val rules: String,
                 @JsonProperty("raw") val observation: String)