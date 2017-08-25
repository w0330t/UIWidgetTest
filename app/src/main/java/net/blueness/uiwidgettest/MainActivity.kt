package net.blueness.uiwidgettest

import android.app.ProgressDialog
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.ProgressBar
import org.jetbrains.anko.find
import org.jetbrains.anko.progressDialog

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var editText: EditText? = null
    private var imageView: ImageView? = null
    private var progressBar: ProgressBar? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = find(R.id.button)
        editText = find(R.id.edit_text)
        imageView = find(R.id.image_view)
        progressBar = find(R.id.progress_bar)
        button.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when (v.id) {
//                R.id.button -> toast(editText!!.text.toString())
//                R.id.button -> imageView!!.setImageResource(R.drawable.img_2)
//                R.id.button ->
//                    if (progressBar!!.visibility == View.GONE) {
//                        progressBar!!.visibility = View.VISIBLE
//                    } else {
//                        progressBar!!.visibility = View.GONE
//                    }
//                更新进度条
//                R.id.button -> {
//                    var progress = progressBar!!.progress
//                    progress += 10
//                    progressBar!!.setProgress(progress)
//                }

//                显示对话框
                R.id.button -> {
                    val dialog = AlertDialog.Builder(this)
                    dialog.setTitle("This is Dialog")
                    dialog.setMessage("Something important")
                    dialog.setCancelable(false)
                    dialog.setPositiveButton("OK") {
                        d, which -> Unit
                    }
                    dialog.setNegativeButton("Cancel") {
                        d, which -> Unit
                    }
                    dialog.show()
                }
                else -> ""
            }
        }
    }
}
