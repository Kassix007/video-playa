.class public abstract LM/G0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F

.field public static final b:Lu/z0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/16 v0, 0x16

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    sput v0, LM/G0;->a:F

    .line 5
    .line 6
    sget-object v0, Lu/y;->a:Lu/t;

    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    const/16 v2, 0x12c

    .line 10
    .line 11
    invoke-static {v2, v1, v0}, Lu/d;->p(IILu/x;)Lu/z0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, LM/G0;->b:Lu/z0;

    .line 16
    .line 17
    return-void
.end method

.method public static final a(LB5/c;LM/J0;LP/o;II)LM/I0;
    .locals 12

    .line 1
    sget-object v1, LC0/t0;->h:LP/T0;

    .line 2
    .line 3
    invoke-virtual {p2, v1}, LP/o;->k(LP/l0;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    move-object v6, v1

    .line 8
    check-cast v6, LW0/c;

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const/4 v9, 0x0

    .line 16
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    filled-new-array {v1, p0, v2}, [Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    sget-object v2, LM/m;->z:LM/m;

    .line 25
    .line 26
    new-instance v4, LM/H0;

    .line 27
    .line 28
    invoke-direct {v4, v5, v6, p0, v9}, LM/H0;-><init>(ZLW0/c;LB5/c;Z)V

    .line 29
    .line 30
    .line 31
    sget-object v7, LZ/n;->a:LZ/m;

    .line 32
    .line 33
    move-object v10, v1

    .line 34
    new-instance v1, LZ/m;

    .line 35
    .line 36
    const/4 v7, 0x0

    .line 37
    invoke-direct {v1, v7, v2, v4}, LZ/m;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p2, v5}, LP/o;->h(Z)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    invoke-virtual {p2, v6}, LP/o;->g(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    or-int/2addr v2, v4

    .line 49
    and-int/lit16 v4, p3, 0x380

    .line 50
    .line 51
    xor-int/lit16 v4, v4, 0x180

    .line 52
    .line 53
    const/16 v8, 0x100

    .line 54
    .line 55
    const/4 v11, 0x1

    .line 56
    if-le v4, v8, :cond_0

    .line 57
    .line 58
    invoke-virtual {p2, p1}, LP/o;->g(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-nez v4, :cond_1

    .line 63
    .line 64
    :cond_0
    and-int/lit16 v4, p3, 0x180

    .line 65
    .line 66
    if-ne v4, v8, :cond_2

    .line 67
    .line 68
    :cond_1
    move v4, v11

    .line 69
    goto :goto_0

    .line 70
    :cond_2
    move v4, v7

    .line 71
    :goto_0
    or-int/2addr v2, v4

    .line 72
    invoke-virtual {p2, p0}, LP/o;->g(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    or-int/2addr v2, v4

    .line 77
    and-int/lit16 v4, p3, 0x1c00

    .line 78
    .line 79
    xor-int/lit16 v4, v4, 0xc00

    .line 80
    .line 81
    const/16 v8, 0x800

    .line 82
    .line 83
    if-le v4, v8, :cond_3

    .line 84
    .line 85
    invoke-virtual {p2, v9}, LP/o;->h(Z)Z

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    if-nez v4, :cond_4

    .line 90
    .line 91
    :cond_3
    and-int/lit16 v0, p3, 0xc00

    .line 92
    .line 93
    if-ne v0, v8, :cond_5

    .line 94
    .line 95
    :cond_4
    move v7, v11

    .line 96
    :cond_5
    or-int v0, v2, v7

    .line 97
    .line 98
    invoke-virtual {p2}, LP/o;->H()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    if-nez v0, :cond_6

    .line 103
    .line 104
    sget-object v0, LP/k;->a:LP/S;

    .line 105
    .line 106
    if-ne v2, v0, :cond_7

    .line 107
    .line 108
    :cond_6
    new-instance v4, LM/F0;

    .line 109
    .line 110
    move-object v8, p0

    .line 111
    move-object v7, p1

    .line 112
    invoke-direct/range {v4 .. v9}, LM/F0;-><init>(ZLW0/c;LM/J0;LB5/c;Z)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p2, v4}, LP/o;->d0(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    move-object v2, v4

    .line 119
    :cond_7
    check-cast v2, LB5/a;

    .line 120
    .line 121
    const/4 v4, 0x0

    .line 122
    const/4 v5, 0x4

    .line 123
    move-object v3, p2

    .line 124
    move-object v0, v10

    .line 125
    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/P1;->P([Ljava/lang/Object;LZ/l;LB5/a;LP/o;II)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    check-cast p0, LM/I0;

    .line 130
    .line 131
    return-object p0
.end method
