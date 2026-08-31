.class public final Lv0/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LW0/c;
.implements Lq5/c;


# instance fields
.field public final q:LM5/h;

.field public final synthetic r:Lv0/A;

.field public s:LM5/h;

.field public t:Lv0/g;

.field public final u:Lq5/i;

.field public final synthetic v:Lv0/A;


# direct methods
.method public constructor <init>(Lv0/A;LM5/h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lv0/y;->v:Lv0/A;

    .line 5
    .line 6
    iput-object p2, p0, Lv0/y;->q:LM5/h;

    .line 7
    .line 8
    iput-object p1, p0, Lv0/y;->r:Lv0/A;

    .line 9
    .line 10
    sget-object p1, Lv0/g;->r:Lv0/g;

    .line 11
    .line 12
    iput-object p1, p0, Lv0/y;->t:Lv0/g;

    .line 13
    .line 14
    sget-object p1, Lq5/i;->q:Lq5/i;

    .line 15
    .line 16
    iput-object p1, p0, Lv0/y;->u:Lq5/i;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final D(J)F
    .locals 1

    .line 1
    iget-object v0, p0, Lv0/y;->r:Lv0/A;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, LW0/c;->D(J)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final G(F)I
    .locals 1

    .line 1
    iget-object v0, p0, Lv0/y;->r:Lv0/A;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LW0/c;->G(F)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final Q(J)J
    .locals 1

    .line 1
    iget-object v0, p0, Lv0/y;->r:Lv0/A;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, LW0/c;->Q(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide p1

    .line 7
    return-wide p1
.end method

.method public final T(J)F
    .locals 1

    .line 1
    iget-object v0, p0, Lv0/y;->r:Lv0/A;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, LW0/c;->T(J)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final a(Lv0/g;Ls5/a;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, LM5/h;

    .line 2
    .line 3
    invoke-static {p2}, Ln5/A;->v(Lq5/c;)Lq5/c;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, v1, p2}, LM5/h;-><init>(ILq5/c;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, LM5/h;->s()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lv0/y;->t:Lv0/g;

    .line 15
    .line 16
    iput-object v0, p0, Lv0/y;->s:LM5/h;

    .line 17
    .line 18
    invoke-virtual {v0}, LM5/h;->r()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1
.end method

.method public final a0(F)J
    .locals 2

    .line 1
    iget-object v0, p0, Lv0/y;->r:Lv0/A;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LW0/c;->a0(F)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final b()F
    .locals 1

    .line 1
    iget-object v0, p0, Lv0/y;->r:Lv0/A;

    .line 2
    .line 3
    invoke-virtual {v0}, Lv0/A;->b()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final c()J
    .locals 10

    .line 1
    iget-object v0, p0, Lv0/y;->v:Lv0/A;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, LB0/g;->u(LB0/m;)LB0/L;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iget-object v1, v1, LB0/L;->P:LC0/b1;

    .line 11
    .line 12
    invoke-interface {v1}, LC0/b1;->d()J

    .line 13
    .line 14
    .line 15
    move-result-wide v1

    .line 16
    invoke-interface {v0, v1, v2}, LW0/c;->Q(J)J

    .line 17
    .line 18
    .line 19
    move-result-wide v1

    .line 20
    iget-wide v3, v0, Lv0/A;->N:J

    .line 21
    .line 22
    const/16 v0, 0x20

    .line 23
    .line 24
    shr-long v5, v1, v0

    .line 25
    .line 26
    long-to-int v5, v5

    .line 27
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    shr-long v6, v3, v0

    .line 32
    .line 33
    long-to-int v6, v6

    .line 34
    int-to-float v6, v6

    .line 35
    sub-float/2addr v5, v6

    .line 36
    const/4 v6, 0x0

    .line 37
    invoke-static {v6, v5}, Ljava/lang/Math;->max(FF)F

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    const/high16 v7, 0x40000000    # 2.0f

    .line 42
    .line 43
    div-float/2addr v5, v7

    .line 44
    const-wide v8, 0xffffffffL

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    and-long/2addr v1, v8

    .line 50
    long-to-int v1, v1

    .line 51
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    and-long v2, v3, v8

    .line 56
    .line 57
    long-to-int v2, v2

    .line 58
    int-to-float v2, v2

    .line 59
    sub-float/2addr v1, v2

    .line 60
    invoke-static {v6, v1}, Ljava/lang/Math;->max(FF)F

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    div-float/2addr v1, v7

    .line 65
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    int-to-long v2, v2

    .line 70
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    int-to-long v4, v1

    .line 75
    shl-long v0, v2, v0

    .line 76
    .line 77
    and-long v2, v4, v8

    .line 78
    .line 79
    or-long/2addr v0, v2

    .line 80
    return-wide v0
.end method

.method public final e()LC0/b1;
    .locals 1

    .line 1
    iget-object v0, p0, Lv0/y;->v:Lv0/A;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, LB0/g;->u(LB0/m;)LB0/L;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v0, v0, LB0/L;->P:LC0/b1;

    .line 11
    .line 12
    return-object v0
.end method

.method public final f0(I)F
    .locals 1

    .line 1
    iget-object v0, p0, Lv0/y;->r:Lv0/A;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LW0/c;->f0(I)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final getContext()Lq5/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lv0/y;->u:Lq5/i;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h(JLB5/e;Ls5/c;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p4, Lv0/w;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Lv0/w;

    .line 7
    .line 8
    iget v1, v0, Lv0/w;->t:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lv0/w;->t:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lv0/w;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, Lv0/w;-><init>(Lv0/y;Ls5/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Lv0/w;->r:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lv0/w;->t:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    iget-object p1, v0, Lv0/w;->q:LM5/B;

    .line 35
    .line 36
    :try_start_0
    invoke-static {p4}, Lm5/a;->e(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :catchall_0
    move-exception p2

    .line 41
    goto :goto_2

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    invoke-static {p4}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    const-wide/16 v3, 0x0

    .line 54
    .line 55
    cmp-long p4, p1, v3

    .line 56
    .line 57
    if-gtz p4, :cond_3

    .line 58
    .line 59
    iget-object p4, p0, Lv0/y;->s:LM5/h;

    .line 60
    .line 61
    if-eqz p4, :cond_3

    .line 62
    .line 63
    new-instance v1, Lv0/h;

    .line 64
    .line 65
    invoke-direct {v1, p1, p2}, Lv0/h;-><init>(J)V

    .line 66
    .line 67
    .line 68
    invoke-static {v1}, Lm5/a;->b(Ljava/lang/Throwable;)Lm5/l;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-virtual {p4, v1}, LM5/h;->resumeWith(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    :cond_3
    iget-object p4, p0, Lv0/y;->v:Lv0/A;

    .line 76
    .line 77
    invoke-virtual {p4}, Lc0/l;->l0()LM5/w;

    .line 78
    .line 79
    .line 80
    move-result-object p4

    .line 81
    new-instance v1, Lv0/x;

    .line 82
    .line 83
    const/4 v3, 0x0

    .line 84
    invoke-direct {v1, p1, p2, p0, v3}, Lv0/x;-><init>(JLv0/y;Lq5/c;)V

    .line 85
    .line 86
    .line 87
    const/4 p1, 0x3

    .line 88
    invoke-static {p4, v3, v3, v1, p1}, LM5/y;->t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    :try_start_1
    iput-object p1, v0, Lv0/w;->q:LM5/B;

    .line 93
    .line 94
    iput v2, v0, Lv0/w;->t:I

    .line 95
    .line 96
    invoke-interface {p3, p0, v0}, LB5/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 100
    sget-object p2, Lr5/a;->q:Lr5/a;

    .line 101
    .line 102
    if-ne p4, p2, :cond_4

    .line 103
    .line 104
    return-object p2

    .line 105
    :cond_4
    :goto_1
    sget-object p2, Lv0/a;->q:Lv0/a;

    .line 106
    .line 107
    invoke-interface {p1, p2}, LM5/b0;->a(Ljava/util/concurrent/CancellationException;)V

    .line 108
    .line 109
    .line 110
    return-object p4

    .line 111
    :goto_2
    sget-object p3, Lv0/a;->q:Lv0/a;

    .line 112
    .line 113
    invoke-interface {p1, p3}, LM5/b0;->a(Ljava/util/concurrent/CancellationException;)V

    .line 114
    .line 115
    .line 116
    throw p2
.end method

.method public final i0(F)F
    .locals 1

    .line 1
    iget-object v0, p0, Lv0/y;->r:Lv0/A;

    .line 2
    .line 3
    invoke-virtual {v0}, Lv0/A;->b()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    div-float/2addr p1, v0

    .line 8
    return p1
.end method

.method public final l()F
    .locals 1

    .line 1
    iget-object v0, p0, Lv0/y;->r:Lv0/A;

    .line 2
    .line 3
    invoke-virtual {v0}, Lv0/A;->l()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final resumeWith(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lv0/y;->v:Lv0/A;

    .line 2
    .line 3
    iget-object v1, v0, Lv0/A;->K:LR/e;

    .line 4
    .line 5
    monitor-enter v1

    .line 6
    :try_start_0
    iget-object v0, v0, Lv0/A;->J:LR/e;

    .line 7
    .line 8
    invoke-virtual {v0, p0}, LR/e;->l(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    .line 11
    monitor-exit v1

    .line 12
    iget-object v0, p0, Lv0/y;->q:LM5/h;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, LM5/h;->resumeWith(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :catchall_0
    move-exception p1

    .line 19
    monitor-exit v1

    .line 20
    throw p1
.end method

.method public final s(F)J
    .locals 2

    .line 1
    iget-object v0, p0, Lv0/y;->r:Lv0/A;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LW0/c;->s(F)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final u(F)F
    .locals 1

    .line 1
    iget-object v0, p0, Lv0/y;->r:Lv0/A;

    .line 2
    .line 3
    invoke-virtual {v0}, Lv0/A;->b()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-float/2addr v0, p1

    .line 8
    return v0
.end method
