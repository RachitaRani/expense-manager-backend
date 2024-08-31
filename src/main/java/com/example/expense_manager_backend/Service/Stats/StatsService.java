package com.example.expense_manager_backend.Service.Stats;

import com.example.expense_manager_backend.Dto.GraphDTO;
import com.example.expense_manager_backend.Dto.StatsDTO;

public interface StatsService {
    GraphDTO getChartData();

    StatsDTO getStats();
}
