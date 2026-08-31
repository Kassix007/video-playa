.class public final LB0/u;
.super LB0/U;
.source "SourceFile"


# virtual methods
.method public final Y(Lz0/l;)I
    .locals 6

    .line 1
    iget-object v0, p0, LB0/U;->B:LB0/n0;

    .line 2
    .line 3
    iget-object v0, v0, LB0/n0;->B:LB0/L;

    .line 4
    .line 5
    iget-object v0, v0, LB0/L;->V:LB0/P;

    .line 6
    .line 7
    iget-object v0, v0, LB0/P;->q:LB0/Y;

    .line 8
    .line 9
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object v1, v0, LB0/Y;->G:LB0/M;

    .line 13
    .line 14
    iget-object v2, v0, LB0/Y;->v:LB0/P;

    .line 15
    .line 16
    iget-object v3, v2, LB0/P;->d:LB0/G;

    .line 17
    .line 18
    sget-object v4, LB0/G;->r:LB0/G;

    .line 19
    .line 20
    const/4 v5, 0x1

    .line 21
    if-ne v3, v4, :cond_0

    .line 22
    .line 23
    iput-boolean v5, v1, LB0/M;->d:Z

    .line 24
    .line 25
    iget-boolean v3, v1, LB0/M;->b:Z

    .line 26
    .line 27
    if-eqz v3, :cond_1

    .line 28
    .line 29
    iput-boolean v5, v2, LB0/P;->f:Z

    .line 30
    .line 31
    iput-boolean v5, v2, LB0/P;->g:Z

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    iput-boolean v5, v1, LB0/M;->e:Z

    .line 35
    .line 36
    :cond_1
    :goto_0
    invoke-virtual {v0}, LB0/Y;->n()LB0/v;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    iget-object v2, v2, LB0/v;->b0:LB0/u;

    .line 41
    .line 42
    if-nez v2, :cond_2

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_2
    iput-boolean v5, v2, LB0/T;->x:Z

    .line 46
    .line 47
    :goto_1
    invoke-virtual {v0}, LB0/Y;->t()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, LB0/Y;->n()LB0/v;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iget-object v0, v0, LB0/v;->b0:LB0/u;

    .line 55
    .line 56
    if-nez v0, :cond_3

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_3
    const/4 v2, 0x0

    .line 60
    iput-boolean v2, v0, LB0/T;->x:Z

    .line 61
    .line 62
    :goto_2
    iget-object v0, v1, LB0/M;->g:Ljava/util/HashMap;

    .line 63
    .line 64
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    check-cast v0, Ljava/lang/Integer;

    .line 69
    .line 70
    if-eqz v0, :cond_4

    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    goto :goto_3

    .line 77
    :cond_4
    const/high16 v0, -0x80000000

    .line 78
    .line 79
    :goto_3
    iget-object v1, p0, LB0/U;->G:Lr/B;

    .line 80
    .line 81
    invoke-virtual {v1, v0, p1}, Lr/B;->g(ILjava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    return v0
.end method

.method public final a(J)Lz0/J;
    .locals 6

    .line 1
    invoke-virtual {p0, p1, p2}, Lz0/J;->X(J)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LB0/U;->B:LB0/n0;

    .line 5
    .line 6
    iget-object v1, v0, LB0/n0;->B:LB0/L;

    .line 7
    .line 8
    invoke-virtual {v1}, LB0/L;->w()LR/e;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iget-object v2, v1, LR/e;->q:[Ljava/lang/Object;

    .line 13
    .line 14
    iget v1, v1, LR/e;->s:I

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    :goto_0
    if-ge v3, v1, :cond_0

    .line 18
    .line 19
    aget-object v4, v2, v3

    .line 20
    .line 21
    check-cast v4, LB0/L;

    .line 22
    .line 23
    iget-object v4, v4, LB0/L;->V:LB0/P;

    .line 24
    .line 25
    iget-object v4, v4, LB0/P;->q:LB0/Y;

    .line 26
    .line 27
    invoke-static {v4}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    sget-object v5, LB0/I;->s:LB0/I;

    .line 31
    .line 32
    iput-object v5, v4, LB0/Y;->z:LB0/I;

    .line 33
    .line 34
    add-int/lit8 v3, v3, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    iget-object v0, v0, LB0/n0;->B:LB0/L;

    .line 38
    .line 39
    iget-object v1, v0, LB0/L;->M:Lz0/C;

    .line 40
    .line 41
    invoke-virtual {v0}, LB0/L;->m()Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-interface {v1, p0, v0, p1, p2}, Lz0/C;->c(LB0/T;Ljava/util/List;J)Lz0/D;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-static {p0, p1}, LB0/U;->p0(LB0/U;Lz0/D;)V

    .line 50
    .line 51
    .line 52
    return-object p0
.end method

.method public final q0()V
    .locals 1

    .line 1
    iget-object v0, p0, LB0/U;->B:LB0/n0;

    .line 2
    .line 3
    iget-object v0, v0, LB0/n0;->B:LB0/L;

    .line 4
    .line 5
    iget-object v0, v0, LB0/L;->V:LB0/P;

    .line 6
    .line 7
    iget-object v0, v0, LB0/P;->q:LB0/Y;

    .line 8
    .line 9
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, LB0/Y;->c0()V

    .line 13
    .line 14
    .line 15
    return-void
.end method
