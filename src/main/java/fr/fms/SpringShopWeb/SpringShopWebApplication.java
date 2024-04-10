package fr.fms.SpringShopWeb;

import fr.fms.SpringShopWeb.dao.ArticleRepository;
import fr.fms.SpringShopWeb.dao.CategoryRepository;
import fr.fms.SpringShopWeb.entities.Article;
import fr.fms.SpringShopWeb.entities.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class SpringShopWebApplication implements CommandLineRunner {


	@Autowired
	ArticleRepository articleRepository;

	@Autowired
	CategoryRepository categoryRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringShopWebApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//generateData();

		articleRepository.findAll().forEach(System.out::println);
	}


	public void generateData(){

		Category smartphone = categoryRepository.save(new Category(null, "smartphone", "smartphone & accessoires"));
		Category tablet = categoryRepository.save(new Category(null, "tablette", "tablette, coque pour tablette & accessoire"));
		Category pc = categoryRepository.save(new Category(null, "PC", "PC, laptops, chargeur & accessoires"));
		Category component = categoryRepository.save(new Category(null, "composants PC", "composants pour PC et laptops"));
		Category headphone = categoryRepository.save(new Category(null, "casque audio", "casque audio pour PC, smartphone et tablette"));
		articleRepository.save(new Article(null, "Samsung S10", 250, smartphone));
		articleRepository.save(new Article(null, "Iphone 12 max", 1000, smartphone));
		articleRepository.save(new Article(null, "MacBook pro", 2500, pc));
		articleRepository.save(new Article(null, "MSI Crosshair 17", 1500, pc));
		articleRepository.save(new Article(null, "Nvidia GeForce RTX 4060", 900, component));
		articleRepository.save(new Article(null, "Razer Kraken", 300, headphone));
		articleRepository.save(new Article(null, "Souris logitech", 50, component));
		articleRepository.save(new Article(null, "Iphone 10 pro", 900, smartphone));
		articleRepository.save(new Article(null, "Ipad Air pro", 600, tablet));
		articleRepository.save(new Article(null, "Galaxy tab", 200, tablet));
		articleRepository.save(new Article(null, "Lenovo legion", 1200, pc));
	}

}
