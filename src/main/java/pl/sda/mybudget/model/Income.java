package pl.sda.mybudget.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.aspectj.weaver.ast.Or;
import pl.sda.mybudget.model.enumeration.IncomeType;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Income {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // @Column(name = "nazwa") - nazwa inside database
    private Long id;
    private long amountInPolishGrosz;
    private LocalDate incomeDate;
    private String incomeSource;
    @Enumerated(EnumType.STRING)
    private IncomeType incomeType;
}
