package com.example.river;

import android.app.FragmentManager;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback{

    private FragmentManager fragmentManager;
    private MapFragment mapFragment;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getFragmentManager();
        mapFragment =(MapFragment)fragmentManager.findFragmentById(R.id.googleMap);
        mapFragment.getMapAsync(this);



    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        LatLng han1 = new LatLng(37.525969, 127.017473);
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.title("잠원 자전거 대여점");
        markerOptions.snippet("전화번호: 02-488-8366");
        markerOptions.position(han1);
        googleMap.addMarker(markerOptions);

        LatLng han2 = new LatLng(37.530021, 126.928495);
        markerOptions.title("마포 한강공원 자전거 대여소");
        markerOptions.snippet("전화번호 : 없음");
        markerOptions.position(han2);
        googleMap.addMarker(markerOptions);

        LatLng han3 = new LatLng(37.512393059717134, 127.0017107341448);
        markerOptions.title("반포 자전거 대여점");
        markerOptions.snippet("전화번호: 02-488-8366");
        markerOptions.position(han3);
        googleMap.addMarker(markerOptions);

        LatLng han4 = new LatLng(37.524738882219246, 126.93583859034192);
        markerOptions.title("여의도 자전거 대여소");
        markerOptions.snippet("전화번호: 02-488-8366");
        markerOptions.position(han4);
        googleMap.addMarker(markerOptions);

        LatLng han5 = new LatLng(37.55144533801179, 127.04111661647721);
        markerOptions.title("페달세상");
        markerOptions.snippet("전화번호: 02-42205-1110");
        markerOptions.position(han5);
        googleMap.addMarker(markerOptions);

        LatLng han101 = new LatLng(37.519944, 126.978794);
        markerOptions.title("강촌아파트 앞 따릉이 대여소");
        markerOptions.snippet("전화번호: 1599-0120");
        markerOptions.position(han101);
        googleMap.addMarker(markerOptions);

        LatLng han102 = new LatLng(37.503356, 126.986579);
        markerOptions.title("반포본동 따릉이 대여소");
        markerOptions.snippet("전화번호: 1599-0120");
        markerOptions.position(han102);
        googleMap.addMarker(markerOptions);

        LatLng han103 = new LatLng(37.530653, 126.927575);
        markerOptions.title("동작역 따릉이 대여소");
        markerOptions.snippet("전화번호: 1599-0120");
        markerOptions.position(han103);
        googleMap.addMarker(markerOptions);

        LatLng han104 = new LatLng(37.510258, 126.963530);
        markerOptions.title("흑석역 무료 자전거 대여소");
        markerOptions.snippet("전화번호: 02-814-5885");
        markerOptions.position(han104);
        googleMap.addMarker(markerOptions);

        LatLng han105 = new LatLng(37.53043200240652, 126.92795263295426);
        markerOptions.title("여의도 한강공원 자전거 대여점");
        markerOptions.snippet("전화번호:없음");
        markerOptions.position(han105);
        googleMap.addMarker(markerOptions);

        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(han2, 12));

    }
}