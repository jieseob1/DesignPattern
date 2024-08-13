package concrete;

import framework.Item;
import framework.ItemCreator;

import java.util.Date;

public class MpCreator extends ItemCreator {
  @Override
  protected void requestItemsInfo() {
    System.out.println("데이터베이스에서 마나 물약의 정보 가지고 온다.");
  }

  @Override
  protected void createItemLog() {
    System.out.println("마나 물약을 새로 생성했다." + new Date());
  }

  @Override
  protected Item createItem() {
    return new MpPotion();
  }
}
