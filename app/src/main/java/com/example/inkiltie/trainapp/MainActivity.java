package com.example.inkiltie.trainapp;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;
import java.io.IOException;
import com.google.maps.android.data.kml.KmlLayer;
import org.xmlpull.v1.XmlPullParserException;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {

    String from;
    String to;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Spinner fromRes = (Spinner)findViewById(R.id.from);
        final Spinner toRes = (Spinner)findViewById(R.id.to);
        LinearLayout button = (LinearLayout)findViewById(R.id.button);

        final SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                from = fromRes.getSelectedItem().toString();
                to = toRes.getSelectedItem().toString();

                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString("From", from);
                editor.putString("To", to);
                editor.commit();

                if(from == to) {
                    Toast toast = Toast.makeText(getApplicationContext(), "Please, pick different directions", Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.TOP|Gravity.CENTER_HORIZONTAL, 0, 670);
                    toast.show();
                }
                else {
                    startActivity(new Intent(MainActivity.this,Result.class));
                }
            }
        });

        SupportMapFragment mapFragment = (SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap map) {
        LatLng vancouver = new LatLng(49.2250, -122.9920);
        map.moveCamera(CameraUpdateFactory.newLatLng(vancouver));
        map.setMinZoomPreference(10.0f);
        map.getUiSettings().setZoomControlsEnabled(true);

        try {
            KmlLayer kmlLayer = new KmlLayer(map, R.raw.stations, getApplicationContext());
            kmlLayer.addLayerToMap();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        catch (XmlPullParserException e) {
            e.printStackTrace();
        }
    }
}