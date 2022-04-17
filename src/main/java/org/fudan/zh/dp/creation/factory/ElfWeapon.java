package org.fudan.zh.dp.creation.factory;

public class ElfWeapon implements Weapon {

  WeaponType weaponType;

  public ElfWeapon(WeaponType weaponType) {
    this.weaponType = weaponType;
  }

  @Override
  public WeaponType getWeaponType() {
    return weaponType;
  }

  @Override
  public String toString() {
    return "An elf " + weaponType.toString();
  }
}
