package app.yonezawa.yone.profile2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity() : AppCompatActivity(), Parcelable {
    constructor(parcel: Parcel) : this() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //ボタンがタップされた時に
        button1.setOnClickListener {
            //画像をImageViewに反映する
            profileImage.setImageResource(R.drawable.randy_image)

            //ラベルをTextViewに反映する
            profileLabelText.text = "名前"

            //コメントをTextViewに反映する
            profileCommentText.text = "Androidメンターのランディだよ"

            }
            //スポーツのボタンがタップされた時に
            button2.setOnClickListener {
                //画像をImageViewに反映する
                profileImage.setImageResource(R.drawable.baseball_image)
                //レベルをTextViewに反映する
                profileLabelText.text = "スポーツ"
                //コメントをTextViewに反映する
                profileCommentText.text = "野球観戦が好きで、スタジアムに通っている"
            }
            //好きな食べ物のボタンがタップされた時に
            button3.setOnClickListener {
                //画像をImageViewに反映する
                profileImage.setImageResource(R.drawable.donut_image)
                //レベルをTextViewに反映する
                profileLabelText.text = "好きな食べ物 "
                //コメントをTextViewに反映する
                profileCommentText.text = "キャンディやドーナツが大好き"
            }

            //趣味のボタンがタップされた時に
            button4.setOnClickListener {
                //画像をImageViewに反映する
                profileImage.setImageResource(R.drawable.gadget_image)
                //レベルをTextViewに反映する
                profileLabelText.text = "趣味"
                //コメントをTextViewに反映する
                profileCommentText.text = "ガジェットを集めて動かすこと"
        }

    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MainActivity> {
        override fun createFromParcel(parcel: Parcel): MainActivity {
            return MainActivity(parcel)
        }

        override fun newArray(size: Int): Array<MainActivity?> {
            return arrayOfNulls(size)
        }
    }

}
