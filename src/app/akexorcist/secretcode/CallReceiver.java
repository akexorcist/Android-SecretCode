package app.akexorcist.secretcode;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;

public class CallReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
    	String action = intent.getAction();
        if(action.equals("android.provider.Telephony.SECRET_CODE")) {
        	PackageManager pm =context.getPackageManager(); 
        	Intent i = pm.getLaunchIntentForPackage(context.getPackageName());
            context.startActivity(i);
            
            /*
        	Intent i = new Intent(context, ActivityName.class);
            i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(i);
            */
        }
     }
}
