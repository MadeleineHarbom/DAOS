package opgave6;

public class Traadaftestning {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Vi er igang");
		threadClass t1 = new threadClass("MUUH");
		threadClass t2 = new threadClass("ØF");
		threadClass t3 = new threadClass("Mææh");
		try {
			t1.sleep(1000);
			t1.run();
			t2.sleep(2000);
			t2.run();
			t3.sleep(3000);
			t3.run();
		}
		catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}

	}

}
