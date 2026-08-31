package com.google.android.gms.internal.clearcut;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class E0 {
    public static HashMap f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static Object f10413k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static boolean f10414l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Uri f10406a = Uri.parse("content://com.google.android.gsf.gservices");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Uri f10407b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f10408c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f10409d = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicBoolean f10410e = new AtomicBoolean();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final HashMap f10411g = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final HashMap f10412h = new HashMap();
    public static final HashMap i = new HashMap();
    public static final HashMap j = new HashMap();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String[] f10415m = new String[0];

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object a(HashMap map, String str, Object obj) {
        synchronized (E0.class) {
            try {
                if (!map.containsKey(str)) {
                    return null;
                }
                Object obj2 = map.get(str);
                if (obj2 != null) {
                    obj = obj2;
                }
                return obj;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX DEBUG: Incorrect finally slice size: {[GOTO] complete}, expected: {[GOTO, THROW, INVOKE, THROW, IF] complete} */
    /* JADX WARN: Finally extract failed */
    public static String b(ContentResolver contentResolver, String str) {
        String str2;
        synchronized (E0.class) {
            try {
                c(contentResolver);
                Object obj = f10413k;
                if (f.containsKey(str)) {
                    String str3 = (String) f.get(str);
                    return str3 != null ? str3 : null;
                }
                for (String str4 : f10415m) {
                    if (str.startsWith(str4)) {
                        if (!f10414l || f.isEmpty()) {
                            String[] strArr = f10415m;
                            HashMap map = f;
                            Cursor cursorQuery = contentResolver.query(f10407b, null, null, strArr, null);
                            TreeMap treeMap = new TreeMap();
                            if (cursorQuery != null) {
                                while (cursorQuery.moveToNext()) {
                                    try {
                                        treeMap.put(cursorQuery.getString(0), cursorQuery.getString(1));
                                    } finally {
                                        cursorQuery.close();
                                    }
                                }
                            }
                            map.putAll(treeMap);
                            f10414l = true;
                            if (f.containsKey(str) && (str2 = (String) f.get(str)) != null) {
                                str = str2;
                            }
                        }
                        return str;
                    }
                }
                Cursor cursorQuery2 = contentResolver.query(f10406a, null, null, new String[]{str}, null);
                if (cursorQuery2 != null) {
                    try {
                        if (cursorQuery2.moveToFirst()) {
                            String string = cursorQuery2.getString(1);
                            if (string != null && string.equals(null)) {
                                string = null;
                            }
                            synchronized (E0.class) {
                                try {
                                    if (obj == f10413k) {
                                        f.put(str, string);
                                    }
                                } finally {
                                }
                            }
                            str = string != null ? string : null;
                            cursorQuery2.close();
                            return str;
                        }
                    } catch (Throwable th) {
                        if (cursorQuery2 == null) {
                            throw th;
                        }
                        cursorQuery2.close();
                        throw th;
                    }
                }
                synchronized (E0.class) {
                    try {
                        if (obj == f10413k) {
                            f.put(str, null);
                        }
                    } finally {
                    }
                }
                if (cursorQuery2 != null) {
                    cursorQuery2.close();
                }
                return null;
            } finally {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void c(ContentResolver contentResolver) {
        HashMap map = f;
        AtomicBoolean atomicBoolean = f10410e;
        if (map == null) {
            atomicBoolean.set(false);
            f = new HashMap();
            f10413k = new Object();
            f10414l = false;
            contentResolver.registerContentObserver(f10406a, true, new F0(null, 0));
            return;
        }
        if (atomicBoolean.getAndSet(false)) {
            f.clear();
            f10411g.clear();
            f10412h.clear();
            i.clear();
            j.clear();
            f10413k = new Object();
            f10414l = false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void d(Object obj, HashMap map, String str, Object obj2) {
        synchronized (E0.class) {
            try {
                if (obj == f10413k) {
                    map.put(str, obj2);
                    f.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
