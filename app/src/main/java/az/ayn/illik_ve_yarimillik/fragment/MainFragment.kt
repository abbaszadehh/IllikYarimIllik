package az.ayn.illik_ve_yarimillik.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import az.ayn.illik_ve_yarimillik.MainFragmentDirections
import az.ayn.illik_ve_yarimillik.databinding.FragmentMainBinding

class MainFragment : Fragment() {


    private lateinit var binding : FragmentMainBinding

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View {

        binding = FragmentMainBinding.inflate(layoutInflater,container,false)
        return binding.root

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

       binding.yarimil.setOnClickListener {
           val action = MainFragmentDirections.actionMainFragmentDirectionstoYarimillikFragment()
           Navigation.findNavController(it).navigate(action)
       }

       binding.tvIllik.setOnClickListener{
           val action = MainFragmentDirections.actionFragmentDirectionstoIllikFragment()
           Navigation.findNavController(it).navigate(action)
       }

    }

    companion object {

        @JvmStatic
        fun newInstance() =  MainFragment().apply {

                    }
                }
    }
