package com.google.android.gms.internal.clearcut;

import java.lang.reflect.Field;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class Y {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Object f10451A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U.l f10452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f10453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class f10454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10456e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f10457g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f10458h;
    public final int i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f10459k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f10460l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int[] f10461m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f10462n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f10463o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f10464p = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f10465q = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f10466r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f10467s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f10468t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f10469u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f10470v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f10471w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Field f10472x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f10473y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Object f10474z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Y(Class cls, String str, Object[] objArr) {
        this.f10454c = cls;
        U.l lVar = new U.l();
        lVar.f7511r = str;
        lVar.f7510q = 0;
        this.f10452a = lVar;
        this.f10453b = objArr;
        this.f10455d = lVar.i();
        int i = lVar.i();
        this.f10456e = i;
        if (i == 0) {
            this.f = 0;
            this.f10457g = 0;
            this.f10458h = 0;
            this.i = 0;
            this.f10459k = 0;
            this.j = 0;
            this.f10460l = 0;
            this.f10461m = null;
            return;
        }
        int i7 = lVar.i();
        this.f = i7;
        int i8 = lVar.i();
        this.f10457g = lVar.i();
        this.f10458h = lVar.i();
        this.f10459k = lVar.i();
        this.j = lVar.i();
        this.i = lVar.i();
        this.f10460l = lVar.i();
        int i9 = lVar.i();
        this.f10461m = i9 != 0 ? new int[i9] : null;
        this.f10462n = (i7 << 1) + i8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Field b(String str, Class cls) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(string).length() + name.length() + String.valueOf(str).length() + 40);
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            throw new RuntimeException(k1.i.k(sb, " not found. Known fields are ", string));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean a() {
        U.l lVar = this.f10452a;
        if (lVar.f7510q >= ((String) lVar.f7511r).length()) {
            return false;
        }
        this.f10467s = lVar.i();
        int i = lVar.i();
        this.f10468t = i;
        int i7 = i & 255;
        this.f10469u = i7;
        int i8 = this.f10467s;
        if (i8 < this.f10464p) {
            this.f10464p = i8;
        }
        if (i8 > this.f10465q) {
            this.f10465q = i8;
        }
        EnumC0759s enumC0759s = EnumC0759s.f10553z;
        int i9 = enumC0759s.f10554q;
        if (i7 != i9 && i7 >= EnumC0759s.f10548u.f10554q) {
            int i10 = EnumC0759s.f10552y.f10554q;
        }
        int i11 = this.f10466r + 1;
        this.f10466r = i11;
        int i12 = this.f10464p;
        Class cls = AbstractC0737a0.f10482a;
        if (i8 >= 40) {
            long j = i11;
            int i13 = (((((long) i8) - ((long) i12)) + 10) > (((j + 3) * 3) + (2 * j) + 3) ? 1 : (((((long) i8) - ((long) i12)) + 10) == (((j + 3) * 3) + (2 * j) + 3) ? 0 : -1));
        }
        if ((i & 1024) != 0) {
            int i14 = this.f10463o;
            this.f10463o = i14 + 1;
            this.f10461m[i14] = i8;
        }
        this.f10473y = null;
        this.f10474z = null;
        this.f10451A = null;
        int i15 = this.f10455d;
        if (i7 > i9) {
            this.f10470v = lVar.i();
            int i16 = this.f10469u;
            if (i16 == EnumC0759s.f10545r.f10554q + 51 || i16 == EnumC0759s.f10547t.f10554q + 51) {
                this.f10473y = c();
                return true;
            }
            if (i16 == EnumC0759s.f10546s.f10554q + 51 && (i15 & 1) == 1) {
                this.f10474z = c();
            }
            return true;
        }
        this.f10472x = b((String) c(), this.f10454c);
        if ((i15 & 1) == 1 && this.f10469u <= EnumC0759s.f10547t.f10554q) {
            this.f10471w = lVar.i();
        }
        int i17 = this.f10469u;
        if (i17 == EnumC0759s.f10545r.f10554q || i17 == EnumC0759s.f10547t.f10554q) {
            this.f10473y = this.f10472x.getType();
            return true;
        }
        if (i17 == EnumC0759s.f10549v.f10554q || i17 == EnumC0759s.f10552y.f10554q) {
            this.f10473y = c();
            return true;
        }
        if (i17 == EnumC0759s.f10546s.f10554q || i17 == EnumC0759s.f10550w.f10554q || i17 == EnumC0759s.f10551x.f10554q) {
            if ((i15 & 1) == 1) {
                this.f10474z = c();
            }
            return true;
        }
        if (i17 == enumC0759s.f10554q) {
            this.f10451A = c();
            if ((this.f10468t & 2048) != 0) {
                this.f10474z = c();
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object c() {
        int i = this.f10462n;
        this.f10462n = i + 1;
        return this.f10453b[i];
    }
}
