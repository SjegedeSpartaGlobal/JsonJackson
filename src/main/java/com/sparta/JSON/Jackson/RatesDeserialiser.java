package com.sparta.JSON.Jackson;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class RatesDeserialiser {

    public RatesDTO ratesMappedDTO;

    public RatesDeserialiser(String filepath) {
        try {
            ObjectMapper ratesObject  = new ObjectMapper();
            ratesMappedDTO = ratesObject.readValue(new File(filepath), RatesDTO.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
