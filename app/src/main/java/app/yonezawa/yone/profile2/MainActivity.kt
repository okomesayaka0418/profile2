package app.yonezawa.yone.profile2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //画像を見えない状態にする
       profileImage.isVisible = false

        //テキストを見えない状態にする
       profileCommentText.isVisible = false

        button1.setOnClickListener {

            //画像を見える状態にする
            profileImage.isVisible = true

            profileCommentText.isVisible = true



        }



    }
}