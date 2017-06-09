package henry.code.databindingsample;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import henry.code.databindingsample.databinding.ActivityMainBinding;

public class MainActivity extends Activity {

    ActivityMainBinding myBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        myBinding.myTextView.setText("Yeah, I can bind my view directly");
    }
}



