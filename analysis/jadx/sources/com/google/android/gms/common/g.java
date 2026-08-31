package com.google.android.gms.common;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public class g extends Exception {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Illegal instructions before constructor call */
    public g(Status status) {
        int i = status.f10312q;
        String str = status.f10313r;
        super(i + ": " + (str == null ? "" : str));
    }
}
