package dao;

import java.io.Serializable;

public class Product implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String productId;		// 상품 아이디
	private String pname;			// 상품명
	private Integer unitPrice;		// 상품 가격
	private String description;		// 상품 설명
	private String manufacturer;	// 제조사
	private String category;		// 분류
	private long unitInstock;		// 재고수
	private String condition;		// 신품,중고품,재생품
	private String filename;		// 이미지 파일명
	
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	

	public Product(String productId, String pname, Integer unitPrice, String description, String manufacturer,
			String category, long unitInstock, String condition, String filename) {
		super();
		this.productId = productId;
		this.pname = pname;
		this.unitPrice = unitPrice;
		this.description = description;
		this.manufacturer = manufacturer;
		this.category = category;
		this.unitInstock = unitInstock;
		this.condition = condition;
		this.filename = filename;
	}



	public String getProductId() {
		return productId;
	}

	public String getFilename() {
		return filename;
	}



	public void setFilename(String filename) {
		this.filename = filename;
	}



	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Integer getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Integer unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public long getUnitInstock() {
		return unitInstock;
	}

	public void setUnitInstock(long unitInstock) {
		this.unitInstock = unitInstock;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
}
