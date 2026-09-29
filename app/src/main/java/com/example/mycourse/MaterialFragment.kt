package com.example.mycourse

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import com.example.mycourse.databinding.FragmentMaterialBinding

class MaterialFragment : Fragment() {
    private var _binding: FragmentMaterialBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMaterialBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val materials = resources.getStringArray(R.array.material_list)
        binding.listMaterial.adapter = ArrayAdapter(
            requireContext(),
            android.R.layout.simple_list_item_1,
            materials
        )
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
