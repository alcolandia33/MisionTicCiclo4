package com.example.apptienda

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.apptienda.databinding.InicioBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class InicioActivity : Fragment() {

    private var _binding: InicioBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = InicioBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.inicioRegistro.setOnClickListener {
           findNavController().navigate(R.id.action_inicioActivity_to_registroActivity2)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}