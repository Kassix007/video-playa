package com.google.firebase.installations;

import com.google.firebase.Firebase;
import com.google.firebase.FirebaseApp;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class InstallationsKt {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final FirebaseInstallations getInstallations(Firebase firebase) {
        m.e(firebase, "<this>");
        FirebaseInstallations firebaseInstallations = FirebaseInstallations.getInstance();
        m.d(firebaseInstallations, "getInstance()");
        return firebaseInstallations;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final FirebaseInstallations installations(Firebase firebase, FirebaseApp app) {
        m.e(firebase, "<this>");
        m.e(app, "app");
        FirebaseInstallations firebaseInstallations = FirebaseInstallations.getInstance(app);
        m.d(firebaseInstallations, "getInstance(app)");
        return firebaseInstallations;
    }
}
