import com.bignerdranch.nyethack.Player

fun main() {

    val player = Player()
    player.castFireball()

    // Аура
    val auraColor = player.auraColor()

    // Состояние игрока
    printPlayerStatus(player)

    // Аура
    player.auraColor()
}

private fun printPlayerStatus(player: Player) {
    println("(Aura: $player.auraColor) " + "(Blessed: ${if (player.isBlessed) "YES" else "NO"})")
    println("$player.name $player.healthStatus")
}