package bms.multipleselectionspinner;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    MultipleSelectionSpinner mSpinner;
    List<String> list = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSpinner = findViewById(R.id.mSpinner);

        list.add("Violet");
        list.add("Indigo");
        list.add("Brown");
        list.add("Green");
        list.add("Yellow");
        list.add("Orange");
        list.add("Red");

        mSpinner.setItems(list);

        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Selected : " + mSpinner.getSelectedItemsAsString() , Toast.LENGTH_SHORT).show();
            }
        });
    }
}
