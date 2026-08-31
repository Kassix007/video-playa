package com.google.android.gms.internal.vision;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class X {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final X f11243r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final X f11244s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final X[] f11245t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ X[] f11246u;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f11247q;

    /* JADX INFO: Fake field, exist only in values array */
    X EF0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC0926o0 enumC0926o0 = EnumC0926o0.DOUBLE;
        X x6 = new X("DOUBLE", 0, 0, 1, enumC0926o0);
        EnumC0926o0 enumC0926o02 = EnumC0926o0.FLOAT;
        X x7 = new X("FLOAT", 1, 1, 1, enumC0926o02);
        EnumC0926o0 enumC0926o03 = EnumC0926o0.LONG;
        X x8 = new X("INT64", 2, 2, 1, enumC0926o03);
        X x9 = new X("UINT64", 3, 3, 1, enumC0926o03);
        EnumC0926o0 enumC0926o04 = EnumC0926o0.INT;
        X x10 = new X("INT32", 4, 4, 1, enumC0926o04);
        X x11 = new X("FIXED64", 5, 5, 1, enumC0926o03);
        X x12 = new X("FIXED32", 6, 6, 1, enumC0926o04);
        EnumC0926o0 enumC0926o05 = EnumC0926o0.BOOLEAN;
        X x13 = new X("BOOL", 7, 7, 1, enumC0926o05);
        EnumC0926o0 enumC0926o06 = EnumC0926o0.STRING;
        X x14 = new X("STRING", 8, 8, 1, enumC0926o06);
        EnumC0926o0 enumC0926o07 = EnumC0926o0.MESSAGE;
        X x15 = new X("MESSAGE", 9, 9, 1, enumC0926o07);
        EnumC0926o0 enumC0926o08 = EnumC0926o0.BYTE_STRING;
        X x16 = new X("BYTES", 10, 10, 1, enumC0926o08);
        X x17 = new X("UINT32", 11, 11, 1, enumC0926o04);
        EnumC0926o0 enumC0926o09 = EnumC0926o0.ENUM;
        X x18 = new X("ENUM", 12, 12, 1, enumC0926o09);
        X x19 = new X("SFIXED32", 13, 13, 1, enumC0926o04);
        X x20 = new X("SFIXED64", 14, 14, 1, enumC0926o03);
        X x21 = new X("SINT32", 15, 15, 1, enumC0926o04);
        X x22 = new X("SINT64", 16, 16, 1, enumC0926o03);
        X x23 = new X("GROUP", 17, 17, 1, enumC0926o07);
        X x24 = new X("DOUBLE_LIST", 18, 18, 2, enumC0926o0);
        X x25 = new X("FLOAT_LIST", 19, 19, 2, enumC0926o02);
        X x26 = new X("INT64_LIST", 20, 20, 2, enumC0926o03);
        X x27 = new X("UINT64_LIST", 21, 21, 2, enumC0926o03);
        X x28 = new X("INT32_LIST", 22, 22, 2, enumC0926o04);
        X x29 = new X("FIXED64_LIST", 23, 23, 2, enumC0926o03);
        X x30 = new X("FIXED32_LIST", 24, 24, 2, enumC0926o04);
        X x31 = new X("BOOL_LIST", 25, 25, 2, enumC0926o05);
        X x32 = new X("STRING_LIST", 26, 26, 2, enumC0926o06);
        X x33 = new X("MESSAGE_LIST", 27, 27, 2, enumC0926o07);
        X x34 = new X("BYTES_LIST", 28, 28, 2, enumC0926o08);
        X x35 = new X("UINT32_LIST", 29, 29, 2, enumC0926o04);
        X x36 = new X("ENUM_LIST", 30, 30, 2, enumC0926o09);
        X x37 = new X("SFIXED32_LIST", 31, 31, 2, enumC0926o04);
        X x38 = new X("SFIXED64_LIST", 32, 32, 2, enumC0926o03);
        X x39 = new X("SINT32_LIST", 33, 33, 2, enumC0926o04);
        X x40 = new X("SINT64_LIST", 34, 34, 2, enumC0926o03);
        X x41 = new X("DOUBLE_LIST_PACKED", 35, 35, 3, enumC0926o0);
        f11243r = x41;
        X x42 = new X("FLOAT_LIST_PACKED", 36, 36, 3, enumC0926o02);
        X x43 = new X("INT64_LIST_PACKED", 37, 37, 3, enumC0926o03);
        X x44 = new X("UINT64_LIST_PACKED", 38, 38, 3, enumC0926o03);
        X x45 = new X("INT32_LIST_PACKED", 39, 39, 3, enumC0926o04);
        X x46 = new X("FIXED64_LIST_PACKED", 40, 40, 3, enumC0926o03);
        X x47 = new X("FIXED32_LIST_PACKED", 41, 41, 3, enumC0926o04);
        X x48 = new X("BOOL_LIST_PACKED", 42, 42, 3, enumC0926o05);
        X x49 = new X("UINT32_LIST_PACKED", 43, 43, 3, enumC0926o04);
        X x50 = new X("ENUM_LIST_PACKED", 44, 44, 3, enumC0926o09);
        X x51 = new X("SFIXED32_LIST_PACKED", 45, 45, 3, enumC0926o04);
        X x52 = new X("SFIXED64_LIST_PACKED", 46, 46, 3, enumC0926o03);
        X x53 = new X("SINT32_LIST_PACKED", 47, 47, 3, enumC0926o04);
        X x54 = new X("SINT64_LIST_PACKED", 48, 48, 3, enumC0926o03);
        f11244s = x54;
        f11246u = new X[]{x6, x7, x8, x9, x10, x11, x12, x13, x14, x15, x16, x17, x18, x19, x20, x21, x22, x23, x24, x25, x26, x27, x28, x29, x30, x31, x32, x33, x34, x35, x36, x37, x38, x39, x40, x41, x42, x43, x44, x45, x46, x47, x48, x49, x50, x51, x52, x53, x54, new X("GROUP_LIST", 49, 49, 2, enumC0926o07), new X("MAP", 50, 50, 4, EnumC0926o0.VOID)};
        X[] xArrValues = values();
        f11245t = new X[xArrValues.length];
        for (X x55 : xArrValues) {
            f11245t[x55.f11247q] = x55;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public X(String str, int i, int i7, int i8, EnumC0926o0 enumC0926o0) {
        this.f11247q = i7;
        int i9 = Y.f11249a[O.c.a(i8)];
        if (i9 == 1 || i9 == 2) {
            enumC0926o0.getClass();
        }
        if (i8 == 1) {
            int i10 = Y.f11250b[enumC0926o0.ordinal()];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static X[] values() {
        return (X[]) f11246u.clone();
    }
}
