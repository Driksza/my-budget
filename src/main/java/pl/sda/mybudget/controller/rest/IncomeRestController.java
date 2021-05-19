package pl.sda.mybudget.controller.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.mybudget.model.Income;
import pl.sda.mybudget.model.enumeration.IncomeType;
import pl.sda.mybudget.service.IncomeService;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/rest/incomes")
public class IncomeRestController {


    private final IncomeService incomeService;

    public IncomeRestController(IncomeService incomeService) {
        this.incomeService = incomeService;
    }

    @GetMapping
    List<Income> getAllIncomes() {
//        return List.of(
//                new Income(1_000, LocalDate.now(), "Od żony:)", IncomeType.MOPS),
//                new Income(5_00_000, LocalDate.now(), "500++", IncomeType.MOPS)
//                );
        return  incomeService.findAllIncomes();
    }
    // Select by id
    // rest/incomes/1
    @GetMapping("/{id}")
    Income findbyId (@PathVariable("id") Long idik) {
        return null;
    }

}
