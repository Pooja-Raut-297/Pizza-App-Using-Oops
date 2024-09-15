package mainPackage;

public class Pizza {
	
	private int price;
	private boolean veg;
	
	private int extraCheesePrice  = 100;
	private int extraTopingsPrice = 150;
	private int backPackPrice = 20;
	
	private int basePizzaPrice;
	
	private boolean isExtraCheeseAdded = false;
	private boolean isExtraToppingsAdded = false;
	private boolean isOptedForTakeAway = false;
	 
	
	public Pizza(Boolean vegPizza) {
		this.veg = vegPizza;
		if(this.veg) {
			this.price = 300;
		}else {
			this.price = 400;
		}
		
		basePizzaPrice = this.price;
	}
	
	public void addExtraCheese() {
		isExtraCheeseAdded = true;
		this.price += extraCheesePrice;;
	}
	
	public void addExtraToppings() {
		isExtraToppingsAdded = true;
		this.price += extraTopingsPrice;
	}
	
	public void takeAway() {
		isOptedForTakeAway = true;
		this.price += backPackPrice;
	}
	
	public void getBill() {
		String Bill = "";
		System.out.println("Pizza: " + basePizzaPrice);
		
		if(isExtraCheeseAdded) {
			Bill += "Extra Cheese Added: " + extraCheesePrice + "\n";
		}
		
		if(isExtraToppingsAdded) {
			Bill += "Extra Toppings Added: " + extraTopingsPrice + "\n";
		}
		
		if(isOptedForTakeAway) {
			Bill += "Take Away: " + backPackPrice + "\n";
		}
		
		Bill += "Bill: " + this.price + "\n";
		System.out.print(Bill);
	}	
}

/*
 * output:
 * Base Pizza = 300
 * toppings = 150
 * cheese = 100
 * take away = 20
 * */



