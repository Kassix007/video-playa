package com.google.android.gms.internal.clearcut;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class G extends F {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Class f10419c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.clearcut.F
    public final void a(long j, Object obj) {
        Object objUnmodifiableList;
        List list = (List) i0.k(j, obj);
        if (list instanceof E) {
            objUnmodifiableList = ((E) list).G();
        } else if (f10419c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        i0.c(j, obj, objUnmodifiableList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:20:0x006a */
    @Override // com.google.android.gms.internal.clearcut.F
    public final void b(long j, Object obj, Object obj2) {
        List list;
        List list2;
        List list3 = (List) i0.k(j, obj2);
        int size = list3.size();
        List list4 = (List) i0.k(j, obj);
        if (list4.isEmpty()) {
            List d5 = list4 instanceof E ? new D(size) : new ArrayList(size);
            i0.c(j, obj, d5);
            list2 = d5;
        } else {
            if (f10419c.isAssignableFrom(list4.getClass())) {
                ArrayList arrayList = new ArrayList(list4.size() + size);
                arrayList.addAll(list4);
                list = arrayList;
            } else {
                boolean z5 = list4 instanceof C0743d0;
                list2 = list4;
                if (z5) {
                    D d7 = new D(list4.size() + size);
                    d7.addAll((C0743d0) list4);
                    list = d7;
                }
            }
            i0.c(j, obj, list);
            list2 = list;
        }
        int size2 = list2.size();
        int size3 = list3.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list3);
        }
        if (size2 > 0) {
            list3 = list2;
        }
        i0.c(j, obj, list3);
    }
}
