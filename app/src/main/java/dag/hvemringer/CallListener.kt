package dag.hvemringer

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.telephony.TelephonyManager
import android.util.Log


class CallListener : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        Log.i("onR","${intent.action}")
        val stateStr = intent.extras?.getString(TelephonyManager.EXTRA_STATE)
        val number =  intent.extras?.getString(TelephonyManager.EXTRA_INCOMING_NUMBER)
        Log.i("onR","St=$stateStr Tlf=$number")
    }
}