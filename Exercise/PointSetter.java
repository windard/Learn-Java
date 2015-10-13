import java.awt.Point;
class PointSetter{
	public static void main(String[] args) {
		Point location = new Point(4,13);

		System.out.println("Starting Location:");
		System.out.println("X equals " + location.x);
		System.out.println("Y equals " + location.y);

		System.out.println("\nMoving to (7,6)");
		location.x = 7;
		location.y = 6;

		System.out.println("\nEnding Location");
		System.out.println("X equals " + location.x);
		System.out.println("Y equals " + location.y);
	}
}