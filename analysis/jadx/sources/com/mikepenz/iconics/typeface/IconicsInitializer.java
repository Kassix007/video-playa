package com.mikepenz.iconics.typeface;

import O4.c;
import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.m;
import m2.InterfaceC1359b;
import n5.s;

/* JADX INFO: loaded from: classes.dex */
public final class IconicsInitializer implements InterfaceC1359b {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m2.InterfaceC1359b
    public final Object create(Context context) {
        m.e(context, "context");
        c cVar = c.f5203a;
        if (c.f5204b == null) {
            c.f5204b = context.getApplicationContext();
        }
        return c.f5203a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m2.InterfaceC1359b
    public final List dependencies() {
        return s.f15299q;
    }
}
