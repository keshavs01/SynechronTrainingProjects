package com.synechron.paging_sorting.repos;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.synechron.paging_sorting.entity.CibilScore;

public interface ScoreRepository extends PagingAndSortingRepository<CibilScore, String> {

}
