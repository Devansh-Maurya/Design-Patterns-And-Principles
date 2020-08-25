package strategy.actiongame.character

import strategy.actiongame.behaviour.weapon.WeaponBehavior

/**
 * Created by devansh on 25/08/20.
 */
class King(weapon: WeaponBehavior) : Character(weapon) {

    override fun fight() {
        print("King is ")
        weapon.useWeapon()
    }
}