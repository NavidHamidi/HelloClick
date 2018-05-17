package fr.epita.helloclick

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import fr.epita.helloclick.R.id.button_click
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_click.setOnClickListener(this@MainActivity)
        button_reset.setOnClickListener(this@MainActivity)
        button_reverse.setOnClickListener(this@MainActivity)
        button_normal.setOnClickListener(this@MainActivity)
        button_big.setOnClickListener(this@MainActivity)

    }

    var cpt = 0
    var add = 1
    var mode = true
    var reverse = false
    var i = 1

    override fun onClick(clickedView: View?) {
        if (clickedView != null) {
            when (clickedView.id) {
                R.id.button_click -> {
                    if (reverse) {
                        i = 1
                    }
                    else {
                        i = -1
                    }
                    if (mode) {
                        cpt += (add * i)
                    }
                    else {
                        cpt += (add * i)
                    }
                    compteur.text = cpt.toString()
                }
                R.id.button_reset -> {
                    cpt = 0
                    reverse = false
                    compteur.text = cpt.toString()
                }
                R.id.button_reverse -> {
                    reverse = !reverse
                }
                R.id.button_normal -> {
                    add = 1
                }
                R.id.button_big -> {
                    add = 10
                }
            }
        }
    }
}
