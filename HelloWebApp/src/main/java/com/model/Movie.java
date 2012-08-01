package com.model;

public class Movie {
  private String name;
  private String descripcion;
  
  public Movie(){
  }
  
  public Movie(String name){
	  this.name = name;
  }
  
  public Movie(String name, String descripcion){
	  this.name = name;
	  this.descripcion = descripcion;
  }
  
  public String getName() {
	return name;
  }
  
  public void setName(String name) {
	this.name = name;
  }
  
  public String getDescripcion() {
	return descripcion;
  }
  
  public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
  }
}
