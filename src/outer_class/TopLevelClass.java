package outer_class;

public class TopLevelClass {

	void display() {
		System.out.println("iç sınıf örneği");
	}
	
	public static void main(String[] args) {
		TopLevelClass obj = new TopLevelClass();
	}
	
}
