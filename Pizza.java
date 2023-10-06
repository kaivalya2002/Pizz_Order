package pizza;
import java.util.*;
public class Pizza {
	
int price ;	
int baseprice;
boolean addcheese = false;
boolean addtoppings = false;
boolean takeaway = false;

int add_cheese = 100;
int add_toppings = 100;
int take_away = 20;
Scanner sc = new Scanner(System.in);
public Pizza()
{
	
	System.out.println("**** WELCOME TO PIZZA HUNT ****");
	System.out.println("Please select type of pizza you want");
	System.out.println("1.Veg pizza \n2.Non-Veg pizza");
	System.out.println("Choose one :");
	int n =sc.nextInt();
	
	if(n==1)
		this.price = 300;
	else if(n==2)
	   this.price = 500;
	
  baseprice = this.price;	
}


public void addcheese()
{
   addcheese=true;
	   this.price += add_cheese;
}

public void addToppings()
{   
	addtoppings=true;
	this.price += add_toppings;
}

public void takeaway()
{	
	
	
}

public void bill()
  {
	String bill ="";
	System.out.println("Base Price :"+baseprice);
	
	if(addcheese=true)
	 {
	   bill += "Cheese is added :"+add_cheese;	
	 }
	if(addtoppings=true)
	 {
	   bill += "\nToppings is added :"+add_toppings;	
	 }
	
	bill += "\n \nTotal Bill :"+this.price+"\n";
	System.out.println(bill);
  }
}
