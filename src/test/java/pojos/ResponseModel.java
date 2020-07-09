package pojos;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "base",
        "rates",
        "date"
})
public class ResponseModel {
    @JsonProperty("base")
    public String base;
    @JsonProperty("rates")
    public Rates rates;
    @JsonProperty("date")
    public String date;

}
