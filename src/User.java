public class User {
  public static void main(String[] args) {
    
    SmartTv smartTv = new SmartTv();

    System.out.println("A TV está ligada? : " + smartTv.on);
    System.out.println("Canal atual : " + smartTv.channel);
    System.out.println("Volume atual : " + smartTv.volume);
  }
}
