package az.ayn.illik_ve_yarimillik.fragment

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import az.ayn.illik_ve_yarimillik.databinding.FragmentIllikBinding


class IllikFragment : Fragment() {

    private lateinit var binding: FragmentIllikBinding
    var param1 : Double? = null
    var param2 : Double? = null
    var resultBal : Double? = null
    var resultQiymet : Double? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentIllikBinding.inflate(layoutInflater,container,false)
        return binding.root

                }


    @SuppressLint("SuspiciousIndentation")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


       binding.geriIllik.setOnClickListener{
           val action = IllikFragmentDirections.actionIllikFragmentToMainFragment()
           Navigation.findNavController(it).navigate(action)
       }

        binding.hesabla.setOnClickListener {
            with(binding){
                
            }

                param1 = binding.firstTerm.text.toString().toDoubleOrNull()
                param2 = binding.secondTerm.text.toString().toDoubleOrNull()

            if( param1==null || param2==null ){

                Toast.makeText(context,"Lazımi yerləri doldurun!!",Toast.LENGTH_LONG).show()
                            }
            else

            {
              resultBal = (param1!! + param2!!)/2
              binding.bal.text = "Illik bal : $resultBal"

                if(resultBal!!<=30.09){
                    resultQiymet = 2.0

                }
                else if (resultBal!! >= 30 && resultBal!! <= 60.09 ){
                    resultQiymet = 3.0
                }

                else if (resultBal!! >= 60.1 && resultBal!! <= 80.09){
                    resultQiymet = 4.0
                }
                else {
                    resultQiymet = 5.0
                }

                binding.qiymet.text = "Illik qiymət : $resultQiymet"

                              }

            }

        binding.sifirla.setOnClickListener {

            with(binding){
                firstTerm.text = null
                secondTerm.text = null
                bal.text = "bal"
                qiymet.text = "qiymət"
            }


        }


        }



    companion object {

        @JvmStatic
        fun newInstance() = IllikFragment()

    }
}
