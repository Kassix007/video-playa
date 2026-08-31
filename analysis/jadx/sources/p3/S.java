package p3;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class S implements Cloneable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public C1473t f15695A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public ArrayList f15696B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public C f15697C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public Integer f15698D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public Boolean f15699E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public E.c0 f15700F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public String f15701G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public String f15702H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public String f15703I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public Boolean f15704J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public Boolean f15705K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public AbstractC1448b0 f15706L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public Float f15707M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public String f15708N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public String f15709O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public AbstractC1448b0 f15710P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public Float f15711Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public AbstractC1448b0 f15712R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public Float f15713S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public int f15714T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public int f15715U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public int f15716V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public int f15717W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public int f15718X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f15719Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public int f15720Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f15721a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f15722b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f15723c0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f15724q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public AbstractC1448b0 f15725r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Float f15726s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public AbstractC1448b0 f15727t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Float f15728u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C f15729v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Float f15730w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public C[] f15731x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public C f15732y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Float f15733z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static S a() {
        S s6 = new S();
        s6.f15724q = -1L;
        C1473t c1473t = C1473t.f15841r;
        s6.f15725r = c1473t;
        s6.f15714T = 1;
        Float fValueOf = Float.valueOf(1.0f);
        s6.f15726s = fValueOf;
        s6.f15727t = null;
        s6.f15728u = fValueOf;
        s6.f15729v = new C(1.0f);
        s6.f15715U = 1;
        s6.f15716V = 1;
        s6.f15730w = Float.valueOf(4.0f);
        s6.f15731x = null;
        s6.f15732y = new C(0.0f);
        s6.f15733z = fValueOf;
        s6.f15695A = c1473t;
        s6.f15696B = null;
        s6.f15697C = new C(7, 12.0f);
        s6.f15698D = 400;
        s6.f15717W = 1;
        s6.f15718X = 1;
        s6.f15719Y = 1;
        s6.f15720Z = 1;
        Boolean bool = Boolean.TRUE;
        s6.f15699E = bool;
        s6.f15700F = null;
        s6.f15701G = null;
        s6.f15702H = null;
        s6.f15703I = null;
        s6.f15704J = bool;
        s6.f15705K = bool;
        s6.f15706L = c1473t;
        s6.f15707M = fValueOf;
        s6.f15708N = null;
        s6.f15721a0 = 1;
        s6.f15709O = null;
        s6.f15710P = null;
        s6.f15711Q = fValueOf;
        s6.f15712R = null;
        s6.f15713S = fValueOf;
        s6.f15722b0 = 1;
        s6.f15723c0 = 1;
        return s6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object clone() {
        S s6 = (S) super.clone();
        C[] cArr = this.f15731x;
        if (cArr != null) {
            s6.f15731x = (C[]) cArr.clone();
        }
        return s6;
    }
}
