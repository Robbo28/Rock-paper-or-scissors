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
}