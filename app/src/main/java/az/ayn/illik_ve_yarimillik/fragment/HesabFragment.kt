package az.ayn.illik_ve_yarimillik.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import az.ayn.illik_ve_yarimillik.databinding.FragmentHesabBinding
class HesabFragment() : Fragment() {

    private lateinit var binding : FragmentHesabBinding
    var gelenKsqSayi : Int? = null
    var ksqBali : Int? = null
    var ksq1 : Int? = null
    var ksq2 : Int? = null
    var ksq3 : Int? = null
    var ksq4 : Int? = null
    var ksq5 : Int? = null
    var ksq6 : Int? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {

        binding = FragmentHesabBinding.inflate(layoutInflater,container,false)
        return binding.root


        ksq1 = binding.ksq1.text.toString().toInt()
        ksq2 = binding.ksq2.text.toString().toInt()
        ksq3 = binding.ksq3.text.toString().toInt()
        ksq4 = binding.ksq4.text.toString().toInt()
        ksq5 = binding.ksq5.text.toString().toInt()
        ksq6 = binding.ksq6.text.toString().toInt()

           }

        fun ksqsay3(): Int{
            return (ksq1!! + ksq2!! + ksq3!!)/3
        }

         fun ksq4(): Int{
             return (ksq1!! + ksq2!! + ksq3!! + ksq4!!)/4
         }

    fun ksq5(): Int{
        return (ksq1!! + ksq2!! + ksq3!! + ksq4!!+ ksq5!!)/5
    }
    fun ksq6(): Int{
        return (ksq1!! + ksq2!! + ksq3!! + ksq4!!+ ksq5!!+ ksq6!!)/6

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        arguments?.let {
         gelenKsqSayi = HesabFragmentArgs.fromBundle(it).ksqSayi
            binding.enterKsq.text = "KSQ sayı: $gelenKsqSayi"

                    }

            if(gelenKsqSayi==3){
                binding.ksq4.visibility = View.INVISIBLE
                binding.ksq5.visibility = View.INVISIBLE
                binding.ksq6.visibility = View.INVISIBLE

                ksqBali = ksqsay3()
            }

            else if(gelenKsqSayi ==4){

                binding.ksq5.visibility = View.INVISIBLE
                binding.ksq6.visibility = View.INVISIBLE

                ksqBali = ksq4()
            }
        else if (gelenKsqSayi==5){
                binding.ksq6.visibility = View.INVISIBLE
                ksqBali = ksq5()
            }
        else{
                ksqBali = ksq6()
            }

        binding.geriHesab.setOnClickListener{
            val action = HesabFragmentDirections.actionHesabFragmentToYarimillikFragment()
            Navigation.findNavController(it).navigate(action)

            }
    }

    companion object {

        @JvmStatic
        fun newInstance() = HesabFragment()
                }
            }
