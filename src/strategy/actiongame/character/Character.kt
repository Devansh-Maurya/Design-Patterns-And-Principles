package strategy.actiongame.character

import strategy.actiongame.behaviour.weapon.WeaponBehavior

/**
 * Created by devansh on 25/08/20.
 */

open class Character(var weapon: WeaponBehavior) {

    open fun fight() {
        weapon.useWeapon()
    }

}