package com.google.firebase.tracing;

import android.os.Trace;

/* JADX INFO: loaded from: classes.dex */
public final class FirebaseTrace {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private FirebaseTrace() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void popTrace() {
        Trace.endSection();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void pushTrace(String str) {
        Trace.beginSection(str);
    }
}
