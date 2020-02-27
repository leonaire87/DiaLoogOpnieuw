package be.ehb.dialoogopnieuw.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

public class FluDialogFrament extends DialogFragment {

    String [] flues = {" regular FLu", "Corona", "Spanish fly", "Sars"};
    private DialogInterface.OnClickListener itemSelectListener = new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            Toast.makeText(getActivity(), "you caught " + flues[which].toLowerCase() , Toast.LENGTH_SHORT ).show();
        }
    };

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        AlertDialog.Builder mijneBuilder =  new AlertDialog.Builder(getActivity());

        mijneBuilder.setTitle("Gotta catch'em all");
        mijneBuilder.setItems(flues,itemSelectListener);

        return mijneBuilder.create();
    }
}
