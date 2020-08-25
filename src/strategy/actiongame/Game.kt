package strategy.actiongame

import strategy.actiongame.behaviour.weapon.AxeBehavior
import strategy.actiongame.behaviour.weapon.BowAndArrowBehavior
import strategy.actiongame.behaviour.weapon.KnifeBehavior
import strategy.actiongame.behaviour.weapon.SwordBehavior
import strategy.actiongame.character.Character
import strategy.actiongame.character.King
import strategy.actiongame.character.Knight
import strategy.actiongame.character.Queen
import strategy.actiongame.character.Troll

/**
 * Created by devansh on 25/08/20.
 */

fun main() {
    val king = King(SwordBehavior())
    val queen = Queen(KnifeBehavior())
    val knight = Knight(BowAndArrowBehavior())
    val troll = Troll(AxeBehavior())

    val characters = listOf(king, queen, knight, troll)

    characters.forEach(Character::fight)

    println("-----------------------------------")
    println("King and Knight swapping weapons...")
    println("-----------------------------------")

    king.weapon = BowAndArrowBehavior()
    knight.weapon = SwordBehavior()

    characters.forEach(Character::fight)
}