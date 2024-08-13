public class Main {
  public static void main(String[] args) {
    AbstGameConnectionHelper gameConnectionHelper = new DefaultGameConnectionHelper();
    gameConnectionHelper.requestConnection("인코딩 정보");
  }
}