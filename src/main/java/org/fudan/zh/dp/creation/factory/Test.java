package org.fudan.zh.dp.creation.factory;

public class Test {

  private static final String MANUFACTURED = "%s manufactured %s";

  public static void main(String[] args) {

    BlackSmith blacksmith = new OrcBlackSmith();
    Weapon weapon = blacksmith.weaponManufacturer(WeaponType.SPEAR);
    System.out.println(String.format(MANUFACTURED, blacksmith, weapon));
    weapon = blacksmith.weaponManufacturer(WeaponType.AXE);
    System.out.println(String.format(MANUFACTURED, blacksmith, weapon));

    blacksmith = new ElfBlackSmith();
    weapon = blacksmith.weaponManufacturer(WeaponType.SPEAR);
    System.out.println(String.format(MANUFACTURED, blacksmith, weapon));
    weapon = blacksmith.weaponManufacturer(WeaponType.AXE);
    System.out.println(String.format(MANUFACTURED, blacksmith, weapon));
  }

}
