package developer.harry.com.stromy.ui;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;

import developer.harry.com.stromy.R;

/**
 * Created by harsimran.s on 9/5/2015.
 */
public class AlertDialogFragment extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context context = getActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("Oops not downloaded")
                .setMessage(context.getString(R.string.error_msg))
                .setPositiveButton(context.getString(R.string.positive_button), null);
        AlertDialog dialog = builder.create();
        return dialog;
    }
}
