package warrenhong.entrepreneurquotes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView changingView;
    ArrayList<String> array;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        changingView = (TextView) findViewById(R.id.changingText);
        Button motivation = (Button) findViewById(R.id.motivation);

        array = new ArrayList<>();
        array.add("”It’s not about ideas. It’s about making ideas happen.”");
        array.add("“Always deliver more than expected.”");
        array.add("“Risk more than others think is safe. Dream more than others think is practical.”");
        array.add("Your most unhappy customers are your greatest source of learning");
        array.add("“If you’re not embarrassed by the first version of your product, you’ve launched too late.”");
        array.add("“I’m not afraid of dying, I’m afraid of not trying.”");
        array.add("“Do not be embarrassed by your failures, learn from them and start again.”");
        array.add("“The way to get started is to quit talking and begin doing.”");
        array.add("When everything seems to be going against you, " +
                "remember that the airplane takes off against the wind, not with it.");
        array.add("Failure is just a resting place. It is an opportunity to begin again more intelligently.");

        motivation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int index = (int) Math.floor(Math.random()*array.size());
                changingView.setText(array.get(index));
            }
        });
    }
}
