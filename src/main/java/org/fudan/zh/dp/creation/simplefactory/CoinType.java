package org.fudan.zh.dp.creation.simplefactory;

import java.util.function.Supplier;

public enum CoinType {
  COPPER(CopperCoin::new),
  GOLD(GoldCoin::new);

  private final Supplier<Coin> constructor;

  CoinType(Supplier<Coin> constructor) {
    this.constructor = constructor;
  }

  public Supplier<Coin> getConstructor() {
    return this.constructor;
  }
}
