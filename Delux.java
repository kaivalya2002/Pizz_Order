package pizza;

public class Delux extends Pizza {

	
	public Delux()
	{	
	 super.addcheese();
	 super.addToppings();
	 System.out.println("Do you want a parcel : \n1.Yes \n2.No");
	 int ch = sc.nextInt();
	 if(ch==1)
	 {
		 takeaway=true;
			this.price +=take_away;
		System.out.println("extra charge : 20");	
	 }
	 
	 else if(ch==2)
	 {  
		 takeaway=false;
		 price = this.price;
		 }
	}

	@Override
	public void addcheese() {
		
	}

	@Override
	public void addToppings() {
	}

	
	
}
