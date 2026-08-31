package com.google.firebase;

import com.google.android.gms.common.api.Status;
import v3.i;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseExceptionMapper implements i {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // v3.i
    public final Exception getException(Status status) {
        return status.f10312q == 8 ? new FirebaseException(status.W()) : new FirebaseApiNotAvailableException(status.W());
    }
}
