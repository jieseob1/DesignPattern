import concrete.HpCreator;
import concrete.MpCreator;
import framework.Item;
import framework.ItemCreator;

public class Main {
  public static void main(String[] args) {
    ItemCreator itemCreator;
    Item item;

    itemCreator = new HpCreator();
    item = itemCreator.create();
    item.use();
    itemCreator = new MpCreator();
    item = itemCreator.create();
    item.use();


  }
}