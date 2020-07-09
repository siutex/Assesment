package pojos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "GBP",
        "HKD",
        "IDR",
        "ILS",
        "DKK",
        "LVL",
        "INR",
        "CHF",
        "MXN",
        "CZK",
        "SGD",
        "THB",
        "HRK",
        "MYR",
        "NOK",
        "CNY",
        "BGN",
        "PHP",
        "SEK",
        "PLN",
        "ZAR",
        "CAD",
        "ISK",
        "BRL",
        "RON",
        "EEK",
        "NZD",
        "TRY",
        "JPY",
        "RUB",
        "KRW",
        "USD",
        "HUF",
        "AUD"
})
public class Rates {

    @JsonProperty("GBP")
    public Float gBP;
    @JsonProperty("HKD")
    public Float hKD;
    @JsonProperty("IDR")
    public Float iDR;
    @JsonProperty("ILS")
    public Float iLS;
    @JsonProperty("DKK")
    public Float dKK;
    @JsonProperty("LVL")
    public Float lVL;
    @JsonProperty("INR")
    public Float iNR;
    @JsonProperty("CHF")
    public Float cHF;
    @JsonProperty("MXN")
    public Float mXN;
    @JsonProperty("CZK")
    public Float cZK;
    @JsonProperty("SGD")
    public Float sGD;
    @JsonProperty("THB")
    public Float tHB;
    @JsonProperty("HRK")
    public Float hRK;
    @JsonProperty("MYR")
    public Float mYR;
    @JsonProperty("NOK")
    public Float nOK;
    @JsonProperty("CNY")
    public Float cNY;
    @JsonProperty("BGN")
    public Float bGN;
    @JsonProperty("PHP")
    public Float pHP;
    @JsonProperty("SEK")
    public Float sEK;
    @JsonProperty("LTL")
    public Float lTL;
    @JsonProperty("PLN")
    public Float pLN;
    @JsonProperty("ZAR")
    public Float zAR;
    @JsonProperty("CAD")
    public Float cAD;
    @JsonProperty("ISK")
    public Float iSK;
    @JsonProperty("BRL")
    public Float bRL;
    @JsonProperty("RON")
    public Float rON;
    @JsonProperty("EEK")
    public Float eEK;
    @JsonProperty("NZD")
    public Float nZD;
    @JsonProperty("TRY")
    public Float tRY;
    @JsonProperty("JPY")
    public Float jPY;
    @JsonProperty("RUB")
    public Float rUB;
    @JsonProperty("KRW")
    public Float kRW;
    @JsonProperty("USD")
    public Float uSD;
    @JsonProperty("HUF")
    public Float hUF;
    @JsonProperty("AUD")
    public Float aUD;

}
