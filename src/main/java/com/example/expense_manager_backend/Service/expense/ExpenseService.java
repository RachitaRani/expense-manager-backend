package com.example.expense_manager_backend.Service.expense;

import com.example.expense_manager_backend.Dto.ExpenseDTO;
import com.example.expense_manager_backend.Model.Expense;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ExpenseService {
    Expense postExpense(ExpenseDTO expenseDTO);

    Expense updateExpense(Long id, ExpenseDTO expenseDTO);

    List<Expense> getAllExpenses();

    Expense getExpenseById(Long id);

    void deleteExpense(Long id);
}
