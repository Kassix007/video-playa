package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0862t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f11033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f11034b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0862t(Object obj, Object obj2) {
        this.f11033a = obj;
        this.f11034b = obj2;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, INVOKE, MOVE_EXCEPTION, THROW, IF] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    public Object a() {
        Uri uri;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient;
        String string;
        O1 o12 = (O1) this.f11033a;
        String str = (String) this.f11034b;
        Context context = (Context) o12.f10680b;
        context.getClass();
        ContentResolver contentResolver = context.getContentResolver();
        m.c1 c1Var = G1.f10636a;
        if (contentResolver == null) {
            c1Var.getClass();
            throw new IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
        }
        synchronized (c1Var) {
            try {
                if (((HashMap) c1Var.f14766b) == null) {
                    ((AtomicBoolean) c1Var.f14765a).set(false);
                    c1Var.f14766b = new HashMap(16, 1.0f);
                    c1Var.f14770g = new Object();
                    contentResolver.registerContentObserver(H1.f10640a, true, new C0.r1(c1Var));
                } else if (((AtomicBoolean) c1Var.f14765a).getAndSet(false)) {
                    ((HashMap) c1Var.f14766b).clear();
                    ((HashMap) c1Var.f14767c).clear();
                    ((HashMap) c1Var.f14768d).clear();
                    ((HashMap) c1Var.f14769e).clear();
                    ((HashMap) c1Var.f).clear();
                    c1Var.f14770g = new Object();
                }
                Object obj = c1Var.f14770g;
                String str2 = null;
                if (((HashMap) c1Var.f14766b).containsKey(str)) {
                    String str3 = (String) ((HashMap) c1Var.f14766b).get(str);
                    if (str3 != null) {
                        str2 = str3;
                    }
                    return str2;
                }
                try {
                    uri = H1.f10640a;
                    contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
                    try {
                    } finally {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                    }
                } catch (J1 unused) {
                }
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    throw new J1("Unable to acquire ContentProviderClient");
                }
                try {
                    Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, null, new String[]{str}, null);
                    try {
                        if (cursorQuery == null) {
                            throw new J1("ContentProvider query returned null cursor");
                        }
                        if (cursorQuery.moveToFirst()) {
                            string = cursorQuery.getString(1);
                            cursorQuery.close();
                        } else {
                            cursorQuery.close();
                            string = null;
                        }
                        if (string != null && string.equals(null)) {
                            string = null;
                        }
                        synchronized (c1Var) {
                            try {
                                if (obj == c1Var.f14770g) {
                                    ((HashMap) c1Var.f14766b).put(str, string);
                                }
                            } finally {
                            }
                        }
                        if (string != null) {
                            return string;
                        }
                        return null;
                    } finally {
                    }
                } catch (RemoteException e7) {
                    throw new J1("ContentProvider query failed", e7);
                }
            } finally {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void b(C0857s c0857s) {
        ArrayList arrayList = c0857s.f11028a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((HashMap) this.f11033a).put(Integer.valueOf(((EnumC0877w) obj).f11117q).toString(), c0857s);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InterfaceC0833n c(E.c0 c0Var, InterfaceC0833n interfaceC0833n) {
        I1.S0(c0Var);
        if (!(interfaceC0833n instanceof C0838o)) {
            return interfaceC0833n;
        }
        C0838o c0838o = (C0838o) interfaceC0833n;
        ArrayList arrayList = c0838o.f10998r;
        String str = c0838o.f10997q;
        HashMap map = (HashMap) this.f11033a;
        return (map.containsKey(str) ? (C0857s) map.get(str) : (C0857s) this.f11034b).a(str, c0Var, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void d(E.c0 c0Var, B0.G0 g02) {
        C0786d2 c0786d2 = new C0786d2(g02);
        TreeMap treeMap = (TreeMap) this.f11033a;
        for (Integer num : treeMap.keySet()) {
            C0773b c0773bClone = ((C0773b) g02.f235s).clone();
            InterfaceC0833n interfaceC0833nA = ((C0828m) treeMap.get(num)).a(c0Var, Collections.singletonList(c0786d2));
            int iO0 = interfaceC0833nA instanceof C0798g ? I1.O0(((C0798g) interfaceC0833nA).f10844q.doubleValue()) : -1;
            if (iO0 == 2 || iO0 == -1) {
                g02.f235s = c0773bClone;
            }
        }
        TreeMap treeMap2 = (TreeMap) this.f11034b;
        Iterator it = treeMap2.keySet().iterator();
        while (it.hasNext()) {
            InterfaceC0833n interfaceC0833nA2 = ((C0828m) treeMap2.get((Integer) it.next())).a(c0Var, Collections.singletonList(c0786d2));
            if (interfaceC0833nA2 instanceof C0798g) {
                I1.O0(((C0798g) interfaceC0833nA2).f10844q.doubleValue());
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C0862t(int i) {
        switch (i) {
            case 3:
                this.f11033a = new TreeMap();
                this.f11034b = new TreeMap();
                break;
            default:
                this.f11033a = new HashMap();
                this.f11034b = new C0857s(6);
                C0857s c0857s = new C0857s(0);
                EnumC0877w enumC0877w = EnumC0877w.BITWISE_AND;
                ArrayList arrayList = c0857s.f11028a;
                arrayList.add(enumC0877w);
                arrayList.add(EnumC0877w.BITWISE_LEFT_SHIFT);
                arrayList.add(EnumC0877w.BITWISE_NOT);
                arrayList.add(EnumC0877w.BITWISE_OR);
                arrayList.add(EnumC0877w.BITWISE_RIGHT_SHIFT);
                arrayList.add(EnumC0877w.BITWISE_UNSIGNED_RIGHT_SHIFT);
                arrayList.add(EnumC0877w.BITWISE_XOR);
                b(c0857s);
                C0857s c0857s2 = new C0857s(1);
                EnumC0877w enumC0877w2 = EnumC0877w.EQUALS;
                ArrayList arrayList2 = c0857s2.f11028a;
                arrayList2.add(enumC0877w2);
                arrayList2.add(EnumC0877w.GREATER_THAN);
                arrayList2.add(EnumC0877w.GREATER_THAN_EQUALS);
                arrayList2.add(EnumC0877w.IDENTITY_EQUALS);
                arrayList2.add(EnumC0877w.IDENTITY_NOT_EQUALS);
                arrayList2.add(EnumC0877w.LESS_THAN);
                arrayList2.add(EnumC0877w.LESS_THAN_EQUALS);
                arrayList2.add(EnumC0877w.NOT_EQUALS);
                b(c0857s2);
                C0857s c0857s3 = new C0857s(2);
                EnumC0877w enumC0877w3 = EnumC0877w.APPLY;
                ArrayList arrayList3 = c0857s3.f11028a;
                arrayList3.add(enumC0877w3);
                arrayList3.add(EnumC0877w.BLOCK);
                arrayList3.add(EnumC0877w.BREAK);
                arrayList3.add(EnumC0877w.CASE);
                arrayList3.add(EnumC0877w.DEFAULT);
                arrayList3.add(EnumC0877w.CONTINUE);
                arrayList3.add(EnumC0877w.DEFINE_FUNCTION);
                arrayList3.add(EnumC0877w.FN);
                arrayList3.add(EnumC0877w.IF);
                arrayList3.add(EnumC0877w.QUOTE);
                arrayList3.add(EnumC0877w.RETURN);
                arrayList3.add(EnumC0877w.SWITCH);
                arrayList3.add(EnumC0877w.TERNARY);
                b(c0857s3);
                C0857s c0857s4 = new C0857s(3);
                EnumC0877w enumC0877w4 = EnumC0877w.AND;
                ArrayList arrayList4 = c0857s4.f11028a;
                arrayList4.add(enumC0877w4);
                arrayList4.add(EnumC0877w.NOT);
                arrayList4.add(EnumC0877w.OR);
                b(c0857s4);
                C0857s c0857s5 = new C0857s(4);
                EnumC0877w enumC0877w5 = EnumC0877w.FOR_IN;
                ArrayList arrayList5 = c0857s5.f11028a;
                arrayList5.add(enumC0877w5);
                arrayList5.add(EnumC0877w.FOR_IN_CONST);
                arrayList5.add(EnumC0877w.FOR_IN_LET);
                arrayList5.add(EnumC0877w.FOR_LET);
                arrayList5.add(EnumC0877w.FOR_OF);
                arrayList5.add(EnumC0877w.FOR_OF_CONST);
                arrayList5.add(EnumC0877w.FOR_OF_LET);
                arrayList5.add(EnumC0877w.WHILE);
                b(c0857s5);
                C0857s c0857s6 = new C0857s(5);
                EnumC0877w enumC0877w6 = EnumC0877w.ADD;
                ArrayList arrayList6 = c0857s6.f11028a;
                arrayList6.add(enumC0877w6);
                arrayList6.add(EnumC0877w.DIVIDE);
                arrayList6.add(EnumC0877w.MODULUS);
                arrayList6.add(EnumC0877w.MULTIPLY);
                arrayList6.add(EnumC0877w.NEGATE);
                arrayList6.add(EnumC0877w.POST_DECREMENT);
                arrayList6.add(EnumC0877w.POST_INCREMENT);
                arrayList6.add(EnumC0877w.PRE_DECREMENT);
                arrayList6.add(EnumC0877w.PRE_INCREMENT);
                arrayList6.add(EnumC0877w.SUBTRACT);
                b(c0857s6);
                C0857s c0857s7 = new C0857s(7);
                EnumC0877w enumC0877w7 = EnumC0877w.ASSIGN;
                ArrayList arrayList7 = c0857s7.f11028a;
                arrayList7.add(enumC0877w7);
                arrayList7.add(EnumC0877w.CONST);
                arrayList7.add(EnumC0877w.CREATE_ARRAY);
                arrayList7.add(EnumC0877w.CREATE_OBJECT);
                arrayList7.add(EnumC0877w.EXPRESSION_LIST);
                arrayList7.add(EnumC0877w.GET);
                arrayList7.add(EnumC0877w.GET_INDEX);
                arrayList7.add(EnumC0877w.GET_PROPERTY);
                arrayList7.add(EnumC0877w.NULL);
                arrayList7.add(EnumC0877w.SET_PROPERTY);
                arrayList7.add(EnumC0877w.TYPEOF);
                arrayList7.add(EnumC0877w.UNDEFINED);
                arrayList7.add(EnumC0877w.VAR);
                b(c0857s7);
                break;
        }
    }
}
