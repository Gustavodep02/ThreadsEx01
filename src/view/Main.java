package view;

import controller.Tid;

public class Main {

	public static void main(String[] args) {
		for(int idThread = 0; idThread<5;idThread++) {
			Thread t = new Tid(idThread);
			t.start();
		}
			

	}

}
