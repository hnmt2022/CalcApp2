package jp.techacademy.hiromi.nomoto.calcapp2


import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.view.View
import androidx.appcompat.app.AlertDialog


class MainActivity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if (editText1.text.toString() == "" || editText2.text.toString() == ""||editText1.text.toString() =="."||editText2.text.toString()=="." ) {
            showAlertDialog()
        } else {

            val e1: Double = editText1.text.toString().toDouble()
            val e2: Double = editText2.text.toString().toDouble()
            val e3: String = editText1.text.toString()
            //if( e1 ==null || e2 == null){

            var value = 0.0

            //if( e1 ==null || e2 == null){
            //if( editText1.text.toString() =="" || editText2.text.toString() == ""){
            //if( editText1.text.toString() == null || editText2.text.toString() == null){
            //if( e1.toString() ==null || e2.toString() == null){
            //if( editText1.text.toString().length() = 0 ){
            // if( e3 ==""){

            //showAlertDialog()}

            //  }else

            if (v.id == R.id.button1) {
                value = e1 + e2

            } else if (v.id == R.id.button2) {
                value = e1 - e2

            } else if (v.id == R.id.button3) {
                value = e1 * e2


            } else if (v.id == R.id.button4) {
                value = e1 / e2

            }


            val intent = Intent(this, SecondActivity2::class.java)

            intent.putExtra("VALUE", value)


            startActivity(intent)

        }
    }




    private fun showAlertDialog(){
        val alertDialogBuilder = AlertDialog.Builder(this)
        alertDialogBuilder.setTitle("入力エラー")
        alertDialogBuilder.setMessage("数値を入力してください")


        alertDialogBuilder.setPositiveButton("ok"){_,_ -> }

        val alertDialog = alertDialogBuilder.create()
        alertDialog.show()

        //showAlertDialog()<=これだと延々アラートダイアログが出る

    }

}

private fun String.length() {

}






