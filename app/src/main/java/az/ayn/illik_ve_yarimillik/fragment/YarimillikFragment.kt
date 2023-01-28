package az.ayn.illik_ve_yarimillik.fragment

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import az.ayn.illik_ve_yarimillik.YarimillikFragmentDirections
import az.ayn.illik_ve_yarimillik.databinding.FragmentYarimillikBinding


class YarimillikFragment : Fragment() {
    private lateinit var binding: FragmentYarimillikBinding
    var ksqSay : Int? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentYarimillikBinding.inflate(layoutInflater,container,false)
        return binding.root
    }
    

    @SuppressLint("SuspiciousIndentation")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.geriYarim.setOnClickListener{
            val action = YarimillikFragmentDirections.actionYarimillikFragmentDirectionstoMainFragment()
            Navigation.findNavController(it).navigate(action)
        }
        binding.ireli.setOnClickListener{

            val action = YarimillikFragmentDirections.actionYarimillikFragmentDirectionstoHesabFragment()
          Navigation.findNavController(it).navigate(action)

        }

    }

    companion object {

        @JvmStatic
        fun newInstance() = YarimillikFragment()
    }
}
