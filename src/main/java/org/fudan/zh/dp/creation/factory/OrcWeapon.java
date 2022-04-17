package org.fudan.zh.dp.creation.factory;

public class OrcWeapon implements Weapon{

  WeaponType weaponType;

  public OrcWeapon(WeaponType weaponType) {
    this.weaponType = weaponType;
  }

  @Override
  public WeaponType getWeaponType() {
    return weaponType;
  }

  @Override
  public String toString() {
    return "An orc " + weaponType.toString();
  }
}
