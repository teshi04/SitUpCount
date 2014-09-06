package jp.tsur.situpcount;

import android.util.Log;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.wearable.MessageEvent;
import com.google.android.gms.wearable.Wearable;
import com.google.android.gms.wearable.WearableListenerService;

public class ListenerService extends WearableListenerService {

    public static final String PATH_SITUP_COUNT = "/situp_count";

    private GoogleApiClient mGoogleApiClient;

    @Override
    public void onCreate() {
        super.onCreate();
        mGoogleApiClient = new GoogleApiClient.Builder(this)
                .addApi(Wearable.API)
                .build();
        mGoogleApiClient.connect();
    }

    @Override
    public void onMessageReceived(MessageEvent event) {
        Log.d("aaa", "onMessageReceived");

        if (event.getPath().equals(PATH_SITUP_COUNT)) {
            byte[] data = event.getData();
            Log.d("aaa", new String(data));
        }
    }
}
