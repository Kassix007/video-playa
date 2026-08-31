package com.google.firebase.components;

import com.google.firebase.inject.Provider;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Provider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11739a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [com.google.firebase.components.OptionalProvider.<clinit>():void] */
    public /* synthetic */ g(int i) {
        this.f11739a = i;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.google.firebase.components.OptionalProvider.a():java.lang.Object */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        switch (this.f11739a) {
            case 0:
                return OptionalProvider.lambda$static$1();
            default:
                return Collections.EMPTY_SET;
        }
    }
}
