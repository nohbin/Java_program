package solo;

public class Customer {

	   private Grade grad;
	    private int totalPrice;
	    private String name;
	    private double rewardPrice;
	    private int addPrice;
	    
	    
	    public int getAddPrice() {
			return addPrice;
		}

		public void setAddPrice(int addPrice) {
			this.addPrice = addPrice;
			setTotalPrice(this.totalPrice);
		}

		public Customer() {}	 
	    
	    public Grade getGrad() {
	        return grad;
	    }
	    
	    public void setGrad(Grade grad) {
	        this.grad = grad;
	    }
	    
	    public int getTotalPrice() {
	        return totalPrice ;
	       
	    }
	    
	    public void setTotalPrice(int totalPrice) {
	        this.totalPrice = totalPrice + addPrice;
	        setRewardPrice();
	    }
	    
	    public String getName() {
	        return name;
	    }
	    
	    public void setName(String name) {
	        this.name = name;
	    }
	    
	    public double getRewardPrice() {
	        return rewardPrice;
	    }
	    
	    public void setRewardPrice() {    	
	        this.rewardPrice = grad.reward(totalPrice);
	    }
	    
	    @Override
	    public String toString() {
	        return "이름 : " + name + " , 등급 : " + grad + " , 누적 구매 금액 : " + totalPrice + " , 적립금 : " + rewardPrice + "\n";
	    }
	}