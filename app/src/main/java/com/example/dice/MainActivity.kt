package com.example.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButtom :Button = this.findViewById(R.id.button_roll)
        val diceOne : ImageView = findViewById(R.id.first_dice)
        val diceTwo : ImageView = findViewById(R.id.second_dice)
        rollButtom.setOnClickListener {
          val randomNumber =  Random().nextInt(6)+1
            val resourceDrawable1 = when(randomNumber){
               1 -> R.drawable.dice1
                2-> R.drawable.dice2
                3 -> R.drawable.dice3
                4-> R.drawable.dice4
                5-> R.drawable.dice5
                6->R.drawable.dice6
                else ->R.drawable.dice6
            }
            diceOne.setImageResource(resourceDrawable1)

            val randomNumber2 =  Random().nextInt(6)+1
            val resourceDrawable2 = when(randomNumber2){
                1 -> R.drawable.dice1
                2-> R.drawable.dice2
                3 -> R.drawable.dice3
                4-> R.drawable.dice4
                5-> R.drawable.dice5
                6->R.drawable.dice6
                else ->R.drawable.dice6
            }
            diceTwo.setImageResource(resourceDrawable2)
        }
    }
}
