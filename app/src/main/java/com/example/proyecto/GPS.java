package com.example.proyecto;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.proyecto.databinding.ActivityGpsBinding;

public class GPS extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityGpsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityGpsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera

        LatLng Santos = new LatLng(-36.601094, -72.106767);
        LatLng Lugares = new LatLng(-36.603367, -72.091297);
        LatLng Lugares1 = new LatLng(-36.604587, -72.083914);
        LatLng Lugares2 = new LatLng(-36.6119628,-72.07268723);

        mMap.addMarker(new MarkerOptions().position(Santos).title("Santo Tomas Chillán - Gamero"));
        mMap.addMarker(new MarkerOptions().position(Lugares).title("Heladeria y Cafeteria Cremossos"));
        mMap.addMarker(new MarkerOptions().position(Lugares1).title("Cecinas Ramos Cordillera"));
        mMap.addMarker(new MarkerOptions().position(Lugares2).title("Fernando Muñoz"));



        mMap.moveCamera(CameraUpdateFactory.newLatLng(Santos));
        mMap.setMinZoomPreference(16.0F);
        mMap.setMaxZoomPreference(20.0f);
    }
}