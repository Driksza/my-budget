package pl.sda.mybudget.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Value;

import java.time.LocalDate;

// DTO - data transfer Object
// dtos should be immutable
// TODO: user java 16's records
@Value
public class IncomeDto {
    @JsonProperty("idik")
    Long id;
    @JsonProperty("kwota")
    long amountInPolishGrosz;
    @JsonProperty("dzień wypłaty")
    LocalDate incomeDate;
    @JsonProperty("źródło")
    String incomeSource;
    @JsonProperty("typ")
    String incomeType;


}


