.class public final LF/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu0/a;


# instance fields
.field public final q:LF/e;


# direct methods
.method public constructor <init>(LF/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LF/a;->q:LF/e;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final F(IJJ)J
    .locals 0

    .line 1
    const/4 p2, 0x2

    .line 2
    if-ne p1, p2, :cond_1

    .line 3
    .line 4
    const/16 p1, 0x20

    .line 5
    .line 6
    shr-long p1, p4, p1

    .line 7
    .line 8
    long-to-int p1, p1

    .line 9
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    const/4 p2, 0x0

    .line 14
    cmpg-float p1, p1, p2

    .line 15
    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    new-instance p1, Ljava/util/concurrent/CancellationException;

    .line 20
    .line 21
    const-string p2, "Scroll cancelled"

    .line 22
    .line 23
    invoke-direct {p1, p2}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :cond_1
    :goto_0
    const-wide/16 p1, 0x0

    .line 28
    .line 29
    return-wide p1
.end method

.method public final b0(IJ)J
    .locals 7

    .line 1
    iget-object v0, p0, LF/a;->q:LF/e;

    .line 2
    .line 3
    iget-object v1, v0, LF/N;->d:LF/D;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-ne p1, v2, :cond_1

    .line 7
    .line 8
    iget-object p1, v1, LF/D;->t:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p1, LP/b0;

    .line 11
    .line 12
    invoke-virtual {p1}, LP/b0;->e()F

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    float-to-double v2, p1

    .line 21
    const-wide v4, 0x3eb0c6f7a0b5ed8dL    # 1.0E-6

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    cmpl-double p1, v2, v4

    .line 27
    .line 28
    if-lez p1, :cond_1

    .line 29
    .line 30
    iget-object p1, v1, LF/D;->t:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p1, LP/b0;

    .line 33
    .line 34
    invoke-virtual {p1}, LP/b0;->e()F

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    invoke-virtual {v0}, LF/N;->m()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    int-to-float v2, v2

    .line 43
    mul-float/2addr p1, v2

    .line 44
    invoke-virtual {v0}, LF/N;->k()LF/B;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    iget v2, v2, LF/B;->b:I

    .line 49
    .line 50
    invoke-virtual {v0}, LF/N;->k()LF/B;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    iget v3, v3, LF/B;->c:I

    .line 55
    .line 56
    add-int/2addr v2, v3

    .line 57
    int-to-float v2, v2

    .line 58
    iget-object v3, v1, LF/D;->t:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v3, LP/b0;

    .line 61
    .line 62
    invoke-virtual {v3}, LP/b0;->e()F

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    invoke-static {v3}, Ljava/lang/Math;->signum(F)F

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    neg-float v3, v3

    .line 71
    mul-float/2addr v2, v3

    .line 72
    add-float/2addr v2, p1

    .line 73
    iget-object v1, v1, LF/D;->t:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v1, LP/b0;

    .line 76
    .line 77
    invoke-virtual {v1}, LP/b0;->e()F

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    const/4 v3, 0x0

    .line 82
    cmpl-float v1, v1, v3

    .line 83
    .line 84
    if-lez v1, :cond_0

    .line 85
    .line 86
    move v6, v2

    .line 87
    move v2, p1

    .line 88
    move p1, v6

    .line 89
    :cond_0
    const/16 v1, 0x20

    .line 90
    .line 91
    shr-long v3, p2, v1

    .line 92
    .line 93
    long-to-int v3, v3

    .line 94
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    invoke-static {v3, p1, v2}, LD5/a;->p(FFF)F

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    neg-float p1, p1

    .line 103
    iget-object v0, v0, LF/N;->k:Lp3/z0;

    .line 104
    .line 105
    invoke-virtual {v0, p1}, Lp3/z0;->d(F)F

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    neg-float p1, p1

    .line 110
    const-wide v2, 0xffffffffL

    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    and-long/2addr p2, v2

    .line 116
    long-to-int p2, p2

    .line 117
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 118
    .line 119
    .line 120
    move-result p2

    .line 121
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    int-to-long v4, p1

    .line 126
    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    int-to-long p1, p1

    .line 131
    shl-long v0, v4, v1

    .line 132
    .line 133
    and-long/2addr p1, v2

    .line 134
    or-long/2addr p1, v0

    .line 135
    return-wide p1

    .line 136
    :cond_1
    const-wide/16 p1, 0x0

    .line 137
    .line 138
    return-wide p1
.end method

.method public final n(JJLq5/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    const/4 p2, 0x1

    .line 3
    invoke-static {p3, p4, p1, p1, p2}, LW0/p;->a(JFFI)J

    .line 4
    .line 5
    .line 6
    move-result-wide p1

    .line 7
    new-instance p3, LW0/p;

    .line 8
    .line 9
    invoke-direct {p3, p1, p2}, LW0/p;-><init>(J)V

    .line 10
    .line 11
    .line 12
    return-object p3
.end method
