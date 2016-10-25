package cl.adachersoft.aboutcris;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        TextView linkeding = (TextView) findViewById(R.id.LinkedingTv);
        linkeding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent linkedinIntent = new Intent(Intent.ACTION_VIEW);
                linkedinIntent.setData(Uri.parse("https://www.linkedin.com/in/cristianvidallopez?trk=hp-identity-name"));
                startActivity(linkedinIntent);

            }
        });

        TextView phone = (TextView) findViewById(R.id.phoneTV);
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:+56 9 88031299"));
                startActivity(callIntent);
            }
        });
    }
}
