package com.plantas.ui;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;

import com.plantas.dto.Plant;


@Named
@ManagedBean
@Scope("session")
public class SearchPlants {
	
	@Inject
	private Plant plant;
	
	public String execute() {
		
		if (plant != null && plant.getName().equalsIgnoreCase("Amapola")) {
			return "search2";
			
		}else {
			return "noresults";			
		}
		
	}

	public Plant getPlant() {
		return plant;
	}

	public void setPlant(Plant plant) {
		this.plant = plant;
	}

}
