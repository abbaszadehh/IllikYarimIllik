package az.ayn.illik_ve_yarimillik.fragment

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import az.ayn.illik_ve_yarimillik.databinding.FragmentHesabBinding
import az.ayn.illik_ve_yarimillik.databinding.FragmentHesabBinding.inflate
import kotlin.properties.ReadOnlyProperty

class HesabFragment() : Fragment() {
    private lateinit var binding: FragmentHesabBinding
    private val args: HesabFragmentArgs by navArgs()

    private fun navArgs(): ReadOnlyProperty<HesabFragment, HesabFragmentArgs> {
        TODO("Not yet implemented")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val ksqSay = args.ksqBsq
        if (ksqSay.isBsq) {
            binding.bsqbal.visibility = View.VISIBLE
        }

        when (ksqSay.ksq) {
            3 -> {
                with(binding) {
                    ksq1.visibility = View.VISIBLE
                    ksq2.visibility = View.VISIBLE
                    ksq3.visibility = View.VISIBLE

                    with(binding) {
                        hesabla.setOnClickListener {
                            ksq1.text.toString().toInt()
                            ksq2.text.toString().toInt()
                            ksq3.text.toString().toInt()
                            balHesabla3()
                        }
                    }

                }
            }
            4 -> {
                with(binding) {
                    ksq1.visibility = View.VISIBLE
                    ksq2.visibility = View.VISIBLE
                    ksq3.visibility = View.VISIBLE
                    ksq4.visibility = View.VISIBLE

                    with(binding) {
                        hesabla.setOnClickListener {
                            ksq1.text.toString().toInt()
                            ksq2.text.toString().toInt()
                            ksq3.text.toString().toInt()
                            ksq4.text.toString().toInt()
                            balHesabla4()
                        }
                    }
                }
            }
            5 -> {
                with(binding) {
                    ksq1.visibility = View.VISIBLE
                    ksq2.visibility = View.VISIBLE
                    ksq3.visibility = View.VISIBLE
                    ksq4.visibility = View.VISIBLE
                    ksq5.visibility = View.VISIBLE

                    with(binding) {
                        hesabla.setOnClickListener {
                            ksq1.text.toString().toInt()
                            ksq2.text.toString().toInt()
                            ksq3.text.toString().toInt()
                            ksq4.text.toString().toInt()
                            ksq5.text.toString().toInt()
                            balHesabla5()
                        }
                    }
                }
            }
            6 -> {
                with(binding) {
                    ksq1.visibility = View.VISIBLE
                    ksq2.visibility = View.VISIBLE
                    ksq3.visibility = View.VISIBLE
                    ksq4.visibility = View.VISIBLE
                    ksq5.visibility = View.VISIBLE
                    ksq6.visibility = View.VISIBLE

                    with(binding) {
                        hesabla.setOnClickListener {
                            ksq1.text.toString().toInt()
                            ksq2.text.toString().toInt()
                            ksq3.text.toString().toInt()
                            ksq4.text.toString().toInt()
                            ksq5.text.toString().toInt()
                            ksq6.text.toString().toInt()
                            balHesabla6()
                        }
                    }
                }
            }

            else -> {
                Toast.makeText(context, "Daxiletməni qaydalara uyğun edin!", Toast.LENGTH_LONG).show()
            }
        }

        binding.geriHesab.setOnClickListener {
            val action = HesabFragmentDirections.actionHesabFragmentToYarimillikFragment()
            Navigation.findNavController(it).navigate(action)
        }

        binding.sifirla.setOnClickListener {
            with(binding){
                ksq1.text = null
                ksq2.text = null
                ksq3.text = null
                ksq4.text = null
                ksq5.text = null
                ksq6.text = null
               illikBal.text = "bal"
               illikQiymet.text = "qiymət"
            }
        }
    }
    fun ksqBaliHesabla(say: Int, cem:Int, bsq: Boolean) {
        if(bsq) {

            val bsqDeyer = binding.bsqbal.text.toString().trim().toInt()
            val netice = (bsqDeyer*0.6) + (cem/say)*0.4
            binding.illikBal.text = netice.toString()
        }
        else {
            binding.illikBal.text = (cem/say).toString()
        }

    }

    private fun balHesabla3() {
        with(binding) {
            val ksq1Edit = ksq1.text.toString().toInt()
            val ksq2Edit = ksq2.text.toString().toInt()
            val ksq3Edit = ksq3.text.toString().toInt()

            val cemi = ksq1Edit + ksq2Edit + ksq3Edit
            ksqBaliHesabla(3, cemi,args.ksqBsq.isBsq)

        }
    }

    private fun balHesabla4() {
        with(binding) {
            val ksq1Edit = ksq1.text.toString().toInt()
            val ksq2Edit = ksq2.text.toString().toInt()
            val ksq3Edit = ksq3.text.toString().toInt()
            val ksq4Edit = ksq4.text.toString().toInt()


            val cemi = ksq1Edit + ksq2Edit + ksq3Edit + ksq4Edit
            ksqBaliHesabla(4, cemi,args.ksqBsq.isBsq)

        }
    }

    private fun balHesabla5() {
        with(binding) {
            val ksq1Edit = ksq1.text.toString().toInt()
            val ksq2Edit = ksq2.text.toString().toInt()
            val ksq3Edit = ksq3.text.toString().toInt()
            val ksq4Edit = ksq4.text.toString().toInt()
            val ksq5Edit = ksq5.text.toString().toInt()

            val cemi = ksq1Edit + ksq2Edit + ksq3Edit + ksq4Edit + ksq5Edit
            ksqBaliHesabla(5, cemi,args.ksqBsq.isBsq)

        }
    }

    private fun balHesabla6() {
        with(binding) {
            val ksq1Edit = ksq1.text.toString().toInt()
            val ksq2Edit = ksq2.text.toString().toInt()
            val ksq3Edit = ksq3.text.toString().toInt()
            val ksq4Edit = ksq4.text.toString().toInt()
            val ksq5Edit = ksq5.text.toString().toInt()
            val ksq6Edit = ksq6.text.toString().toInt()


            val cemi = ksq1Edit + ksq2Edit + ksq3Edit + ksq4Edit + ksq5Edit + ksq6Edit
            ksqBaliHesabla(6, cemi,args.ksqBsq.isBsq)

        }
    }


}





