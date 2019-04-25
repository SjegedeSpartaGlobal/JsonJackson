package com.sparta.JSON.Jackson;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        RatesDeserialiser rd = new RatesDeserialiser("resources/rates.json");
        System.out.println(rd.ratesMappedDTO.isSuccess());
        System.out.println(rd.ratesMappedDTO.getRates("AED"));

    }
}
