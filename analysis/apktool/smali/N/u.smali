.class public final LN/u;
.super Lc0/l;
.source "SourceFile"

# interfaces
.implements LB0/z;


# instance fields
.field public E:LN/r;

.field public F:LB5/e;

.field public G:Lw/d0;

.field public H:Z


# virtual methods
.method public final c(LB0/T;Lz0/B;J)Lz0/D;
    .locals 4

    .line 1
    invoke-interface {p2, p3, p4}, Lz0/B;->a(J)Lz0/J;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-interface {p1}, Lz0/E;->r()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-boolean v0, p0, LN/u;->H:Z

    .line 12
    .line 13
    if-nez v0, :cond_2

    .line 14
    .line 15
    :cond_0
    iget v0, p2, Lz0/J;->q:I

    .line 16
    .line 17
    iget v1, p2, Lz0/J;->r:I

    .line 18
    .line 19
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/measurement/P1;->a(II)J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    iget-object v2, p0, LN/u;->F:LB5/e;

    .line 24
    .line 25
    new-instance v3, LW0/k;

    .line 26
    .line 27
    invoke-direct {v3, v0, v1}, LW0/k;-><init>(J)V

    .line 28
    .line 29
    .line 30
    new-instance v0, LW0/a;

    .line 31
    .line 32
    invoke-direct {v0, p3, p4}, LW0/a;-><init>(J)V

    .line 33
    .line 34
    .line 35
    invoke-interface {v2, v3, v0}, LB5/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p3

    .line 39
    check-cast p3, Lm5/j;

    .line 40
    .line 41
    iget-object p4, p0, LN/u;->E:LN/r;

    .line 42
    .line 43
    iget-object v0, p3, Lm5/j;->q:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, LN/y;

    .line 46
    .line 47
    iget-object p3, p3, Lm5/j;->r:Ljava/lang/Object;

    .line 48
    .line 49
    invoke-virtual {p4}, LN/r;->d()LN/y;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-static {v1, v0}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-nez v1, :cond_2

    .line 58
    .line 59
    iget-object v1, p4, LN/r;->m:LP/f0;

    .line 60
    .line 61
    invoke-virtual {v1, v0}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    iget-object v0, p4, LN/r;->e:LN/x;

    .line 65
    .line 66
    new-instance v1, LB0/K;

    .line 67
    .line 68
    const/16 v2, 0xc

    .line 69
    .line 70
    invoke-direct {v1, v2, p4, p3}, LB0/K;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    iget-object v0, v0, LN/x;->b:LU5/c;

    .line 74
    .line 75
    invoke-virtual {v0}, LU5/c;->f()Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-eqz v2, :cond_1

    .line 80
    .line 81
    const/4 v3, 0x0

    .line 82
    :try_start_0
    invoke-virtual {v1}, LB0/K;->invoke()Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, v3}, LU5/c;->g(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :catchall_0
    move-exception p1

    .line 90
    invoke-virtual {v0, v3}, LU5/c;->g(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    throw p1

    .line 94
    :cond_1
    :goto_0
    if-nez v2, :cond_2

    .line 95
    .line 96
    invoke-virtual {p4, p3}, LN/r;->h(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    :cond_2
    invoke-interface {p1}, Lz0/E;->r()Z

    .line 100
    .line 101
    .line 102
    move-result p3

    .line 103
    if-nez p3, :cond_4

    .line 104
    .line 105
    iget-boolean p3, p0, LN/u;->H:Z

    .line 106
    .line 107
    if-eqz p3, :cond_3

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_3
    const/4 p3, 0x0

    .line 111
    goto :goto_2

    .line 112
    :cond_4
    :goto_1
    const/4 p3, 0x1

    .line 113
    :goto_2
    iput-boolean p3, p0, LN/u;->H:Z

    .line 114
    .line 115
    iget p3, p2, Lz0/J;->q:I

    .line 116
    .line 117
    iget p4, p2, Lz0/J;->r:I

    .line 118
    .line 119
    new-instance v0, LA/J;

    .line 120
    .line 121
    invoke-direct {v0, p1, p0, p2}, LA/J;-><init>(LB0/T;LN/u;Lz0/J;)V

    .line 122
    .line 123
    .line 124
    sget-object p2, Ln5/t;->q:Ln5/t;

    .line 125
    .line 126
    invoke-interface {p1, p3, p4, p2, v0}, Lz0/E;->f(IILjava/util/Map;LB5/c;)Lz0/D;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    return-object p1
.end method

.method public final q0()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, LN/u;->H:Z

    .line 3
    .line 4
    return-void
.end method
