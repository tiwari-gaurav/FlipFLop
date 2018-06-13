package com.flipimage;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;

public class utils {
    private static ProgressDialog dialog;
    public static void showProgressDialog(Context context) {

        if (!((Activity) context).isFinishing()) {
            dialog = new ProgressDialog(context, ProgressDialog.THEME_HOLO_LIGHT);
            dialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            dialog.setMessage("Please wait...");
            dialog.setIndeterminate(true);
            dialog.setCanceledOnTouchOutside(false);
            dialog.setCancelable(false);
            dialog.show();
        }
    }

    public static void hideProgressDialog() {

        try {

            if (dialog != null && dialog.isShowing()) {

                dialog.dismiss();

            }

        } catch (IllegalArgumentException ex) {
            ex.printStackTrace();
        }

    }

}
