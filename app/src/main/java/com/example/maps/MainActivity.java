package com.example.maps;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.MediaController;
import android.widget.VideoView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback, GoogleMap.OnMapClickListener, GoogleMap.OnMapLongClickListener {

    EditText txtLatitud, txtLongitud;

    GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtLatitud = findViewById(R.id.txt_Latitud);
        txtLongitud = findViewById(R.id.txt_Longitud);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.gps);
        mapFragment.getMapAsync(this);

        VideoView video = findViewById(R.id.VideoView);
        String videdo = "android.resource://"+getPackageName()+"/"+R.raw.video;
        Uri uri = Uri.parse(videdo);
        video.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        video.setMediaController(mediaController);
        mediaController.setAnchorView(video);

    }

    @Override
    public void onMapClick(@NonNull LatLng latLng) {
        txtLatitud.setText(""+latLng.latitude);
        txtLongitud.setText(""+latLng.longitude);
    }

    @Override
    public void onMapLongClick(@NonNull LatLng latLng) {
        txtLatitud.setText(""+latLng.latitude);
        txtLongitud.setText(""+latLng.longitude);
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        mMap = googleMap;
        this.mMap.setOnMapClickListener(this);
        this.mMap.setOnMapLongClickListener(this);

        LatLng Arica = new LatLng(-18.4820978,-70.3153989);
        mMap.addMarker(new MarkerOptions().position(Arica).title("Universidad Santo Tomás, Arica"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Arica));

        LatLng Iquique = new LatLng(-20.2270304,-70.1660082);
        mMap.addMarker(new MarkerOptions().position(Iquique).title("Universidad Santo Tomás, Iquique"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Iquique));

        LatLng Concepcion = new LatLng(-36.826338,-73.0842844);
        mMap.addMarker(new MarkerOptions().position(Concepcion).title("Universidad Santo Tomás, Concepción"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Concepcion));

        LatLng Antofagasta = new LatLng(-23.6378373,-70.4020518);
        mMap.addMarker(new MarkerOptions().position(Antofagasta).title("Universidad Santo Tomás, Antofagasta"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Antofagasta));

        LatLng LaSerena = new LatLng(-29.895747,-71.2748066);
        mMap.addMarker(new MarkerOptions().position(LaSerena).title("Universidad Santo Tomás, La Serena"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(LaSerena));

        LatLng ViñaDelMar = new LatLng(-33.0367507,-71.5254358);
        mMap.addMarker(new MarkerOptions().position(ViñaDelMar).title("Universidad Santo Tomás, Viña Del Mar"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ViñaDelMar));

        LatLng Santiago = new LatLng(-33.4487848,-70.6615744);
        mMap.addMarker(new MarkerOptions().position(Santiago).title("Universidad Santo Tomás, Santiago"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Santiago));

        LatLng Talca = new LatLng(-35.4290572,-71.6740181);
        mMap.addMarker(new MarkerOptions().position(Talca).title("Universidad Santo Tomás, Talca"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Talca));

        LatLng LosAngeles = new LatLng(-37.4720562,-72.3566685);
        mMap.addMarker(new MarkerOptions().position(LosAngeles).title("Universidad Santo Tomás, Los Angeles"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(LosAngeles));

        LatLng Temuco = new LatLng(-38.7352255,-72.6100049);
        mMap.addMarker(new MarkerOptions().position(Temuco).title("Universidad Santo Tomás, Temuco"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Temuco));

        LatLng Valdivia = new LatLng(-39.8247848,-73.2410312);
        mMap.addMarker(new MarkerOptions().position(Valdivia).title("Universidad Santo Tomás, Valdivia"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Valdivia));

        LatLng Osorno = new LatLng(-40.5723428,-73.1419977);
        mMap.addMarker(new MarkerOptions().position(Osorno).title("Universidad Santo Tomás, Osorno"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Osorno));

        LatLng PuertoMontt = new LatLng(-41.4835017,-72.9460439);
        mMap.addMarker(new MarkerOptions().position(PuertoMontt).title("Universidad Santo Tomás, Puerto Montt"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(PuertoMontt));




    }
}