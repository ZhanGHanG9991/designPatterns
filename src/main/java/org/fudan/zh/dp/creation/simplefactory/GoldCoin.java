package org.fudan.zh.dp.creation.simplefactory;

public class GoldCoin implements Coin{

  static final String DESCRIPTION = "This is a gold coin.";

  @Override
  public String getDescription() {
    return DESCRIPTION;
  }
}
