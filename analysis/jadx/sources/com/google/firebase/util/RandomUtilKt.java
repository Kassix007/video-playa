package com.google.firebase.util;

import D5.a;
import E5.c;
import G5.d;
import java.util.ArrayList;
import java.util.Iterator;
import k1.i;
import kotlin.jvm.internal.m;
import n5.l;
import n5.w;

/* JADX INFO: loaded from: classes.dex */
public final class RandomUtilKt {
    private static final String ALPHANUMERIC_ALPHABET = "23456789abcdefghjkmnpqrstvwxyz";

    private static /* synthetic */ void getALPHANUMERIC_ALPHABET$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String nextAlphanumericString(c cVar, int i) {
        m.e(cVar, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(i.i(i, "invalid length: ").toString());
        }
        d dVarO = a.O(0, i);
        ArrayList arrayList = new ArrayList(n5.m.c0(dVarO, 10));
        Iterator it = dVarO.iterator();
        while (((G5.c) it).f2022s) {
            ((w) it).nextInt();
            arrayList.add(Character.valueOf(ALPHANUMERIC_ALPHABET.charAt(cVar.a(30))));
        }
        return l.q0(arrayList, "", null, null, null, 62);
    }
}
