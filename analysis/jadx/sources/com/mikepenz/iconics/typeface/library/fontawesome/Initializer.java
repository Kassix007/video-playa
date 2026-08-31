package com.mikepenz.iconics.typeface.library.fontawesome;

import O4.c;
import P4.e;
import android.content.Context;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import com.mikepenz.iconics.typeface.IconicsInitializer;
import java.util.List;
import kotlin.jvm.internal.m;
import m2.InterfaceC1359b;

/* JADX INFO: loaded from: classes.dex */
public final class Initializer implements InterfaceC1359b {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m2.InterfaceC1359b
    public final Object create(Context context) {
        m.e(context, "context");
        FontAwesome fontAwesome = FontAwesome.INSTANCE;
        c.a(fontAwesome);
        c.a(P4.c.f6323a);
        c.a(e.f6327a);
        return fontAwesome;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m2.InterfaceC1359b
    public final List dependencies() {
        return AbstractC0836n2.z(IconicsInitializer.class);
    }
}
