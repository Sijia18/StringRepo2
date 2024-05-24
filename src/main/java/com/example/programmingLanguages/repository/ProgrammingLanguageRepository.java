package com.example.programmingLanguages.repository;

import com.example.programmingLanguages.entity.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "repo-prog-language", collectionResourceDescription = @Description("Repository for ProgrammingLanguage"))
public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage, Long> {}