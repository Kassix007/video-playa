package com.google.android.gms.internal.vision;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class K {
    protected int zza;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(Iterable iterable, List list) {
        Charset charset = AbstractC0914i0.f11272a;
        iterable.getClass();
        if (iterable instanceof InterfaceC0933s0) {
            List listB = ((InterfaceC0933s0) iterable).b();
            InterfaceC0933s0 interfaceC0933s0 = (InterfaceC0933s0) list;
            int size = list.size();
            for (Object obj : listB) {
                if (obj == null) {
                    int size2 = interfaceC0933s0.size() - size;
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(size2);
                    sb.append(" is null.");
                    String string = sb.toString();
                    for (int size3 = interfaceC0933s0.size() - 1; size3 >= size; size3--) {
                        interfaceC0933s0.remove(size3);
                    }
                    throw new NullPointerException(string);
                }
                if (obj instanceof P) {
                    interfaceC0933s0.M((P) obj);
                } else {
                    interfaceC0933s0.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof G0) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
        }
        int size4 = list.size();
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                int size5 = list.size() - size4;
                StringBuilder sb2 = new StringBuilder(37);
                sb2.append("Element at index ");
                sb2.append(size5);
                sb2.append(" is null.");
                String string2 = sb2.toString();
                for (int size6 = list.size() - 1; size6 >= size4; size6--) {
                    list.remove(size6);
                }
                throw new NullPointerException(string2);
            }
            list.add(obj2);
        }
    }

    public abstract void b(int i);

    public abstract int c();
}
