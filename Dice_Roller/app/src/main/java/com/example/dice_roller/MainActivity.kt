package com.example.dice_roller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*
import kotlin.random.Random as RandomRandom
var count:Int = 0
var bingo_count =0
class MainActivity : AppCompatActivity() {

    lateinit var diceimage1: ImageView
    lateinit var diceimage2: ImageView
    lateinit var diceimage3: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.rollButton)
        val endButton : Button = findViewById(R.id.end_button)
        val aboutButton : Button = findViewById(R.id.about)
        val rulesButton : Button = findViewById(R.id.Rules)
        diceimage2 = findViewById(R.id.dice_image2)
        diceimage3 = findViewById(R.id.dice_image3)
        diceimage1 = findViewById(R.id.dice_image1)

        rollButton.setOnClickListener{

            rolldice()
    }
        endButton.setOnClickListener{
            finish()
        }
        aboutButton.setOnClickListener{
            val i =Intent(this,Rules::class.java)
            startActivity(i)
        }
        rulesButton.setOnClickListener{
            val i =Intent(this,About::class.java)
            startActivity(i)
        }
}

    private fun rolldice() {


        val rand1 = Random().nextInt(6) + 1
        var image_saved1 = when (rand1){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceimage1.setImageResource(image_saved1)

        val rand3 = Random().nextInt(6) + 1
        var image_saved3 = when (rand3){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }


        diceimage3.setImageResource(image_saved3)
        val rand2 = Random().nextInt(6) + 1
        var image_saved2 = when (rand2){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceimage2.setImageResource(image_saved2)

        var reward_txt : TextView= findViewById(R.id.reward)
        var bingo_txt : TextView= findViewById(R.id.bingo_count)
        var review_txt : TextView = findViewById(R.id.review)
        var txxt = if(image_saved1 == image_saved2 && image_saved2 == image_saved3){
            bingo_count++
            bingo_txt.text = "BINGO ! : " + bingo_count.toString() + " in " + count.toString() + " Rolls "
            review_txt.text = "Review  : "+ if(count <= 10) {" Topper Ho Tum Toh... "}
            else {
                if(count <= 20) {"Wah bhaiya..."}
                else {
                    if(count<=50){"Theek he hai !..."}
                    else {
                        if(count <= 100) {"Bhakk Be...!"}
                        else {" Rehnedo Mat khelo, END GAME NOW !!... "}
                }

                }
            }
            count=0


        }
        else {

            count++
            reward_txt.text = "TRY AGAIN ! : "+ count.toString()

        }

    }
    }
