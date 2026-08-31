package com.google.firebase;

import android.content.Context;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.inject.Provider;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Provider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11724a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f11725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11726c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ a(Context context, String str) {
        this.f11725b = context;
        this.f11726c = str;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.google.firebase.FirebaseApp.b(com.google.firebase.FirebaseApp, android.content.Context):com.google.firebase.internal.DataCollectionConfigStorage */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        switch (this.f11724a) {
            case 0:
                return ((FirebaseApp) this.f11726c).lambda$new$0(this.f11725b);
            default:
                return DefaultHeartBeatController.lambda$new$2(this.f11725b, (String) this.f11726c);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ a(FirebaseApp firebaseApp, Context context) {
        this.f11726c = firebaseApp;
        this.f11725b = context;
    }
}
