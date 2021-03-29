package pl.rafalmiskiewicz

import android.content.Context
import android.graphics.BitmapFactory
import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var myAsyncTak: MyAsyncTask? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.go).setOnClickListener() {
            if(myAsyncTak!=null){
                finish()
            }
            myAsyncTak= MyAsyncTask(this)
            myAsyncTak!!.execute()

        }
    }
    class MyAsyncTask(val context: Context): AsyncTask<Void, Void, Void>() {


        override fun doInBackground(vararg params: Void?): Void? {

            //val bitmap: BitmapFactory.decodeResource(context.resources,R.drawable.ic_launcher_background)
            try {
                Thread.sleep(5000)
            }catch (e:InterruptedException){
                e.printStackTrace()
            }
            return null
        }

    }
}