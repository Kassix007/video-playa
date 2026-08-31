.class public final LB0/c0;
.super Lz0/J;
.source "SourceFile"

# interfaces
.implements Lz0/B;
.implements LB0/b;
.implements LB0/e0;


# instance fields
.field public A:Z

.field public B:LB0/I;

.field public C:J

.field public D:LB5/c;

.field public E:F

.field public F:Z

.field public G:Ljava/lang/Object;

.field public H:Z

.field public I:Z

.field public J:Z

.field public K:Z

.field public L:Z

.field public final M:LB0/M;

.field public final N:LR/e;

.field public O:Z

.field public P:Z

.field public Q:J

.field public final R:LB0/b0;

.field public final S:LB0/b0;

.field public T:F

.field public U:Z

.field public V:LB5/c;

.field public W:J

.field public X:F

.field public final Y:LB0/b0;

.field public Z:Z

.field public final v:LB0/P;

.field public w:Z

.field public x:I

.field public y:I

.field public z:Z


# direct methods
.method public constructor <init>(LB0/P;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Lz0/J;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LB0/c0;->v:LB0/P;

    .line 5
    .line 6
    const p1, 0x7fffffff

    .line 7
    .line 8
    .line 9
    iput p1, p0, LB0/c0;->x:I

    .line 10
    .line 11
    iput p1, p0, LB0/c0;->y:I

    .line 12
    .line 13
    sget-object p1, LB0/I;->s:LB0/I;

    .line 14
    .line 15
    iput-object p1, p0, LB0/c0;->B:LB0/I;

    .line 16
    .line 17
    const-wide/16 v0, 0x0

    .line 18
    .line 19
    iput-wide v0, p0, LB0/c0;->C:J

    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    iput-boolean p1, p0, LB0/c0;->F:Z

    .line 23
    .line 24
    new-instance v2, LB0/M;

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    invoke-direct {v2, p0, v3}, LB0/M;-><init>(LB0/b;I)V

    .line 28
    .line 29
    .line 30
    iput-object v2, p0, LB0/c0;->M:LB0/M;

    .line 31
    .line 32
    new-instance v2, LR/e;

    .line 33
    .line 34
    const/16 v3, 0x10

    .line 35
    .line 36
    new-array v3, v3, [LB0/c0;

    .line 37
    .line 38
    invoke-direct {v2, v3}, LR/e;-><init>([Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iput-object v2, p0, LB0/c0;->N:LR/e;

    .line 42
    .line 43
    iput-boolean p1, p0, LB0/c0;->O:Z

    .line 44
    .line 45
    const/4 p1, 0x0

    .line 46
    const/16 v2, 0xf

    .line 47
    .line 48
    invoke-static {p1, p1, v2}, LW0/b;->b(III)J

    .line 49
    .line 50
    .line 51
    move-result-wide v2

    .line 52
    iput-wide v2, p0, LB0/c0;->Q:J

    .line 53
    .line 54
    new-instance p1, LB0/b0;

    .line 55
    .line 56
    const/4 v2, 0x1

    .line 57
    invoke-direct {p1, p0, v2}, LB0/b0;-><init>(LB0/c0;I)V

    .line 58
    .line 59
    .line 60
    iput-object p1, p0, LB0/c0;->R:LB0/b0;

    .line 61
    .line 62
    new-instance p1, LB0/b0;

    .line 63
    .line 64
    const/4 v2, 0x0

    .line 65
    invoke-direct {p1, p0, v2}, LB0/b0;-><init>(LB0/c0;I)V

    .line 66
    .line 67
    .line 68
    iput-object p1, p0, LB0/c0;->S:LB0/b0;

    .line 69
    .line 70
    iput-wide v0, p0, LB0/c0;->W:J

    .line 71
    .line 72
    new-instance p1, LB0/b0;

    .line 73
    .line 74
    const/4 v0, 0x2

    .line 75
    invoke-direct {p1, p0, v0}, LB0/b0;-><init>(LB0/c0;I)V

    .line 76
    .line 77
    .line 78
    iput-object p1, p0, LB0/c0;->Y:LB0/b0;

    .line 79
    .line 80
    return-void
.end method


# virtual methods
.method public final A()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LB0/c0;->H:Z

    .line 2
    .line 3
    return v0
.end method

.method public final J()V
    .locals 3

    .line 1
    iget-object v0, p0, LB0/c0;->v:LB0/P;

    .line 2
    .line 3
    iget-object v0, v0, LB0/P;->a:LB0/L;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x7

    .line 7
    invoke-static {v0, v1, v2}, LB0/L;->S(LB0/L;ZI)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final K()I
    .locals 1

    .line 1
    iget-object v0, p0, LB0/c0;->v:LB0/P;

    .line 2
    .line 3
    invoke-virtual {v0}, LB0/P;->a()LB0/n0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lz0/J;->K()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public final N()I
    .locals 1

    .line 1
    iget-object v0, p0, LB0/c0;->v:LB0/P;

    .line 2
    .line 3
    invoke-virtual {v0}, LB0/P;->a()LB0/n0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lz0/J;->N()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public final U(JFLB5/c;)V
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LB0/c0;->I:Z

    .line 3
    .line 4
    iget-wide v1, p0, LB0/c0;->C:J

    .line 5
    .line 6
    invoke-static {p1, p2, v1, v2}, LW0/i;->a(JJ)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x0

    .line 11
    iget-object v3, p0, LB0/c0;->v:LB0/P;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    iget-boolean v1, p0, LB0/c0;->Z:Z

    .line 16
    .line 17
    if-eqz v1, :cond_3

    .line 18
    .line 19
    :cond_0
    iget-boolean v1, v3, LB0/P;->k:Z

    .line 20
    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    iget-boolean v1, v3, LB0/P;->j:Z

    .line 24
    .line 25
    if-nez v1, :cond_1

    .line 26
    .line 27
    iget-boolean v1, p0, LB0/c0;->Z:Z

    .line 28
    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    :cond_1
    iput-boolean v0, p0, LB0/c0;->K:Z

    .line 32
    .line 33
    iput-boolean v2, p0, LB0/c0;->Z:Z

    .line 34
    .line 35
    :cond_2
    invoke-virtual {p0}, LB0/c0;->c0()V

    .line 36
    .line 37
    .line 38
    :cond_3
    iget-object v1, v3, LB0/P;->q:LB0/Y;

    .line 39
    .line 40
    iget-object v4, v3, LB0/P;->a:LB0/L;

    .line 41
    .line 42
    if-eqz v1, :cond_6

    .line 43
    .line 44
    iget-object v5, v1, LB0/Y;->v:LB0/P;

    .line 45
    .line 46
    iget-object v6, v5, LB0/P;->a:LB0/L;

    .line 47
    .line 48
    invoke-static {v6}, LB0/g;->q(LB0/L;)Z

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    if-eqz v6, :cond_4

    .line 53
    .line 54
    move v1, v0

    .line 55
    goto :goto_0

    .line 56
    :cond_4
    iget-object v1, v1, LB0/Y;->F:LB0/V;

    .line 57
    .line 58
    sget-object v6, LB0/V;->s:LB0/V;

    .line 59
    .line 60
    if-ne v1, v6, :cond_5

    .line 61
    .line 62
    iget-boolean v1, v5, LB0/P;->b:Z

    .line 63
    .line 64
    if-nez v1, :cond_5

    .line 65
    .line 66
    iput-boolean v0, v5, LB0/P;->c:Z

    .line 67
    .line 68
    :cond_5
    iget-boolean v1, v5, LB0/P;->c:Z

    .line 69
    .line 70
    :goto_0
    if-ne v1, v0, :cond_6

    .line 71
    .line 72
    move v1, v0

    .line 73
    goto :goto_1

    .line 74
    :cond_6
    move v1, v2

    .line 75
    :goto_1
    if-eqz v1, :cond_a

    .line 76
    .line 77
    invoke-virtual {v3}, LB0/P;->a()LB0/n0;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    iget-object v1, v1, LB0/n0;->D:LB0/n0;

    .line 82
    .line 83
    if-eqz v1, :cond_7

    .line 84
    .line 85
    iget-object v1, v1, LB0/T;->y:Lz0/z;

    .line 86
    .line 87
    if-nez v1, :cond_8

    .line 88
    .line 89
    :cond_7
    invoke-static {v4}, LB0/O;->a(LB0/L;)LB0/t0;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    check-cast v1, LC0/A;

    .line 94
    .line 95
    invoke-virtual {v1}, LC0/A;->getPlacementScope()Lz0/I;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    :cond_8
    iget-object v5, v3, LB0/P;->q:LB0/Y;

    .line 100
    .line 101
    invoke-static {v5}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v4}, LB0/L;->s()LB0/L;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    if-eqz v4, :cond_9

    .line 109
    .line 110
    iget-object v4, v4, LB0/L;->V:LB0/P;

    .line 111
    .line 112
    iput v2, v4, LB0/P;->h:I

    .line 113
    .line 114
    :cond_9
    const v4, 0x7fffffff

    .line 115
    .line 116
    .line 117
    iput v4, v5, LB0/Y;->y:I

    .line 118
    .line 119
    const/16 v4, 0x20

    .line 120
    .line 121
    shr-long v6, p1, v4

    .line 122
    .line 123
    long-to-int v4, v6

    .line 124
    const-wide v6, 0xffffffffL

    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    and-long/2addr v6, p1

    .line 130
    long-to-int v6, v6

    .line 131
    invoke-static {v1, v5, v4, v6}, Lz0/I;->d(Lz0/I;Lz0/J;II)V

    .line 132
    .line 133
    .line 134
    :cond_a
    iget-object v1, v3, LB0/P;->q:LB0/Y;

    .line 135
    .line 136
    if-eqz v1, :cond_b

    .line 137
    .line 138
    iget-boolean v1, v1, LB0/Y;->A:Z

    .line 139
    .line 140
    if-nez v1, :cond_b

    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_b
    move v0, v2

    .line 144
    :goto_2
    if-eqz v0, :cond_c

    .line 145
    .line 146
    const-string v0, "Error: Placement happened before lookahead."

    .line 147
    .line 148
    invoke-static {v0}, Ly0/a;->b(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    :cond_c
    invoke-virtual {p0, p1, p2, p3, p4}, LB0/c0;->e0(JFLB5/c;)V

    .line 152
    .line 153
    .line 154
    return-void
.end method

.method public final Y()Ljava/util/List;
    .locals 9

    .line 1
    iget-object v0, p0, LB0/c0;->v:LB0/P;

    .line 2
    .line 3
    iget-object v1, v0, LB0/P;->a:LB0/L;

    .line 4
    .line 5
    invoke-virtual {v1}, LB0/L;->a0()V

    .line 6
    .line 7
    .line 8
    iget-boolean v1, p0, LB0/c0;->O:Z

    .line 9
    .line 10
    iget-object v2, p0, LB0/c0;->N:LR/e;

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v2}, LR/e;->h()Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    return-object v0

    .line 19
    :cond_0
    iget-object v0, v0, LB0/P;->a:LB0/L;

    .line 20
    .line 21
    invoke-virtual {v0}, LB0/L;->w()LR/e;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iget-object v3, v1, LR/e;->q:[Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v1, LR/e;->s:I

    .line 28
    .line 29
    const/4 v4, 0x0

    .line 30
    move v5, v4

    .line 31
    :goto_0
    if-ge v5, v1, :cond_2

    .line 32
    .line 33
    aget-object v6, v3, v5

    .line 34
    .line 35
    check-cast v6, LB0/L;

    .line 36
    .line 37
    iget v7, v2, LR/e;->s:I

    .line 38
    .line 39
    if-gt v7, v5, :cond_1

    .line 40
    .line 41
    iget-object v6, v6, LB0/L;->V:LB0/P;

    .line 42
    .line 43
    iget-object v6, v6, LB0/P;->p:LB0/c0;

    .line 44
    .line 45
    invoke-virtual {v2, v6}, LR/e;->c(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    iget-object v6, v6, LB0/L;->V:LB0/P;

    .line 50
    .line 51
    iget-object v6, v6, LB0/P;->p:LB0/c0;

    .line 52
    .line 53
    iget-object v7, v2, LR/e;->q:[Ljava/lang/Object;

    .line 54
    .line 55
    aget-object v8, v7, v5

    .line 56
    .line 57
    aput-object v6, v7, v5

    .line 58
    .line 59
    :goto_1
    add-int/lit8 v5, v5, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    invoke-virtual {v0}, LB0/L;->n()Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, LR/b;

    .line 67
    .line 68
    iget-object v0, v0, LR/b;->q:LR/e;

    .line 69
    .line 70
    iget v0, v0, LR/e;->s:I

    .line 71
    .line 72
    iget v1, v2, LR/e;->s:I

    .line 73
    .line 74
    invoke-virtual {v2, v0, v1}, LR/e;->o(II)V

    .line 75
    .line 76
    .line 77
    iput-boolean v4, p0, LB0/c0;->O:Z

    .line 78
    .line 79
    invoke-virtual {v2}, LR/e;->h()Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    return-object v0
.end method

.method public final Z()V
    .locals 6

    .line 1
    iget-boolean v0, p0, LB0/c0;->H:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iput-boolean v1, p0, LB0/c0;->H:Z

    .line 5
    .line 6
    iget-object v2, p0, LB0/c0;->v:LB0/P;

    .line 7
    .line 8
    iget-object v2, v2, LB0/P;->a:LB0/L;

    .line 9
    .line 10
    iget-object v3, v2, LB0/L;->U:LB0/g0;

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    iget-object v0, v3, LB0/g0;->b:LB0/v;

    .line 15
    .line 16
    invoke-virtual {v0}, LB0/n0;->O0()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2}, LB0/L;->q()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/4 v4, 0x6

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-static {v2, v1, v4}, LB0/L;->S(LB0/L;ZI)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iget-object v0, v2, LB0/L;->V:LB0/P;

    .line 31
    .line 32
    iget-boolean v0, v0, LB0/P;->e:Z

    .line 33
    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    invoke-static {v2, v1, v4}, LB0/L;->Q(LB0/L;ZI)V

    .line 37
    .line 38
    .line 39
    :cond_1
    :goto_0
    iget-object v0, v3, LB0/g0;->c:LB0/n0;

    .line 40
    .line 41
    iget-object v1, v3, LB0/g0;->b:LB0/v;

    .line 42
    .line 43
    iget-object v1, v1, LB0/n0;->C:LB0/n0;

    .line 44
    .line 45
    :goto_1
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-nez v3, :cond_3

    .line 50
    .line 51
    if-eqz v0, :cond_3

    .line 52
    .line 53
    iget-boolean v3, v0, LB0/n0;->U:Z

    .line 54
    .line 55
    if-eqz v3, :cond_2

    .line 56
    .line 57
    invoke-virtual {v0}, LB0/n0;->I0()V

    .line 58
    .line 59
    .line 60
    :cond_2
    iget-object v0, v0, LB0/n0;->C:LB0/n0;

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_3
    invoke-virtual {v2}, LB0/L;->w()LR/e;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iget-object v1, v0, LR/e;->q:[Ljava/lang/Object;

    .line 68
    .line 69
    iget v0, v0, LR/e;->s:I

    .line 70
    .line 71
    const/4 v2, 0x0

    .line 72
    :goto_2
    if-ge v2, v0, :cond_5

    .line 73
    .line 74
    aget-object v3, v1, v2

    .line 75
    .line 76
    check-cast v3, LB0/L;

    .line 77
    .line 78
    invoke-virtual {v3}, LB0/L;->t()I

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    const v5, 0x7fffffff

    .line 83
    .line 84
    .line 85
    if-eq v4, v5, :cond_4

    .line 86
    .line 87
    iget-object v4, v3, LB0/L;->V:LB0/P;

    .line 88
    .line 89
    iget-object v4, v4, LB0/P;->p:LB0/c0;

    .line 90
    .line 91
    invoke-virtual {v4}, LB0/c0;->Z()V

    .line 92
    .line 93
    .line 94
    invoke-static {v3}, LB0/L;->T(LB0/L;)V

    .line 95
    .line 96
    .line 97
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_5
    return-void
.end method

.method public final a(J)Lz0/J;
    .locals 4

    .line 1
    iget-object v0, p0, LB0/c0;->v:LB0/P;

    .line 2
    .line 3
    iget-object v1, v0, LB0/P;->a:LB0/L;

    .line 4
    .line 5
    iget-object v2, v1, LB0/L;->R:LB0/I;

    .line 6
    .line 7
    sget-object v3, LB0/I;->s:LB0/I;

    .line 8
    .line 9
    if-ne v2, v3, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1}, LB0/L;->c()V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v1, v0, LB0/P;->a:LB0/L;

    .line 15
    .line 16
    invoke-static {v1}, LB0/g;->q(LB0/L;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    iget-object v1, v0, LB0/P;->q:LB0/Y;

    .line 23
    .line 24
    invoke-static {v1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iput-object v3, v1, LB0/Y;->z:LB0/I;

    .line 28
    .line 29
    invoke-virtual {v1, p1, p2}, LB0/Y;->a(J)Lz0/J;

    .line 30
    .line 31
    .line 32
    :cond_1
    iget-object v0, v0, LB0/P;->a:LB0/L;

    .line 33
    .line 34
    invoke-virtual {v0}, LB0/L;->s()LB0/L;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    if-eqz v1, :cond_6

    .line 39
    .line 40
    iget-object v1, v1, LB0/L;->V:LB0/P;

    .line 41
    .line 42
    iget-object v2, p0, LB0/c0;->B:LB0/I;

    .line 43
    .line 44
    if-eq v2, v3, :cond_3

    .line 45
    .line 46
    iget-boolean v0, v0, LB0/L;->T:Z

    .line 47
    .line 48
    if-eqz v0, :cond_2

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    const-string v0, "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()"

    .line 52
    .line 53
    invoke-static {v0}, Ly0/a;->b(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    :cond_3
    :goto_0
    iget-object v0, v1, LB0/P;->d:LB0/G;

    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_5

    .line 63
    .line 64
    const/4 v2, 0x2

    .line 65
    if-ne v0, v2, :cond_4

    .line 66
    .line 67
    sget-object v0, LB0/I;->r:LB0/I;

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 71
    .line 72
    new-instance p2, Ljava/lang/StringBuilder;

    .line 73
    .line 74
    const-string v0, "Measurable could be only measured from the parent\'s measure or layout block. Parents state is "

    .line 75
    .line 76
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    iget-object v0, v1, LB0/P;->d:LB0/G;

    .line 80
    .line 81
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    throw p1

    .line 92
    :cond_5
    sget-object v0, LB0/I;->q:LB0/I;

    .line 93
    .line 94
    :goto_1
    iput-object v0, p0, LB0/c0;->B:LB0/I;

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_6
    iput-object v3, p0, LB0/c0;->B:LB0/I;

    .line 98
    .line 99
    :goto_2
    invoke-virtual {p0, p1, p2}, LB0/c0;->h0(J)Z

    .line 100
    .line 101
    .line 102
    return-object p0
.end method

.method public final b0()V
    .locals 14

    .line 1
    iget-boolean v0, p0, LB0/c0;->H:Z

    .line 2
    .line 3
    if-eqz v0, :cond_c

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, LB0/c0;->H:Z

    .line 7
    .line 8
    iget-object v1, p0, LB0/c0;->v:LB0/P;

    .line 9
    .line 10
    iget-object v2, v1, LB0/P;->a:LB0/L;

    .line 11
    .line 12
    iget-object v2, v2, LB0/L;->U:LB0/g0;

    .line 13
    .line 14
    iget-object v3, v2, LB0/g0;->c:LB0/n0;

    .line 15
    .line 16
    iget-object v2, v2, LB0/g0;->b:LB0/v;

    .line 17
    .line 18
    iget-object v2, v2, LB0/n0;->C:LB0/n0;

    .line 19
    .line 20
    :goto_0
    invoke-static {v3, v2}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-nez v4, :cond_b

    .line 25
    .line 26
    if-eqz v3, :cond_b

    .line 27
    .line 28
    const/high16 v4, 0x100000

    .line 29
    .line 30
    invoke-static {v4}, LB0/o0;->g(I)Z

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    invoke-virtual {v3, v5}, LB0/n0;->D0(Z)Lc0/l;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    const/4 v6, 0x0

    .line 39
    if-eqz v5, :cond_9

    .line 40
    .line 41
    iget-object v5, v5, Lc0/l;->q:Lc0/l;

    .line 42
    .line 43
    iget v5, v5, Lc0/l;->t:I

    .line 44
    .line 45
    and-int/2addr v5, v4

    .line 46
    if-eqz v5, :cond_9

    .line 47
    .line 48
    invoke-static {v4}, LB0/o0;->g(I)Z

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    invoke-virtual {v3}, LB0/n0;->B0()Lc0/l;

    .line 53
    .line 54
    .line 55
    move-result-object v7

    .line 56
    if-eqz v5, :cond_0

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_0
    iget-object v7, v7, Lc0/l;->u:Lc0/l;

    .line 60
    .line 61
    if-nez v7, :cond_1

    .line 62
    .line 63
    goto :goto_6

    .line 64
    :cond_1
    :goto_1
    invoke-virtual {v3, v5}, LB0/n0;->D0(Z)Lc0/l;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    :goto_2
    if-eqz v5, :cond_9

    .line 69
    .line 70
    iget v8, v5, Lc0/l;->t:I

    .line 71
    .line 72
    and-int/2addr v8, v4

    .line 73
    if-eqz v8, :cond_9

    .line 74
    .line 75
    iget v8, v5, Lc0/l;->s:I

    .line 76
    .line 77
    and-int/2addr v8, v4

    .line 78
    if-eqz v8, :cond_8

    .line 79
    .line 80
    move-object v8, v5

    .line 81
    move-object v9, v6

    .line 82
    :goto_3
    if-eqz v8, :cond_8

    .line 83
    .line 84
    iget v10, v8, Lc0/l;->s:I

    .line 85
    .line 86
    and-int/2addr v10, v4

    .line 87
    if-eqz v10, :cond_7

    .line 88
    .line 89
    instance-of v10, v8, LB0/n;

    .line 90
    .line 91
    if-eqz v10, :cond_7

    .line 92
    .line 93
    move-object v10, v8

    .line 94
    check-cast v10, LB0/n;

    .line 95
    .line 96
    iget-object v10, v10, LB0/n;->F:Lc0/l;

    .line 97
    .line 98
    move v11, v0

    .line 99
    :goto_4
    const/4 v12, 0x1

    .line 100
    if-eqz v10, :cond_6

    .line 101
    .line 102
    iget v13, v10, Lc0/l;->s:I

    .line 103
    .line 104
    and-int/2addr v13, v4

    .line 105
    if-eqz v13, :cond_5

    .line 106
    .line 107
    add-int/lit8 v11, v11, 0x1

    .line 108
    .line 109
    if-ne v11, v12, :cond_2

    .line 110
    .line 111
    move-object v8, v10

    .line 112
    goto :goto_5

    .line 113
    :cond_2
    if-nez v9, :cond_3

    .line 114
    .line 115
    new-instance v9, LR/e;

    .line 116
    .line 117
    const/16 v12, 0x10

    .line 118
    .line 119
    new-array v12, v12, [Lc0/l;

    .line 120
    .line 121
    invoke-direct {v9, v12}, LR/e;-><init>([Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    :cond_3
    if-eqz v8, :cond_4

    .line 125
    .line 126
    invoke-virtual {v9, v8}, LR/e;->c(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    move-object v8, v6

    .line 130
    :cond_4
    invoke-virtual {v9, v10}, LR/e;->c(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    :cond_5
    :goto_5
    iget-object v10, v10, Lc0/l;->v:Lc0/l;

    .line 134
    .line 135
    goto :goto_4

    .line 136
    :cond_6
    if-ne v11, v12, :cond_7

    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_7
    invoke-static {v9}, LB0/g;->f(LR/e;)Lc0/l;

    .line 140
    .line 141
    .line 142
    move-result-object v8

    .line 143
    goto :goto_3

    .line 144
    :cond_8
    if-eq v5, v7, :cond_9

    .line 145
    .line 146
    iget-object v5, v5, Lc0/l;->v:Lc0/l;

    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_9
    :goto_6
    iget-object v4, v3, LB0/n0;->V:LB0/s0;

    .line 150
    .line 151
    if-eqz v4, :cond_a

    .line 152
    .line 153
    invoke-virtual {v3, v6, v0}, LB0/n0;->U0(LB5/c;Z)V

    .line 154
    .line 155
    .line 156
    iget-object v4, v3, LB0/n0;->B:LB0/L;

    .line 157
    .line 158
    invoke-virtual {v4, v0}, LB0/L;->R(Z)V

    .line 159
    .line 160
    .line 161
    :cond_a
    iget-object v3, v3, LB0/n0;->C:LB0/n0;

    .line 162
    .line 163
    goto/16 :goto_0

    .line 164
    .line 165
    :cond_b
    iget-object v1, v1, LB0/P;->a:LB0/L;

    .line 166
    .line 167
    invoke-virtual {v1}, LB0/L;->w()LR/e;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    iget-object v2, v1, LR/e;->q:[Ljava/lang/Object;

    .line 172
    .line 173
    iget v1, v1, LR/e;->s:I

    .line 174
    .line 175
    :goto_7
    if-ge v0, v1, :cond_c

    .line 176
    .line 177
    aget-object v3, v2, v0

    .line 178
    .line 179
    check-cast v3, LB0/L;

    .line 180
    .line 181
    iget-object v3, v3, LB0/L;->V:LB0/P;

    .line 182
    .line 183
    iget-object v3, v3, LB0/P;->p:LB0/c0;

    .line 184
    .line 185
    invoke-virtual {v3}, LB0/c0;->b0()V

    .line 186
    .line 187
    .line 188
    add-int/lit8 v0, v0, 0x1

    .line 189
    .line 190
    goto :goto_7

    .line 191
    :cond_c
    return-void
.end method

.method public final c()LB0/M;
    .locals 1

    .line 1
    iget-object v0, p0, LB0/c0;->M:LB0/M;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c0()V
    .locals 8

    .line 1
    iget-object v0, p0, LB0/c0;->v:LB0/P;

    .line 2
    .line 3
    iget v1, v0, LB0/P;->l:I

    .line 4
    .line 5
    if-lez v1, :cond_2

    .line 6
    .line 7
    iget-object v0, v0, LB0/P;->a:LB0/L;

    .line 8
    .line 9
    invoke-virtual {v0}, LB0/L;->w()LR/e;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, v0, LR/e;->q:[Ljava/lang/Object;

    .line 14
    .line 15
    iget v0, v0, LR/e;->s:I

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    move v3, v2

    .line 19
    :goto_0
    if-ge v3, v0, :cond_2

    .line 20
    .line 21
    aget-object v4, v1, v3

    .line 22
    .line 23
    check-cast v4, LB0/L;

    .line 24
    .line 25
    iget-object v5, v4, LB0/L;->V:LB0/P;

    .line 26
    .line 27
    iget-boolean v6, v5, LB0/P;->j:Z

    .line 28
    .line 29
    iget-object v7, v5, LB0/P;->p:LB0/c0;

    .line 30
    .line 31
    if-nez v6, :cond_0

    .line 32
    .line 33
    iget-boolean v5, v5, LB0/P;->k:Z

    .line 34
    .line 35
    if-eqz v5, :cond_1

    .line 36
    .line 37
    :cond_0
    iget-boolean v5, v7, LB0/c0;->K:Z

    .line 38
    .line 39
    if-nez v5, :cond_1

    .line 40
    .line 41
    invoke-virtual {v4, v2}, LB0/L;->R(Z)V

    .line 42
    .line 43
    .line 44
    :cond_1
    invoke-virtual {v7}, LB0/c0;->c0()V

    .line 45
    .line 46
    .line 47
    add-int/lit8 v3, v3, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    return-void
.end method

.method public final d0()V
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LB0/c0;->U:Z

    .line 3
    .line 4
    iget-object v1, p0, LB0/c0;->v:LB0/P;

    .line 5
    .line 6
    iget-object v2, v1, LB0/P;->a:LB0/L;

    .line 7
    .line 8
    invoke-virtual {v2}, LB0/L;->s()LB0/L;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {p0}, LB0/c0;->n()LB0/v;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    iget v3, v3, LB0/n0;->N:F

    .line 17
    .line 18
    iget-object v1, v1, LB0/P;->a:LB0/L;

    .line 19
    .line 20
    iget-object v4, v1, LB0/L;->U:LB0/g0;

    .line 21
    .line 22
    iget-object v5, v4, LB0/g0;->c:LB0/n0;

    .line 23
    .line 24
    iget-object v4, v4, LB0/g0;->b:LB0/v;

    .line 25
    .line 26
    :goto_0
    if-eq v5, v4, :cond_0

    .line 27
    .line 28
    const-string v6, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator"

    .line 29
    .line 30
    invoke-static {v5, v6}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    move-object v6, v5

    .line 34
    check-cast v6, LB0/B;

    .line 35
    .line 36
    iget v6, v6, LB0/n0;->N:F

    .line 37
    .line 38
    add-float/2addr v3, v6

    .line 39
    iget-object v5, v5, LB0/n0;->C:LB0/n0;

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    iget v4, p0, LB0/c0;->T:F

    .line 43
    .line 44
    cmpg-float v4, v3, v4

    .line 45
    .line 46
    if-nez v4, :cond_1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    iput v3, p0, LB0/c0;->T:F

    .line 50
    .line 51
    if-eqz v2, :cond_2

    .line 52
    .line 53
    invoke-virtual {v2}, LB0/L;->L()V

    .line 54
    .line 55
    .line 56
    :cond_2
    if-eqz v2, :cond_3

    .line 57
    .line 58
    invoke-virtual {v2}, LB0/L;->A()V

    .line 59
    .line 60
    .line 61
    :cond_3
    :goto_1
    iget-boolean v3, p0, LB0/c0;->H:Z

    .line 62
    .line 63
    const/4 v4, 0x0

    .line 64
    if-nez v3, :cond_5

    .line 65
    .line 66
    if-eqz v2, :cond_4

    .line 67
    .line 68
    invoke-virtual {v2}, LB0/L;->A()V

    .line 69
    .line 70
    .line 71
    :cond_4
    invoke-virtual {p0}, LB0/c0;->Z()V

    .line 72
    .line 73
    .line 74
    iget-boolean v1, p0, LB0/c0;->w:Z

    .line 75
    .line 76
    if-eqz v1, :cond_6

    .line 77
    .line 78
    if-eqz v2, :cond_6

    .line 79
    .line 80
    invoke-virtual {v2, v4}, LB0/L;->R(Z)V

    .line 81
    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_5
    iget-object v1, v1, LB0/L;->U:LB0/g0;

    .line 85
    .line 86
    iget-object v1, v1, LB0/g0;->b:LB0/v;

    .line 87
    .line 88
    invoke-virtual {v1}, LB0/n0;->O0()V

    .line 89
    .line 90
    .line 91
    :cond_6
    :goto_2
    if-eqz v2, :cond_8

    .line 92
    .line 93
    iget-object v1, v2, LB0/L;->V:LB0/P;

    .line 94
    .line 95
    iget-boolean v2, p0, LB0/c0;->w:Z

    .line 96
    .line 97
    if-nez v2, :cond_9

    .line 98
    .line 99
    iget-object v2, v1, LB0/P;->d:LB0/G;

    .line 100
    .line 101
    sget-object v3, LB0/G;->s:LB0/G;

    .line 102
    .line 103
    if-ne v2, v3, :cond_9

    .line 104
    .line 105
    iget v2, p0, LB0/c0;->y:I

    .line 106
    .line 107
    const v3, 0x7fffffff

    .line 108
    .line 109
    .line 110
    if-ne v2, v3, :cond_7

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_7
    const-string v2, "Place was called on a node which was placed already"

    .line 114
    .line 115
    invoke-static {v2}, Ly0/a;->b(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    :goto_3
    iget v2, v1, LB0/P;->i:I

    .line 119
    .line 120
    iput v2, p0, LB0/c0;->y:I

    .line 121
    .line 122
    add-int/2addr v2, v0

    .line 123
    iput v2, v1, LB0/P;->i:I

    .line 124
    .line 125
    goto :goto_4

    .line 126
    :cond_8
    iput v4, p0, LB0/c0;->y:I

    .line 127
    .line 128
    :cond_9
    :goto_4
    invoke-virtual {p0}, LB0/c0;->t()V

    .line 129
    .line 130
    .line 131
    return-void
.end method

.method public final e0(JFLB5/c;)V
    .locals 6

    .line 1
    iget-object v0, p0, LB0/c0;->v:LB0/P;

    .line 2
    .line 3
    iget-object v1, v0, LB0/P;->a:LB0/L;

    .line 4
    .line 5
    iget-object v2, v0, LB0/P;->a:LB0/L;

    .line 6
    .line 7
    iget-boolean v1, v1, LB0/L;->e0:Z

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const-string v1, "place is called on a deactivated node"

    .line 12
    .line 13
    invoke-static {v1}, Ly0/a;->a(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    sget-object v1, LB0/G;->s:LB0/G;

    .line 17
    .line 18
    iput-object v1, v0, LB0/P;->d:LB0/G;

    .line 19
    .line 20
    iget-boolean v1, p0, LB0/c0;->A:Z

    .line 21
    .line 22
    const/4 v3, 0x1

    .line 23
    xor-int/2addr v1, v3

    .line 24
    iput-wide p1, p0, LB0/c0;->C:J

    .line 25
    .line 26
    iput p3, p0, LB0/c0;->E:F

    .line 27
    .line 28
    iput-object p4, p0, LB0/c0;->D:LB5/c;

    .line 29
    .line 30
    iput-boolean v3, p0, LB0/c0;->A:Z

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    iput-boolean v3, p0, LB0/c0;->U:Z

    .line 34
    .line 35
    invoke-static {v2}, LB0/O;->a(LB0/L;)LB0/t0;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    check-cast v4, LC0/A;

    .line 40
    .line 41
    invoke-virtual {v4}, LC0/A;->getRectManager()LJ0/a;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    invoke-virtual {v5, v2, p1, p2, v1}, LJ0/a;->f(LB0/L;JZ)V

    .line 46
    .line 47
    .line 48
    iget-boolean v1, p0, LB0/c0;->K:Z

    .line 49
    .line 50
    if-nez v1, :cond_1

    .line 51
    .line 52
    iget-boolean v1, p0, LB0/c0;->H:Z

    .line 53
    .line 54
    if-eqz v1, :cond_1

    .line 55
    .line 56
    invoke-virtual {v0}, LB0/P;->a()LB0/n0;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    iget-wide v2, v1, Lz0/J;->u:J

    .line 61
    .line 62
    invoke-static {p1, p2, v2, v3}, LW0/i;->c(JJ)J

    .line 63
    .line 64
    .line 65
    move-result-wide p1

    .line 66
    invoke-virtual {v1, p1, p2, p3, p4}, LB0/n0;->R0(JFLB5/c;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, LB0/c0;->d0()V

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_1
    iget-object v1, p0, LB0/c0;->M:LB0/M;

    .line 74
    .line 75
    iput-boolean v3, v1, LB0/M;->e:Z

    .line 76
    .line 77
    invoke-virtual {v0, v3}, LB0/P;->d(Z)V

    .line 78
    .line 79
    .line 80
    iput-object p4, p0, LB0/c0;->V:LB5/c;

    .line 81
    .line 82
    iput-wide p1, p0, LB0/c0;->W:J

    .line 83
    .line 84
    iput p3, p0, LB0/c0;->X:F

    .line 85
    .line 86
    invoke-virtual {v4}, LC0/A;->getSnapshotObserver()LB0/v0;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    iget-object p2, p0, LB0/c0;->Y:LB0/b0;

    .line 91
    .line 92
    iget-object p3, p1, LB0/v0;->f:LB0/f;

    .line 93
    .line 94
    invoke-virtual {p1, v2, p3, p2}, LB0/v0;->a(LB0/u0;LB5/c;LB5/a;)V

    .line 95
    .line 96
    .line 97
    :goto_0
    sget-object p1, LB0/G;->u:LB0/G;

    .line 98
    .line 99
    iput-object p1, v0, LB0/P;->d:LB0/G;

    .line 100
    .line 101
    return-void
.end method

.method public final g()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LB0/c0;->G:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h0(J)Z
    .locals 9

    .line 1
    iget-object v0, p0, LB0/c0;->v:LB0/P;

    .line 2
    .line 3
    iget-object v1, v0, LB0/P;->a:LB0/L;

    .line 4
    .line 5
    iget-object v2, v0, LB0/P;->a:LB0/L;

    .line 6
    .line 7
    iget-boolean v1, v1, LB0/L;->e0:Z

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const-string v1, "measure is called on a deactivated node"

    .line 12
    .line 13
    invoke-static {v1}, Ly0/a;->a(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-static {v2}, LB0/O;->a(LB0/L;)LB0/t0;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v2}, LB0/L;->s()LB0/L;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    iget-boolean v4, v2, LB0/L;->T:Z

    .line 25
    .line 26
    const/4 v5, 0x1

    .line 27
    const/4 v6, 0x0

    .line 28
    if-nez v4, :cond_2

    .line 29
    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    iget-boolean v3, v3, LB0/L;->T:Z

    .line 33
    .line 34
    if-eqz v3, :cond_1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    move v3, v6

    .line 38
    goto :goto_1

    .line 39
    :cond_2
    :goto_0
    move v3, v5

    .line 40
    :goto_1
    iput-boolean v3, v2, LB0/L;->T:Z

    .line 41
    .line 42
    invoke-virtual {v2}, LB0/L;->q()Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-nez v3, :cond_4

    .line 47
    .line 48
    iget-wide v3, p0, Lz0/J;->t:J

    .line 49
    .line 50
    invoke-static {v3, v4, p1, p2}, LW0/a;->b(JJ)Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-nez v3, :cond_3

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_3
    check-cast v1, LC0/A;

    .line 58
    .line 59
    invoke-virtual {v1, v2, v6}, LC0/A;->q(LB0/L;Z)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2}, LB0/L;->U()V

    .line 63
    .line 64
    .line 65
    return v6

    .line 66
    :cond_4
    :goto_2
    iget-object v1, p0, LB0/c0;->M:LB0/M;

    .line 67
    .line 68
    iput-boolean v6, v1, LB0/M;->d:Z

    .line 69
    .line 70
    invoke-virtual {v2}, LB0/L;->w()LR/e;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    iget-object v3, v1, LR/e;->q:[Ljava/lang/Object;

    .line 75
    .line 76
    iget v1, v1, LR/e;->s:I

    .line 77
    .line 78
    move v4, v6

    .line 79
    :goto_3
    if-ge v4, v1, :cond_5

    .line 80
    .line 81
    aget-object v7, v3, v4

    .line 82
    .line 83
    check-cast v7, LB0/L;

    .line 84
    .line 85
    iget-object v7, v7, LB0/L;->V:LB0/P;

    .line 86
    .line 87
    iget-object v7, v7, LB0/P;->p:LB0/c0;

    .line 88
    .line 89
    iget-object v7, v7, LB0/c0;->M:LB0/M;

    .line 90
    .line 91
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    add-int/lit8 v4, v4, 0x1

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_5
    iput-boolean v5, p0, LB0/c0;->z:Z

    .line 98
    .line 99
    invoke-virtual {v0}, LB0/P;->a()LB0/n0;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    iget-wide v3, v1, Lz0/J;->s:J

    .line 104
    .line 105
    invoke-virtual {p0, p1, p2}, Lz0/J;->X(J)V

    .line 106
    .line 107
    .line 108
    iget-object v1, v0, LB0/P;->d:LB0/G;

    .line 109
    .line 110
    sget-object v7, LB0/G;->u:LB0/G;

    .line 111
    .line 112
    if-ne v1, v7, :cond_6

    .line 113
    .line 114
    goto :goto_4

    .line 115
    :cond_6
    const-string v1, "layout state is not idle before measure starts"

    .line 116
    .line 117
    invoke-static {v1}, Ly0/a;->b(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    :goto_4
    iput-wide p1, p0, LB0/c0;->Q:J

    .line 121
    .line 122
    sget-object p1, LB0/G;->q:LB0/G;

    .line 123
    .line 124
    iput-object p1, v0, LB0/P;->d:LB0/G;

    .line 125
    .line 126
    iput-boolean v6, p0, LB0/c0;->J:Z

    .line 127
    .line 128
    invoke-static {v2}, LB0/O;->a(LB0/L;)LB0/t0;

    .line 129
    .line 130
    .line 131
    move-result-object p2

    .line 132
    check-cast p2, LC0/A;

    .line 133
    .line 134
    invoke-virtual {p2}, LC0/A;->getSnapshotObserver()LB0/v0;

    .line 135
    .line 136
    .line 137
    move-result-object p2

    .line 138
    iget-object v1, p0, LB0/c0;->R:LB0/b0;

    .line 139
    .line 140
    iget-object v8, p2, LB0/v0;->c:LB0/f;

    .line 141
    .line 142
    invoke-virtual {p2, v2, v8, v1}, LB0/v0;->a(LB0/u0;LB5/c;LB5/a;)V

    .line 143
    .line 144
    .line 145
    iget-object p2, v0, LB0/P;->d:LB0/G;

    .line 146
    .line 147
    if-ne p2, p1, :cond_7

    .line 148
    .line 149
    iput-boolean v5, p0, LB0/c0;->K:Z

    .line 150
    .line 151
    iput-boolean v5, p0, LB0/c0;->L:Z

    .line 152
    .line 153
    iput-object v7, v0, LB0/P;->d:LB0/G;

    .line 154
    .line 155
    :cond_7
    invoke-virtual {v0}, LB0/P;->a()LB0/n0;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    iget-wide p1, p1, Lz0/J;->s:J

    .line 160
    .line 161
    invoke-static {p1, p2, v3, v4}, LW0/k;->a(JJ)Z

    .line 162
    .line 163
    .line 164
    move-result p1

    .line 165
    if-eqz p1, :cond_9

    .line 166
    .line 167
    invoke-virtual {v0}, LB0/P;->a()LB0/n0;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    iget p1, p1, Lz0/J;->q:I

    .line 172
    .line 173
    iget p2, p0, Lz0/J;->q:I

    .line 174
    .line 175
    if-ne p1, p2, :cond_9

    .line 176
    .line 177
    invoke-virtual {v0}, LB0/P;->a()LB0/n0;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    iget p1, p1, Lz0/J;->r:I

    .line 182
    .line 183
    iget p2, p0, Lz0/J;->r:I

    .line 184
    .line 185
    if-eq p1, p2, :cond_8

    .line 186
    .line 187
    goto :goto_5

    .line 188
    :cond_8
    move v5, v6

    .line 189
    :cond_9
    :goto_5
    invoke-virtual {v0}, LB0/P;->a()LB0/n0;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    iget p1, p1, Lz0/J;->q:I

    .line 194
    .line 195
    invoke-virtual {v0}, LB0/P;->a()LB0/n0;

    .line 196
    .line 197
    .line 198
    move-result-object p2

    .line 199
    iget p2, p2, Lz0/J;->r:I

    .line 200
    .line 201
    int-to-long v0, p1

    .line 202
    const/16 p1, 0x20

    .line 203
    .line 204
    shl-long/2addr v0, p1

    .line 205
    int-to-long p1, p2

    .line 206
    const-wide v2, 0xffffffffL

    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    and-long/2addr p1, v2

    .line 212
    or-long/2addr p1, v0

    .line 213
    invoke-virtual {p0, p1, p2}, Lz0/J;->W(J)V

    .line 214
    .line 215
    .line 216
    return v5
.end method

.method public final k(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, LB0/c0;->v:LB0/P;

    .line 2
    .line 3
    invoke-virtual {v0}, LB0/P;->a()LB0/n0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-boolean v1, v1, LB0/T;->v:Z

    .line 8
    .line 9
    if-eq p1, v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, LB0/P;->a()LB0/n0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-boolean p1, v0, LB0/T;->v:Z

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    iput-boolean p1, p0, LB0/c0;->Z:Z

    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final n()LB0/v;
    .locals 1

    .line 1
    iget-object v0, p0, LB0/c0;->v:LB0/P;

    .line 2
    .line 3
    iget-object v0, v0, LB0/P;->a:LB0/L;

    .line 4
    .line 5
    iget-object v0, v0, LB0/L;->U:LB0/g0;

    .line 6
    .line 7
    iget-object v0, v0, LB0/g0;->b:LB0/v;

    .line 8
    .line 9
    return-object v0
.end method

.method public final o(LB0/a;)V
    .locals 4

    .line 1
    iget-object v0, p0, LB0/c0;->v:LB0/P;

    .line 2
    .line 3
    iget-object v0, v0, LB0/P;->a:LB0/L;

    .line 4
    .line 5
    invoke-virtual {v0}, LB0/L;->w()LR/e;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, v0, LR/e;->q:[Ljava/lang/Object;

    .line 10
    .line 11
    iget v0, v0, LR/e;->s:I

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    :goto_0
    if-ge v2, v0, :cond_0

    .line 15
    .line 16
    aget-object v3, v1, v2

    .line 17
    .line 18
    check-cast v3, LB0/L;

    .line 19
    .line 20
    iget-object v3, v3, LB0/L;->V:LB0/P;

    .line 21
    .line 22
    iget-object v3, v3, LB0/P;->p:LB0/c0;

    .line 23
    .line 24
    invoke-virtual {p1, v3}, LB0/a;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    return-void
.end method

.method public final q()LB0/b;
    .locals 1

    .line 1
    iget-object v0, p0, LB0/c0;->v:LB0/P;

    .line 2
    .line 3
    iget-object v0, v0, LB0/P;->a:LB0/L;

    .line 4
    .line 5
    invoke-virtual {v0}, LB0/L;->s()LB0/L;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, LB0/L;->V:LB0/P;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, v0, LB0/P;->p:LB0/c0;

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    return-object v0
.end method

.method public final requestLayout()V
    .locals 2

    .line 1
    iget-object v0, p0, LB0/c0;->v:LB0/P;

    .line 2
    .line 3
    iget-object v0, v0, LB0/P;->a:LB0/L;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, LB0/L;->R(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final t()V
    .locals 11

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LB0/c0;->P:Z

    .line 3
    .line 4
    iget-object v0, p0, LB0/c0;->M:LB0/M;

    .line 5
    .line 6
    invoke-virtual {v0}, LB0/M;->h()V

    .line 7
    .line 8
    .line 9
    iget-boolean v1, p0, LB0/c0;->K:Z

    .line 10
    .line 11
    iget-object v2, p0, LB0/c0;->v:LB0/P;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    if-eqz v1, :cond_4

    .line 15
    .line 16
    iget-object v1, v2, LB0/P;->a:LB0/L;

    .line 17
    .line 18
    invoke-virtual {v1}, LB0/L;->w()LR/e;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iget-object v4, v1, LR/e;->q:[Ljava/lang/Object;

    .line 23
    .line 24
    iget v1, v1, LR/e;->s:I

    .line 25
    .line 26
    move v5, v3

    .line 27
    :goto_0
    if-ge v5, v1, :cond_4

    .line 28
    .line 29
    aget-object v6, v4, v5

    .line 30
    .line 31
    check-cast v6, LB0/L;

    .line 32
    .line 33
    invoke-virtual {v6}, LB0/L;->q()Z

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    iget-object v8, v6, LB0/L;->V:LB0/P;

    .line 38
    .line 39
    if-eqz v7, :cond_3

    .line 40
    .line 41
    iget-object v7, v8, LB0/P;->p:LB0/c0;

    .line 42
    .line 43
    iget-object v9, v7, LB0/c0;->B:LB0/I;

    .line 44
    .line 45
    sget-object v10, LB0/I;->q:LB0/I;

    .line 46
    .line 47
    if-ne v9, v10, :cond_3

    .line 48
    .line 49
    iget-boolean v9, v7, LB0/c0;->z:Z

    .line 50
    .line 51
    if-eqz v9, :cond_0

    .line 52
    .line 53
    iget-wide v9, v7, Lz0/J;->t:J

    .line 54
    .line 55
    new-instance v7, LW0/a;

    .line 56
    .line 57
    invoke-direct {v7, v9, v10}, LW0/a;-><init>(J)V

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_0
    const/4 v7, 0x0

    .line 62
    :goto_1
    if-eqz v7, :cond_2

    .line 63
    .line 64
    iget-object v9, v6, LB0/L;->R:LB0/I;

    .line 65
    .line 66
    sget-object v10, LB0/I;->s:LB0/I;

    .line 67
    .line 68
    if-ne v9, v10, :cond_1

    .line 69
    .line 70
    invoke-virtual {v6}, LB0/L;->c()V

    .line 71
    .line 72
    .line 73
    :cond_1
    iget-object v6, v8, LB0/P;->p:LB0/c0;

    .line 74
    .line 75
    iget-wide v7, v7, LW0/a;->a:J

    .line 76
    .line 77
    invoke-virtual {v6, v7, v8}, LB0/c0;->h0(J)Z

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    goto :goto_2

    .line 82
    :cond_2
    move v6, v3

    .line 83
    :goto_2
    if-eqz v6, :cond_3

    .line 84
    .line 85
    iget-object v6, v2, LB0/P;->a:LB0/L;

    .line 86
    .line 87
    const/4 v7, 0x7

    .line 88
    invoke-static {v6, v3, v7}, LB0/L;->S(LB0/L;ZI)V

    .line 89
    .line 90
    .line 91
    :cond_3
    add-int/lit8 v5, v5, 0x1

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_4
    iget-boolean v1, p0, LB0/c0;->L:Z

    .line 95
    .line 96
    if-nez v1, :cond_5

    .line 97
    .line 98
    invoke-virtual {p0}, LB0/c0;->n()LB0/v;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    iget-boolean v1, v1, LB0/T;->x:Z

    .line 103
    .line 104
    if-nez v1, :cond_7

    .line 105
    .line 106
    iget-boolean v1, p0, LB0/c0;->K:Z

    .line 107
    .line 108
    if-eqz v1, :cond_7

    .line 109
    .line 110
    :cond_5
    iput-boolean v3, p0, LB0/c0;->K:Z

    .line 111
    .line 112
    iget-object v1, v2, LB0/P;->d:LB0/G;

    .line 113
    .line 114
    sget-object v4, LB0/G;->s:LB0/G;

    .line 115
    .line 116
    iput-object v4, v2, LB0/P;->d:LB0/G;

    .line 117
    .line 118
    invoke-virtual {v2, v3}, LB0/P;->e(Z)V

    .line 119
    .line 120
    .line 121
    iget-object v4, v2, LB0/P;->a:LB0/L;

    .line 122
    .line 123
    invoke-static {v4}, LB0/O;->a(LB0/L;)LB0/t0;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    check-cast v5, LC0/A;

    .line 128
    .line 129
    invoke-virtual {v5}, LC0/A;->getSnapshotObserver()LB0/v0;

    .line 130
    .line 131
    .line 132
    move-result-object v5

    .line 133
    iget-object v6, p0, LB0/c0;->S:LB0/b0;

    .line 134
    .line 135
    iget-object v7, v5, LB0/v0;->e:LB0/f;

    .line 136
    .line 137
    invoke-virtual {v5, v4, v7, v6}, LB0/v0;->a(LB0/u0;LB5/c;LB5/a;)V

    .line 138
    .line 139
    .line 140
    iput-object v1, v2, LB0/P;->d:LB0/G;

    .line 141
    .line 142
    invoke-virtual {p0}, LB0/c0;->n()LB0/v;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    iget-boolean v1, v1, LB0/T;->x:Z

    .line 147
    .line 148
    if-eqz v1, :cond_6

    .line 149
    .line 150
    iget-boolean v1, v2, LB0/P;->j:Z

    .line 151
    .line 152
    if-eqz v1, :cond_6

    .line 153
    .line 154
    invoke-virtual {p0}, LB0/c0;->requestLayout()V

    .line 155
    .line 156
    .line 157
    :cond_6
    iput-boolean v3, p0, LB0/c0;->L:Z

    .line 158
    .line 159
    :cond_7
    iget-boolean v1, v0, LB0/M;->b:Z

    .line 160
    .line 161
    if-eqz v1, :cond_8

    .line 162
    .line 163
    invoke-virtual {v0}, LB0/M;->e()Z

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    if-eqz v1, :cond_8

    .line 168
    .line 169
    invoke-virtual {v0}, LB0/M;->g()V

    .line 170
    .line 171
    .line 172
    :cond_8
    iput-boolean v3, p0, LB0/c0;->P:Z

    .line 173
    .line 174
    return-void
.end method
