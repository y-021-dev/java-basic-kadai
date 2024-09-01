package kadai_015;

public class Car_Chapter15 {

	private int gear = 0;
	private int speed = 0;

	public Car_Chapter15(int gear,int speed) {
		this.gear = gear;
		this.speed = speed;
	}

	public void gearChange (final int afterGear) {

		switch(afterGear) {

		case 1:
			this.speed = 10;
			break;
		case 2:
			this.speed = 20;
			break;
		case 3:
			this.speed = 30;
			break;
		case 4:
			this.speed = 40;
			break;
		case 5:
			this.speed = 50;
			break;
		default:
			this.speed = 10;
			break;

		}

		if(this.gear != afterGear) {
			System.out.println("ギア" + this.gear + "から" + afterGear + "に切り替えました");
		}
		else {
			System.out.println("ギア" + this.gear + "です");
		}


	}

	public void run (){
		System.out.println("速度は時速" + this.speed + "kmです");
	}

}
