package org.fudan.zh.dp.creation.factory;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

public class OrcBlackSmith implements BlackSmith{

  private static final Map<WeaponType, OrcWeapon> weaponMap;

  static {
    weaponMap = new EnumMap<>(WeaponType.class);
    Arrays.stream(WeaponType.values()).forEach(type -> weaponMap.put(type, new OrcWeapon(type)));
  }

  @Override
  public Weapon weaponManufacturer(WeaponType weaponType) {
    return weaponMap.get(weaponType);
  }

  @Override
  public String toString() {
    return "The orc blacksmith";
  }
}
