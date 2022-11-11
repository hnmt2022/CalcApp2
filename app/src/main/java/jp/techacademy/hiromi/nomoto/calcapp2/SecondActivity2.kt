package jp.techacademy.hiromi.nomoto.calcapp2


    import androidx.appcompat.app.AppCompatActivity
    import android.os.Bundle
    import jp.techacademy.hiromi.nomoto.calcapp2.R
    import kotlinx.android.synthetic.main.activity_second2.*

class SecondActivity2 : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_second2)

            val value= intent.getDoubleExtra("VALUE", 0.0)




            textView.text = value.toString()

        }



}

