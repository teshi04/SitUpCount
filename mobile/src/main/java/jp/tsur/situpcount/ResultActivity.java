package jp.tsur.situpcount;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.InjectView;


public class ResultActivity extends Activity {

    public static final String EXTRA_SITUP_COUNT = "situp_count";

    @InjectView(R.id.count_label)
    TextView mCountLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        ButterKnife.inject(this);

        String situpCount = getIntent().getStringExtra(EXTRA_SITUP_COUNT);
        mCountLabel.setText(situpCount);
    }

}
