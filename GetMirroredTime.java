import java.lang.Math;

public static class GetMirroredTime {
  
  public static void getMirroredTime(int h, int m) {
    int nh, nm;
    
    nh = Math.abs(h - 12);
    nm = Math.abs(m - 60);

    System.out.println((nh == 12 ? "0" : nh) + " " +
                       (nm == 60 ? "0" : nm));
  }
}
