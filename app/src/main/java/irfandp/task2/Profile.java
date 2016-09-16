package irfandp.task2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Profile extends BaseActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        Button btn_frag_two = (Button)findViewById(R.id.btn_frag_two);
//        final EditText name_obj = (EditText)findViewById(R.id.txt_name);
//        final EditText email_obj = (EditText)findViewById(R.id.txt_email);
//
//        btn_frag_two.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Fragment fragment = new FragmentTwo();
//
//                FragmentManager fm = getSupportFragmentManager();
//
//                FragmentTransaction ft = fm.beginTransaction();
//
//                Bundle bundle = new Bundle();
//
//                bundle.putString("name", String.valueOf(name_obj.getText()));
//
//                bundle.putString("email", String.valueOf(email_obj.getText()));
//
//                fragment.setArguments(bundle);
//
//                ft.replace(R.id.fragment_place, fragment);
//
//                ft.commit();
//            }
//        });




    }

    @Override
    protected int setLayoutResourceIdentifier() {
        return R.layout.activity_profile;
    }




}
