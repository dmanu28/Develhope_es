package com.noirx.customQueryExercise.entity;

import java.util.Objects;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Flight {

	public enum Status{
		ONTIME, DELAYED, CANCELLED
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String description;
	private String fromAirport;
	private String toAirport;
	private Status status;
	
	
	public Flight() {}

	public Flight(Integer id, String description, String fromAirport, String toAirport, Status status) {
		this.id = id;
		this.description = description;
		this.fromAirport = fromAirport;
		this.toAirport = toAirport;
		this.status = Status.ONTIME;
	}
	
	@Autowired
	public Flight(Integer id) {
		this.id = id;
		setDescription(15);
		setFromAirport(7);
		setToAirport(7);
		this.status = Status.ONTIME;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(int stringSize) {
		this.description = generateString(stringSize);
	}

	public String getFromAirport() {
		return fromAirport;
	}

	public void setFromAirport(int stringSize) {
		this.fromAirport = generateString(stringSize);
	}

	public String getToAirport() {
		return toAirport;
	}

	public void setToAirport(int stringSize) {
		this.toAirport = generateString(stringSize);
	}


	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		return Objects.hash(description, fromAirport, id, status, toAirport);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Flight other = (Flight) obj;
		return Objects.equals(description, other.description) && Objects.equals(fromAirport, other.fromAirport)
				&& Objects.equals(id, other.id) && status == other.status && Objects.equals(toAirport, other.toAirport);
	}

	@Override
	public String toString() {
		return "Flight [id=" + id + ", description=" + description + ", fromAirport=" + fromAirport + ", toAirport="
				+ toAirport + ", status=" + status + "]";
	}
	
	public String generateString(int stringSize) {
		final String CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		StringBuilder buildString = new StringBuilder();
		Random random = new Random();
		for(int x = 0; x < stringSize; x++) {
			int charIndex = random.nextInt(CHARS.length());
			buildString.append(CHARS.charAt(charIndex));
		}
		return buildString.toString();
	}
	
}
