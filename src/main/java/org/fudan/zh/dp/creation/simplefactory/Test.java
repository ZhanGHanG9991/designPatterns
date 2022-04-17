package org.fudan.zh.dp.creation.simplefactory;

public class Test {

  public static void main(String[] args) {
    Coin coin1 = CoinFactory.getCoin(CoinType.COPPER);
    Coin coin2 = CoinFactory.getCoin(CoinType.GOLD);
    System.out.println(coin1.getDescription());
    System.out.println(coin2.getDescription());
  }
}
