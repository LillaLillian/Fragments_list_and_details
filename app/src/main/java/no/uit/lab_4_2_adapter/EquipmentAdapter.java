package no.uit.lab_4_2_adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class EquipmentAdapter extends ArrayAdapter<Equipment> {
    private int layoutResource;

    public EquipmentAdapter(Context context, int layoutResource, List<Equipment> items) {
        super(context, layoutResource, items);
        this.layoutResource = layoutResource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return getEquipmentView(position, convertView, parent);
    }

    private View getEquipmentView(int position, View convertView, ViewGroup parent) {

        Equipment equipment = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(this.layoutResource, parent, false);
        }

        TextView tvType = (TextView) convertView.findViewById(R.id.tvListType);
        TextView tvModel = (TextView) convertView.findViewById(R.id.tvListModel);
        TextView tvManufacturer = (TextView) convertView.findViewById(R.id.tvListManufacturer);

        tvType.setText(equipment.getType());
        tvModel.setText(equipment.getModel());
        tvManufacturer.setText(equipment.getManufacturer());

        return convertView;
    }
}
