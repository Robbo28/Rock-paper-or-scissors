package com.example.rockpaperscissors

fun main(){
    var computerChoice = ""
    var playerChoice = ""

    println("Rock, Paper or Scissors?\nEnter your choice . . .")
    playerChoice = readln()

    val randomNumber = (1..3).random()

    when (randomNumber){
        1 -> {
            computerChoice = "Rock"
        }
        2 -> {
            computerChoice = "Paper"
        }
        3 -> {
            computerChoice = "Scissors"
        }
    }

    println(computerChoice)

    val winner = when{
        playerChoice == computerChoice -> "Draw"
        playerChoice == "Rock" && computerChoice == "Scissors" -> "Player"
        playerChoice == "Paper" && computerChoice == "Rock" -> "Player"
        playerChoice == "Scissors" && computerChoice == "Paper" -> "Player"
        else -> "Computer"
    }

    when (winner){
        "Draw" -> println("It was a draw")
        "Player","Computer" -> println("$winner won")
        else -> println("Unknown result")
    }
}