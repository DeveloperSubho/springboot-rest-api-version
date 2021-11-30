package com.devsubho.springbootrestapiversion.model;

public class Name {
	private String carName;
	private String modelName;

	public Name() {
	}

	public Name(String carName, String modelName) {
		super();
		this.carName = carName;
		this.modelName = modelName;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

}
