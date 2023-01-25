package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.firebase.auth.FirebaseAuth

class PassRecover : Fragment(R.layout.passwordrecover){
    private lateinit var editText: EditText
    private lateinit var login : TextView
    private lateinit var button: Button


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view= inflater.inflate(R.layout.passwordrecover,container,false)

        editText=view.findViewById(R.id.Emailrecover)
        button=view.findViewById(R.id.button4)
        login=view.findViewById(R.id.textView10)

        login.setOnClickListener {
            val fragment1 = LoginFragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.mainContainer, fragment1)
            transaction?.commit()
        }

        button.setOnClickListener {
            if (editText.text.isEmpty()){

            }else{
                FirebaseAuth.getInstance().sendPasswordResetEmail(editText.text.toString())
                    .addOnSuccessListener {
                        Toast.makeText(this.requireContext(), "Check E-mail", Toast.LENGTH_SHORT).show()
                    }
                    .addOnFailureListener{
                        Toast.makeText(this.requireContext(), "Enter the Email you signed up with ", Toast.LENGTH_SHORT).show()
                    }
            }
        }

        return view
    }

}




