public class SmartTv {
  boolean on = false;
  int channel = 1;
  int volume = 25;

  public void turnOnTv() {
    on = true;
  }

  public void turnOffTv() {
    on = false;
  }

  public void changingChannel() {
    channel++;
  }

  public void turnUpVolume() {
    volume++;
    System.out.println("Aumentando o volume para : " + volume);
  }

  public void lowerVolume() {
    volume--;
    System.out.println("Diminuindo o volume para : " + volume);
  }
}
