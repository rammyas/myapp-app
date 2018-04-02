package com.accn.ppes.product.entity;


public class Product {
    public Long id;

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String name;

    public Product() {}

    public Product(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format(
                "Product[id=%s, name='%s']",
                id, name);
    }

}
