package com.google.android.gms.flags.impl;

import D3.b;
import F3.f;
import G3.a;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.util.DynamiteApi;
import l6.d;
import n5.AbstractC1397A;

/* JADX INFO: loaded from: classes.dex */
@DynamiteApi
public class FlagProviderImpl extends f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f10374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SharedPreferences f10375d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FlagProviderImpl() {
        attachInterface(this, "com.google.android.gms.flags.IFlagProvider");
        this.f10374c = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // F3.e
    public boolean getBooleanFlagValue(String str, boolean z5, int i) {
        if (!this.f10374c) {
            return z5;
        }
        SharedPreferences sharedPreferences = this.f10375d;
        Boolean boolValueOf = Boolean.valueOf(z5);
        try {
            boolValueOf = (Boolean) d.F(new a(sharedPreferences, str, boolValueOf, 0));
        } catch (Exception e7) {
            String strValueOf = String.valueOf(e7.getMessage());
            Log.w("FlagDataUtils", strValueOf.length() != 0 ? "Flag value not available, returning default: ".concat(strValueOf) : new String("Flag value not available, returning default: "));
        }
        return boolValueOf.booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // F3.e
    public int getIntFlagValue(String str, int i, int i7) {
        if (!this.f10374c) {
            return i;
        }
        SharedPreferences sharedPreferences = this.f10375d;
        Integer numValueOf = Integer.valueOf(i);
        try {
            numValueOf = (Integer) d.F(new a(sharedPreferences, str, numValueOf, 1));
        } catch (Exception e7) {
            String strValueOf = String.valueOf(e7.getMessage());
            Log.w("FlagDataUtils", strValueOf.length() != 0 ? "Flag value not available, returning default: ".concat(strValueOf) : new String("Flag value not available, returning default: "));
        }
        return numValueOf.intValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // F3.e
    public long getLongFlagValue(String str, long j, int i) {
        if (!this.f10374c) {
            return j;
        }
        SharedPreferences sharedPreferences = this.f10375d;
        Long lValueOf = Long.valueOf(j);
        try {
            lValueOf = (Long) d.F(new a(sharedPreferences, str, lValueOf, 2));
        } catch (Exception e7) {
            String strValueOf = String.valueOf(e7.getMessage());
            Log.w("FlagDataUtils", strValueOf.length() != 0 ? "Flag value not available, returning default: ".concat(strValueOf) : new String("Flag value not available, returning default: "));
        }
        return lValueOf.longValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // F3.e
    public String getStringFlagValue(String str, String str2, int i) {
        if (!this.f10374c) {
            return str2;
        }
        try {
            return (String) d.F(new a(this.f10375d, str, str2, 3));
        } catch (Exception e7) {
            String strValueOf = String.valueOf(e7.getMessage());
            Log.w("FlagDataUtils", strValueOf.length() != 0 ? "Flag value not available, returning default: ".concat(strValueOf) : new String("Flag value not available, returning default: "));
            return str2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // F3.e
    public void init(D3.a aVar) {
        Context context = (Context) b.K(aVar);
        if (this.f10374c) {
            return;
        }
        try {
            this.f10375d = AbstractC1397A.H(context.createPackageContext("com.google.android.gms", 0));
            this.f10374c = true;
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Exception e7) {
            String strValueOf = String.valueOf(e7.getMessage());
            Log.w("FlagProviderImpl", strValueOf.length() != 0 ? "Could not retrieve sdk flags, continuing with defaults: ".concat(strValueOf) : new String("Could not retrieve sdk flags, continuing with defaults: "));
        }
    }
}
