package com.demo.petstore.domain;

import javax.persistence.*;

import com.demo.petstore.PetstoreApplication;

@Entity
@DiscriminatorColumn(
    discriminatorType = DiscriminatorType.STRING,
    name = "pet_type",
    columnDefinition = "CHAR(5)"
)
public abstract class Pet {

	@Id @GeneratedValue
	int id;
		public int getId() {
			return id;
		}

	String name;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}

	int appearance;
		public int getAppearance() {
			return appearance;
		}
		public void setAppearance(int appearance) {
			this.appearance = appearance;
		}

    int energy;
		public int getEnergy() {
			return energy;
		}
		public void setEnergy(int energy) {
			this.energy = energy;
		}

	Money price;
		public Money getPrice() {
			return price;
		}
		public void setPrice(Money price) {
			this.price = price;
		}

	Address placeOfAdoption;
		public Address getPlaceOfAdoption() {
			return placeOfAdoption;
		}
		public void setPlaceOfAdoption(Address placeOfAdoption) {
			this.placeOfAdoption = placeOfAdoption;
		}

	public abstract String speak();


	public void eat(){
		energy = energy + 1;
	}

	public void sleep(){
		energy = energy + 1;
	}

	public void save(){
		PetRepository repository = PetstoreApplication.getApplicationContext().getBean(PetRepository.class);
		repository.save(this);
	}


	@Override
	public String toString() {
		return "appearance = " + appearance + " & energy = " + energy;
	}


}
