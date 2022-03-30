package com.android.example.camerainfragment

import android.R.attr
import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.Fragment


class CameraFragment : Fragment() {
    private val pic_id = 123

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_camera, container, false)

        val cameraButton: Button = view.findViewById(R.id.camera_button)
        val cameraImage: ImageView = view.findViewById(R.id.click_image)
        cameraButton.setOnClickListener {
            val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(cameraIntent, pic_id)
        }

        return view
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        // Match the request 'pic id with requestCode
        // Match the request 'pic id with requestCode
        if (requestCode === pic_id) {

            // BitMap is data structure of image file
            // which stor the image in memory
// BitMap is data structure of image file
            // which stor the image in memory

            // BitMap is data structure of image file
            // which store the image in memory
        }
    }

}