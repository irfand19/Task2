package irfandp.task2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by User on 9/16/2016.
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(setLayoutResourceIdentifier());

    }

    protected abstract int setLayoutResourceIdentifier();

}

