package com.fastcampus.cryptautomation.repository;

import com.fastcampus.cryptautomation.entity.ReportHistory;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ReportHistoryJpaRepository extends JpaRepository<ReportHistory, Integer> {
}
