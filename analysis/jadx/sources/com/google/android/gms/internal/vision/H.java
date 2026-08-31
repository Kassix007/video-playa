package com.google.android.gms.internal.vision;

import androidx.work.impl.WorkDatabaseVersions;

/* JADX INFO: loaded from: classes.dex */
public final class H implements InterfaceC0916j0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final H f11153b = new H(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final H f11154c = new H(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final H f11155d = new H(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final H f11156e = new H(3);
    public static final H f = new H(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final H f11157g = new H(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final H f11158h = new H(6);
    public static final H i = new H(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11159a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [com.google.android.gms.internal.vision.H.<clinit>():void] */
    public /* synthetic */ H(int i7) {
        this.f11159a = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.vision.InterfaceC0916j0
    public final boolean a(int i7) {
        I i8;
        J j;
        switch (this.f11159a) {
            case 0:
                if ((i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? null : EnumC0917k.REASON_INVALID : EnumC0917k.REASON_UPGRADE : EnumC0917k.REASON_MISSING : EnumC0917k.REASON_UNKNOWN) != null) {
                }
                break;
            case 1:
                if ((i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? null : EnumC0921m.RESULT_SKIPPED : EnumC0921m.RESULT_FAIL : EnumC0921m.RESULT_SUCCESS : EnumC0921m.RESULT_UNKNOWN) != null) {
                }
                break;
            case 2:
                if ((i7 != 0 ? i7 != 1 ? i7 != 2 ? null : EnumC0927p.CLASSIFICATION_ALL : EnumC0927p.CLASSIFICATION_NONE : EnumC0927p.CLASSIFICATION_UNKNOWN) != null) {
                }
                break;
            case 3:
                if ((i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? null : EnumC0929q.LANDMARK_CONTOUR : EnumC0929q.LANDMARK_ALL : EnumC0929q.LANDMARK_NONE : EnumC0929q.LANDMARK_UNKNOWN) != null) {
                }
                break;
            case 4:
                if ((i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? null : r.MODE_SELFIE : r.MODE_FAST : r.MODE_ACCURATE : r.MODE_UNKNOWN) != null) {
                }
                break;
            case 5:
                if ((i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? null : EnumC0940w.FORMAT_MONOCHROME : EnumC0940w.FORMAT_RGB8 : EnumC0940w.FORMAT_LUMINANCE : EnumC0940w.FORMAT_UNKNOWN) != null) {
                }
                break;
            case 6:
                switch (i7) {
                    case 0:
                        i8 = I.UNRECOGNIZED;
                        break;
                    case 1:
                        i8 = I.CODE_128;
                        break;
                    case 2:
                        i8 = I.CODE_39;
                        break;
                    case 3:
                        i8 = I.CODE_93;
                        break;
                    case 4:
                        i8 = I.CODABAR;
                        break;
                    case 5:
                        i8 = I.DATA_MATRIX;
                        break;
                    case 6:
                        i8 = I.EAN_13;
                        break;
                    case 7:
                        i8 = I.EAN_8;
                        break;
                    case 8:
                        i8 = I.ITF;
                        break;
                    case 9:
                        i8 = I.QR_CODE;
                        break;
                    case 10:
                        i8 = I.UPC_A;
                        break;
                    case 11:
                        i8 = I.UPC_E;
                        break;
                    case 12:
                        i8 = I.PDF417;
                        break;
                    case 13:
                        i8 = I.AZTEC;
                        break;
                    case 14:
                        i8 = I.DATABAR;
                        break;
                    case 15:
                    default:
                        i8 = null;
                        break;
                    case WorkDatabaseVersions.VERSION_16 /* 16 */:
                        i8 = I.TEZ_CODE;
                        break;
                }
                if (i8 != null) {
                }
                break;
            default:
                switch (i7) {
                    case 0:
                        j = J.UNKNOWN_FORMAT;
                        break;
                    case 1:
                        j = J.CONTACT_INFO;
                        break;
                    case 2:
                        j = J.EMAIL;
                        break;
                    case 3:
                        j = J.ISBN;
                        break;
                    case 4:
                        j = J.PHONE;
                        break;
                    case 5:
                        j = J.PRODUCT;
                        break;
                    case 6:
                        j = J.SMS;
                        break;
                    case 7:
                        j = J.TEXT;
                        break;
                    case 8:
                        j = J.URL;
                        break;
                    case 9:
                        j = J.WIFI;
                        break;
                    case 10:
                        j = J.GEO;
                        break;
                    case 11:
                        j = J.CALENDAR_EVENT;
                        break;
                    case 12:
                        j = J.DRIVER_LICENSE;
                        break;
                    case 13:
                        j = J.BOARDING_PASS;
                        break;
                    default:
                        j = null;
                        break;
                }
                if (j != null) {
                }
                break;
        }
        return true;
    }
}
