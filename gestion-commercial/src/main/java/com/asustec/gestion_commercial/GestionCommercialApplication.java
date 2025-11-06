package com.asustec.gestion_commercial;

import com.asustec.gestion_commercial.model.Produit;
import com.asustec.gestion_commercial.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class GestionCommercialApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(GestionCommercialApplication.class, args);

    }

    @Autowired
    ProduitRepository produitRepository;


    @Override
    public void run(String... args) throws Exception {
        System.out.println("Welcome to Gestion Commercial Application");

        List<Produit> produits = List.of(
                new Produit("BMW 5 Series",
                        "The BMW 5 Series combines elegance, innovation, and performance in a refined executive sedan. With its sleek design and cutting-edge technology, it delivers both comfort and sportiness.",
                        500000.00),

                new Produit("Audi A6",
                        "The Audi A6 offers a perfect blend of sophistication, performance, and technology, with a modern interior and efficient engine lineup.",
                        480000.00),

                new Produit("Mercedes-Benz E-Class",
                        "The Mercedes E-Class redefines luxury and innovation with premium comfort, advanced safety systems, and powerful engine options.",
                        520000.00),

                new Produit("Tesla Model S",
                        "The Tesla Model S delivers extraordinary electric performance, unmatched acceleration, and an innovative Autopilot driving system.",
                        600000.00),

                new Produit("Lexus ES",
                        "The Lexus ES blends refined craftsmanship with reliability and comfort, offering a serene driving experience with hybrid efficiency.",
                        450000.00),

                new Produit("Jaguar XF",
                        "The Jaguar XF combines British elegance with sporty performance and refined interior design, built for driving enthusiasts.",
                        490000.00),

                new Produit("Volvo S90",
                        "The Volvo S90 embodies Scandinavian luxury, safety, and comfort, featuring minimalist design and advanced driver-assist technologies.",
                        470000.00),

                new Produit("Genesis G80",
                        "The Genesis G80 offers world-class comfort, elegant design, and strong performance with cutting-edge technology integration.",
                        460000.00),

                new Produit("Porsche Panamera",
                        "The Porsche Panamera merges luxury and sports performance, offering thrilling handling and a premium interior experience.",
                        750000.00),

                new Produit("Cadillac CT5",
                        "The Cadillac CT5 delivers American performance and style with a luxurious interior and state-of-the-art connectivity features.",
                        430000.00)
        );

        produitRepository.saveAll(produits);

        System.out.println("✅ Successfully inserted " + produits.size() + " cars into the database!");
    }

}
