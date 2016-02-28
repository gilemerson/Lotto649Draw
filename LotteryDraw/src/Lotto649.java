import java.util.Random;

public class Lotto649 extends LottoGame implements IBonusNumber{

	//Constructor 
	public Lotto649(){
		super (6, 49);
	}
	
	//Public Methods
	public int bonusNumber(){
		Random  rnd  = new Random(); 
		int number = 0;
		int rndElement;
		
		int index = 0;//Assign Sentinel Variable For While Loop
		while(index < 1){
		rndElement  = rnd.nextInt(49) + 1;
		//Check To See If  rndElemet Has Been Chosen 
		if(this._numberArray[rndElement] != 1){;
			number = rndElement;	
			//Set Flag -1 To Indicate rndElement Has Been Chosen
			this._numberArray[rndElement] = 1;	
			//Increment  Variable 
			index ++;
		  }
		
		}
		return number;
	}
	
	//Public OverRides Methods
	@Override
	public String toString(){
		String output = "";
		int setNum = 5;
		
		output += "5 Sets Of Numbers Using Arrays\n";
		output += "--------------------------------\n";
		for(int count  = 0; count < setNum; count++){
			this.pickElements();
			
			int elements;
			for(int element = 0; element < this._elementArray.length; element++){
				if(element > 0){
					output += ", ";		
					
				}
				
			output += this._elementArray[element];	
			
			  }			
			
			output += " + Bonus: " + this.bonusNumber() + "\n";
			}
		
		output += "--------------------------------\n";
		
		return output;
	}
	
	
	
}
