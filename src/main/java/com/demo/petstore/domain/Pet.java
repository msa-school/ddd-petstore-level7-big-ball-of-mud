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

	@Id @GeneratedValue
	int id;
		public int getId() {
			return id;
		}

	public abstract String speak();


	public void eat(){
		energy = energy + 1;
	}

	public void sleep(){
		energy = energy + 1;
	}

	public void save(){
		Repository repository = PetstoreApplication.getApplicationContext().getBean(Repository.class);
		repository.save(this);
	}


	@Override
	public String toString() {
		return "appearance = " + appearance + " & energy = " + energy;
	}


}
