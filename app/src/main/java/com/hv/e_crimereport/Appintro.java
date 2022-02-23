package com.hv.e_crimereport;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;
import android.os.Bundle;

public class Appintro extends AppIntro {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       //    setContentView(R.layout.activity_appintro);
        getSupportActionBar().hide();
        addSlide(AppIntroFragment.newInstance("Welcome to e Crime Report App","Discover the app now",R.drawable.ecr_logo, ContextCompat.getColor(getApplicationContext(),R.color.colorPrimaryDark)));
        addSlide(AppIntroFragment.newInstance("SOS","Your Safety is our priority, Send SOS request in emergency cases by tapping on SOS icon on home page",R.drawable.sos_img, ContextCompat.getColor(getApplicationContext(),R.color.colorPrimaryDark)));
        addSlide(AppIntroFragment.newInstance("Crime Report","You can now report crimes with app ",R.drawable.crime2, ContextCompat.getColor(getApplicationContext(),R.color.colorPrimaryDark)));
        addSlide(AppIntroFragment.newInstance("Accident Report","Enter Plate number, Take pictures and leave, Your accident report will be sent via Email",R.drawable.accident2, ContextCompat.getColor(getApplicationContext(),R.color.colorPrimaryDark)));
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        startActivity(new Intent(getApplicationContext(),MainActivity.class));
    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        startActivity(new Intent(getApplicationContext(),MainActivity.class));

    }
}
