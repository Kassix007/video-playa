package com.google.android.gms.common;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import x3.AbstractC1887A;

/* JADX INFO: loaded from: classes.dex */
public class c extends DialogFragment {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Dialog f10326q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public DialogInterface.OnCancelListener f10327r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public AlertDialog f10328s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f10327r;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f10326q;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f10328s == null) {
            Activity activity = getActivity();
            AbstractC1887A.g(activity);
            this.f10328s = new AlertDialog.Builder(activity).create();
        }
        return this.f10328s;
    }
}
