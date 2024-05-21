public class User {
  public static void main(String[] args) {
    
    SmartTv smartTv = new SmartTv();

    smartTv.lowerVolume();
    smartTv.lowerVolume();
    smartTv.lowerVolume();
    smartTv.turnUpVolume();

    System.out.println("Canal atual : " + smartTv.channel);

    smartTv.changeChannel(22);
    System.out.println("Canal atual : " + smartTv.channel);

    System.out.println("A TV está ligada? : " + smartTv.on);
    System.out.println("Canal atual : " + smartTv.channel);
    System.out.println("Volume atual : " + smartTv.volume);

    smartTv.turnOnTv();
    System.out.println("Novo estatus : --> A TV está ligada? : " + smartTv.on);
  }
}
