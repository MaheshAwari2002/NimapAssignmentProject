package com.nimap.Assignment.Entity;



	import java.util.ArrayList;
	import java.util.List;
import com.fasterxml.jackson.annotation.JsonBackReference;

	import jakarta.persistence.CascadeType;
    import jakarta.persistence.Column;
    import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.OneToMany;
	import jakarta.persistence.Table;

	@Entity
	@Table(name = "category")

	public class Category {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;

	    @Column(nullable = false)
		private String name;

	    @Column(length = 2000)
	    private String description;
	    
	    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, orphanRemoval = true)
		 @JsonManagedReference
	    private List<Product> products = new ArrayList<>();

	    // Constructors
	    public Category() {
	    }

	    public Category(String name, String description) {
	        this.name = name;
	        this.description = description;
	    }

	    // Getters and Setters
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

	    public String getDescription() {
	        return description;
	    }

	    public void setDescription(String description) {
	        this.description = description;
	    }

	    public List<Product> getProducts() {
	        return products;
	    }

	    public void setProducts(List<Product> products) {
	        this.products = products;
	    }
	}
	
