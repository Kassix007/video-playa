package com.google.android.gms.internal.vision;

/* JADX INFO: loaded from: classes.dex */
public final class Y0 extends IllegalArgumentException {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Y0(int i, int i7) {
        StringBuilder sb = new StringBuilder(54);
        sb.append("Unpaired surrogate at index ");
        sb.append(i);
        sb.append(" of ");
        sb.append(i7);
        super(sb.toString());
    }
}
