package no.uit.lab_4_2_adapter;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements EquipmentListFragment.OnEquipmentListSelectedListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        if (fragment instanceof EquipmentListFragment) {
            EquipmentListFragment equipmentListFragment = (EquipmentListFragment) fragment;
            equipmentListFragment.setOnEquipmentListSelectedListener(this);
        }
    }

    @Override
    public void onEquipmentSelected(Equipment equipment) {
        EquipmentDetailsFragment detailsFragment = (EquipmentDetailsFragment) getSupportFragmentManager().findFragmentById(R.id.detail_fragment);
        detailsFragment.displayDetails(equipment);
    }
}
