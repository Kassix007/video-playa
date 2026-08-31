package com.google.firebase.installations;

import S3.d;
import com.google.firebase.annotations.DeferredApi;
import com.google.firebase.installations.internal.FidListener;
import com.google.firebase.installations.internal.FidListenerHandle;

/* JADX INFO: loaded from: classes.dex */
public interface FirebaseInstallationsApi {
    d delete();

    d getId();

    d getToken(boolean z5);

    @DeferredApi
    FidListenerHandle registerFidListener(FidListener fidListener);
}
