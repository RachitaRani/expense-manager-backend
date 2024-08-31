package com.example.expense_manager_backend.Service.income;

import com.example.expense_manager_backend.Dto.IncomeDTO;
import com.example.expense_manager_backend.Model.Income;

import java.util.List;

public interface IncomeService {
    Income postIncome(IncomeDTO incomeDTO);

    Income updateIncome(Long id, IncomeDTO incomeDTO);

    List<Income> getAllIncome();

    Income getIncomeById(Long id);

    void deleteIncome(Long id);
}
