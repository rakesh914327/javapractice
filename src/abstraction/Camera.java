package abstraction;

public class Camera implements Nikon,Sony{

	@Override
	public void canCapturePhotos() {
		// TODO Auto-generated method stub
		System.out.println("Capturing Photos");
	}

	@Override
	public void canCaptureVideos() {
		// TODO Auto-generated method stub
		System.out.println("Capturing Videos");
	}
	
	public static void main(String[] args) {
		
		Camera c = new Camera();
		c.canCapturePhotos();
		c.canCaptureVideos();
	}

}
