package fr.fms.SpringShopWeb.dao;

import fr.fms.SpringShopWeb.entities.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
    Page<Article> findByDescriptionContains(String description, Pageable pageable);
}
