package ch11;

public class Computer implements Controllable {

	@Override
	public void turnOn() {
		System.out.println("컴퓨터를 켜다.");
	}

	@Override
	public void turnOff() {
		System.out.println("컴퓨터를 끈다.");
	}
}
