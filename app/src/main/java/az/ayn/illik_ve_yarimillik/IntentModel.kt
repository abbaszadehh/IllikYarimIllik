package az.ayn.illik_ve_yarimillik

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class IntentModel(
    var ksq:Int,
    var isBsq: Boolean
) : Parcelable
