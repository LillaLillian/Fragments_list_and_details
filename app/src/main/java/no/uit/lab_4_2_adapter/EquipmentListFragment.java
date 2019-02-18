package no.uit.lab_4_2_adapter;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class EquipmentListFragment extends ListFragment {
    private OnEquipmentListSelectedListener mCallback;
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
    private ArrayList<Equipment> equipmentList = new ArrayList<>();

    public void setOnEquipmentListSelectedListener(Activity activity){  // Sjekker at activity implementerer interfacet
        mCallback = (OnEquipmentListSelectedListener) activity;
    }

    public interface OnEquipmentListSelectedListener{
        void onEquipmentSelected(Equipment equipment);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        EquipmentAdapter adapter = new EquipmentAdapter(getActivity(), R.layout.equipment_view_layout, equipmentList);
        setListAdapter(adapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        mCallback.onEquipmentSelected(equipmentList.get(position));
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        equipmentList.add(new Equipment("Smart watch", "Huawei", "Smart watch 2", simpleDateFormat.format(Calendar.getInstance().getTime())));
        equipmentList.add(new Equipment("Laptop", "Huawei", "MateBook", simpleDateFormat.format(Calendar.getInstance().getTime())));
        equipmentList.add(new Equipment("Tablet", "Apple", "iPad Pro", simpleDateFormat.format(Calendar.getInstance().getTime())));
        equipmentList.add(new Equipment("Smart watch", "Huawei", "Smart watch 2", simpleDateFormat.format(Calendar.getInstance().getTime())));
        equipmentList.add(new Equipment("Laptop", "Huawei", "MateBook", simpleDateFormat.format(Calendar.getInstance().getTime())));
        equipmentList.add(new Equipment("Tablet", "Apple", "iPad Pro", simpleDateFormat.format(Calendar.getInstance().getTime())));
        equipmentList.add(new Equipment("Smart watch", "Huawei", "Smart watch 2", simpleDateFormat.format(Calendar.getInstance().getTime())));
        equipmentList.add(new Equipment("Laptop", "Huawei", "MateBook", simpleDateFormat.format(Calendar.getInstance().getTime())));
        equipmentList.add(new Equipment("Tablet", "Apple", "iPad Pro", simpleDateFormat.format(Calendar.getInstance().getTime())));
        equipmentList.add(new Equipment("Smart watch", "Huawei", "Smart watch 2", simpleDateFormat.format(Calendar.getInstance().getTime())));
        equipmentList.add(new Equipment("Laptop", "Huawei", "MateBook", simpleDateFormat.format(Calendar.getInstance().getTime())));
        equipmentList.add(new Equipment("Tablet", "Apple", "iPad Pro", simpleDateFormat.format(Calendar.getInstance().getTime())));
        super.onCreate(savedInstanceState);
    }
}
