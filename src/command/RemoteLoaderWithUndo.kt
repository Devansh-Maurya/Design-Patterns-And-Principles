package command

import command.command.LightOffCommand
import command.command.LightOnCommand
import command.invoker.RemoteControlWithUndo
import command.receiver.Light

/**
 * Created by devansh on 12/09/20.
 */

fun main() {

    val remoteControl = RemoteControlWithUndo()

    val livingRoomLight = Light("Living Room")
    val kitchenLight = Light("Kitchen")

    val livingRoomLightOn = LightOnCommand(livingRoomLight)
    val livingRoomLightOff = LightOffCommand(livingRoomLight)

    val kitchenLightOn = LightOnCommand(kitchenLight)
    val kitchenLightOff = LightOffCommand(kitchenLight)


    remoteControl.run {
        setCommand(0, livingRoomLightOn, livingRoomLightOff)
        setCommand(1, kitchenLightOn, kitchenLightOff)

        onButtonPushed(0)
        offButtonPushed(0)
        println(this)
        undoButtonPushed()

        onButtonPushed(1)
        offButtonPushed(1)
        println(this)
        undoButtonPushed()
    }
}