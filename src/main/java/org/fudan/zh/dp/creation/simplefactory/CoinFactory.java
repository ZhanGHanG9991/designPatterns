package org.fudan.zh.dp.creation.simplefactory;

public class CoinFactory {
  public static Coin getCoin(CoinType type) {
    return type.getConstructor().get();
  }
}
