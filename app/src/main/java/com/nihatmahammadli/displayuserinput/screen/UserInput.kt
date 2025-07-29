    package com.nihatmahammadli.displayuserinput.screen

    import android.annotation.SuppressLint
    import android.os.Bundle
    import androidx.fragment.app.Fragment
    import android.view.LayoutInflater
    import android.view.View
    import android.view.ViewGroup
    import com.nihatmahammadli.displayuserinput.R
    import com.nihatmahammadli.displayuserinput.databinding.FragmentUserInputBinding

    class UserInput : Fragment() {
        private lateinit var binding: FragmentUserInputBinding
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)

        }

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            binding = FragmentUserInputBinding.inflate(inflater, container, false)
            return binding.root
        }

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)
            display()
        }


        @SuppressLint("SetTextI18n")
        fun display(){
            binding.displayBtn.setOnClickListener {
                val name = binding.inputTxt.text.toString().trim()
                binding.displayTxt.text = "Hello $name"
            }
        }

    }