package com.fordytoo._kgen.Repositories;

import com.fordytoo._kgen.Entities.Chapter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChapterRepository extends CrudRepository<Chapter, Long> {
}