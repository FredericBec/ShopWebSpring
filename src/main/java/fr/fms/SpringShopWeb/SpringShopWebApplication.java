package fr.fms.SpringShopWeb;

import fr.fms.SpringShopWeb.dao.ArticleRepository;
import fr.fms.SpringShopWeb.entities.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringShopWebApplication implements CommandLineRunner {


	@Autowired
	ArticleRepository articleRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringShopWebApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//generateData();

		articleRepository.findAll().forEach(System.out::println);
	}

	public void generateData(){
		articleRepository.save(new Article(null, "Samsung S10", 250));
		articleRepository.save(new Article(null, "Iphone 12", 1000));
		articleRepository.save(new Article(null, "MacBook pro", 2500));
		articleRepository.save(new Article(null, "MSI Crosshair 17", 1500));
		articleRepository.save(new Article(null, "Nvidia GeForce RTX 4060", 900));
		articleRepository.save(new Article(null, "Razer Kraken", 300));
		articleRepository.save(new Article(null, "Souris logitech", 50));
		articleRepository.save(new Article(null, "Imprimante Epson xp-455", 200));
		articleRepository.save(new Article(null, "Iphone 10", 900));
		articleRepository.save(new Article(null, "Ipad Air", 600));
		articleRepository.save(new Article(null, "Galaxy tab", 200));
		articleRepository.save(new Article(null, "Lenovo legion", 1200));
	}
}
