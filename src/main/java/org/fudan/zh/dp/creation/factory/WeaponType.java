package org.fudan.zh.dp.creation.factory;

public enum WeaponType {
  SHORT_SWORD("short sword"),
  SPEAR("spear"),
  AXE("axe"),
  UNDEFINED("");

  private final String title;

  WeaponType(String s) {
    title = s;
  }

  @Override
  public String toString() {
    return title;
  }
}
