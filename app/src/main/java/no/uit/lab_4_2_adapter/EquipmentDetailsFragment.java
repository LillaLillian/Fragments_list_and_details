package no.uit.lab_4_2_adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class EquipmentDetailsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.detalj_fragment, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    public void displayDetails (Equipment equipment) {
        TextView tvType = getActivity().findViewById(R.id.tvType);
        TextView tvManufacturer = getActivity().findViewById(R.id.tvManufacturer);
        TextView tvModel = getActivity().findViewById(R.id.tvModel);
        TextView tvBoughtOn = getActivity().findViewById(R.id.tvBoughtOn);
        TextView tvOnLoan = getActivity().findViewById(R.id.tvOnLoan);
        TextView tvLoanedTo = getActivity().findViewById(R.id.tvLoanedTo);
        ImageView ivImage = getActivity().findViewById(R.id.imageView);

        tvType.setText(equipment.getType());
        tvManufacturer.setText(equipment.getManufacturer());
        tvModel.setText(equipment.getModel());
        tvBoughtOn.setText(equipment.getBoughtOn());
        tvOnLoan.setText(equipment.isOnLoan()? "Yes" : "No");
        tvLoanedTo.setText(equipment.isOnLoan()? equipment.getLoanedTo() : "No one");
        ivImage.setImageResource(equipment.getImageRef());
    }

}
