
public abstract class FeeStructure {	
	abstract void getClassLevelFee();
	abstract void getTotalFee();
}

class SchoolFee extends FeeStructure{
	final int N = 5000;
	final int F = 40000;
	int getCautionDeposit() {
		return this.getCautionDeposit();
	}

	void getClassLevelFee() {
		System.out.println("LKG ClassLevelFee: "+F);
	}
	
	void getTotalFee() {
		System.out.println("Total Fee: "+(F+N));		
	}	
}