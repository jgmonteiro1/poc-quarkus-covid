package com.jgmonteiro.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jgmonteiro.entities.dto.AllDTO;
import com.jgmonteiro.entities.dto.FrenchGuianaDTO;

public class Cases {

    @JsonProperty("All")
    private AllDTO all;
    @JsonProperty("French Guiana")
    private FrenchGuianaDTO frenchGuiana;
}
