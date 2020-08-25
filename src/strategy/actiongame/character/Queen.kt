package strategy.actiongame.character

import strategy.actiongame.behaviour.weapon.WeaponBehavior

/**
 * Created by devansh on 25/08/20.
 */

class Queen(weapon: WeaponBehavior) : Character(weapon) {

    override fun fight() {
        print("Queen is ")
        weapon.useWeapon()
    }
}