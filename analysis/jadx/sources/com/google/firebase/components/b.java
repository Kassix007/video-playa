package com.google.firebase.components;

import com.google.firebase.FirebaseApp;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallations;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Provider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11731b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ b(int i, Object obj) {
        this.f11730a = i;
        this.f11731b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        switch (this.f11730a) {
            case 0:
                return ComponentDiscovery.instantiate((String) this.f11731b);
            default:
                return FirebaseInstallations.lambda$new$0((FirebaseApp) this.f11731b);
        }
    }
}
