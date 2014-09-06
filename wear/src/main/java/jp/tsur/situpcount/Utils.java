package jp.tsur.situpcount;

import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.support.wearable.activity.ConfirmationActivity;

public class Utils {

    private static final int DEFAULT_VIBRATION_DURATION_MS = 200;

    public static void vibrate(Context context) {
        Vibrator v = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
        v.vibrate(DEFAULT_VIBRATION_DURATION_MS);
    }

    public static void startConfirmationActivity(Context context, int animationType, String message) {
        Intent confirmationActivity = new Intent(context, ConfirmationActivity.class)
                .setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_NO_ANIMATION)
                .putExtra(ConfirmationActivity.EXTRA_ANIMATION_TYPE, animationType)
                .putExtra(ConfirmationActivity.EXTRA_MESSAGE, message);
        context.startActivity(confirmationActivity);
    }
}
