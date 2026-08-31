package com.google.android.gms.common;

import J1.DialogInterfaceOnCancelListenerC0181m;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import x3.AbstractC1887A;

/* JADX INFO: loaded from: classes.dex */
public class j extends DialogInterfaceOnCancelListenerC0181m {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public AlertDialog f10347A0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public Dialog f10348y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public DialogInterface.OnCancelListener f10349z0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // J1.DialogInterfaceOnCancelListenerC0181m
    public final Dialog G() {
        Dialog dialog = this.f10348y0;
        if (dialog != null) {
            return dialog;
        }
        this.f2663p0 = false;
        if (this.f10347A0 == null) {
            Context contextI = i();
            AbstractC1887A.g(contextI);
            this.f10347A0 = new AlertDialog.Builder(contextI).create();
        }
        return this.f10347A0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // J1.DialogInterfaceOnCancelListenerC0181m, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f10349z0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
