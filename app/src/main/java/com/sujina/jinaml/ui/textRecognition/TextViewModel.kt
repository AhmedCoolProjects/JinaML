package com.sujina.jinaml.ui.textRecognition

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TextViewModel : ViewModel() {
    /* val REQUEST_IMAGE_CAPTURE = 1
     private val _image = MutableLiveData<ImageView>().apply {
         value

     }*/
    private val _text = MutableLiveData<String>().apply {
        value = "this is the text view"
    }
    val text: LiveData<String> = _text
}
/*




    private fun dispatchTakePictureIntent() {
        val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        try {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE)
        } catch (e: ActivityNotFoundException) {
            // display error state to the user
        }
    }

    private fun startActivityForResult(takePictureIntent: Intent, requestImageCapture: Int) {

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            val imageBitmap = data?.extras?.get("data") as Bitmap
            _image.setValue(imageBitmap)
        }
    }
}*/
