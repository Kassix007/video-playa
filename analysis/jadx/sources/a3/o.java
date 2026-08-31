package a3;

import a.AbstractC0597a;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import m3.AbstractC1360a;
import m3.C1361b;
import q6.C1537f;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f8857a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashSet f8858b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f8859c = {80, 75, 3, 4};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f8860d = {31, -117, 8};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static F a(final String str, Callable callable, Runnable runnable) {
        C0632k c0632kA = str == null ? null : g3.g.f13063b.a(str);
        F f = c0632kA != null ? new F(c0632kA) : null;
        HashMap map = f8857a;
        if (str != null && map.containsKey(str)) {
            f = (F) map.get(str);
        }
        if (f != null) {
            if (runnable != null) {
                runnable.run();
            }
            return f;
        }
        F f7 = new F(callable, false);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final int i = 0;
            f7.b(new InterfaceC0621B() { // from class: a3.m
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // a3.InterfaceC0621B
                public final void onResult(Object obj) {
                    switch (i) {
                        case 0:
                            HashMap map2 = o.f8857a;
                            map2.remove(str);
                            atomicBoolean.set(true);
                            if (map2.size() == 0) {
                                o.k();
                            }
                            break;
                        default:
                            HashMap map3 = o.f8857a;
                            map3.remove(str);
                            atomicBoolean.set(true);
                            if (map3.size() == 0) {
                                o.k();
                            }
                            break;
                    }
                }
            });
            final int i7 = 1;
            f7.a(new InterfaceC0621B() { // from class: a3.m
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // a3.InterfaceC0621B
                public final void onResult(Object obj) {
                    switch (i7) {
                        case 0:
                            HashMap map2 = o.f8857a;
                            map2.remove(str);
                            atomicBoolean.set(true);
                            if (map2.size() == 0) {
                                o.k();
                            }
                            break;
                        default:
                            HashMap map3 = o.f8857a;
                            map3.remove(str);
                            atomicBoolean.set(true);
                            if (map3.size() == 0) {
                                o.k();
                            }
                            break;
                    }
                }
            });
            if (!atomicBoolean.get()) {
                map.put(str, f7);
                if (map.size() == 1) {
                    k();
                }
            }
        }
        return f7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static D b(Context context, String str, String str2) {
        C0632k c0632kA = str2 == null ? null : g3.g.f13063b.a(str2);
        if (c0632kA != null) {
            return new D(c0632kA);
        }
        try {
            return c(context, context.getAssets().open(str), str2);
        } catch (IOException e7) {
            return new D(e7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static D c(Context context, InputStream inputStream, String str) {
        C0632k c0632kA = str == null ? null : g3.g.f13063b.a(str);
        if (c0632kA != null) {
            return new D(c0632kA);
        }
        try {
            q6.A aJ = AbstractC0597a.j(AbstractC0597a.R(inputStream));
            int i = 1;
            if (j(aJ, f8859c).booleanValue()) {
                return h(context, new ZipInputStream(new C1537f(aJ, i)), str);
            }
            if (j(aJ, f8860d).booleanValue()) {
                return d(new GZIPInputStream(new C1537f(aJ, i)), str);
            }
            String[] strArr = AbstractC1360a.f15055u;
            return e(new C1361b(aJ), str, true);
        } catch (IOException e7) {
            return new D(e7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static D d(InputStream inputStream, String str) {
        q6.A aJ = AbstractC0597a.j(AbstractC0597a.R(inputStream));
        String[] strArr = AbstractC1360a.f15055u;
        return e(new C1361b(aJ), str, true);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[IF]}, finally: {[IF, INVOKE] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static D e(C1361b c1361b, String str, boolean z5) {
        C0632k c0632kA;
        try {
            if (str == null) {
                c0632kA = null;
            } else {
                try {
                    c0632kA = g3.g.f13063b.a(str);
                } catch (Exception e7) {
                    D d5 = new D(e7);
                    if (z5) {
                        n3.i.b(c1361b);
                    }
                    return d5;
                }
            }
            if (c0632kA != null) {
                D d7 = new D(c0632kA);
                if (z5) {
                    n3.i.b(c1361b);
                }
                return d7;
            }
            C0632k c0632kA2 = l3.r.a(c1361b);
            if (str != null) {
                g3.g.f13063b.f13064a.l(str, c0632kA2);
            }
            D d8 = new D(c0632kA2);
            if (z5) {
                n3.i.b(c1361b);
            }
            return d8;
        } catch (Throwable th) {
            if (z5) {
                n3.i.b(c1361b);
            }
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static F f(Context context, final int i, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return a(str, new Callable() { // from class: a3.n
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Context context2 = (Context) weakReference.get();
                if (context2 == null) {
                    context2 = applicationContext;
                }
                return o.g(context2, i, str);
            }
        }, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static D g(Context context, int i, String str) {
        C0632k c0632kA = str == null ? null : g3.g.f13063b.a(str);
        if (c0632kA != null) {
            return new D(c0632kA);
        }
        try {
            q6.A aJ = AbstractC0597a.j(AbstractC0597a.R(context.getResources().openRawResource(i)));
            int i7 = 1;
            if (j(aJ, f8859c).booleanValue()) {
                return h(context, new ZipInputStream(new C1537f(aJ, i7)), str);
            }
            if (!j(aJ, f8860d).booleanValue()) {
                String[] strArr = AbstractC1360a.f15055u;
                return e(new C1361b(aJ), str, true);
            }
            try {
                return d(new GZIPInputStream(new C1537f(aJ, i7)), str);
            } catch (IOException e7) {
                return new D(e7);
            }
        } catch (Resources.NotFoundException e8) {
            return new D(e8);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static D h(Context context, ZipInputStream zipInputStream, String str) {
        try {
            return i(context, zipInputStream, str);
        } finally {
            n3.i.b(zipInputStream);
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE, MOVE_EXCEPTION, INVOKE, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static D i(Context context, ZipInputStream zipInputStream, String str) {
        C0632k c0632kA;
        C0620A c0620a;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (str == null) {
            c0632kA = null;
        } else {
            try {
                c0632kA = g3.g.f13063b.a(str);
            } catch (IOException e7) {
                return new D(e7);
            }
        }
        if (c0632kA != null) {
            return new D(c0632kA);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        C0632k c0632k = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                q6.A aJ = AbstractC0597a.j(AbstractC0597a.R(zipInputStream));
                String[] strArr = AbstractC1360a.f15055u;
                c0632k = e(new C1361b(aJ), null, false).f8793a;
            } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                String[] strArrSplit = name.split("/");
                map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
            } else if (name.contains(".ttf") || name.contains(".otf")) {
                String[] strArrSplit2 = name.split("/");
                String str2 = strArrSplit2[strArrSplit2.length - 1];
                String str3 = str2.split("\\.")[0];
                if (context == null) {
                    return new D(new IllegalStateException("Unable to extract font " + str3 + " please pass a non-null Context parameter"));
                }
                File file = new File(context.getCacheDir(), str2);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                        try {
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int i = zipInputStream.read(bArr);
                                if (i == -1) {
                                    break;
                                }
                                fileOutputStream2.write(bArr, 0, i);
                            }
                            fileOutputStream2.flush();
                            fileOutputStream2.close();
                            fileOutputStream.close();
                        } catch (Throwable th) {
                            try {
                                fileOutputStream2.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } finally {
                    }
                } catch (Throwable th3) {
                    n3.c.c("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th3);
                }
                Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                if (!file.delete()) {
                    n3.c.b("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                }
                map2.put(str3, typefaceCreateFromFile);
            } else {
                zipInputStream.closeEntry();
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (c0632k == null) {
            return new D(new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : map.entrySet()) {
            String str4 = (String) entry.getKey();
            Iterator it = ((HashMap) c0632k.c()).values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    c0620a = null;
                    break;
                }
                c0620a = (C0620A) it.next();
                if (c0620a.f8757d.equals(str4)) {
                    break;
                }
            }
            if (c0620a != null) {
                c0620a.f = n3.i.d((Bitmap) entry.getValue(), c0620a.f8754a, c0620a.f8755b);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            boolean z5 = false;
            for (g3.c cVar : c0632k.f.values()) {
                if (cVar.f13051a.equals(entry2.getKey())) {
                    cVar.f13054d = (Typeface) entry2.getValue();
                    z5 = true;
                }
            }
            if (!z5) {
                n3.c.b("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (map.isEmpty()) {
            Iterator it2 = ((HashMap) c0632k.c()).entrySet().iterator();
            while (it2.hasNext()) {
                C0620A c0620a2 = (C0620A) ((Map.Entry) it2.next()).getValue();
                if (c0620a2 == null) {
                    return null;
                }
                String str5 = c0620a2.f8757d;
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                if (str5.startsWith("data:") && str5.indexOf("base64,") > 0) {
                    try {
                        byte[] bArrDecode = Base64.decode(str5.substring(str5.indexOf(44) + 1), 0);
                        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                        if (bitmapDecodeByteArray != null) {
                            c0620a2.f = n3.i.d(bitmapDecodeByteArray, c0620a2.f8754a, c0620a2.f8755b);
                        }
                    } catch (IllegalArgumentException e8) {
                        n3.c.c("data URL did not have correct base64 format.", e8);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            g3.g.f13063b.f13064a.l(str, c0632k);
        }
        return new D(c0632k);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Boolean j(q6.A a7, byte[] bArr) {
        try {
            q6.A aC = a7.c();
            for (byte b7 : bArr) {
                if (aC.readByte() != b7) {
                    return Boolean.FALSE;
                }
            }
            aC.close();
            return Boolean.TRUE;
        } catch (Exception unused) {
            n3.c.f15153a.getClass();
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused2) {
            return Boolean.FALSE;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void k() {
        ArrayList arrayList = new ArrayList(f8858b);
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String l(Context context, int i) {
        StringBuilder sb = new StringBuilder("rawRes");
        sb.append((context.getResources().getConfiguration().uiMode & 48) == 32 ? "_night_" : "_day_");
        sb.append(i);
        return sb.toString();
    }
}
