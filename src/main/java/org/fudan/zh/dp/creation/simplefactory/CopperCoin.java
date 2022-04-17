package org.fudan.zh.dp.creation.simplefactory;

public class CopperCoin implements Coin{

  static final String DESCRIPTION = "This is a copper coin.";

  @Override
  public String getDescription() {
    return DESCRIPTION;
  }
}
