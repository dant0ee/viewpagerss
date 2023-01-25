package com.example.myapplication

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.firebase.auth.EmailAuthProvider
import com.google.firebase.auth.FirebaseAuth

class ResetPassword :Fragment(R.layout.fragment_profilis) {


    private lateinit var Login : TextView
    private lateinit var curentpass : EditText
    private lateinit var newpass: EditText
    private lateinit var resetpass: Button



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view=inflater.inflate(R.layout.fragment_profilis,container,false)

        val preferences = activity?.getSharedPreferences("informacia", Context.MODE_PRIVATE)
        val editor = preferences?.edit()
        Login=view.findViewById(R.id.Login)
        curentpass=view.findViewById(R.id.paroli)
        newpass=view.findViewById(R.id.gaimeore_paroli)
        resetpass=view.findViewById(R.id.button2)


        Login.setOnClickListener {
            val fragment1 =LoginFragment()
            val transaction = fragmentManager?.beginTransaction()
            FirebaseAuth.getInstance().signOut()
            editor?.clear()
            transaction?.replace(R.id.mainContainer, fragment1)
            transaction?.commit()

        }
        resetpass.setOnClickListener {
            val curpass = curentpass.text.toString()
            val nwpass = newpass.text.toString()
            if (curpass.isNotEmpty() && nwpass.isNotEmpty()) {
                val user = FirebaseAuth.getInstance().currentUser
                val credential = EmailAuthProvider.getCredential(user?.email!!, curpass)
                user.reauthenticateAndRetrieveData(credential)
                    .addOnCompleteListener { task ->
                        if (task.isSuccessful) {
                            if (nwpass.length >= 6) {
                                user?.updatePassword(nwpass)
                                    ?.addOnCompleteListener { task ->
                                        if (task.isSuccessful) {
                                            editor?.remove("password")
                                            editor?.putString("password", nwpass)
                                            editor?.apply()
                                            Toast.makeText(
                                                this.requireContext(),
                                                "paroli sheicvala",
                                                Toast.LENGTH_SHORT
                                            ).show()

                                        } else {
                                            Toast.makeText(
                                                this.requireContext(),
                                                "error",
                                                Toast.LENGTH_SHORT
                                            ).show()
                                        }
                                    }
                            }
                        }else {
                            Toast.makeText(context, "old password is not correct", Toast.LENGTH_SHORT).show()
                            curentpass.setText("")



                        }

                    }


            }
            
        } 
        return view

       

    }
}