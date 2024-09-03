package com.example.lab3;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFind(View view){
        TextView descript =  findViewById(R.id.description);
        Spinner item =  findViewById(R.id.item);
        String selectedRanking = String.valueOf(item.getSelectedItem());
        String description="";
        switch (selectedRanking) {
            case "Batsman":
                description = "Selected ranking: Batsman\n\nTop 10 ODI Batsmen:\n1. Babar Azam\n2. Shubman Gill\n3. Virat Kohli\n4. Rohit Sharma\n5. Daryl Mitchell\n6. David Warner\n7. Harry Tector\n8. Dawid Malan\n9. Rassie van der Dussen\n10. Heinrich Klaasen\n\nDescription: Batsmen are crucial in setting up a strong total or chasing down a target. They are known for their technique, consistency, and ability to score runs under pressure.";
                break;
            case "Bowler":
                description = "Selected ranking: Bowler\n\nTop 10 ODI Bowlers:\n1. Keshav Maharaj\n2. Josh Hazlewood\n3. Adam Zampa\n4. Kuldeep Yadav\n5. Bernard Scholtz\n6. Mohammad Nabi\n7. Shaheen Afridi\n8. Jasprit Bumrah\n9. Trent Boult\n10. Mohammed Siraj\n\nDescription: Bowlers play a key role in restricting the opposition's score and taking wickets. They are known for their accuracy, speed, and ability to deliver under pressure.";
                break;
            case "All-Rounder":
                description = "Selected ranking: All-Rounder\n\nTop 10 ODI All-Rounders:\n1. Mohammad Nabi\n2. Shakib Al Hasan\n3. Sikandar Raza\n4. Assad Vala\n5. Rashid Khan\n6. Gerhard Erasmus\n7. Glenn Maxwell\n8. Mitchell Santner\n9. Mehidy Hasan\n10. Zeeshan Maqsood\n\nDescription: All-Rounders are versatile players who contribute with both bat and ball. They are valuable assets to any team, providing balance and flexibility.";
                break;
        }
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(SecondActivity.EXTRA_MESSAGE, description);
        startActivity(intent);
    }
}
