package com.devsubho.springbootrestapiversion.controller;

import com.devsubho.springbootrestapiversion.model.Name;
import com.devsubho.springbootrestapiversion.model.CarVersion1;
import com.devsubho.springbootrestapiversion.model.CarVersion2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarVersioningController {

	@GetMapping("v1/car")
	public CarVersion1 carVersion1() {
		return new CarVersion1("Buggati Veyron");
	}

	@GetMapping("v2/car")
	public CarVersion2 carVersion2() {
		return new CarVersion2(new Name("Buggati", "Veyron"));
	}

	@GetMapping(value = "/car/param", params = "version=1")
	public CarVersion1 paramV1() {
		return new CarVersion1("Buggati Veyron");
	}

	@GetMapping(value = "/car/param", params = "version=2")
	public CarVersion2 paramV2() {
		return new CarVersion2(new Name("Buggati", "Veyron"));
	}

	@GetMapping(value = "/car/header", headers = "X-API-VERSION=1")
	public CarVersion1 headerV1() {
		return new CarVersion1("Buggati Veyron");
	}

	@GetMapping(value = "/car/header", headers = "X-API-VERSION=2")
	public CarVersion2 headerV2() {
		return new CarVersion2(new Name("Buggati", "Veyron"));
	}

	@GetMapping(value = "/car/produces", produces = "application/vnd.company.app-v1+json")
	public CarVersion1 producesV1() {
		return new CarVersion1("Buggati Veyron");
	}

	@GetMapping(value = "/car/produces", produces = "application/vnd.company.app-v2+json")
	public CarVersion2 producesV2() {
		return new CarVersion2(new Name("Buggati", "Veyron"));
	}

}
