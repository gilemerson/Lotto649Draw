import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class LottoGame {
	//Private Instance Variables
	private int _elementNum;
	private int _setSize;
	
	//Protected References Types
	protected int[] _numberArray;
	protected int[] _elementArray;
	
	//Constructor
	LottoGame(int elementNum, int setSize){
		this._elementNum = elementNum;
		this._setSize = setSize;		
	}
	
	//Instantiate ArrayList and Build The NumberArrayList
	private void _initialize(){
		this._elementArray = new int[this._elementNum];
		this._numberArray = new int[this._setSize + 1];
		
		for(int num = 1; num < this._numberArray.length; num++){
			this._numberArray[num] = num;
		}	
	}
	
	public void pickElements(){
		Random rnd = new Random();
		int rndElement;
		int index = 0;//Sentinel Variable
		
		this._initialize();//Reset The Array Structure
		while(index < this._elementNum){
			rndElement = rnd.nextInt(this._setSize) + 1;
			//Check If rndElement Has Been Chosen
			if(this._numberArray[rndElement] != -1){
				this._elementArray[index] = rndElement;
				//Flag That Number Has Been Chosen
				this._numberArray[rndElement] = 1;
				index ++;
			}
		}	
		
	//Sort The Element Array
	Arrays.sort(this._elementArray);
	}
}
