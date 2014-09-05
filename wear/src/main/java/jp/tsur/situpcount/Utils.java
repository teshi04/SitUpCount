package jp.tsur.situpcount;

import android.content.Context;
import android.os.Vibrator;

public class Utils {

    private static final int DEFAULT_VIBRATION_DURATION_MS = 200;

    public static void vibrate(Context context) {
        Vibrator v = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
        v.vibrate(DEFAULT_VIBRATION_DURATION_MS);
    }
}
