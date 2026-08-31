.class public abstract LB0/U;
.super LB0/T;
.source "SourceFile"

# interfaces
.implements Lz0/B;


# instance fields
.field public final B:LB0/n0;

.field public C:J

.field public D:Ljava/util/LinkedHashMap;

.field public final E:Lz0/A;

.field public F:Lz0/D;

.field public final G:Lr/B;


# direct methods
.method public constructor <init>(LB0/n0;)V
    .locals 2

    .line 1
    invoke-direct {p0}, LB0/T;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LB0/U;->B:LB0/n0;

    .line 5
    .line 6
    const-wide/16 v0, 0x0

    .line 7
    .line 8
    iput-wide v0, p0, LB0/U;->C:J

    .line 9
    .line 10
    new-instance p1, Lz0/A;

    .line 11
    .line 12
    invoke-direct {p1, p0}, Lz0/A;-><init>(LB0/U;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, LB0/U;->E:Lz0/A;

    .line 16
    .line 17
    sget-object p1, Lr/L;->a:Lr/B;

    .line 18
    .line 19
    new-instance p1, Lr/B;

    .line 20
    .line 21
    invoke-direct {p1}, Lr/B;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, LB0/U;->G:Lr/B;

    .line 25
    .line 26
    return-void
.end method

.method public static final p0(LB0/U;Lz0/D;)V
    .locals 6

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-interface {p1}, Lz0/D;->b()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-interface {p1}, Lz0/D;->a()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    int-to-long v2, v0

    .line 12
    const/16 v0, 0x20

    .line 13
    .line 14
    shl-long/2addr v2, v0

    .line 15
    int-to-long v0, v1

    .line 16
    const-wide v4, 0xffffffffL

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    and-long/2addr v0, v4

    .line 22
    or-long/2addr v0, v2

    .line 23
    invoke-virtual {p0, v0, v1}, Lz0/J;->W(J)V

    .line 24
    .line 25
    .line 26
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v0, 0x0

    .line 30
    :goto_0
    if-nez v0, :cond_1

    .line 31
    .line 32
    const-wide/16 v0, 0x0

    .line 33
    .line 34
    invoke-virtual {p0, v0, v1}, Lz0/J;->W(J)V

    .line 35
    .line 36
    .line 37
    :cond_1
    iget-object v0, p0, LB0/U;->F:Lz0/D;

    .line 38
    .line 39
    invoke-static {v0, p1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_5

    .line 44
    .line 45
    if-eqz p1, :cond_5

    .line 46
    .line 47
    iget-object v0, p0, LB0/U;->D:Ljava/util/LinkedHashMap;

    .line 48
    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_3

    .line 56
    .line 57
    :cond_2
    invoke-interface {p1}, Lz0/D;->c()Ljava/util/Map;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-nez v0, :cond_5

    .line 66
    .line 67
    :cond_3
    invoke-interface {p1}, Lz0/D;->c()Ljava/util/Map;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    iget-object v1, p0, LB0/U;->D:Ljava/util/LinkedHashMap;

    .line 72
    .line 73
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-nez v0, :cond_5

    .line 78
    .line 79
    iget-object v0, p0, LB0/U;->B:LB0/n0;

    .line 80
    .line 81
    iget-object v0, v0, LB0/n0;->B:LB0/L;

    .line 82
    .line 83
    iget-object v0, v0, LB0/L;->V:LB0/P;

    .line 84
    .line 85
    iget-object v0, v0, LB0/P;->q:LB0/Y;

    .line 86
    .line 87
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    iget-object v0, v0, LB0/Y;->G:LB0/M;

    .line 91
    .line 92
    invoke-virtual {v0}, LB0/M;->f()V

    .line 93
    .line 94
    .line 95
    iget-object v0, p0, LB0/U;->D:Ljava/util/LinkedHashMap;

    .line 96
    .line 97
    if-nez v0, :cond_4

    .line 98
    .line 99
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 100
    .line 101
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 102
    .line 103
    .line 104
    iput-object v0, p0, LB0/U;->D:Ljava/util/LinkedHashMap;

    .line 105
    .line 106
    :cond_4
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 107
    .line 108
    .line 109
    invoke-interface {p1}, Lz0/D;->c()Ljava/util/Map;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    invoke-interface {v0, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 114
    .line 115
    .line 116
    :cond_5
    iput-object p1, p0, LB0/U;->F:Lz0/D;

    .line 117
    .line 118
    return-void
.end method


# virtual methods
.method public final U(JFLB5/c;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LB0/U;->r0(J)V

    .line 2
    .line 3
    .line 4
    iget-boolean p1, p0, LB0/T;->w:Z

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-virtual {p0}, LB0/U;->q0()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final b()F
    .locals 1

    .line 1
    iget-object v0, p0, LB0/U;->B:LB0/n0;

    .line 2
    .line 3
    invoke-virtual {v0}, LB0/n0;->b()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final c0()LB0/T;
    .locals 1

    .line 1
    iget-object v0, p0, LB0/U;->B:LB0/n0;

    .line 2
    .line 3
    iget-object v0, v0, LB0/n0;->C:LB0/n0;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, LB0/n0;->z0()LB0/U;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return-object v0
.end method

.method public final d0()Lz0/m;
    .locals 1

    .line 1
    iget-object v0, p0, LB0/U;->E:Lz0/A;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e0()Z
    .locals 1

    .line 1
    iget-object v0, p0, LB0/U;->F:Lz0/D;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public final g()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LB0/U;->B:LB0/n0;

    .line 2
    .line 3
    invoke-virtual {v0}, LB0/n0;->g()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final getLayoutDirection()LW0/l;
    .locals 1

    .line 1
    iget-object v0, p0, LB0/U;->B:LB0/n0;

    .line 2
    .line 3
    iget-object v0, v0, LB0/n0;->B:LB0/L;

    .line 4
    .line 5
    iget-object v0, v0, LB0/L;->O:LW0/l;

    .line 6
    .line 7
    return-object v0
.end method

.method public final h0()LB0/L;
    .locals 1

    .line 1
    iget-object v0, p0, LB0/U;->B:LB0/n0;

    .line 2
    .line 3
    iget-object v0, v0, LB0/n0;->B:LB0/L;

    .line 4
    .line 5
    return-object v0
.end method

.method public final j0()Lz0/D;
    .locals 1

    .line 1
    iget-object v0, p0, LB0/U;->F:Lz0/D;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "LookaheadDelegate has not been measured yet when measureResult is requested."

    .line 7
    .line 8
    invoke-static {v0}, LC0/S;->i(Ljava/lang/String;)LC2/e;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    throw v0
.end method

.method public final l()F
    .locals 1

    .line 1
    iget-object v0, p0, LB0/U;->B:LB0/n0;

    .line 2
    .line 3
    invoke-virtual {v0}, LB0/n0;->l()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final l0()LB0/T;
    .locals 1

    .line 1
    iget-object v0, p0, LB0/U;->B:LB0/n0;

    .line 2
    .line 3
    iget-object v0, v0, LB0/n0;->D:LB0/n0;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, LB0/n0;->z0()LB0/U;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return-object v0
.end method

.method public final m0()J
    .locals 2

    .line 1
    iget-wide v0, p0, LB0/U;->C:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final o0()V
    .locals 4

    .line 1
    iget-wide v0, p0, LB0/U;->C:J

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    const/4 v3, 0x0

    .line 5
    invoke-virtual {p0, v0, v1, v2, v3}, LB0/U;->U(JFLB5/c;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public q0()V
    .locals 1

    .line 1
    invoke-virtual {p0}, LB0/U;->j0()Lz0/D;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Lz0/D;->d()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final r()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final r0(J)V
    .locals 2

    .line 1
    iget-wide v0, p0, LB0/U;->C:J

    .line 2
    .line 3
    invoke-static {v0, v1, p1, p2}, LW0/i;->a(JJ)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iput-wide p1, p0, LB0/U;->C:J

    .line 10
    .line 11
    iget-object p1, p0, LB0/U;->B:LB0/n0;

    .line 12
    .line 13
    iget-object p2, p1, LB0/n0;->B:LB0/L;

    .line 14
    .line 15
    iget-object p2, p2, LB0/L;->V:LB0/P;

    .line 16
    .line 17
    iget-object p2, p2, LB0/P;->q:LB0/Y;

    .line 18
    .line 19
    if-eqz p2, :cond_0

    .line 20
    .line 21
    invoke-virtual {p2}, LB0/Y;->b0()V

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-static {p1}, LB0/T;->n0(LB0/n0;)V

    .line 25
    .line 26
    .line 27
    :cond_1
    iget-boolean p1, p0, LB0/T;->x:Z

    .line 28
    .line 29
    if-nez p1, :cond_2

    .line 30
    .line 31
    invoke-virtual {p0}, LB0/U;->j0()Lz0/D;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    new-instance p2, LB0/x0;

    .line 36
    .line 37
    invoke-direct {p2, p1, p0}, LB0/x0;-><init>(Lz0/D;LB0/T;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, p2}, LB0/T;->Z(LB0/x0;)V

    .line 41
    .line 42
    .line 43
    :cond_2
    return-void
.end method

.method public final s0(LB0/U;Z)J
    .locals 5

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    move-object v2, p0

    .line 4
    :goto_0
    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 5
    .line 6
    .line 7
    move-result v3

    .line 8
    if-nez v3, :cond_2

    .line 9
    .line 10
    iget-boolean v3, v2, LB0/T;->v:Z

    .line 11
    .line 12
    if-eqz v3, :cond_0

    .line 13
    .line 14
    if-nez p2, :cond_1

    .line 15
    .line 16
    :cond_0
    iget-wide v3, v2, LB0/U;->C:J

    .line 17
    .line 18
    invoke-static {v0, v1, v3, v4}, LW0/i;->c(JJ)J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    :cond_1
    iget-object v2, v2, LB0/U;->B:LB0/n0;

    .line 23
    .line 24
    iget-object v2, v2, LB0/n0;->D:LB0/n0;

    .line 25
    .line 26
    invoke-static {v2}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2}, LB0/n0;->z0()LB0/U;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-static {v2}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    return-wide v0
.end method
