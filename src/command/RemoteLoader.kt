package command

import command.command.*
import command.invoker.RemoteControl
import command.receiver.Light
import command.receiver.Stereo

/**
 * Created by devansh on 12/09/20.
 */

fun main() {

    val remoteControl = RemoteControl()

    val livingRoomLight = Light("Living Room")
    val kitchenLight = Light("Kitchen")
    val stereo = Stereo("Living Room")

    val livingRoomLightOn = LightOnCommand(livingRoomLight)
    val livingRoomLightOff = LightOffCommand(livingRoomLight)

    val kitchenLightOn = LightOnCommand(kitchenLight)
    val kitchenLightOff = LightOffCommand(kitchenLight)

    val stereoOnWithCD = StereoOnWithCDCommand(stereo)
    val stereoOff = StereoOffCommand(stereo)

    val partyOnMacro = MacroCommand(listOf(livingRoomLightOn, stereoOnWithCD))
    val partyOffMacro = MacroCommand(listOf(livingRoomLightOff, stereoOff))

    remoteControl.run {
        setCommand(0, livingRoomLightOn, livingRoomLightOff)
        setCommand(1, kitchenLightOn, kitchenLightOff)
        setCommand(2, stereoOnWithCD, stereoOff)
        setCommand(3, partyOnMacro, partyOffMacro)

        println(this)

        onButtonPushed(0)
        offButtonPushed(0)
        onButtonPushed(1)
        offButtonPushed(1)
        onButtonPushed(2)
        offButtonPushed(2)

        println("--- Pushing Macro On ---")
        onButtonPushed(3)
        println("--- Pushing Macro Off ---")
        offButtonPushed(3)
    }
}