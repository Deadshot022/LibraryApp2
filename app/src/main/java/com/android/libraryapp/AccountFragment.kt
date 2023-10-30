package com.android.libraryapp

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.android.libraryapp.databinding.FragmentAccountBinding


/**
 * A simple [Fragment] subclass.
 * Use the [AccountFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AccountFragment : Fragment() {
    private var _binding: FragmentAccountBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAccountBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        val imageList = ArrayList<SlideModel>() // Create image list
//
//// imageList.add(SlideModel("String Url" or R.drawable)
//// imageList.add(SlideModel("String Url" or R.drawable, "title") You can add title
//
//        imageList.add(SlideModel(R.drawable.banner2, ScaleTypes.FIT))
//        imageList.add(SlideModel(R.drawable.banner3, ScaleTypes.FIT))
//        imageList.add(SlideModel(R.drawable.banner5, ScaleTypes.FIT))
//
//        val imageSlider = binding.imageSlider
//        imageSlider.setImageList(imageList)
//
//        binding.cardview4.setOnClickListener {
//            val intent = Intent(requireContext(), TablesHomeActivity::class.java)
//            context?.startActivity(intent)
//
//
//
//
//        }
    }



}