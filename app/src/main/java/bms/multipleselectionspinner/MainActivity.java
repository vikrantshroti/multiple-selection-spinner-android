package bms.multipleselectionspinner;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //MultipleSelection spinner object
    MultipleSelectionSpinner mSpinner;

    //List which hold multiple selection spinner values
    List<String> list = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //casting of spinner
        mSpinner = findViewById(R.id.mSpinner);

        //adding items to list
        list.add("Violet");
        list.add("Indigo");
        list.add("Brown");
        list.add("Green");
        list.add("Yellow");
        list.add("Orange");
        list.add("Red");

        //set items to spinner from list
        mSpinner.setItems(list);

        //onClick listener of button for showing multiple selection spinner values
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Selected : " + mSpinner.getSelectedItemsAsString() , Toast.LENGTH_SHORT).show();
            }
        });
    }
}
