package madhuri.com.testapp1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckedTextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val CheckedTextView = findViewById<CheckedTextView>(R.id.CTview);

        //then, check using the conditional statement like
        if(CheckedTextView != null)
            CheckedTextView.isChecked = false
            CheckedTextView.setCheckMarkDrawable(
            android.R.drawable.checkbox_off_background)
        CheckedTextView.setOnClickListener{
            CheckedTextView.isChecked = !CheckedTextView.isChecked
            CheckedTextView.setCheckMarkDrawable(
                if(CheckedTextView.isChecked)
                    android.R.drawable.checkbox_on_background
            else
                    android.R.drawable.checkbox_off_background)

            val Msg = getString(R.string.msg_show)+ " "+
                    getString(if(CheckedTextView.isChecked)
                        R.string.Checked
                    else
                        R.string.Unchecked)
            Toast.makeText(this@MainActivity, Msg,Toast.LENGTH_LONG).show();
        }
    }
}