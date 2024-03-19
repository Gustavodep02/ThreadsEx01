package controller;

public class Tid extends Thread{
	private int idThread;
	public Tid(int idThread) {
		this.idThread = idThread;
	}
	public void run(){
	System.out.println(idThread);
}
}
