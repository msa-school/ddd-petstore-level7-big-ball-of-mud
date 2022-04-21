package com.demo.petstore;

import com.demo.petstore.domain.Dog;
import com.demo.petstore.domain.Pet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PetstoreApplication {

	static ApplicationContext applicationContext;
	public static ApplicationContext getApplicationContext(){
		return applicationContext;
	}

	public static void main(String[] args) {
		applicationContext = SpringApplication.run(PetstoreApplication.class, args);

		Pet dog = new Dog();   // new Cat();
		dog.setName("뽀삐");

		System.out.println(dog.speak());

		System.out.println("pet is eating");
		dog.eat();

		System.out.println(dog);
		

		System.out.println("pet is sleeping");
		dog.sleep();

		System.out.println(dog);

		dog.save();

	}

}
