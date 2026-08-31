package com.google.android.gms.internal.vision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.vision.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0935t0 extends AbstractC0931r0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Class f11319c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:32:0x009a */
    @Override // com.google.android.gms.internal.vision.AbstractC0931r0
    public final void a(long j, Object obj, Object obj2) {
        List list;
        List list2;
        List list3 = (List) U0.l(j, obj2);
        int size = list3.size();
        List list4 = (List) U0.l(j, obj);
        if (list4.isEmpty()) {
            List c0930q0 = list4 instanceof InterfaceC0933s0 ? new C0930q0(size) : ((list4 instanceof G0) && (list4 instanceof InterfaceC0924n0)) ? ((InterfaceC0924n0) list4).a(size) : new ArrayList(size);
            U0.d(j, obj, c0930q0);
            list2 = c0930q0;
        } else {
            if (f11319c.isAssignableFrom(list4.getClass())) {
                ArrayList arrayList = new ArrayList(list4.size() + size);
                arrayList.addAll(list4);
                U0.d(j, obj, arrayList);
                list = arrayList;
            } else if (list4 instanceof Q0) {
                C0930q0 c0930q02 = new C0930q0(list4.size() + size);
                c0930q02.addAll((Q0) list4);
                U0.d(j, obj, c0930q02);
                list = c0930q02;
            } else {
                boolean z5 = list4 instanceof G0;
                list2 = list4;
                if (z5) {
                    boolean z6 = list4 instanceof InterfaceC0924n0;
                    list2 = list4;
                    if (z6) {
                        InterfaceC0924n0 interfaceC0924n0 = (InterfaceC0924n0) list4;
                        list2 = list4;
                        if (!interfaceC0924n0.zza()) {
                            InterfaceC0924n0 interfaceC0924n0A = interfaceC0924n0.a(list4.size() + size);
                            U0.d(j, obj, interfaceC0924n0A);
                            list2 = interfaceC0924n0A;
                        }
                    }
                }
            }
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
        U0.d(j, obj, list3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.vision.AbstractC0931r0
    public final void b(long j, Object obj) {
        Object objUnmodifiableList;
        List list = (List) U0.l(j, obj);
        if (list instanceof InterfaceC0933s0) {
            objUnmodifiableList = ((InterfaceC0933s0) list).c();
        } else {
            if (f11319c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof G0) && (list instanceof InterfaceC0924n0)) {
                InterfaceC0924n0 interfaceC0924n0 = (InterfaceC0924n0) list;
                if (interfaceC0924n0.zza()) {
                    interfaceC0924n0.f();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        U0.d(j, obj, objUnmodifiableList);
    }
}
