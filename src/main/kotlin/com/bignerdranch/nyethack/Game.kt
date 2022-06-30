import com.bignerdranch.nyethack.Player
import com.bignerdranch.nyethack.Room

fun main() {

    val player = Player("Madrigal")
    player.castFireball()

    var currentRoom = Room("Foyer")
    println(currentRoom.description())
    println(currentRoom.load())

    // Состояние игрока
    printPlayerStatus(player)

    // Аура
    player.auraColor()
}

private fun printPlayerStatus(player: Player) {
    println("(Aura: $player.auraColor) " + "(Blessed: ${if (player.isBlessed) "YES" else "NO"})")
    println("$player.name $player.healthStatus")
}