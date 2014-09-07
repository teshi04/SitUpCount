package jp.tsur.situpcount;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;


public class ResultActivity extends Activity {

    public static final String EXTRA_SITUP_COUNT = "situp_count";

    @InjectView(R.id.count_label)
    TextView mCountLabel;

    private String mSitupCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        ButterKnife.inject(this);

        mSitupCount = getIntent().getStringExtra(EXTRA_SITUP_COUNT);
        mCountLabel.setText(mSitupCount);
    }

    @OnClick(R.id.share_button)
    void share() {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, getString(R.string.text_result1) + mSitupCount + getString(R.string.text_result2));
        startActivity(intent);
    }
}
