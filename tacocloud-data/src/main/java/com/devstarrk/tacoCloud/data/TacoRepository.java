package com.devstarrk.tacoCloud.data;

import com.devstarrk.tacoCloud.Taco;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TacoRepository extends PagingAndSortingRepository<Taco, Long>{
}
