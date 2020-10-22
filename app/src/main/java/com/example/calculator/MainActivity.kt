package com.example.calculator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.math.BigDecimal
import java.math.RoundingMode

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        add.setOnClickListener()
        {
            add()
        }
        sub.setOnClickListener()
        {
            subtract()
        }
        mul.setOnClickListener()
        {
            multiply()
        }
        div.setOnClickListener()
        {
            divide()
        }

    }



        fun add()
        {
            if (inputIsNotEmpty())
            {
                val input1 = number_1.text.toString().trim().toBigDecimal()
                val input2 = number_2.text.toString().trim().toBigDecimal()
                answer.text = input1.add(input2).toString()
            }

        }


        fun subtract()
        {
            if (inputIsNotEmpty())
            {
                val input1 = number_1.text.toString().trim().toBigDecimal()
                val input2 = number_2.text.toString().trim().toBigDecimal()
                answer.text = input1.subtract(input2).toString()
            }

        }


        fun multiply() {
            if (inputIsNotEmpty()) {
                val input1 = number_1.text.toString().trim().toBigDecimal()
                val input2 = number_2.text.toString().trim().toBigDecimal()
                answer.text = input1.multiply(input2).toString()
            }

        }

        fun divide()
        {
            if (inputIsNotEmpty())
            {
                val input1 = number_1.text.toString().trim().toBigDecimal()
                val input2 = number_2.text.toString().trim().toBigDecimal()
                if (input2.compareTo(BigDecimal.ZERO) == 0)
                {
                    number_2.error = "Invalid Input"
                }

                answer.text = input1.divide(input2, 2, RoundingMode.HALF_UP).toString()
            }

        }

        fun inputIsNotEmpty(): Boolean
        {
            var b = true
            if (number_1.text.toString().trim().isEmpty())
            {
                number_1.error = "Required"
                b = false
            }
            if (number_2.text.toString().trim().isEmpty())
            {
                number_2.error = "Required"
                b = false
            }
            return b
        }

    }

