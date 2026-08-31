package C3;

import A.AbstractC0012i;
import A.AbstractC0017n;
import A.C0022t;
import A.C0023u;
import A.M;
import A.N;
import A.O;
import A.Q;
import B0.C0044i;
import B0.C0045j;
import B0.D;
import B0.InterfaceC0046k;
import B0.T;
import C0.W0;
import E3.h;
import J5.t;
import L0.C0189a;
import L0.F;
import M.N0;
import P.C0345b;
import P.C0363k;
import P.C0371o;
import P.C0372o0;
import P.D0;
import P.InterfaceC0347c;
import P.InterfaceC0360i0;
import P.W;
import R4.C0447f0;
import R4.C0458i;
import R4.C0466k;
import R4.C0468k1;
import R4.V0;
import R4.Y0;
import T1.A;
import T1.y;
import U4.AbstractC0534a;
import U4.C0547n;
import X.k;
import Z5.L;
import a.AbstractC0597a;
import a5.r;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.print.PrintAttributes;
import android.util.LongSparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationResponse;
import android.webkit.WebView;
import android.widget.EdgeEffect;
import android.widget.TextView;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import c0.AbstractC0727o;
import c0.C0714b;
import c0.C0717e;
import c0.C0722j;
import c0.InterfaceC0725m;
import c3.C0733c;
import c5.C0735b;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import com.web2native.MainActivity;
import e0.ViewOnAttachStateChangeListenerC1018c;
import e5.e;
import h5.AbstractC1127b;
import j0.AbstractC1145B;
import j0.C1150e;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import k1.i;
import k4.C1188a;
import kotlin.jvm.internal.m;
import m5.C1386y;
import n1.AbstractC1393a;
import n1.d;
import n5.l;
import n5.s;
import o0.C1411a;
import q2.w;
import q6.x;
import s4.f;
import s4.g;
import v.AbstractC1720o;
import v0.u;
import w1.AbstractC1826B;
import w1.AbstractC1835K;
import y4.AbstractC1918b;
import z0.AbstractC1933J;
import z0.C1949i;
import z0.InterfaceC1925B;
import z0.InterfaceC1926C;
import z0.InterfaceC1927D;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static Context f1182q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static Boolean f1183r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static boolean f1184s = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final V5.a A(V5.a aVar) {
        m.e(aVar, "<this>");
        return aVar.b().g() ? aVar : new L(aVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final PrintAttributes.MediaSize B(String str) {
        int iHashCode = str.hashCode();
        switch (iHashCode) {
            case -2125940183:
                if (str.equals("ISO_A0")) {
                    PrintAttributes.MediaSize mediaSize = PrintAttributes.MediaSize.ISO_A0;
                    m.b(mediaSize);
                    return mediaSize;
                }
                break;
            case -2125940182:
                if (str.equals("ISO_A1")) {
                    PrintAttributes.MediaSize mediaSize2 = PrintAttributes.MediaSize.ISO_A1;
                    m.b(mediaSize2);
                    return mediaSize2;
                }
                break;
            case -2125940181:
                if (str.equals("ISO_A2")) {
                    PrintAttributes.MediaSize mediaSize3 = PrintAttributes.MediaSize.ISO_A2;
                    m.b(mediaSize3);
                    return mediaSize3;
                }
                break;
            case -2125940180:
                if (str.equals("ISO_A3")) {
                    PrintAttributes.MediaSize mediaSize4 = PrintAttributes.MediaSize.ISO_A3;
                    m.b(mediaSize4);
                    return mediaSize4;
                }
                break;
            case -2125940179:
                if (str.equals("ISO_A4")) {
                    PrintAttributes.MediaSize mediaSize5 = PrintAttributes.MediaSize.ISO_A4;
                    m.b(mediaSize5);
                    return mediaSize5;
                }
                break;
            case -2125940178:
                if (str.equals("ISO_A5")) {
                    PrintAttributes.MediaSize mediaSize6 = PrintAttributes.MediaSize.ISO_A5;
                    m.b(mediaSize6);
                    return mediaSize6;
                }
                break;
            case -2125940177:
                if (str.equals("ISO_A6")) {
                    PrintAttributes.MediaSize mediaSize7 = PrintAttributes.MediaSize.ISO_A6;
                    m.b(mediaSize7);
                    return mediaSize7;
                }
                break;
            case -2125940176:
                if (str.equals("ISO_A7")) {
                    PrintAttributes.MediaSize mediaSize8 = PrintAttributes.MediaSize.ISO_A7;
                    m.b(mediaSize8);
                    return mediaSize8;
                }
                break;
            case -2125940175:
                if (str.equals("ISO_A8")) {
                    PrintAttributes.MediaSize mediaSize9 = PrintAttributes.MediaSize.ISO_A8;
                    m.b(mediaSize9);
                    return mediaSize9;
                }
                break;
            case -2125940174:
                if (str.equals("ISO_A9")) {
                    PrintAttributes.MediaSize mediaSize10 = PrintAttributes.MediaSize.ISO_A9;
                    m.b(mediaSize10);
                    return mediaSize10;
                }
                break;
            default:
                switch (iHashCode) {
                    case -2125940152:
                        if (str.equals("ISO_B0")) {
                            PrintAttributes.MediaSize mediaSize11 = PrintAttributes.MediaSize.ISO_B0;
                            m.b(mediaSize11);
                            return mediaSize11;
                        }
                        break;
                    case -2125940151:
                        if (str.equals("ISO_B1")) {
                            PrintAttributes.MediaSize mediaSize12 = PrintAttributes.MediaSize.ISO_B1;
                            m.b(mediaSize12);
                            return mediaSize12;
                        }
                        break;
                    case -2125940150:
                        if (str.equals("ISO_B2")) {
                            PrintAttributes.MediaSize mediaSize13 = PrintAttributes.MediaSize.ISO_B2;
                            m.b(mediaSize13);
                            return mediaSize13;
                        }
                        break;
                    case -2125940149:
                        if (str.equals("ISO_B3")) {
                            PrintAttributes.MediaSize mediaSize14 = PrintAttributes.MediaSize.ISO_B3;
                            m.b(mediaSize14);
                            return mediaSize14;
                        }
                        break;
                    case -2125940148:
                        if (str.equals("ISO_B4")) {
                            PrintAttributes.MediaSize mediaSize15 = PrintAttributes.MediaSize.ISO_B4;
                            m.b(mediaSize15);
                            return mediaSize15;
                        }
                        break;
                    case -2125940147:
                        if (str.equals("ISO_B5")) {
                            PrintAttributes.MediaSize mediaSize16 = PrintAttributes.MediaSize.ISO_B5;
                            m.b(mediaSize16);
                            return mediaSize16;
                        }
                        break;
                    case -2125940146:
                        if (str.equals("ISO_B6")) {
                            PrintAttributes.MediaSize mediaSize17 = PrintAttributes.MediaSize.ISO_B6;
                            m.b(mediaSize17);
                            return mediaSize17;
                        }
                        break;
                    case -2125940145:
                        if (str.equals("ISO_B7")) {
                            PrintAttributes.MediaSize mediaSize18 = PrintAttributes.MediaSize.ISO_B7;
                            m.b(mediaSize18);
                            return mediaSize18;
                        }
                        break;
                    case -2125940144:
                        if (str.equals("ISO_B8")) {
                            PrintAttributes.MediaSize mediaSize19 = PrintAttributes.MediaSize.ISO_B8;
                            m.b(mediaSize19);
                            return mediaSize19;
                        }
                        break;
                    case -2125940143:
                        if (str.equals("ISO_B9")) {
                            PrintAttributes.MediaSize mediaSize20 = PrintAttributes.MediaSize.ISO_B9;
                            m.b(mediaSize20);
                            return mediaSize20;
                        }
                        break;
                    default:
                        switch (iHashCode) {
                            case -2125940121:
                                if (str.equals("ISO_C0")) {
                                    PrintAttributes.MediaSize mediaSize21 = PrintAttributes.MediaSize.ISO_C0;
                                    m.b(mediaSize21);
                                    return mediaSize21;
                                }
                                break;
                            case -2125940120:
                                if (str.equals("ISO_C1")) {
                                    PrintAttributes.MediaSize mediaSize22 = PrintAttributes.MediaSize.ISO_C1;
                                    m.b(mediaSize22);
                                    return mediaSize22;
                                }
                                break;
                            case -2125940119:
                                if (str.equals("ISO_C2")) {
                                    PrintAttributes.MediaSize mediaSize23 = PrintAttributes.MediaSize.ISO_C2;
                                    m.b(mediaSize23);
                                    return mediaSize23;
                                }
                                break;
                            case -2125940118:
                                if (str.equals("ISO_C3")) {
                                    PrintAttributes.MediaSize mediaSize24 = PrintAttributes.MediaSize.ISO_C3;
                                    m.b(mediaSize24);
                                    return mediaSize24;
                                }
                                break;
                            case -2125940117:
                                if (str.equals("ISO_C4")) {
                                    PrintAttributes.MediaSize mediaSize25 = PrintAttributes.MediaSize.ISO_C4;
                                    m.b(mediaSize25);
                                    return mediaSize25;
                                }
                                break;
                            case -2125940116:
                                if (str.equals("ISO_C5")) {
                                    PrintAttributes.MediaSize mediaSize26 = PrintAttributes.MediaSize.ISO_C5;
                                    m.b(mediaSize26);
                                    return mediaSize26;
                                }
                                break;
                            case -2125940115:
                                if (str.equals("ISO_C6")) {
                                    PrintAttributes.MediaSize mediaSize27 = PrintAttributes.MediaSize.ISO_C6;
                                    m.b(mediaSize27);
                                    return mediaSize27;
                                }
                                break;
                            case -2125940114:
                                if (str.equals("ISO_C7")) {
                                    PrintAttributes.MediaSize mediaSize28 = PrintAttributes.MediaSize.ISO_C7;
                                    m.b(mediaSize28);
                                    return mediaSize28;
                                }
                                break;
                            case -2125940113:
                                if (str.equals("ISO_C8")) {
                                    PrintAttributes.MediaSize mediaSize29 = PrintAttributes.MediaSize.ISO_C8;
                                    m.b(mediaSize29);
                                    return mediaSize29;
                                }
                                break;
                            case -2125940112:
                                if (str.equals("ISO_C9")) {
                                    PrintAttributes.MediaSize mediaSize30 = PrintAttributes.MediaSize.ISO_C9;
                                    m.b(mediaSize30);
                                    return mediaSize30;
                                }
                                break;
                            default:
                                switch (iHashCode) {
                                    case -2121788519:
                                        if (str.equals("OM_DAI_PA_KAI")) {
                                            PrintAttributes.MediaSize mediaSize31 = PrintAttributes.MediaSize.OM_DAI_PA_KAI;
                                            m.b(mediaSize31);
                                            return mediaSize31;
                                        }
                                        break;
                                    case -1926817635:
                                        if (str.equals("PRC_10")) {
                                            PrintAttributes.MediaSize mediaSize32 = PrintAttributes.MediaSize.PRC_10;
                                            m.b(mediaSize32);
                                            return mediaSize32;
                                        }
                                        break;
                                    case -1872329652:
                                        if (str.equals("ROC_8K")) {
                                            PrintAttributes.MediaSize mediaSize33 = PrintAttributes.MediaSize.ROC_8K;
                                            m.b(mediaSize33);
                                            return mediaSize33;
                                        }
                                        break;
                                    case -1520137929:
                                        if (str.equals("OM_JUURO_KU_KAI")) {
                                            PrintAttributes.MediaSize mediaSize34 = PrintAttributes.MediaSize.OM_JUURO_KU_KAI;
                                            m.b(mediaSize34);
                                            return mediaSize34;
                                        }
                                        break;
                                    case -1479636154:
                                        if (str.equals("ISO_A10")) {
                                            PrintAttributes.MediaSize mediaSize35 = PrintAttributes.MediaSize.ISO_A10;
                                            m.b(mediaSize35);
                                            return mediaSize35;
                                        }
                                        break;
                                    case -1479635193:
                                        if (str.equals("ISO_B10")) {
                                            PrintAttributes.MediaSize mediaSize36 = PrintAttributes.MediaSize.ISO_B10;
                                            m.b(mediaSize36);
                                            return mediaSize36;
                                        }
                                        break;
                                    case -1479634232:
                                        if (str.equals("ISO_C10")) {
                                            PrintAttributes.MediaSize mediaSize37 = PrintAttributes.MediaSize.ISO_C10;
                                            m.b(mediaSize37);
                                            return mediaSize37;
                                        }
                                        break;
                                    case -1350795023:
                                        if (str.equals("NA_FOOLSCAP")) {
                                            PrintAttributes.MediaSize mediaSize38 = PrintAttributes.MediaSize.NA_FOOLSCAP;
                                            m.b(mediaSize38);
                                            return mediaSize38;
                                        }
                                        break;
                                    case -1346665732:
                                        if (str.equals("JIS_EXEC")) {
                                            PrintAttributes.MediaSize mediaSize39 = PrintAttributes.MediaSize.JIS_EXEC;
                                            m.b(mediaSize39);
                                            return mediaSize39;
                                        }
                                        break;
                                    case -1273834123:
                                        if (str.equals("NA_LEDGER")) {
                                            PrintAttributes.MediaSize mediaSize40 = PrintAttributes.MediaSize.NA_LEDGER;
                                            m.b(mediaSize40);
                                            return mediaSize40;
                                        }
                                        break;
                                    case -1273344974:
                                        if (str.equals("NA_LETTER")) {
                                            PrintAttributes.MediaSize mediaSize41 = PrintAttributes.MediaSize.NA_LETTER;
                                            m.b(mediaSize41);
                                            return mediaSize41;
                                        }
                                        break;
                                    case -1187302264:
                                        if (str.equals("JPN_HAGAKI")) {
                                            PrintAttributes.MediaSize mediaSize42 = PrintAttributes.MediaSize.JPN_HAGAKI;
                                            m.b(mediaSize42);
                                            return mediaSize42;
                                        }
                                        break;
                                    case -1149467379:
                                        if (str.equals("NA_LEGAL")) {
                                            PrintAttributes.MediaSize mediaSize43 = PrintAttributes.MediaSize.NA_LEGAL;
                                            m.b(mediaSize43);
                                            return mediaSize43;
                                        }
                                        break;
                                    case -1115990372:
                                        if (str.equals("NA_QUARTO")) {
                                            PrintAttributes.MediaSize mediaSize44 = PrintAttributes.MediaSize.NA_QUARTO;
                                            m.b(mediaSize44);
                                            return mediaSize44;
                                        }
                                        break;
                                    case -968438346:
                                        if (str.equals("JPN_OUFUKU")) {
                                            PrintAttributes.MediaSize mediaSize45 = PrintAttributes.MediaSize.JPN_OUFUKU;
                                            m.b(mediaSize45);
                                            return mediaSize45;
                                        }
                                        break;
                                    case -874728938:
                                        if (str.equals("JIS_B10")) {
                                            PrintAttributes.MediaSize mediaSize46 = PrintAttributes.MediaSize.JIS_B10;
                                            m.b(mediaSize46);
                                            return mediaSize46;
                                        }
                                        break;
                                    case -540047162:
                                        if (str.equals("UNKNOWN_LANDSCAPE")) {
                                            PrintAttributes.MediaSize mediaSize47 = PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE;
                                            m.b(mediaSize47);
                                            return mediaSize47;
                                        }
                                        break;
                                    case -442682352:
                                        if (str.equals("UNKNOWN_PORTRAIT")) {
                                            PrintAttributes.MediaSize mediaSize48 = PrintAttributes.MediaSize.UNKNOWN_PORTRAIT;
                                            m.b(mediaSize48);
                                            return mediaSize48;
                                        }
                                        break;
                                    case -170915757:
                                        if (str.equals("NA_GOVT_LETTER")) {
                                            PrintAttributes.MediaSize mediaSize49 = PrintAttributes.MediaSize.NA_GOVT_LETTER;
                                            m.b(mediaSize49);
                                            return mediaSize49;
                                        }
                                        break;
                                    case 348711606:
                                        if (str.equals("NA_MONARCH")) {
                                            PrintAttributes.MediaSize mediaSize50 = PrintAttributes.MediaSize.NA_MONARCH;
                                            m.b(mediaSize50);
                                            return mediaSize50;
                                        }
                                        break;
                                    case 380116923:
                                        if (str.equals("JPN_KAKU2")) {
                                            PrintAttributes.MediaSize mediaSize51 = PrintAttributes.MediaSize.JPN_KAKU2;
                                            m.b(mediaSize51);
                                            return mediaSize51;
                                        }
                                        break;
                                    case 398195720:
                                        if (str.equals("PRC_16K")) {
                                            PrintAttributes.MediaSize mediaSize52 = PrintAttributes.MediaSize.PRC_16K;
                                            m.b(mediaSize52);
                                            return mediaSize52;
                                        }
                                        break;
                                    case 427903738:
                                        if (str.equals("JPN_KAHU")) {
                                            PrintAttributes.MediaSize mediaSize53 = PrintAttributes.MediaSize.JPN_KAHU;
                                            m.b(mediaSize53);
                                            return mediaSize53;
                                        }
                                        break;
                                    case 428334636:
                                        if (str.equals("JPN_YOU4")) {
                                            PrintAttributes.MediaSize mediaSize54 = PrintAttributes.MediaSize.JPN_YOU4;
                                            m.b(mediaSize54);
                                            return mediaSize54;
                                        }
                                        break;
                                    case 764196838:
                                        if (str.equals("OM_PA_KAI")) {
                                            PrintAttributes.MediaSize mediaSize55 = PrintAttributes.MediaSize.OM_PA_KAI;
                                            m.b(mediaSize55);
                                            return mediaSize55;
                                        }
                                        break;
                                    case 1117708943:
                                        if (str.equals("NA_JUNIOR_LEGAL")) {
                                            PrintAttributes.MediaSize mediaSize56 = PrintAttributes.MediaSize.NA_JUNIOR_LEGAL;
                                            m.b(mediaSize56);
                                            return mediaSize56;
                                        }
                                        break;
                                    case 1132216759:
                                        if (str.equals("NA_INDEX_3X5")) {
                                            PrintAttributes.MediaSize mediaSize57 = PrintAttributes.MediaSize.NA_INDEX_3X5;
                                            m.b(mediaSize57);
                                            return mediaSize57;
                                        }
                                        break;
                                    case 1132217721:
                                        if (str.equals("NA_INDEX_4X6")) {
                                            PrintAttributes.MediaSize mediaSize58 = PrintAttributes.MediaSize.NA_INDEX_4X6;
                                            m.b(mediaSize58);
                                            return mediaSize58;
                                        }
                                        break;
                                    case 1132218684:
                                        if (str.equals("NA_INDEX_5X8")) {
                                            PrintAttributes.MediaSize mediaSize59 = PrintAttributes.MediaSize.NA_INDEX_5X8;
                                            m.b(mediaSize59);
                                            return mediaSize59;
                                        }
                                        break;
                                    case 1854704711:
                                        if (str.equals("NA_TABLOID")) {
                                            PrintAttributes.MediaSize mediaSize60 = PrintAttributes.MediaSize.NA_TABLOID;
                                            m.b(mediaSize60);
                                            return mediaSize60;
                                        }
                                        break;
                                    case 2087315629:
                                        if (str.equals("ROC_16K")) {
                                            PrintAttributes.MediaSize mediaSize61 = PrintAttributes.MediaSize.ROC_16K;
                                            m.b(mediaSize61);
                                            return mediaSize61;
                                        }
                                        break;
                                    default:
                                        switch (iHashCode) {
                                            case -2106427047:
                                                if (str.equals("JIS_B0")) {
                                                    PrintAttributes.MediaSize mediaSize62 = PrintAttributes.MediaSize.JIS_B0;
                                                    m.b(mediaSize62);
                                                    return mediaSize62;
                                                }
                                                break;
                                            case -2106427046:
                                                if (str.equals("JIS_B1")) {
                                                    PrintAttributes.MediaSize mediaSize63 = PrintAttributes.MediaSize.JIS_B1;
                                                    m.b(mediaSize63);
                                                    return mediaSize63;
                                                }
                                                break;
                                            case -2106427045:
                                                if (str.equals("JIS_B2")) {
                                                    PrintAttributes.MediaSize mediaSize64 = PrintAttributes.MediaSize.JIS_B2;
                                                    m.b(mediaSize64);
                                                    return mediaSize64;
                                                }
                                                break;
                                            case -2106427044:
                                                if (str.equals("JIS_B3")) {
                                                    PrintAttributes.MediaSize mediaSize65 = PrintAttributes.MediaSize.JIS_B3;
                                                    m.b(mediaSize65);
                                                    return mediaSize65;
                                                }
                                                break;
                                            case -2106427043:
                                                if (str.equals("JIS_B4")) {
                                                    PrintAttributes.MediaSize mediaSize66 = PrintAttributes.MediaSize.JIS_B4;
                                                    m.b(mediaSize66);
                                                    return mediaSize66;
                                                }
                                                break;
                                            case -2106427042:
                                                if (str.equals("JIS_B5")) {
                                                    PrintAttributes.MediaSize mediaSize67 = PrintAttributes.MediaSize.JIS_B5;
                                                    m.b(mediaSize67);
                                                    return mediaSize67;
                                                }
                                                break;
                                            case -2106427041:
                                                if (str.equals("JIS_B6")) {
                                                    PrintAttributes.MediaSize mediaSize68 = PrintAttributes.MediaSize.JIS_B6;
                                                    m.b(mediaSize68);
                                                    return mediaSize68;
                                                }
                                                break;
                                            case -2106427040:
                                                if (str.equals("JIS_B7")) {
                                                    PrintAttributes.MediaSize mediaSize69 = PrintAttributes.MediaSize.JIS_B7;
                                                    m.b(mediaSize69);
                                                    return mediaSize69;
                                                }
                                                break;
                                            case -2106427039:
                                                if (str.equals("JIS_B8")) {
                                                    PrintAttributes.MediaSize mediaSize70 = PrintAttributes.MediaSize.JIS_B8;
                                                    m.b(mediaSize70);
                                                    return mediaSize70;
                                                }
                                                break;
                                            case -2106427038:
                                                if (str.equals("JIS_B9")) {
                                                    PrintAttributes.MediaSize mediaSize71 = PrintAttributes.MediaSize.JIS_B9;
                                                    m.b(mediaSize71);
                                                    return mediaSize71;
                                                }
                                                break;
                                            default:
                                                switch (iHashCode) {
                                                    case 76391923:
                                                        if (str.equals("PRC_1")) {
                                                            PrintAttributes.MediaSize mediaSize72 = PrintAttributes.MediaSize.PRC_1;
                                                            m.b(mediaSize72);
                                                            return mediaSize72;
                                                        }
                                                        break;
                                                    case 76391924:
                                                        if (str.equals("PRC_2")) {
                                                            PrintAttributes.MediaSize mediaSize73 = PrintAttributes.MediaSize.PRC_2;
                                                            m.b(mediaSize73);
                                                            return mediaSize73;
                                                        }
                                                        break;
                                                    case 76391925:
                                                        if (str.equals("PRC_3")) {
                                                            PrintAttributes.MediaSize mediaSize74 = PrintAttributes.MediaSize.PRC_3;
                                                            m.b(mediaSize74);
                                                            return mediaSize74;
                                                        }
                                                        break;
                                                    case 76391926:
                                                        if (str.equals("PRC_4")) {
                                                            PrintAttributes.MediaSize mediaSize75 = PrintAttributes.MediaSize.PRC_4;
                                                            m.b(mediaSize75);
                                                            return mediaSize75;
                                                        }
                                                        break;
                                                    case 76391927:
                                                        if (str.equals("PRC_5")) {
                                                            PrintAttributes.MediaSize mediaSize76 = PrintAttributes.MediaSize.PRC_5;
                                                            m.b(mediaSize76);
                                                            return mediaSize76;
                                                        }
                                                        break;
                                                    case 76391928:
                                                        if (str.equals("PRC_6")) {
                                                            PrintAttributes.MediaSize mediaSize77 = PrintAttributes.MediaSize.PRC_6;
                                                            m.b(mediaSize77);
                                                            return mediaSize77;
                                                        }
                                                        break;
                                                    case 76391929:
                                                        if (str.equals("PRC_7")) {
                                                            PrintAttributes.MediaSize mediaSize78 = PrintAttributes.MediaSize.PRC_7;
                                                            m.b(mediaSize78);
                                                            return mediaSize78;
                                                        }
                                                        break;
                                                    case 76391930:
                                                        if (str.equals("PRC_8")) {
                                                            PrintAttributes.MediaSize mediaSize79 = PrintAttributes.MediaSize.PRC_8;
                                                            m.b(mediaSize79);
                                                            return mediaSize79;
                                                        }
                                                        break;
                                                    case 76391931:
                                                        if (str.equals("PRC_9")) {
                                                            PrintAttributes.MediaSize mediaSize80 = PrintAttributes.MediaSize.PRC_9;
                                                            m.b(mediaSize80);
                                                            return mediaSize80;
                                                        }
                                                        break;
                                                    default:
                                                        switch (iHashCode) {
                                                            case 372941136:
                                                                if (str.equals("JPN_CHOU2")) {
                                                                    PrintAttributes.MediaSize mediaSize81 = PrintAttributes.MediaSize.JPN_CHOU2;
                                                                    m.b(mediaSize81);
                                                                    return mediaSize81;
                                                                }
                                                                break;
                                                            case 372941137:
                                                                if (str.equals("JPN_CHOU3")) {
                                                                    PrintAttributes.MediaSize mediaSize82 = PrintAttributes.MediaSize.JPN_CHOU3;
                                                                    m.b(mediaSize82);
                                                                    return mediaSize82;
                                                                }
                                                                break;
                                                            case 372941138:
                                                                if (str.equals("JPN_CHOU4")) {
                                                                    PrintAttributes.MediaSize mediaSize83 = PrintAttributes.MediaSize.JPN_CHOU4;
                                                                    m.b(mediaSize83);
                                                                    return mediaSize83;
                                                                }
                                                                break;
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
                break;
        }
        if (Build.VERSION.SDK_INT < 31) {
            PrintAttributes.MediaSize mediaSize84 = PrintAttributes.MediaSize.ISO_A4;
            m.b(mediaSize84);
            return mediaSize84;
        }
        int iHashCode2 = str.hashCode();
        if (iHashCode2 != -1635448183) {
            if (iHashCode2 != 1493735629) {
                if (iHashCode2 != 1552508370) {
                    switch (iHashCode2) {
                        case -1576777052:
                            if (str.equals("NA_ARCH_A")) {
                                PrintAttributes.MediaSize mediaSize85 = PrintAttributes.MediaSize.NA_ARCH_A;
                                m.b(mediaSize85);
                                return mediaSize85;
                            }
                            break;
                        case -1576777051:
                            if (str.equals("NA_ARCH_B")) {
                                PrintAttributes.MediaSize mediaSize86 = PrintAttributes.MediaSize.NA_ARCH_B;
                                m.b(mediaSize86);
                                return mediaSize86;
                            }
                            break;
                        case -1576777050:
                            if (str.equals("NA_ARCH_C")) {
                                PrintAttributes.MediaSize mediaSize87 = PrintAttributes.MediaSize.NA_ARCH_C;
                                m.b(mediaSize87);
                                return mediaSize87;
                            }
                            break;
                        case -1576777049:
                            if (str.equals("NA_ARCH_D")) {
                                PrintAttributes.MediaSize mediaSize88 = PrintAttributes.MediaSize.NA_ARCH_D;
                                m.b(mediaSize88);
                                return mediaSize88;
                            }
                            break;
                        case -1576777048:
                            if (str.equals("NA_ARCH_E")) {
                                PrintAttributes.MediaSize mediaSize89 = PrintAttributes.MediaSize.NA_ARCH_E;
                                m.b(mediaSize89);
                                return mediaSize89;
                            }
                            break;
                        default:
                            switch (iHashCode2) {
                                case 1935475271:
                                    if (str.equals("ANSI_C")) {
                                        PrintAttributes.MediaSize mediaSize90 = PrintAttributes.MediaSize.ANSI_C;
                                        m.b(mediaSize90);
                                        return mediaSize90;
                                    }
                                    break;
                                case 1935475272:
                                    if (str.equals("ANSI_D")) {
                                        PrintAttributes.MediaSize mediaSize91 = PrintAttributes.MediaSize.ANSI_D;
                                        m.b(mediaSize91);
                                        return mediaSize91;
                                    }
                                    break;
                                case 1935475273:
                                    if (str.equals("ANSI_E")) {
                                        PrintAttributes.MediaSize mediaSize92 = PrintAttributes.MediaSize.ANSI_E;
                                        m.b(mediaSize92);
                                        return mediaSize92;
                                    }
                                    break;
                                case 1935475274:
                                    if (str.equals("ANSI_F")) {
                                        PrintAttributes.MediaSize mediaSize93 = PrintAttributes.MediaSize.ANSI_F;
                                        m.b(mediaSize93);
                                        return mediaSize93;
                                    }
                                    break;
                            }
                            break;
                    }
                } else if (str.equals("NA_SUPER_B")) {
                    PrintAttributes.MediaSize mediaSize94 = PrintAttributes.MediaSize.NA_SUPER_B;
                    m.b(mediaSize94);
                    return mediaSize94;
                }
            } else if (str.equals("JPN_OE_PHOTO_L")) {
                PrintAttributes.MediaSize mediaSize95 = PrintAttributes.MediaSize.JPN_OE_PHOTO_L;
                m.b(mediaSize95);
                return mediaSize95;
            }
        } else if (str.equals("NA_ARCH_E1")) {
            PrintAttributes.MediaSize mediaSize96 = PrintAttributes.MediaSize.NA_ARCH_E1;
            m.b(mediaSize96);
            return mediaSize96;
        }
        PrintAttributes.MediaSize mediaSize97 = PrintAttributes.MediaSize.ISO_A4;
        m.b(mediaSize97);
        return mediaSize97;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean C(R4.C0468k1 r5, java.lang.String r6) {
        /*
            java.lang.String r0 = "dataObject"
            kotlin.jvm.internal.m.e(r5, r0)
            R4.i r0 = r5.f7073d
            if (r6 == 0) goto L123
            java.lang.String r1 = "w2n"
            r2 = 0
            boolean r1 = J5.t.G0(r6, r1, r2)
            if (r1 != 0) goto L14
            goto L123
        L14:
            java.lang.String r1 = "w2n://orufy-connect"
            boolean r1 = J5.t.G0(r6, r1, r2)
            if (r1 == 0) goto L38
            if (r0 == 0) goto L2b
            R4.G r1 = r0.f7007m
            if (r1 == 0) goto L2b
            java.lang.Boolean r1 = r1.f6758a
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r1 = kotlin.jvm.internal.m.a(r1, r3)
            goto L2c
        L2b:
            r1 = r2
        L2c:
            if (r1 == 0) goto L38
            com.web2native.OrufyConnectHandlerUtil r6 = r5.f7052L
            if (r6 == 0) goto Lfc
            com.web2native.MainActivity r5 = r5.f7067a
            r6.showConversation(r5)
            return r2
        L38:
            java.lang.String r1 = "https"
            boolean r1 = J5.t.G0(r6, r1, r2)
            if (r1 != 0) goto L123
            java.lang.String r1 = "http"
            boolean r1 = J5.t.G0(r6, r1, r2)
            if (r1 != 0) goto L123
            java.lang.String r1 = "w2n://jsFunction:"
            boolean r3 = J5.m.K0(r6, r1)
            if (r3 == 0) goto L65
            java.lang.String r6 = J5.m.a1(r6, r1)
            java.lang.String r0 = ""
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto Lfc
            android.webkit.WebView r5 = r5.f7084k
            if (r5 == 0) goto Lfc
            r0 = 0
            r5.evaluateJavascript(r6, r0)
            return r2
        L65:
            java.lang.String r1 = "w2n://notification-screen"
            boolean r1 = J5.m.K0(r6, r1)
            java.lang.String r3 = "<set-?>"
            java.lang.String r4 = "/"
            if (r1 == 0) goto Laa
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r0 = r0.toString()
            java.lang.String r6 = java.net.URLEncoder.encode(r6, r0)
            T1.u r0 = r5.f7075e
            if (r0 != 0) goto L94
            java.lang.String r0 = "notificationScreen"
            r5.f7080h = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            kotlin.jvm.internal.m.e(r0, r3)
            r5.i = r0
        L94:
            T1.u r5 = r5.f7075e
            if (r5 == 0) goto Lfc
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "notificationScreen/"
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            T1.u.b(r5, r6)
            return r2
        Laa:
            java.lang.String r1 = "w2n://download-screen"
            boolean r1 = J5.m.K0(r6, r1)
            if (r1 == 0) goto Lfd
            if (r0 == 0) goto Lc1
            R4.Y r0 = r0.f7020z
            if (r0 == 0) goto Lc1
            java.lang.Boolean r0 = r0.f6884a
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.m.a(r0, r1)
            goto Lc2
        Lc1:
            r0 = r2
        Lc2:
            if (r0 == 0) goto Lfc
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r0 = r0.toString()
            java.lang.String r6 = java.net.URLEncoder.encode(r6, r0)
            T1.u r0 = r5.f7075e
            if (r0 != 0) goto Le7
            java.lang.String r0 = "downloadScreen"
            r5.f7080h = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            kotlin.jvm.internal.m.e(r0, r3)
            r5.i = r0
        Le7:
            T1.u r5 = r5.f7075e
            if (r5 == 0) goto Lfc
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "downloadScreen/"
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            T1.u.b(r5, r6)
        Lfc:
            return r2
        Lfd:
            java.lang.String r0 = "w2n://go_back"
            boolean r0 = J5.m.K0(r6, r0)
            if (r0 == 0) goto L115
            java.lang.String r0 = "topBar"
            boolean r6 = J5.m.K0(r6, r0)
            if (r6 == 0) goto L111
            m(r5)
            return r2
        L111:
            m(r5)
            return r2
        L115:
            java.lang.String r0 = "w2n://permission"
            boolean r0 = J5.m.K0(r6, r0)
            if (r0 == 0) goto L123
            g5.h r5 = r5.f7059S
            r5.f(r6, r2)
            return r2
        L123:
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: C3.a.C(R4.k1, java.lang.String):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean E(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static synchronized boolean F(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f1182q;
        if (context2 != null && (bool = f1183r) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f1183r = null;
        if (B3.b.b()) {
            f1183r = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        } else {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                f1183r = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                f1183r = Boolean.FALSE;
            }
        }
        f1182q = applicationContext;
        return f1183r.booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean G(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String H(String str, Object... objArr) {
        int iIndexOf;
        String string;
        int i = 0;
        for (int i7 = 0; i7 < objArr.length; i7++) {
            Object obj = objArr[i7];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e7) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str2, (Throwable) e7);
                    string = "<" + str2 + " threw " + e7.getClass().getName() + ">";
                }
            }
            objArr[i7] = string;
        }
        StringBuilder sb = new StringBuilder((objArr.length * 16) + str.length());
        int i8 = 0;
        while (i < objArr.length && (iIndexOf = str.indexOf("%s", i8)) != -1) {
            sb.append((CharSequence) str, i8, iIndexOf);
            sb.append(objArr[i]);
            i8 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i8, str.length());
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i9 = i + 1; i9 < objArr.length; i9++) {
                sb.append(", ");
                sb.append(objArr[i9]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static InterfaceC1927D I(M m4, int i, int i7, int i8, int i9, int i10, T t6, List list, AbstractC1933J[] abstractC1933JArr, int i11) {
        int i12;
        float f;
        int i13;
        int i14;
        List list2 = list;
        long j = i10;
        int[] iArr = new int[i11];
        int iMax = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int iMin = 0;
        float f7 = 0.0f;
        while (true) {
            if (i15 >= i11) {
                break;
            }
            InterfaceC1925B interfaceC1925B = (InterfaceC1925B) list2.get(i15);
            long j7 = j;
            Object objG = interfaceC1925B.g();
            N n7 = objG instanceof N ? (N) objG : null;
            float f8 = n7 != null ? n7.f34a : 0.0f;
            if (f8 > 0.0f) {
                f7 += f8;
                i16++;
            } else {
                int i18 = i8 - i17;
                AbstractC1933J abstractC1933JA = abstractC1933JArr[i15];
                if (abstractC1933JA == null) {
                    if (i8 == Integer.MAX_VALUE) {
                        i13 = i18;
                        i14 = Integer.MAX_VALUE;
                    } else if (i18 < 0) {
                        i13 = i18;
                        i14 = 0;
                    } else {
                        i14 = i18;
                        i13 = i14;
                    }
                    abstractC1933JA = interfaceC1925B.a(m4.d(0, i14, i9, false));
                } else {
                    i13 = i18;
                }
                int iB = m4.b(abstractC1933JA);
                int iE = m4.e(abstractC1933JA);
                iArr[i15] = iB;
                int i19 = i13 - iB;
                if (i19 < 0) {
                    i19 = 0;
                }
                iMin = Math.min(i10, i19);
                i17 += iB + iMin;
                iMax = Math.max(iMax, iE);
                abstractC1933JArr[i15] = abstractC1933JA;
            }
            i15++;
            j = j7;
        }
        long j8 = j;
        if (i16 == 0) {
            i17 -= iMin;
            i12 = 0;
        } else {
            long j9 = ((long) (i16 - 1)) * j8;
            long jRound = ((long) ((i8 != Integer.MAX_VALUE ? i8 : i) - i17)) - j9;
            if (jRound < 0) {
                jRound = 0;
            }
            float f9 = jRound / f7;
            for (int i20 = 0; i20 < i11; i20++) {
                Object objG2 = ((InterfaceC1925B) list2.get(i20)).g();
                N n8 = objG2 instanceof N ? (N) objG2 : null;
                jRound -= (long) Math.round((n8 != null ? n8.f34a : 0.0f) * f9);
            }
            int i21 = 0;
            int i22 = 0;
            while (i22 < i11) {
                if (abstractC1933JArr[i22] == null) {
                    InterfaceC1925B interfaceC1925B2 = (InterfaceC1925B) list2.get(i22);
                    Object objG3 = interfaceC1925B2.g();
                    f = f9;
                    N n9 = objG3 instanceof N ? (N) objG3 : null;
                    float f10 = n9 != null ? n9.f34a : 0.0f;
                    if (f10 <= 0.0f) {
                        B.a.b("All weights <= 0 should have placeables");
                    }
                    float f11 = f10;
                    int iSignum = Long.signum(jRound);
                    jRound -= (long) iSignum;
                    int iMax2 = Math.max(0, Math.round(f11 * f) + iSignum);
                    AbstractC1933J abstractC1933JA2 = interfaceC1925B2.a(m4.d((!(n9 != null ? n9.f35b : true) || iMax2 == Integer.MAX_VALUE) ? 0 : iMax2, iMax2, i9, true));
                    int iB2 = m4.b(abstractC1933JA2);
                    int iE2 = m4.e(abstractC1933JA2);
                    iArr[i22] = iB2;
                    i21 += iB2;
                    int iMax3 = Math.max(iMax, iE2);
                    abstractC1933JArr[i22] = abstractC1933JA2;
                    iMax = iMax3;
                } else {
                    f = f9;
                }
                i22++;
                list2 = list;
                f9 = f;
            }
            i12 = (int) (((long) i21) + j9);
            int i23 = i8 - i17;
            if (i12 < 0) {
                i12 = 0;
            }
            if (i12 > i23) {
                i12 = i23;
            }
        }
        int i24 = i12 + i17;
        if (i24 < 0) {
            i24 = 0;
        }
        int iMax4 = Math.max(i24, i);
        int iMax5 = Math.max(iMax, Math.max(i7, 0));
        int[] iArr2 = new int[i11];
        m4.f(iMax4, iArr, iArr2, t6);
        return m4.a(abstractC1933JArr, t6, iArr2, iMax4, iMax5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void L(D0 d02, InterfaceC0347c interfaceC0347c, int i) {
        while (true) {
            int i7 = d02.f5306v;
            if (i > i7 && i < d02.f5305u) {
                return;
            }
            if (i7 == 0 && i == 0) {
                return;
            }
            d02.J();
            if (d02.w(d02.f5306v)) {
                interfaceC0347c.o();
            }
            d02.i();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int M(Context context, int i, int i7) {
        TypedValue typedValueM = AbstractC0597a.M(context, i);
        return (typedValueM == null || typedValueM.type != 16) ? i7 : typedValueM.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static TimeInterpolator N(Context context, int i, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!G(strValueOf, "cubic-bezier") && !G(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (G(strValueOf, "cubic-bezier")) {
            String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(",");
            if (strArrSplit.length == 4) {
                return new PathInterpolator(y(strArrSplit, 0), y(strArrSplit, 1), y(strArrSplit, 2), y(strArrSplit, 3));
            }
            throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
        }
        if (!G(strValueOf, "path")) {
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(strValueOf));
        }
        String strSubstring = strValueOf.substring(5, strValueOf.length() - 1);
        Path path = new Path();
        try {
            d.b(h.w(strSubstring), path);
            return new PathInterpolator(path);
        } catch (RuntimeException e7) {
            throw new RuntimeException("Error in parsing ".concat(strSubstring), e7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void Q(View view, g gVar) {
        C1188a c1188a = gVar.f16505q.f16480b;
        if (c1188a == null || !c1188a.f14123a) {
            return;
        }
        float fE = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            WeakHashMap weakHashMap = AbstractC1835K.f18149a;
            fE += AbstractC1826B.e((View) parent);
        }
        f fVar = gVar.f16505q;
        if (fVar.f16487l != fE) {
            fVar.f16487l = fE;
            gVar.n();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void T(ViewGroup viewGroup, boolean z5) {
        if (Build.VERSION.SDK_INT >= 29) {
            w.b(viewGroup, z5);
        } else if (f1184s) {
            try {
                w.b(viewGroup, z5);
            } catch (NoSuchMethodError unused) {
                f1184s = false;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Bitmap U(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                return (intrinsicWidth == bitmapDrawable.getBitmap().getWidth() && intrinsicHeight == bitmapDrawable.getBitmap().getHeight()) ? bitmapDrawable.getBitmap() : Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), intrinsicWidth, intrinsicHeight, true);
            }
            throw new IllegalArgumentException("bitmap is null");
        }
        Rect bounds = drawable.getBounds();
        int i = bounds.left;
        int i7 = bounds.top;
        int i8 = bounds.right;
        int i9 = bounds.bottom;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.draw(new Canvas(bitmapCreateBitmap));
        drawable.setBounds(i, i7, i8, i9);
        return bitmapCreateBitmap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void d(a5.c cVar, String str, String str2, MainActivity mainActivity, B5.c cVar2, B5.a aVar, C0371o c0371o, int i) {
        boolean z5;
        boolean z6;
        C0371o c0371o2 = c0371o;
        c0371o2.U(-1137977269);
        int i7 = (c0371o2.i(aVar) ? 131072 : 65536) | i | (c0371o2.g(cVar) ? 4 : 2) | (c0371o2.g(str) ? 32 : 16) | (c0371o2.g(str2) ? 256 : 128) | (c0371o2.i(mainActivity) ? 2048 : 1024) | (c0371o2.i(cVar2) ? 16384 : 8192);
        if (c0371o2.K(i7 & 1, (74899 & i7) != 74898)) {
            float f = 5;
            InterfaceC0725m interfaceC0725mA = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.c.a(androidx.compose.foundation.layout.c.f9277a, 65), f);
            boolean z7 = ((i7 & 14) == 4) | ((57344 & i7) == 16384) | ((458752 & i7) == 131072);
            Object objH = c0371o2.H();
            if (z7 || objH == C0363k.f5418a) {
                objH = new e(cVar, aVar, cVar2);
                c0371o2.d0(objH);
            }
            InterfaceC0725m interfaceC0725mA2 = u.a(interfaceC0725mA, C1386y.f15098a, (PointerInputEventHandler) objH);
            C0717e c0717e = C0714b.f10076q;
            InterfaceC1926C interfaceC1926CD = AbstractC0017n.d(c0717e, false);
            int i8 = c0371o2.f5454P;
            InterfaceC0360i0 interfaceC0360i0M = c0371o2.m();
            InterfaceC0725m interfaceC0725mC = AbstractC0727o.c(c0371o2, interfaceC0725mA2);
            InterfaceC0046k.f452a.getClass();
            D d5 = C0045j.f445b;
            c0371o2.W();
            if (c0371o2.f5453O) {
                c0371o2.l(d5);
            } else {
                c0371o2.g0();
            }
            C0044i c0044i = C0045j.f448e;
            C0345b.u(c0044i, c0371o2, interfaceC1926CD);
            C0044i c0044i2 = C0045j.f447d;
            C0345b.u(c0044i2, c0371o2, interfaceC0360i0M);
            C0044i c0044i3 = C0045j.f;
            if (c0371o2.f5453O || !m.a(c0371o2.H(), Integer.valueOf(i8))) {
                i.o(i8, c0371o2, i8, c0044i3);
            }
            C0044i c0044i4 = C0045j.f446c;
            C0345b.u(c0044i4, c0371o2, interfaceC0725mC);
            InterfaceC0725m interfaceC0725mA3 = androidx.compose.foundation.a.a(AbstractC0597a.n(androidx.compose.foundation.layout.c.f9279c, H.e.a(10)), str.equals("#000000") ? AbstractC1145B.b(AbstractC1393a.b(0.1f, Color.parseColor(str), -1)) : AbstractC1145B.b(AbstractC1393a.b(0.1f, Color.parseColor(str), -16777216)), AbstractC1145B.f13658a);
            InterfaceC1926C interfaceC1926CD2 = AbstractC0017n.d(c0717e, false);
            int i9 = c0371o2.f5454P;
            InterfaceC0360i0 interfaceC0360i0M2 = c0371o2.m();
            InterfaceC0725m interfaceC0725mC2 = AbstractC0727o.c(c0371o2, interfaceC0725mA3);
            c0371o2.W();
            if (c0371o2.f5453O) {
                c0371o2.l(d5);
            } else {
                c0371o2.g0();
            }
            C0345b.u(c0044i, c0371o2, interfaceC1926CD2);
            C0345b.u(c0044i2, c0371o2, interfaceC0360i0M2);
            if (c0371o2.f5453O || !m.a(c0371o2.H(), Integer.valueOf(i9))) {
                i.o(i9, c0371o2, i9, c0044i3);
            }
            C0345b.u(c0044i4, c0371o2, interfaceC0725mC2);
            C0722j c0722j = C0722j.f10095q;
            InterfaceC0725m interfaceC0725mA4 = androidx.compose.foundation.layout.b.a(c0722j, 7);
            Q qA = O.a(AbstractC0012i.f106a, C0714b.f10085z, c0371o2, 0);
            int i10 = c0371o2.f5454P;
            InterfaceC0360i0 interfaceC0360i0M3 = c0371o2.m();
            InterfaceC0725m interfaceC0725mC3 = AbstractC0727o.c(c0371o2, interfaceC0725mA4);
            c0371o2.W();
            if (c0371o2.f5453O) {
                c0371o2.l(d5);
            } else {
                c0371o2.g0();
            }
            C0345b.u(c0044i, c0371o2, qA);
            C0345b.u(c0044i2, c0371o2, interfaceC0360i0M3);
            if (c0371o2.f5453O || !m.a(c0371o2.H(), Integer.valueOf(i10))) {
                i.o(i10, c0371o2, i10, c0044i3);
            }
            C0345b.u(c0044i4, c0371o2, interfaceC0725mC3);
            String str3 = cVar.f8936b;
            if (str3 == null || str3.equals("")) {
                z5 = true;
                z6 = false;
                c0371o2.S(1127492195);
                g(str2, str, cVar, c0371o2, ((i7 >> 6) & 14) | (i7 & 112) | ((i7 << 6) & 896));
                c0371o2.p(false);
            } else {
                c0371o2.S(592007466);
                Drawable drawableCreateFromStream = null;
                try {
                    AssetManager assets = mainActivity.getAssets();
                    String str4 = cVar.f8936b;
                    m.b(str4);
                    InputStream inputStreamOpen = assets.open(str4);
                    m.d(inputStreamOpen, "open(...)");
                    drawableCreateFromStream = Drawable.createFromStream(inputStreamOpen, null);
                } catch (Exception e7) {
                    e7.printStackTrace();
                }
                if (drawableCreateFromStream != null) {
                    c0371o2.S(592096188);
                    C1411a c1411a = new C1411a(new C1150e(U(drawableCreateFromStream)));
                    InterfaceC0725m interfaceC0725mN = AbstractC0597a.n(androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.c.c(c0722j, 40), f), H.e.f2031a);
                    z5 = true;
                    z6 = false;
                    D5.a.c(c1411a, null, interfaceC0725mN, null, C1949i.f18697d, 0.0f, null, c0371o2, 24624, 104);
                    c0371o2.p(false);
                } else {
                    z5 = true;
                    z6 = false;
                    c0371o2.S(1127489666);
                    g(str2, str, cVar, c0371o2, ((i7 >> 6) & 14) | (i7 & 112) | ((i7 << 6) & 896));
                    c0371o2.p(false);
                }
                c0371o2.p(z6);
            }
            String str5 = cVar.f8935a;
            if (str5 == null) {
                c0371o2.S(592601394);
            } else {
                c0371o2.S(592601395);
                C0717e c0717e2 = C0714b.f10080u;
                FillElement fillElement = androidx.compose.foundation.layout.c.f9278b;
                InterfaceC1926C interfaceC1926CD3 = AbstractC0017n.d(c0717e2, z6);
                int i11 = c0371o2.f5454P;
                InterfaceC0360i0 interfaceC0360i0M4 = c0371o2.m();
                InterfaceC0725m interfaceC0725mC4 = AbstractC0727o.c(c0371o2, fillElement);
                InterfaceC0046k.f452a.getClass();
                D d7 = C0045j.f445b;
                c0371o2.W();
                if (c0371o2.f5453O) {
                    c0371o2.l(d7);
                } else {
                    c0371o2.g0();
                }
                C0345b.u(C0045j.f448e, c0371o2, interfaceC1926CD3);
                C0345b.u(C0045j.f447d, c0371o2, interfaceC0360i0M4);
                C0044i c0044i5 = C0045j.f;
                if (c0371o2.f5453O || !m.a(c0371o2.H(), Integer.valueOf(i11))) {
                    i.o(i11, c0371o2, i11, c0044i5);
                }
                C0345b.u(C0045j.f446c, c0371o2, interfaceC0725mC4);
                N0.b(str5, androidx.compose.foundation.layout.c.h(), AbstractC1145B.b(Color.parseColor(str2)), AbstractC0836n2.y(13), null, 0L, null, 0L, 0, false, 2, 0, new F(0L, 0L, null, 0L, AbstractC0836n2.y(16), 16646143), c0371o, 3120, 1575936, 57328);
                c0371o2 = c0371o;
                c0371o2.p(z5);
            }
            c0371o2.p(z6);
            c0371o2.p(z5);
            c0371o2.p(z5);
            c0371o2.p(z5);
        } else {
            c0371o2.N();
        }
        C0372o0 c0372o0R = c0371o2.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new r(cVar, str, str2, mainActivity, cVar2, aVar, i, 0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final d0.d e(String str) {
        Set setSingleton = Collections.singleton(str);
        m.d(setSingleton, "singleton(...)");
        return new d0.d(setSingleton);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void g(final String str, final String str2, final a5.c cVar, C0371o c0371o, final int i) {
        int i7;
        String strSubstring;
        C0371o c0371o2 = c0371o;
        c0371o2.U(1511415801);
        if ((i & 6) == 0) {
            i7 = (c0371o2.g(str) ? 4 : 2) | i;
        } else {
            i7 = i;
        }
        int i8 = i7 | (c0371o2.g(str2) ? 32 : 16);
        if ((i & 384) == 0) {
            i8 |= c0371o2.g(cVar) ? 256 : 128;
        }
        if (c0371o2.K(i8 & 1, (i8 & 147) != 146)) {
            InterfaceC0725m interfaceC0725mA = androidx.compose.foundation.a.a(AbstractC0597a.n(androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.c.c(C0722j.f10095q, 40), 5), H.e.f2031a), AbstractC1145B.b(Color.parseColor(str)), AbstractC1145B.f13658a);
            InterfaceC1926C interfaceC1926CD = AbstractC0017n.d(C0714b.f10080u, false);
            int i9 = c0371o2.f5454P;
            InterfaceC0360i0 interfaceC0360i0M = c0371o2.m();
            InterfaceC0725m interfaceC0725mC = AbstractC0727o.c(c0371o2, interfaceC0725mA);
            InterfaceC0046k.f452a.getClass();
            D d5 = C0045j.f445b;
            c0371o2.W();
            if (c0371o2.f5453O) {
                c0371o2.l(d5);
            } else {
                c0371o2.g0();
            }
            C0345b.u(C0045j.f448e, c0371o2, interfaceC1926CD);
            C0345b.u(C0045j.f447d, c0371o2, interfaceC0360i0M);
            C0044i c0044i = C0045j.f;
            if (c0371o2.f5453O || !m.a(c0371o2.H(), Integer.valueOf(i9))) {
                i.o(i9, c0371o2, i9, c0044i);
            }
            C0345b.u(C0045j.f446c, c0371o2, interfaceC0725mC);
            String str3 = cVar.f8935a;
            if (str3 != null) {
                strSubstring = str3.substring(0, 1);
                m.d(strSubstring, "substring(...)");
            } else {
                strSubstring = null;
            }
            N0.b(String.valueOf(strSubstring), androidx.compose.foundation.layout.c.h(), AbstractC1145B.b(Color.parseColor(str2)), AbstractC0836n2.y(16), null, 0L, null, 0L, 0, false, 0, 0, null, c0371o, 3120, 0, 131056);
            c0371o2 = c0371o;
            c0371o2.p(true);
        } else {
            c0371o2.N();
        }
        C0372o0 c0372o0R = c0371o2.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new B5.e() { // from class: a5.s
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // B5.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iW = C0345b.w(i | 1);
                    C3.a.g(str, str2, cVar, (C0371o) obj, iW);
                    return C1386y.f15098a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void h(final C0468k1 dataObject, final Y0 y02, MainActivity mainActivity, final B5.c onClick, C0371o c0371o, int i) {
        m.e(dataObject, "dataObject");
        m.e(onClick, "onClick");
        c0371o.U(-693251603);
        int i7 = i | (c0371o.i(dataObject) ? 4 : 2) | (c0371o.i(y02) ? 32 : 16) | (c0371o.i(mainActivity) ? 256 : 128) | (c0371o.i(onClick) ? 2048 : 1024);
        if (c0371o.K(i7 & 1, (i7 & 1171) != 1170)) {
            Object objH = c0371o.H();
            Object obj = C0363k.f5418a;
            if (objH == obj) {
                objH = C0345b.q(Boolean.FALSE);
                c0371o.d0(objH);
            }
            final W w3 = (W) objH;
            if (y02 == null) {
                c0371o.S(1839568258);
            } else {
                c0371o.S(1839568259);
                final String str = y02.f6896d;
                m.b(str);
                Boolean bool = Boolean.TRUE;
                boolean zI = c0371o.i(dataObject) | c0371o.g(str) | c0371o.i(mainActivity);
                Object objH2 = c0371o.H();
                if (zI || objH2 == obj) {
                    objH2 = new C0735b(dataObject, str, mainActivity, null);
                    c0371o.d0(objH2);
                }
                C0345b.e((B5.e) objH2, c0371o, bool);
                AbstractC1127b.a(k.d(-1047208931, new B5.e() { // from class: c5.a
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // B5.e
                    public final Object invoke(Object obj2, Object obj3) {
                        V0 v02;
                        V0 v03;
                        List list;
                        C0371o c0371o2 = (C0371o) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        if (c0371o2.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                            FillElement fillElement = c.f9279c;
                            String str2 = str;
                            InterfaceC0725m interfaceC0725mA = androidx.compose.foundation.a.a(fillElement, AbstractC1145B.b(Color.parseColor(str2)), AbstractC1145B.f13658a);
                            m.e(interfaceC0725mA, "<this>");
                            C0022t c0022tA = A.r.a(AbstractC0012i.f110e, C0714b.f10074C, c0371o2, 54);
                            int i8 = c0371o2.f5454P;
                            InterfaceC0360i0 interfaceC0360i0M = c0371o2.m();
                            InterfaceC0725m interfaceC0725mC = AbstractC0727o.c(c0371o2, interfaceC0725mA);
                            InterfaceC0046k.f452a.getClass();
                            D d5 = C0045j.f445b;
                            c0371o2.W();
                            if (c0371o2.f5453O) {
                                c0371o2.l(d5);
                            } else {
                                c0371o2.g0();
                            }
                            C0044i c0044i = C0045j.f448e;
                            C0345b.u(c0044i, c0371o2, c0022tA);
                            C0044i c0044i2 = C0045j.f447d;
                            C0345b.u(c0044i2, c0371o2, interfaceC0360i0M);
                            C0044i c0044i3 = C0045j.f;
                            if (c0371o2.f5453O || !m.a(c0371o2.H(), Integer.valueOf(i8))) {
                                i.o(i8, c0371o2, i8, c0044i3);
                            }
                            C0044i c0044i4 = C0045j.f446c;
                            C0345b.u(c0044i4, c0371o2, interfaceC0725mC);
                            AbstractC0534a.t(0, str2, false, c0371o2, 0, 5);
                            InterfaceC0725m interfaceC0725mA2 = C0023u.a(fillElement);
                            C0022t c0022tA2 = A.r.a(AbstractC0012i.f108c, C0714b.f10073B, c0371o2, 0);
                            int i9 = c0371o2.f5454P;
                            InterfaceC0360i0 interfaceC0360i0M2 = c0371o2.m();
                            InterfaceC0725m interfaceC0725mC2 = AbstractC0727o.c(c0371o2, interfaceC0725mA2);
                            c0371o2.W();
                            if (c0371o2.f5453O) {
                                c0371o2.l(d5);
                            } else {
                                c0371o2.g0();
                            }
                            C0345b.u(c0044i, c0371o2, c0022tA2);
                            C0345b.u(c0044i2, c0371o2, interfaceC0360i0M2);
                            if (c0371o2.f5453O || !m.a(c0371o2.H(), Integer.valueOf(i9))) {
                                i.o(i9, c0371o2, i9, c0044i3);
                            }
                            C0345b.u(c0044i4, c0371o2, interfaceC0725mC2);
                            Y0 y03 = y02;
                            List list2 = y03.f6897e;
                            List listJ0 = (list2 == null || (v03 = (V0) l.l0(list2)) == null || (list = v03.f6872a) == null) ? s.f15299q : l.j0(list);
                            List list3 = y03.f6897e;
                            AbstractC0534a.o(listJ0, (list3 == null || (v02 = (V0) l.l0(list3)) == null) ? null : v02.f6873b, c0371o2, 0);
                            c0371o2.p(true);
                            InterfaceC0725m interfaceC0725mD = androidx.compose.foundation.layout.b.d(C0722j.f10095q, 0.0f, 0.0f, 0.0f, 20, 7);
                            InterfaceC1926C interfaceC1926CD = AbstractC0017n.d(C0714b.f10076q, false);
                            int i10 = c0371o2.f5454P;
                            InterfaceC0360i0 interfaceC0360i0M3 = c0371o2.m();
                            InterfaceC0725m interfaceC0725mC3 = AbstractC0727o.c(c0371o2, interfaceC0725mD);
                            c0371o2.W();
                            if (c0371o2.f5453O) {
                                c0371o2.l(d5);
                            } else {
                                c0371o2.g0();
                            }
                            C0345b.u(c0044i, c0371o2, interfaceC1926CD);
                            C0345b.u(c0044i2, c0371o2, interfaceC0360i0M3);
                            if (c0371o2.f5453O || !m.a(c0371o2.H(), Integer.valueOf(i10))) {
                                i.o(i10, c0371o2, i10, c0044i3);
                            }
                            C0345b.u(c0044i4, c0371o2, interfaceC0725mC3);
                            List list4 = y03.f;
                            if (list4 == null) {
                                c0371o2.S(-456261360);
                            } else {
                                c0371o2.S(-456261359);
                                h.a(list4, onClick, c0371o2, 0);
                            }
                            c0371o2.p(false);
                            c0371o2.p(true);
                            c0371o2.p(true);
                            C0468k1 c0468k1 = dataObject;
                            boolean zI2 = c0371o2.i(c0468k1);
                            Object objH3 = c0371o2.H();
                            if (zI2 || objH3 == C0363k.f5418a) {
                                objH3 = new C0547n(c0468k1, w3, 4);
                                c0371o2.d0(objH3);
                            }
                            l6.d.d(false, (B5.a) objH3, c0371o2, 0);
                        } else {
                            c0371o2.N();
                        }
                        return C1386y.f15098a;
                    }
                }, c0371o), c0371o, 384, 3);
            }
            c0371o.p(false);
        } else {
            c0371o.N();
        }
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new U4.Q(dataObject, y02, mainActivity, onClick, i, 2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C0189a i(String str, F f, long j, W0.d dVar, O0.d dVar2, int i) {
        s sVar = s.f15299q;
        return new C0189a(new S0.d(str, f, sVar, sVar, dVar2, dVar), i, 1, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x04ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(final com.web2native.MainActivity r44, final int r45, final com.web2native.MainActivity r46, final int r47, final a5.y r48, final B5.c r49, P.C0371o r50, final int r51) {
        /*
            r2 = r45
            r4 = r48
            r10 = r49
            r12 = r50
            java.lang.String r0 = "handleUrl"
            kotlin.jvm.internal.m.e(r10, r0)
            r0 = -1877885368(0xffffffff9011be48, float:-2.8742795E-29)
            r12.U(r0)
            r1 = r44
            boolean r0 = r12.i(r1)
            if (r0 == 0) goto L1d
            r0 = 4
            goto L1e
        L1d:
            r0 = 2
        L1e:
            r0 = r51 | r0
            boolean r3 = r12.e(r2)
            if (r3 == 0) goto L29
            r3 = 32
            goto L2b
        L29:
            r3 = 16
        L2b:
            r0 = r0 | r3
            r3 = r46
            boolean r5 = r12.i(r3)
            if (r5 == 0) goto L37
            r5 = 256(0x100, float:3.59E-43)
            goto L39
        L37:
            r5 = 128(0x80, float:1.794E-43)
        L39:
            r0 = r0 | r5
            r11 = r47
            boolean r5 = r12.e(r11)
            if (r5 == 0) goto L45
            r5 = 2048(0x800, float:2.87E-42)
            goto L47
        L45:
            r5 = 1024(0x400, float:1.435E-42)
        L47:
            r0 = r0 | r5
            boolean r5 = r12.i(r4)
            if (r5 == 0) goto L51
            r5 = 16384(0x4000, float:2.2959E-41)
            goto L53
        L51:
            r5 = 8192(0x2000, float:1.14794E-41)
        L53:
            r0 = r0 | r5
            boolean r5 = r12.i(r10)
            if (r5 == 0) goto L5d
            r5 = 131072(0x20000, float:1.83671E-40)
            goto L5f
        L5d:
            r5 = 65536(0x10000, float:9.18355E-41)
        L5f:
            r0 = r0 | r5
            r5 = 74899(0x12493, float:1.04956E-40)
            r5 = r5 & r0
            r6 = 74898(0x12492, float:1.04954E-40)
            r14 = 1
            r15 = 0
            if (r5 == r6) goto L6d
            r5 = r14
            goto L6e
        L6d:
            r5 = r15
        L6e:
            r6 = r0 & 1
            boolean r5 = r12.K(r6, r5)
            if (r5 == 0) goto L5dc
            kotlin.jvm.internal.y r6 = new kotlin.jvm.internal.y
            r6.<init>()
            r32 = 0
            if (r4 == 0) goto L82
            P5.D r5 = r4.f9009c
            goto L84
        L82:
            r5 = r32
        L84:
            if (r5 != 0) goto L92
            r5 = -2133661655(0xffffffff80d2e829, float:-1.9368738E-38)
            r12.S(r5)
            r12.p(r15)
            r5 = r32
            goto L9f
        L92:
            r7 = -761564456(0xffffffffd29b72d8, float:-3.33823345E11)
            r12.S(r7)
            P.W r5 = P.C0345b.j(r5, r12)
            r12.p(r15)
        L9f:
            r6.f14268q = r5
            if (r4 == 0) goto La6
            P5.D r5 = r4.i
            goto La8
        La6:
            r5 = r32
        La8:
            if (r5 != 0) goto Lb6
            r5 = -2133586263(0xffffffff80d40ea9, float:-1.9474384E-38)
            r12.S(r5)
            r12.p(r15)
            r16 = r32
            goto Lc5
        Lb6:
            r7 = -761562024(0xffffffffd29b7c58, float:-3.33903036E11)
            r12.S(r7)
            P.W r5 = P.C0345b.j(r5, r12)
            r12.p(r15)
            r16 = r5
        Lc5:
            kotlin.jvm.internal.y r7 = new kotlin.jvm.internal.y
            r7.<init>()
            if (r4 == 0) goto Le9
            a5.l r5 = r4.f9012g
            if (r5 == 0) goto Le9
            a5.i r5 = r5.f8948a
            if (r5 == 0) goto Le9
            java.util.List r5 = r5.f8946a
            if (r5 == 0) goto Le9
            java.lang.Object r5 = r5.get(r2)
            a5.f r5 = (a5.f) r5
            if (r5 == 0) goto Le9
            java.lang.Integer r5 = r5.f8943e
            if (r5 == 0) goto Le9
            int r5 = r5.intValue()
            goto Leb
        Le9:
            r5 = 30
        Leb:
            if (r4 == 0) goto L106
            a5.l r8 = r4.f9012g
            if (r8 == 0) goto L106
            a5.i r8 = r8.f8948a
            if (r8 == 0) goto L106
            java.util.List r8 = r8.f8946a
            if (r8 == 0) goto L106
            java.lang.Object r8 = r8.get(r2)
            a5.f r8 = (a5.f) r8
            if (r8 == 0) goto L106
            java.util.List r8 = r8.f8939a
            r33 = r8
            goto L108
        L106:
            r33 = r32
        L108:
            if (r4 == 0) goto L122
            a5.l r8 = r4.f9012g
            if (r8 == 0) goto L122
            a5.i r8 = r8.f8948a
            if (r8 == 0) goto L122
            java.util.List r8 = r8.f8946a
            if (r8 == 0) goto L122
            java.lang.Object r8 = r8.get(r2)
            a5.f r8 = (a5.f) r8
            if (r8 == 0) goto L122
            java.lang.String r8 = r8.f8941c
            if (r8 != 0) goto L124
        L122:
            java.lang.String r8 = "#ffffff"
        L124:
            if (r4 == 0) goto L142
            a5.l r13 = r4.f9012g
            if (r13 == 0) goto L142
            a5.i r13 = r13.f8948a
            if (r13 == 0) goto L142
            java.util.List r13 = r13.f8946a
            if (r13 == 0) goto L142
            java.lang.Object r13 = r13.get(r2)
            a5.f r13 = (a5.f) r13
            if (r13 == 0) goto L142
            java.lang.String r13 = r13.f8942d
            if (r13 != 0) goto L13f
            goto L142
        L13f:
            r34 = r13
            goto L145
        L142:
            java.lang.String r13 = "#000000"
            goto L13f
        L145:
            if (r4 == 0) goto L14a
            P5.D r13 = r4.j
            goto L14c
        L14a:
            r13 = r32
        L14c:
            kotlin.jvm.internal.m.b(r13)
            P.W r13 = P.C0345b.j(r13, r12)
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            a5.t r3 = new a5.t
            r18 = r8
            r8 = 0
            r15 = r18
            r18 = r13
            r13 = r15
            r15 = r5
            r5 = r46
            r3.<init>(r4, r5, r6, r7, r8)
            P.C0345b.e(r3, r12, r9)
            P.S r7 = P.C0363k.f5418a
            if (r16 == 0) goto L55e
            java.lang.Object r8 = r16.getValue()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != r14) goto L55e
            r8 = -2131559017(0xffffffff80f2fd97, float:-2.2315161E-38)
            r12.S(r8)
            androidx.compose.foundation.layout.FillElement r20 = androidx.compose.foundation.layout.c.f9279c
            float r8 = (float) r15
            java.lang.Object r9 = r18.getValue()
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            float r9 = (float) r9
            float r24 = r8 + r9
            r25 = 7
            r21 = 0
            r22 = 0
            r23 = 0
            c0.m r8 = androidx.compose.foundation.layout.b.d(r20, r21, r22, r23, r24, r25)
            c0.e r9 = c0.C0714b.f10083x
            r15 = 0
            z0.C r9 = A.AbstractC0017n.d(r9, r15)
            int r15 = r12.f5454P
            r35 = 458752(0x70000, float:6.42848E-40)
            P.i0 r5 = r12.m()
            c0.m r8 = c0.AbstractC0727o.c(r12, r8)
            B0.j r16 = B0.InterfaceC0046k.f452a
            r16.getClass()
            B0.D r14 = B0.C0045j.f445b
            r12.W()
            boolean r3 = r12.f5453O
            if (r3 == 0) goto L1bf
            r12.l(r14)
            goto L1c2
        L1bf:
            r12.g0()
        L1c2:
            B0.i r3 = B0.C0045j.f448e
            P.C0345b.u(r3, r12, r9)
            B0.i r9 = B0.C0045j.f447d
            P.C0345b.u(r9, r12, r5)
            B0.i r5 = B0.C0045j.f
            r36 = r0
            boolean r0 = r12.f5453O
            if (r0 != 0) goto L1e2
            java.lang.Object r0 = r12.H()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            boolean r0 = kotlin.jvm.internal.m.a(r0, r1)
            if (r0 != 0) goto L1e5
        L1e2:
            k1.i.o(r15, r12, r15, r5)
        L1e5:
            B0.i r0 = B0.C0045j.f446c
            P.C0345b.u(r0, r12, r8)
            r1 = 35
            float r1 = (float) r1
            c0.j r8 = c0.C0722j.f10095q
            c0.m r1 = androidx.compose.foundation.layout.c.a(r8, r1)
            c0.m r1 = androidx.compose.foundation.layout.c.i(r1)
            r15 = 60
            H.d r15 = H.e.a(r15)
            c0.m r1 = a.AbstractC0597a.n(r1, r15)
            int r15 = android.graphics.Color.parseColor(r34)
            long r10 = j0.AbstractC1145B.b(r15)
            O3.D r15 = j0.AbstractC1145B.f13658a
            c0.m r1 = androidx.compose.foundation.a.a(r1, r10, r15)
            A.d r10 = A.AbstractC0012i.f106a
            c0.d r11 = c0.C0714b.f10085z
            r2 = 0
            A.Q r10 = A.O.a(r10, r11, r12, r2)
            int r2 = r12.f5454P
            P.i0 r11 = r12.m()
            c0.m r1 = c0.AbstractC0727o.c(r12, r1)
            r12.W()
            r37 = r6
            boolean r6 = r12.f5453O
            if (r6 == 0) goto L22f
            r12.l(r14)
            goto L232
        L22f:
            r12.g0()
        L232:
            P.C0345b.u(r3, r12, r10)
            P.C0345b.u(r9, r12, r11)
            boolean r3 = r12.f5453O
            if (r3 != 0) goto L24a
            java.lang.Object r3 = r12.H()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            boolean r3 = kotlin.jvm.internal.m.a(r3, r6)
            if (r3 != 0) goto L24d
        L24a:
            k1.i.o(r2, r12, r2, r5)
        L24d:
            P.C0345b.u(r0, r12, r1)
            r0 = 10
            float r1 = (float) r0
            c0.m r2 = androidx.compose.foundation.layout.c.c(r8, r1)
            D5.a.h(r12, r2)
            if (r33 != 0) goto L26e
            r0 = 1434576443(0x5581e63b, float:1.7853229E13)
            r12.S(r0)
            r15 = 0
            r12.p(r15)
            r2 = r49
            r3 = r8
            r8 = r13
            r6 = r15
            r0 = 1
            goto L54b
        L26e:
            r2 = 1434576444(0x5581e63c, float:1.78532311E13)
            r12.S(r2)
            r2 = r33
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
        L27d:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L53d
            java.lang.Object r5 = r2.next()
            int r6 = r3 + 1
            if (r3 < 0) goto L539
            a5.c r5 = (a5.c) r5
            int r9 = android.graphics.Color.parseColor(r34)
            r10 = -1
            r11 = 1045220557(0x3e4ccccd, float:0.2)
            int r9 = n1.AbstractC1393a.b(r11, r9, r10)
            java.lang.String r9 = java.lang.Integer.toHexString(r9)
            java.lang.String r10 = "toHexString(...)"
            kotlin.jvm.internal.m.d(r9, r10)
            r10 = 2
            java.lang.String r9 = r9.substring(r10)
            java.lang.String r10 = "substring(...)"
            kotlin.jvm.internal.m.d(r9, r10)
            java.lang.String r11 = "#"
            java.lang.String r9 = r11.concat(r9)
            r11 = 3
            if (r3 <= r11) goto L2d2
            r3 = -977767043(0xffffffffc5b8757d, float:-5902.686)
            r12.S(r3)
            r3 = 0
            r12.p(r3)
            r38 = r0
            r41 = r1
            r39 = r2
            r40 = r6
            r42 = r8
            r8 = r13
            r1 = r15
            r0 = 1
            r10 = 2
            r2 = r49
            r6 = r3
            goto L52b
        L2d2:
            m5.y r14 = m5.C1386y.f15098a
            if (r3 != r11) goto L3fa
            r3 = -977655567(0xffffffffc5ba28f1, float:-5957.1177)
            r12.S(r3)
            androidx.compose.foundation.layout.FillElement r3 = androidx.compose.foundation.layout.c.f9278b
            boolean r5 = r12.i(r4)
            java.lang.Object r10 = r12.H()
            if (r5 != 0) goto L2ea
            if (r10 != r7) goto L2f3
        L2ea:
            F.j r10 = new F.j
            r5 = 1
            r10.<init>(r5, r4)
            r12.d0(r10)
        L2f3:
            androidx.compose.ui.input.pointer.PointerInputEventHandler r10 = (androidx.compose.ui.input.pointer.PointerInputEventHandler) r10
            c0.m r3 = v0.u.a(r3, r14, r10)
            c0.e r5 = c0.C0714b.f10080u
            r10 = 0
            z0.C r5 = A.AbstractC0017n.d(r5, r10)
            int r10 = r12.f5454P
            P.i0 r11 = r12.m()
            c0.m r3 = c0.AbstractC0727o.c(r12, r3)
            B0.j r14 = B0.InterfaceC0046k.f452a
            r14.getClass()
            B0.D r14 = B0.C0045j.f445b
            r12.W()
            boolean r0 = r12.f5453O
            if (r0 == 0) goto L31c
            r12.l(r14)
            goto L31f
        L31c:
            r12.g0()
        L31f:
            B0.i r0 = B0.C0045j.f448e
            P.C0345b.u(r0, r12, r5)
            B0.i r5 = B0.C0045j.f447d
            P.C0345b.u(r5, r12, r11)
            B0.i r11 = B0.C0045j.f
            r39 = r2
            boolean r2 = r12.f5453O
            if (r2 != 0) goto L342
            java.lang.Object r2 = r12.H()
            r40 = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)
            boolean r2 = kotlin.jvm.internal.m.a(r2, r6)
            if (r2 != 0) goto L347
            goto L344
        L342:
            r40 = r6
        L344:
            k1.i.o(r10, r12, r10, r11)
        L347:
            B0.i r2 = B0.C0045j.f446c
            P.C0345b.u(r2, r12, r3)
            r3 = 20
            float r3 = (float) r3
            c0.m r3 = androidx.compose.foundation.layout.c.c(r8, r3)
            H.d r6 = H.e.f2031a
            c0.m r3 = a.AbstractC0597a.n(r3, r6)
            c0.e r10 = c0.C0714b.f10076q
            r18 = r9
            r9 = 0
            z0.C r10 = A.AbstractC0017n.d(r10, r9)
            int r9 = r12.f5454P
            r41 = r1
            P.i0 r1 = r12.m()
            c0.m r3 = c0.AbstractC0727o.c(r12, r3)
            r12.W()
            r42 = r8
            boolean r8 = r12.f5453O
            if (r8 == 0) goto L37b
            r12.l(r14)
            goto L37e
        L37b:
            r12.g0()
        L37e:
            P.C0345b.u(r0, r12, r10)
            P.C0345b.u(r5, r12, r1)
            boolean r0 = r12.f5453O
            if (r0 != 0) goto L396
            java.lang.Object r0 = r12.H()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            boolean r0 = kotlin.jvm.internal.m.a(r0, r1)
            if (r0 != 0) goto L399
        L396:
            k1.i.o(r9, r12, r9, r11)
        L399:
            P.C0345b.u(r2, r12, r3)
            boolean r0 = r12.i(r4)
            java.lang.Object r1 = r12.H()
            if (r0 != 0) goto L3a8
            if (r1 != r7) goto L3b1
        L3a8:
            a5.m r1 = new a5.m
            r0 = 0
            r1.<init>()
            r12.d0(r1)
        L3b1:
            r11 = r1
            B5.a r11 = (B5.a) r11
            androidx.compose.foundation.layout.FillElement r0 = androidx.compose.foundation.layout.c.f9279c
            int r1 = android.graphics.Color.parseColor(r18)
            long r1 = j0.AbstractC1145B.b(r1)
            c0.m r0 = androidx.compose.foundation.a.a(r0, r1, r15)
            c0.m r0 = a.AbstractC0597a.n(r0, r6)
            a5.n r1 = new a5.n
            r2 = 0
            r1.<init>(r13, r2)
            r2 = -2085689085(0xffffffff83aee903, float:-1.0280298E-36)
            X.e r1 = X.k.d(r2, r1, r12)
            r2 = 131072(0x20000, float:1.83671E-40)
            r17 = 196608(0x30000, float:2.75506E-40)
            r18 = 28
            r5 = r13
            r13 = 0
            r14 = 0
            r6 = r15
            r15 = r1
            r1 = r6
            r8 = r5
            r16 = r12
            r6 = 0
            r12 = r0
            r0 = 1
            M.s0.c(r11, r12, r13, r14, r15, r16, r17, r18)
            r12 = r16
            r12.p(r0)
            r12.p(r0)
            r12.p(r6)
            r2 = r49
            r10 = 2
            r38 = 10
            goto L52b
        L3fa:
            r41 = r1
            r39 = r2
            r40 = r6
            r42 = r8
            r18 = r9
            r8 = r13
            r1 = r15
            r0 = 1
            r2 = 131072(0x20000, float:1.83671E-40)
            r6 = 0
            r9 = -976015171(0xffffffffc5d330bd, float:-6758.0923)
            r12.S(r9)
            r9 = 5
            if (r3 <= 0) goto L474
            r3 = -976009560(0xffffffffc5d346a8, float:-6760.832)
            r12.S(r3)
            androidx.compose.foundation.layout.FillElement r19 = androidx.compose.foundation.layout.c.f9278b
            float r3 = (float) r9
            r23 = 0
            r24 = 13
            r20 = 0
            r22 = 0
            r21 = r3
            c0.m r3 = androidx.compose.foundation.layout.b.d(r19, r20, r21, r22, r23, r24)
            int r11 = android.graphics.Color.parseColor(r18)
            long r15 = j0.AbstractC1145B.b(r11)
            r30 = 0
            r31 = 131064(0x1fff8, float:1.8366E-40)
            java.lang.String r11 = "|"
            r17 = r14
            r13 = r15
            r15 = 0
            r18 = r17
            r17 = 0
            r20 = r18
            r18 = 0
            r21 = r20
            r20 = 0
            r23 = r21
            r21 = 0
            r24 = r23
            r23 = 0
            r25 = r24
            r24 = 0
            r26 = r25
            r25 = 0
            r27 = r26
            r26 = 0
            r28 = r27
            r27 = 0
            r29 = 54
            r43 = r12
            r12 = r3
            r3 = r28
            r28 = r43
            M.N0.b(r11, r12, r13, r15, r17, r18, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r12 = r28
        L470:
            r12.p(r6)
            goto L47c
        L474:
            r3 = r14
            r11 = -983611566(0xffffffffc55f4752, float:-3572.4575)
            r12.S(r11)
            goto L470
        L47c:
            java.lang.String r11 = r5.f8935a
            if (r11 == 0) goto L489
            int r13 = r11.length()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            goto L48b
        L489:
            r13 = r32
        L48b:
            kotlin.jvm.internal.m.b(r13)
            int r13 = r13.intValue()
            r14 = 14
            if (r13 <= r14) goto L4b0
            int r13 = r33.size()
            r15 = 2
            if (r13 <= r15) goto L4ad
            r13 = 10
            java.lang.String r11 = r11.substring(r6, r13)
            kotlin.jvm.internal.m.d(r11, r10)
            java.lang.String r10 = ".."
            java.lang.String r11 = r11.concat(r10)
            goto L4b2
        L4ad:
            r13 = 10
            goto L4b2
        L4b0:
            r15 = 2
            goto L4ad
        L4b2:
            long r16 = com.google.android.gms.internal.measurement.AbstractC0836n2.y(r14)
            int r10 = android.graphics.Color.parseColor(r8)
            long r18 = j0.AbstractC1145B.b(r10)
            c0.m r10 = androidx.compose.foundation.layout.c.i(r42)
            androidx.compose.foundation.layout.FillElement r14 = androidx.compose.foundation.layout.c.f9278b
            c0.m r20 = r10.d(r14)
            float r9 = (float) r9
            r24 = 0
            r25 = 8
            r22 = r9
            r23 = r9
            r21 = r9
            c0.m r9 = androidx.compose.foundation.layout.b.d(r20, r21, r22, r23, r24, r25)
            boolean r10 = r12.g(r5)
            r14 = r36 & r35
            if (r14 != r2) goto L4e1
            r14 = r0
            goto L4e2
        L4e1:
            r14 = r6
        L4e2:
            r10 = r10 | r14
            java.lang.Object r14 = r12.H()
            if (r10 != 0) goto L4ef
            if (r14 != r7) goto L4ec
            goto L4ef
        L4ec:
            r2 = r49
            goto L4fa
        L4ef:
            U4.l r14 = new U4.l
            r10 = 1
            r2 = r49
            r14.<init>(r10, r5, r2)
            r12.d0(r14)
        L4fa:
            androidx.compose.ui.input.pointer.PointerInputEventHandler r14 = (androidx.compose.ui.input.pointer.PointerInputEventHandler) r14
            c0.m r3 = v0.u.a(r9, r3, r14)
            r30 = 0
            r31 = 131056(0x1fff0, float:1.83649E-40)
            r10 = r15
            r15 = r16
            r17 = 0
            r38 = r13
            r13 = r18
            r18 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r29 = 3072(0xc00, float:4.305E-42)
            r28 = r12
            r12 = r3
            M.N0.b(r11, r12, r13, r15, r17, r18, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r12 = r28
            r12.p(r6)
        L52b:
            r15 = r1
            r13 = r8
            r0 = r38
            r2 = r39
            r3 = r40
            r1 = r41
            r8 = r42
            goto L27d
        L539:
            com.google.android.gms.internal.measurement.AbstractC0836n2.N()
            throw r32
        L53d:
            r2 = r49
            r41 = r1
            r42 = r8
            r8 = r13
            r0 = 1
            r6 = 0
            r12.p(r6)
            r3 = r42
        L54b:
            c0.m r1 = androidx.compose.foundation.layout.c.c(r3, r1)
            D5.a.h(r12, r1)
            r12.p(r0)
            r12.p(r0)
        L558:
            r12.p(r6)
            r1 = r37
            goto L56f
        L55e:
            r36 = r0
            r37 = r6
            r2 = r10
            r8 = r13
            r0 = r14
            r6 = 0
            r35 = 458752(0x70000, float:6.42848E-40)
            r1 = -2136815718(0xffffffff80a2c79a, float:-1.4948954E-38)
            r12.S(r1)
            goto L558
        L56f:
            java.lang.Object r1 = r1.f14268q
            P.S0 r1 = (P.S0) r1
            if (r1 == 0) goto L5d4
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != r0) goto L5d4
            r0 = -2127660178(0xffffffff812e7b6e, float:-3.204731E-38)
            r12.S(r0)
            kotlin.jvm.internal.m.b(r33)
            boolean r0 = r12.i(r4)
            java.lang.Object r1 = r12.H()
            if (r0 != 0) goto L596
            if (r1 != r7) goto L59f
        L596:
            a5.m r1 = new a5.m
            r0 = 1
            r1.<init>()
            r12.d0(r1)
        L59f:
            r11 = r1
            B5.a r11 = (B5.a) r11
            int r0 = r36 >> 3
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            int r1 = r36 << 3
            r3 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r3
            r0 = r0 | r1
            int r1 = r36 << 15
            r1 = r1 & r35
            r0 = r0 | r1
            int r1 = r36 << 12
            r3 = 3670016(0x380000, float:5.142788E-39)
            r1 = r1 & r3
            r0 = r0 | r1
            r1 = 29360128(0x1c00000, float:7.052966E-38)
            int r3 = r36 << 6
            r1 = r1 & r3
            r13 = r0 | r1
            r9 = r46
            r7 = r47
            r10 = r2
            r15 = r6
            r5 = r8
            r3 = r33
            r8 = r44
            r6 = r4
            r4 = r34
            k(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
        L5d0:
            r12.p(r15)
            goto L5df
        L5d4:
            r15 = r6
            r1 = -2136815718(0xffffffff80a2c79a, float:-1.4948954E-38)
            r12.S(r1)
            goto L5d0
        L5dc:
            r12.N()
        L5df:
            P.o0 r8 = r12.r()
            if (r8 == 0) goto L5fa
            a5.o r0 = new a5.o
            r1 = r44
            r2 = r45
            r3 = r46
            r4 = r47
            r5 = r48
            r6 = r49
            r7 = r51
            r0.<init>(r2, r3, r4, r5, r6, r7)
            r8.f5482d = r0
        L5fa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: C3.a.j(com.web2native.MainActivity, int, com.web2native.MainActivity, int, a5.y, B5.c, P.o, int):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:101:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(final java.util.List r27, final java.lang.String r28, final java.lang.String r29, final a5.y r30, final int r31, final com.web2native.MainActivity r32, final com.web2native.MainActivity r33, final B5.c r34, final B5.a r35, P.C0371o r36, final int r37) {
        /*
            r4 = r30
            r7 = r33
            r9 = r35
            r0 = r36
            r1 = r37
            r2 = 1898318948(0x71260c64, float:8.2223186E29)
            r0.U(r2)
            r2 = r1 & 6
            if (r2 != 0) goto L21
            r2 = r27
            boolean r5 = r0.i(r2)
            if (r5 == 0) goto L1e
            r5 = 4
            goto L1f
        L1e:
            r5 = 2
        L1f:
            r5 = r5 | r1
            goto L24
        L21:
            r2 = r27
            r5 = r1
        L24:
            r6 = r1 & 48
            r12 = r28
            if (r6 != 0) goto L36
            boolean r6 = r0.g(r12)
            if (r6 == 0) goto L33
            r6 = 32
            goto L35
        L33:
            r6 = 16
        L35:
            r5 = r5 | r6
        L36:
            r6 = r1 & 384(0x180, float:5.38E-43)
            r13 = r29
            if (r6 != 0) goto L48
            boolean r6 = r0.g(r13)
            if (r6 == 0) goto L45
            r6 = 256(0x100, float:3.59E-43)
            goto L47
        L45:
            r6 = 128(0x80, float:1.794E-43)
        L47:
            r5 = r5 | r6
        L48:
            r6 = r1 & 3072(0xc00, float:4.305E-42)
            if (r6 != 0) goto L58
            boolean r6 = r0.i(r4)
            if (r6 == 0) goto L55
            r6 = 2048(0x800, float:2.87E-42)
            goto L57
        L55:
            r6 = 1024(0x400, float:1.435E-42)
        L57:
            r5 = r5 | r6
        L58:
            r6 = r1 & 24576(0x6000, float:3.4438E-41)
            r10 = r31
            if (r6 != 0) goto L6a
            boolean r6 = r0.e(r10)
            if (r6 == 0) goto L67
            r6 = 16384(0x4000, float:2.2959E-41)
            goto L69
        L67:
            r6 = 8192(0x2000, float:1.14794E-41)
        L69:
            r5 = r5 | r6
        L6a:
            r6 = 196608(0x30000, float:2.75506E-40)
            r6 = r6 & r1
            if (r6 != 0) goto L7e
            r6 = r32
            boolean r8 = r0.i(r6)
            if (r8 == 0) goto L7a
            r8 = 131072(0x20000, float:1.83671E-40)
            goto L7c
        L7a:
            r8 = 65536(0x10000, float:9.18355E-41)
        L7c:
            r5 = r5 | r8
            goto L80
        L7e:
            r6 = r32
        L80:
            r8 = 1572864(0x180000, float:2.204052E-39)
            r8 = r8 & r1
            if (r8 != 0) goto L91
            boolean r8 = r0.i(r7)
            if (r8 == 0) goto L8e
            r8 = 1048576(0x100000, float:1.469368E-39)
            goto L90
        L8e:
            r8 = 524288(0x80000, float:7.34684E-40)
        L90:
            r5 = r5 | r8
        L91:
            r8 = 12582912(0xc00000, float:1.7632415E-38)
            r8 = r8 & r1
            if (r8 != 0) goto La5
            r8 = r34
            boolean r11 = r0.i(r8)
            if (r11 == 0) goto La1
            r11 = 8388608(0x800000, float:1.17549435E-38)
            goto La3
        La1:
            r11 = 4194304(0x400000, float:5.877472E-39)
        La3:
            r5 = r5 | r11
            goto La7
        La5:
            r8 = r34
        La7:
            r11 = 100663296(0x6000000, float:2.4074124E-35)
            r11 = r11 & r1
            if (r11 != 0) goto Lb8
            boolean r11 = r0.i(r9)
            if (r11 == 0) goto Lb5
            r11 = 67108864(0x4000000, float:1.5046328E-36)
            goto Lb7
        Lb5:
            r11 = 33554432(0x2000000, float:9.403955E-38)
        Lb7:
            r5 = r5 | r11
        Lb8:
            r11 = 38347923(0x2492493, float:1.4777644E-37)
            r11 = r11 & r5
            r15 = 38347922(0x2492492, float:1.4777643E-37)
            r16 = 0
            if (r11 == r15) goto Lc5
            r11 = 1
            goto Lc7
        Lc5:
            r11 = r16
        Lc7:
            r15 = r5 & 1
            boolean r11 = r0.K(r15, r11)
            if (r11 == 0) goto L1a6
            java.lang.Object r11 = r0.H()
            P.S r15 = P.C0363k.f5418a
            if (r11 != r15) goto Le0
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            P.f0 r11 = P.C0345b.q(r11)
            r0.d0(r11)
        Le0:
            P.W r11 = (P.W) r11
            java.lang.Object r18 = r11.getValue()
            java.lang.Boolean r18 = (java.lang.Boolean) r18
            boolean r18 = r18.booleanValue()
            if (r18 == 0) goto Lf3
            M.J0 r18 = M.J0.f3324r
        Lf0:
            r3 = r18
            goto Lf6
        Lf3:
            M.J0 r18 = M.J0.f3323q
            goto Lf0
        Lf6:
            M.I0 r3 = M.s0.f(r3, r0)
            P.z r14 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.f9340a
            java.lang.Object r14 = r0.k(r14)
            android.content.res.Configuration r14 = (android.content.res.Configuration) r14
            int r1 = r14.orientation
            r20 = 4603579539098121011(0x3fe3333333333333, double:0.6)
            r2 = 1
            if (r1 == r2) goto L121
            r2 = 2
            if (r1 == r2) goto L116
            int r1 = r14.screenHeightDp
        L111:
            double r1 = (double) r1
            double r1 = r1 * r20
        L114:
            float r1 = (float) r1
            goto L124
        L116:
            int r1 = r14.screenHeightDp
            double r1 = (double) r1
            r19 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            double r1 = r1 * r19
            goto L114
        L121:
            int r1 = r14.screenHeightDp
            goto L111
        L124:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r14 = r0.i(r4)
            boolean r19 = r0.i(r7)
            r14 = r14 | r19
            r19 = r1
            java.lang.Object r1 = r0.H()
            if (r14 != 0) goto L13a
            if (r1 != r15) goto L143
        L13a:
            a5.u r1 = new a5.u
            r14 = 0
            r1.<init>(r4, r7, r11, r14)
            r0.d0(r1)
        L143:
            B5.e r1 = (B5.e) r1
            P.C0345b.e(r1, r0, r2)
            int r1 = android.graphics.Color.parseColor(r12)
            long r1 = j0.AbstractC1145B.b(r1)
            r14 = r19
            r20 = 1
            long r18 = j0.o.f
            r21 = 234881024(0xe000000, float:1.5777218E-30)
            r5 = r5 & r21
            r21 = r1
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            if (r5 != r1) goto L162
            r16 = r20
        L162:
            java.lang.Object r1 = r0.H()
            if (r16 != 0) goto L16a
            if (r1 != r15) goto L173
        L16a:
            I2.e r1 = new I2.e
            r2 = 3
            r1.<init>(r2, r9, r11)
            r0.d0(r1)
        L173:
            B5.a r1 = (B5.a) r1
            a5.p r8 = new a5.p
            r15 = r34
            r16 = r9
            r17 = r11
            r11 = r14
            r9 = r27
            r14 = r6
            r8.<init>()
            r2 = 984907521(0x3ab47f01, float:0.001377076)
            X.e r23 = X.k.d(r2, r8, r0)
            r25 = 100663296(0x6000000, float:2.4074124E-35)
            r26 = 3802(0xeda, float:5.328E-42)
            r9 = 0
            r11 = 0
            r12 = 0
            r15 = 0
            r17 = 0
            r20 = 0
            r13 = r21
            r21 = 0
            r22 = 0
            r24 = r0
            r8 = r1
            r10 = r3
            M.AbstractC0210g0.a(r8, r9, r10, r11, r12, r13, r15, r17, r18, r20, r21, r22, r23, r24, r25, r26)
            goto L1a9
        L1a6:
            r36.N()
        L1a9:
            P.o0 r11 = r36.r()
            if (r11 == 0) goto L1c6
            a5.q r0 = new a5.q
            r1 = r27
            r2 = r28
            r3 = r29
            r5 = r31
            r6 = r32
            r8 = r34
            r9 = r35
            r10 = r37
            r0.<init>()
            r11.f5482d = r0
        L1c6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: C3.a.k(java.util.List, java.lang.String, java.lang.String, a5.y, int, com.web2native.MainActivity, com.web2native.MainActivity, B5.c, B5.a, P.o, int):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static float l(EdgeEffect edgeEffect, float f, float f7, W0.c cVar) {
        float f8 = v.D.f17224a;
        double dB = cVar.b() * 386.0878f * 160.0f * 0.84f;
        double dAbs = Math.abs(f) * 0.35f;
        double d5 = ((double) v.D.f17224a) * dB;
        float fExp = (float) (Math.exp((v.D.f17225b / v.D.f17226c) * Math.log(dAbs / d5)) * d5);
        int i = Build.VERSION.SDK_INT;
        if (fExp > (i >= 31 ? AbstractC1720o.b(edgeEffect) : 0.0f) * f7) {
            return 0.0f;
        }
        int iG = D5.a.G(f);
        if (i >= 31) {
            edgeEffect.onAbsorb(iG);
            return f;
        }
        if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(iG);
        }
        return f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void m(C0468k1 c0468k1) {
        C0447f0 c0447f0;
        WebView webView = c0468k1.f7084k;
        C0466k c0466k = c0468k1.f7089m0;
        if (m.a(webView != null ? webView.getUrl() : null, "https://www.smspariaz.com")) {
            return;
        }
        m.b(webView);
        if (!webView.canGoBack()) {
            if (c0466k != null) {
                c0466k.b(c0468k1);
                return;
            }
            return;
        }
        C0458i c0458i = c0468k1.f7073d;
        if ((c0458i == null || (c0447f0 = c0458i.f6984I) == null) ? false : m.a(c0447f0.f6946a, Boolean.TRUE)) {
            if (c0466k != null) {
                c0466k.b(c0468k1);
            }
        } else {
            if (c0466k != null) {
                c0466k.c();
            }
            if (webView.canGoBack()) {
                webView.goBack();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void n(int i, Object[] objArr) {
        for (int i7 = 0; i7 < i; i7++) {
            if (objArr[i7] == null) {
                throw new NullPointerException(i.i(i7, "at index "));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static d6.l o(d6.l lVar, d6.l lVar2) {
        C0733c c0733c = new C0733c(1);
        int size = lVar.size();
        for (int i = 0; i < size; i++) {
            String strG = lVar.g(i);
            String strI = lVar.i(i);
            if ((!"Warning".equalsIgnoreCase(strG) || !t.G0(strI, "1", false)) && ("Content-Length".equalsIgnoreCase(strG) || "Content-Encoding".equalsIgnoreCase(strG) || "Content-Type".equalsIgnoreCase(strG) || !E(strG) || lVar2.d(strG) == null)) {
                c0733c.b(strG, strI);
            }
        }
        int size2 = lVar2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            String strG2 = lVar2.g(i7);
            if (!"Content-Length".equalsIgnoreCase(strG2) && !"Content-Encoding".equalsIgnoreCase(strG2) && !"Content-Type".equalsIgnoreCase(strG2) && E(strG2)) {
                c0733c.b(strG2, lVar2.i(i7));
            }
        }
        return c0733c.d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static BitmapDrawable p(MainActivity mainActivity, Typeface typeface, String str) {
        Paint paint = new Paint(1);
        paint.setTextSize(50.0f);
        paint.setColor(-16711936);
        paint.setTypeface(typeface);
        paint.setTextAlign(Paint.Align.CENTER);
        int i = (int) 50.0f;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        m.d(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float f = i / 2.0f;
        canvas.drawText(str, f, f - ((fontMetrics.ascent + fontMetrics.descent) / 2), paint);
        return new BitmapDrawable(mainActivity.getResources(), bitmapCreateBitmap);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Bitmap q(MainActivity mainActivity, String str) {
        TextView textView = new TextView(mainActivity);
        textView.setTypeface(Typeface.createFromAsset(mainActivity.getAssets(), "material_icons.ttf"));
        textView.setText(str);
        textView.setTextSize(2, 16.0f);
        textView.setTextColor(-16777216);
        textView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        textView.layout(0, 0, textView.getMeasuredWidth(), textView.getMeasuredHeight());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(textView.getMeasuredWidth(), textView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        m.d(bitmapCreateBitmap, "createBitmap(...)");
        textView.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static AbstractC1918b r(int i) {
        return i != 0 ? i != 1 ? new s4.i() : new s4.d() : new s4.i();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void s(q6.l lVar, x xVar) {
        if (lVar.v(xVar)) {
            return;
        }
        try {
            lVar.W(xVar, false).close();
        } catch (RuntimeException e7) {
            throw e7;
        } catch (Exception unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean t(String current, String str) {
        m.e(current, "current");
        if (current.equals(str)) {
            return true;
        }
        if (current.length() != 0) {
            int i = 0;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                if (i < current.length()) {
                    char cCharAt = current.charAt(i);
                    int i9 = i8 + 1;
                    if (i8 == 0 && cCharAt != '(') {
                        break;
                    }
                    if (cCharAt != '(') {
                        if (cCharAt == ')' && i7 - 1 == 0 && i8 != current.length() - 1) {
                            break;
                        }
                    } else {
                        i7++;
                    }
                    i++;
                    i8 = i9;
                } else if (i7 == 0) {
                    String strSubstring = current.substring(1, current.length() - 1);
                    m.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    return m.a(J5.m.n1(strSubstring).toString(), str);
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void u(q6.l lVar, x xVar) throws IOException {
        try {
            IOException iOException = null;
            for (x xVar2 : lVar.z(xVar)) {
                try {
                    if (lVar.G(xVar2).f12513c) {
                        u(lVar, xVar2);
                    }
                    lVar.f(xVar2);
                } catch (IOException e7) {
                    if (iOException == null) {
                        iOException = e7;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: c4.a.n(java.lang.Object):android.view.translation.ViewTranslationResponse */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void v(ViewOnAttachStateChangeListenerC1018c viewOnAttachStateChangeListenerC1018c, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        W0 w02;
        I0.m mVar;
        B5.c cVar;
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            long jKeyAt = longSparseArray.keyAt(i);
            ViewTranslationResponse viewTranslationResponseN = c4.a.n(longSparseArray.get(jKeyAt));
            if (viewTranslationResponseN != null && (value = viewTranslationResponseN.getValue("android:text")) != null && (text = value.getText()) != null && (w02 = (W0) viewOnAttachStateChangeListenerC1018c.h().b((int) jKeyAt)) != null && (mVar = w02.f941a) != null) {
                Object objG = mVar.f2268d.f2257q.g(I0.h.f2241k);
                if (objG == null) {
                    objG = null;
                }
                I0.a aVar = (I0.a) objG;
                if (aVar != null && (cVar = (B5.c) aVar.f2222b) != null) {
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String w(MainActivity mainActivity, String str) {
        for (String str2 : AbstractC0836n2.A("jpg", "png", "webp", "jpeg", "svg")) {
            try {
                mainActivity.getAssets().open(str + "." + str2).close();
                return str + "." + str2;
            } catch (IOException unused) {
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String[] x(d0.k kVar) {
        m.c(kVar, "null cannot be cast to non-null type androidx.compose.ui.autofill.AndroidContentType");
        return (String[]) ((d0.d) kVar).f11792b.toArray(new String[0]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static float y(String[] strArr, int i) {
        float f = Float.parseFloat(strArr[i]);
        if (f >= 0.0f && f <= 1.0f) {
            return f;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String z(Class cls) {
        LinkedHashMap linkedHashMap = A.f7350b;
        String strValue = (String) linkedHashMap.get(cls);
        if (strValue == null) {
            y yVar = (y) cls.getAnnotation(y.class);
            strValue = yVar != null ? yVar.value() : null;
            if (strValue == null || strValue.length() <= 0) {
                throw new IllegalArgumentException("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()).toString());
            }
            linkedHashMap.put(cls, strValue);
        }
        m.b(strValue);
        return strValue;
    }

    public abstract void D(int i);

    public abstract View J(int i);

    public abstract boolean K();

    public abstract void P(boolean z5);

    public abstract void R();

    public abstract void S(int i);

    public void O(boolean z5) {
    }
}
