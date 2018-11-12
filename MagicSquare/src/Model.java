
public class Model {

	private int num;
	private int totalVal = 0;
	
	
	public Model(){
		
	}
	
	public void calculateTotal(int i, int j, int k) {
		totalVal = i + j + k;
	}
	
	public boolean checkVals(int i, int j, int k) {
		num = i + j + k;
		
		if (num == totalVal) {
			return true;
		} else {
			return false;
		}
	}
	
	
	
	
	
	
}
