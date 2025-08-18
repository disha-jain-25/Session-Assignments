/*
	Alice and her Bakery:
		- Create a class called CakeBaker, that is dependent on two other classes called
		  Frosting and Syrup. This class has a function called bakeCake()
		- Create two interfaces of type Frosting and Syrup with a function called getFrostingType and getSyrupType res.
		- Create two implementations of these two interfaces (so total 4 classes) for chocolates and strawberry flavors.
		- Use Dependency injection to inject the Frosting and Syrup dependencies into CakeBaker and also to call the bakeCake
		  function of the CakeBaker Class.
*/
package com.example.AliceBakery;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AliceBakeryApplication implements CommandLineRunner {

	private final CakeBaker cakeBaker;

    public AliceBakeryApplication(CakeBaker cakeBaker) {
        this.cakeBaker = cakeBaker;
    }

    public static void main(String[] args) {
		SpringApplication.run(AliceBakeryApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		cakeBaker.bakeCake();
	}
}
