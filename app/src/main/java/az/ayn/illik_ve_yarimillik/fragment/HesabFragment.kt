package az.ayn.illik_ve_yarimillik.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import az.ayn.illik_ve_yarimillik.HesabFragmentDirections
import az.ayn.illik_ve_yarimillik.databinding.FragmentHesabBinding
class HesabFragment : Fragment() {

private lateinit var binding : FragmentHesabBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {

        binding = FragmentHesabBinding.inflate(layoutInflater,container,false)
        return binding.root

           }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.geriHesab.setOnClickListener{
            val action = HesabFragmentDirections.actionHesabFragmenttoYarimillikFragment()
            Navigation.findNavController(it).navigate(action)
        }





    }

    companion object {

        @JvmStatic
        fun newInstance() = HesabFragment()
                }
            }
