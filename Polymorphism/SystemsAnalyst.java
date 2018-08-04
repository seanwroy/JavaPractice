//Systems Analyst belongs to three groups (three interfaces)
public class SystemsAnalyst extends Student implements Coop, ThreeYearProgram, JavaStudent {
	
	@Override
	public void work() {
		System.out.println("I go to work.");
	}
	
	@Override
	public void code() {
		System.out.println("I code.");
	}
	
	@Override
	public void jobAfterThirtySixMonths() {
		System.out.println("I get a job after 36 months (hopefully!)");
	}
	
	@Override
	public void MaybeCoop() {
		System.out.println("I might do a coop.");
	}
	
	@Override
	public void writePrograms() {
		System.out.println("I write programs.");
	}
	
	@Override
	public void fixLogic() {
		System.out.println("I fix my occasionally broken logic.");
	}
	
	@Override 
	public void sleep() {
		System.out.println("Systems analysts sleep.");
	}
	
	@Override 
	public void study() {
		System.out.println("Systems analysts study.");
	}
}
