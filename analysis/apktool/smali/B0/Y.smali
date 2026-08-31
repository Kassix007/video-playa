.class public final LB0/Y;
.super Lz0/J;
.source "SourceFile"

# interfaces
.implements Lz0/B;
.implements LB0/b;
.implements LB0/e0;


# instance fields
.field public A:Z

.field public B:Z

.field public C:LW0/a;

.field public D:J

.field public E:LB5/c;

.field public F:LB0/V;

.field public final G:LB0/M;

.field public final H:LR/e;

.field public I:Z

.field public J:Z

.field public K:Z

.field public L:Ljava/lang/Object;

.field public M:Z

.field public final v:LB0/P;

.field public w:Z

.field public x:I

.field public y:I

.field public z:LB0/I;


# direct methods
.method public constructor <init>(LB0/P;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lz0/J;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LB0/Y;->v:LB0/P;

    .line 5
    .line 6
    const v0, 0x7fffffff

    .line 7
    .line 8
    .line 9
    iput v0, p0, LB0/Y;->x:I

    .line 10
    .line 11
    iput v0, p0, LB0/Y;->y:I

    .line 12
    .line 13
    sget-object v0, LB0/I;->s:LB0/I;

    .line 14
    .line 15
    iput-object v0, p0, LB0/Y;->z:LB0/I;

    .line 16
    .line 17
    const-wide/16 v0, 0x0

    .line 18
    .line 19
    iput-wide v0, p0, LB0/Y;->D:J

    .line 20
    .line 21
    sget-object v0, LB0/V;->s:LB0/V;

    .line 22
    .line 23
    iput-object v0, p0, LB0/Y;->F:LB0/V;

    .line 24
    .line 25
    new-instance v0, LB0/M;

    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    invoke-direct {v0, p0, v1}, LB0/M;-><init>(LB0/b;I)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, LB0/Y;->G:LB0/M;

    .line 32
    .line 33
    new-instance v0, LR/e;

    .line 34
    .line 35
    const/16 v1, 0x10

    .line 36
    .line 37
    new-array v1, v1, [LB0/Y;

    .line 38
    .line 39
    invoke-direct {v0, v1}, LR/e;-><init>([Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, LB0/Y;->H:LR/e;

    .line 43
    .line 44
    const/4 v0, 0x1

    .line 45
    iput-boolean v0, p0, LB0/Y;->I:Z

    .line 46
    .line 47
    iput-boolean v0, p0, LB0/Y;->K:Z

    .line 48
    .line 49
    iget-object p1, p1, LB0/P;->p:LB0/c0;

    .line 50
    .line 51
    iget-object p1, p1, LB0/c0;->G:Ljava/lang/Object;

    .line 52
    .line 53
    iput-object p1, p0, LB0/Y;->L:Ljava/lang/Object;

    .line 54
    .line 55
    return-void
.end method


# virtual methods
.method public final A()Z
    .locals 2

    .line 1
    iget-object v0, p0, LB0/Y;->F:LB0/V;

    .line 2
    .line 3
    sget-object v1, LB0/V;->s:LB0/V;

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public final J()V
    .locals 3

    .line 1
    iget-object v0, p0, LB0/Y;->v:LB0/P;

    .line 2
    .line 3
    iget-object v0, v0, LB0/P;->a:LB0/L;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x7

    .line 7
    invoke-static {v0, v1, v2}, LB0/L;->Q(LB0/L;ZI)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final U(JFLB5/c;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p4}, LB0/Y;->d0(JLB5/c;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final Y(Z)V
    .locals 4

    .line 1
    iget-object v0, p0, LB0/Y;->v:LB0/P;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-boolean v1, v0, LB0/P;->c:Z

    .line 6
    .line 7
    if-nez v1, :cond_2

    .line 8
    .line 9
    :cond_0
    if-nez p1, :cond_1

    .line 10
    .line 11
    iget-boolean p1, v0, LB0/P;->c:Z

    .line 12
    .line 13
    if-nez p1, :cond_1

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_1
    sget-object p1, LB0/V;->s:LB0/V;

    .line 17
    .line 18
    iput-object p1, p0, LB0/Y;->F:LB0/V;

    .line 19
    .line 20
    iget-object p1, v0, LB0/P;->a:LB0/L;

    .line 21
    .line 22
    invoke-virtual {p1}, LB0/L;->w()LR/e;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iget-object v0, p1, LR/e;->q:[Ljava/lang/Object;

    .line 27
    .line 28
    iget p1, p1, LR/e;->s:I

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    :goto_0
    if-ge v1, p1, :cond_2

    .line 32
    .line 33
    aget-object v2, v0, v1

    .line 34
    .line 35
    check-cast v2, LB0/L;

    .line 36
    .line 37
    iget-object v2, v2, LB0/L;->V:LB0/P;

    .line 38
    .line 39
    iget-object v2, v2, LB0/P;->q:LB0/Y;

    .line 40
    .line 41
    invoke-static {v2}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    const/4 v3, 0x1

    .line 45
    invoke-virtual {v2, v3}, LB0/Y;->Y(Z)V

    .line 46
    .line 47
    .line 48
    add-int/lit8 v1, v1, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    :goto_1
    return-void
.end method

.method public final Z()V
    .locals 7

    .line 1
    iget-object v0, p0, LB0/Y;->F:LB0/V;

    .line 2
    .line 3
    iget-object v1, p0, LB0/Y;->v:LB0/P;

    .line 4
    .line 5
    iget-boolean v2, v1, LB0/P;->c:Z

    .line 6
    .line 7
    iget-object v3, v1, LB0/P;->a:LB0/L;

    .line 8
    .line 9
    sget-object v4, LB0/V;->q:LB0/V;

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    sget-object v2, LB0/V;->r:LB0/V;

    .line 14
    .line 15
    iput-object v2, p0, LB0/Y;->F:LB0/V;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iput-object v4, p0, LB0/Y;->F:LB0/V;

    .line 19
    .line 20
    :goto_0
    if-eq v0, v4, :cond_1

    .line 21
    .line 22
    iget-boolean v0, v1, LB0/P;->e:Z

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    const/4 v0, 0x6

    .line 27
    const/4 v1, 0x1

    .line 28
    invoke-static {v3, v1, v0}, LB0/L;->Q(LB0/L;ZI)V

    .line 29
    .line 30
    .line 31
    :cond_1
    invoke-virtual {v3}, LB0/L;->w()LR/e;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iget-object v1, v0, LR/e;->q:[Ljava/lang/Object;

    .line 36
    .line 37
    iget v0, v0, LR/e;->s:I

    .line 38
    .line 39
    const/4 v2, 0x0

    .line 40
    :goto_1
    if-ge v2, v0, :cond_4

    .line 41
    .line 42
    aget-object v3, v1, v2

    .line 43
    .line 44
    check-cast v3, LB0/L;

    .line 45
    .line 46
    iget-object v4, v3, LB0/L;->V:LB0/P;

    .line 47
    .line 48
    iget-object v4, v4, LB0/P;->q:LB0/Y;

    .line 49
    .line 50
    if-eqz v4, :cond_3

    .line 51
    .line 52
    iget v5, v4, LB0/Y;->y:I

    .line 53
    .line 54
    const v6, 0x7fffffff

    .line 55
    .line 56
    .line 57
    if-eq v5, v6, :cond_2

    .line 58
    .line 59
    invoke-virtual {v4}, LB0/Y;->Z()V

    .line 60
    .line 61
    .line 62
    invoke-static {v3}, LB0/L;->T(LB0/L;)V

    .line 63
    .line 64
    .line 65
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 69
    .line 70
    const-string v1, "Error: Child node\'s lookahead pass delegate cannot be null when in a lookahead scope."

    .line 71
    .line 72
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw v0

    .line 76
    :cond_4
    return-void
.end method

.method public final a(J)Lz0/J;
    .locals 5

    .line 1
    iget-object v0, p0, LB0/Y;->v:LB0/P;

    .line 2
    .line 3
    iget-object v1, v0, LB0/P;->a:LB0/L;

    .line 4
    .line 5
    invoke-virtual {v1}, LB0/L;->s()LB0/L;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    iget-object v1, v1, LB0/L;->V:LB0/P;

    .line 13
    .line 14
    iget-object v1, v1, LB0/P;->d:LB0/G;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object v1, v2

    .line 18
    :goto_0
    sget-object v3, LB0/G;->r:LB0/G;

    .line 19
    .line 20
    if-eq v1, v3, :cond_2

    .line 21
    .line 22
    iget-object v1, v0, LB0/P;->a:LB0/L;

    .line 23
    .line 24
    invoke-virtual {v1}, LB0/L;->s()LB0/L;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    iget-object v1, v1, LB0/L;->V:LB0/P;

    .line 31
    .line 32
    iget-object v2, v1, LB0/P;->d:LB0/G;

    .line 33
    .line 34
    :cond_1
    sget-object v1, LB0/G;->t:LB0/G;

    .line 35
    .line 36
    if-ne v2, v1, :cond_3

    .line 37
    .line 38
    :cond_2
    const/4 v1, 0x0

    .line 39
    iput-boolean v1, v0, LB0/P;->b:Z

    .line 40
    .line 41
    :cond_3
    iget-object v1, v0, LB0/P;->a:LB0/L;

    .line 42
    .line 43
    invoke-virtual {v1}, LB0/L;->s()LB0/L;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    if-eqz v2, :cond_9

    .line 48
    .line 49
    iget-object v2, v2, LB0/L;->V:LB0/P;

    .line 50
    .line 51
    iget-object v3, p0, LB0/Y;->z:LB0/I;

    .line 52
    .line 53
    sget-object v4, LB0/I;->s:LB0/I;

    .line 54
    .line 55
    if-eq v3, v4, :cond_5

    .line 56
    .line 57
    iget-boolean v1, v1, LB0/L;->T:Z

    .line 58
    .line 59
    if-eqz v1, :cond_4

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_4
    const-string v1, "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()"

    .line 63
    .line 64
    invoke-static {v1}, Ly0/a;->b(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    :cond_5
    :goto_1
    iget-object v1, v2, LB0/P;->d:LB0/G;

    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-eqz v1, :cond_8

    .line 74
    .line 75
    const/4 v3, 0x1

    .line 76
    if-eq v1, v3, :cond_8

    .line 77
    .line 78
    const/4 v3, 0x2

    .line 79
    if-eq v1, v3, :cond_7

    .line 80
    .line 81
    const/4 v3, 0x3

    .line 82
    if-ne v1, v3, :cond_6

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 86
    .line 87
    new-instance p2, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    const-string v0, "Measurable could be only measured from the parent\'s measure or layout block. Parents state is "

    .line 90
    .line 91
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    iget-object v0, v2, LB0/P;->d:LB0/G;

    .line 95
    .line 96
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    throw p1

    .line 107
    :cond_7
    :goto_2
    sget-object v1, LB0/I;->r:LB0/I;

    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_8
    sget-object v1, LB0/I;->q:LB0/I;

    .line 111
    .line 112
    :goto_3
    iput-object v1, p0, LB0/Y;->z:LB0/I;

    .line 113
    .line 114
    goto :goto_4

    .line 115
    :cond_9
    sget-object v1, LB0/I;->s:LB0/I;

    .line 116
    .line 117
    iput-object v1, p0, LB0/Y;->z:LB0/I;

    .line 118
    .line 119
    :goto_4
    iget-object v0, v0, LB0/P;->a:LB0/L;

    .line 120
    .line 121
    iget-object v1, v0, LB0/L;->R:LB0/I;

    .line 122
    .line 123
    sget-object v2, LB0/I;->s:LB0/I;

    .line 124
    .line 125
    if-ne v1, v2, :cond_a

    .line 126
    .line 127
    invoke-virtual {v0}, LB0/L;->c()V

    .line 128
    .line 129
    .line 130
    :cond_a
    invoke-virtual {p0, p1, p2}, LB0/Y;->e0(J)Z

    .line 131
    .line 132
    .line 133
    return-object p0
.end method

.method public final b0()V
    .locals 7

    .line 1
    iget-object v0, p0, LB0/Y;->v:LB0/P;

    .line 2
    .line 3
    iget v1, v0, LB0/P;->o:I

    .line 4
    .line 5
    if-lez v1, :cond_3

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
    if-ge v3, v0, :cond_3

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
    iget-boolean v6, v5, LB0/P;->m:Z

    .line 28
    .line 29
    if-nez v6, :cond_0

    .line 30
    .line 31
    iget-boolean v6, v5, LB0/P;->n:Z

    .line 32
    .line 33
    if-eqz v6, :cond_1

    .line 34
    .line 35
    :cond_0
    iget-boolean v6, v5, LB0/P;->f:Z

    .line 36
    .line 37
    if-nez v6, :cond_1

    .line 38
    .line 39
    invoke-virtual {v4, v2}, LB0/L;->P(Z)V

    .line 40
    .line 41
    .line 42
    :cond_1
    iget-object v4, v5, LB0/P;->q:LB0/Y;

    .line 43
    .line 44
    if-eqz v4, :cond_2

    .line 45
    .line 46
    invoke-virtual {v4}, LB0/Y;->b0()V

    .line 47
    .line 48
    .line 49
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_3
    return-void
.end method

.method public final c()LB0/M;
    .locals 1

    .line 1
    iget-object v0, p0, LB0/Y;->G:LB0/M;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c0()V
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LB0/Y;->M:Z

    .line 3
    .line 4
    iget-object v1, p0, LB0/Y;->v:LB0/P;

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
    iget-object v3, p0, LB0/Y;->F:LB0/V;

    .line 13
    .line 14
    sget-object v4, LB0/V;->q:LB0/V;

    .line 15
    .line 16
    const/4 v5, 0x0

    .line 17
    if-eq v3, v4, :cond_0

    .line 18
    .line 19
    iget-boolean v4, v1, LB0/P;->c:Z

    .line 20
    .line 21
    if-eqz v4, :cond_1

    .line 22
    .line 23
    :cond_0
    sget-object v4, LB0/V;->r:LB0/V;

    .line 24
    .line 25
    if-eq v3, v4, :cond_2

    .line 26
    .line 27
    iget-boolean v1, v1, LB0/P;->c:Z

    .line 28
    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    :cond_1
    invoke-virtual {p0}, LB0/Y;->Z()V

    .line 32
    .line 33
    .line 34
    iget-boolean v1, p0, LB0/Y;->w:Z

    .line 35
    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    invoke-virtual {v2, v5}, LB0/L;->P(Z)V

    .line 41
    .line 42
    .line 43
    :cond_2
    if-eqz v2, :cond_5

    .line 44
    .line 45
    iget-object v1, v2, LB0/L;->V:LB0/P;

    .line 46
    .line 47
    iget-boolean v2, p0, LB0/Y;->w:Z

    .line 48
    .line 49
    if-nez v2, :cond_6

    .line 50
    .line 51
    iget-object v2, v1, LB0/P;->d:LB0/G;

    .line 52
    .line 53
    sget-object v3, LB0/G;->s:LB0/G;

    .line 54
    .line 55
    if-eq v2, v3, :cond_3

    .line 56
    .line 57
    sget-object v3, LB0/G;->t:LB0/G;

    .line 58
    .line 59
    if-ne v2, v3, :cond_6

    .line 60
    .line 61
    :cond_3
    iget v2, p0, LB0/Y;->y:I

    .line 62
    .line 63
    const v3, 0x7fffffff

    .line 64
    .line 65
    .line 66
    if-ne v2, v3, :cond_4

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_4
    const-string v2, "Place was called on a node which was placed already"

    .line 70
    .line 71
    invoke-static {v2}, Ly0/a;->b(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    :goto_0
    iget v2, v1, LB0/P;->h:I

    .line 75
    .line 76
    iput v2, p0, LB0/Y;->y:I

    .line 77
    .line 78
    add-int/2addr v2, v0

    .line 79
    iput v2, v1, LB0/P;->h:I

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_5
    iput v5, p0, LB0/Y;->y:I

    .line 83
    .line 84
    :cond_6
    :goto_1
    invoke-virtual {p0}, LB0/Y;->t()V

    .line 85
    .line 86
    .line 87
    return-void
.end method

.method public final d0(JLB5/c;)V
    .locals 6

    .line 1
    iget-object v0, p0, LB0/Y;->v:LB0/P;

    .line 2
    .line 3
    iget-object v1, v0, LB0/P;->a:LB0/L;

    .line 4
    .line 5
    iget-object v2, v0, LB0/P;->a:LB0/L;

    .line 6
    .line 7
    invoke-virtual {v1}, LB0/L;->s()LB0/L;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iget-object v1, v1, LB0/L;->V:LB0/P;

    .line 14
    .line 15
    iget-object v1, v1, LB0/P;->d:LB0/G;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v1, 0x0

    .line 19
    :goto_0
    const/4 v3, 0x0

    .line 20
    sget-object v4, LB0/G;->t:LB0/G;

    .line 21
    .line 22
    if-ne v1, v4, :cond_1

    .line 23
    .line 24
    iput-boolean v3, v0, LB0/P;->c:Z

    .line 25
    .line 26
    :cond_1
    iget-boolean v1, v2, LB0/L;->e0:Z

    .line 27
    .line 28
    if-eqz v1, :cond_2

    .line 29
    .line 30
    const-string v1, "place is called on a deactivated node"

    .line 31
    .line 32
    invoke-static {v1}, Ly0/a;->a(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    :cond_2
    iput-object v4, v0, LB0/P;->d:LB0/G;

    .line 36
    .line 37
    const/4 v1, 0x1

    .line 38
    iput-boolean v1, p0, LB0/Y;->A:Z

    .line 39
    .line 40
    iput-boolean v3, p0, LB0/Y;->M:Z

    .line 41
    .line 42
    iget-wide v4, p0, LB0/Y;->D:J

    .line 43
    .line 44
    invoke-static {p1, p2, v4, v5}, LW0/i;->a(JJ)Z

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    if-nez v4, :cond_5

    .line 49
    .line 50
    iget-boolean v4, v0, LB0/P;->n:Z

    .line 51
    .line 52
    if-nez v4, :cond_3

    .line 53
    .line 54
    iget-boolean v4, v0, LB0/P;->m:Z

    .line 55
    .line 56
    if-eqz v4, :cond_4

    .line 57
    .line 58
    :cond_3
    iput-boolean v1, v0, LB0/P;->f:Z

    .line 59
    .line 60
    :cond_4
    invoke-virtual {p0}, LB0/Y;->b0()V

    .line 61
    .line 62
    .line 63
    :cond_5
    invoke-static {v2}, LB0/O;->a(LB0/L;)LB0/t0;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    iget-boolean v4, v0, LB0/P;->f:Z

    .line 68
    .line 69
    if-nez v4, :cond_6

    .line 70
    .line 71
    invoke-virtual {p0}, LB0/Y;->A()Z

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    if-eqz v4, :cond_6

    .line 76
    .line 77
    invoke-virtual {v0}, LB0/P;->a()LB0/n0;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-virtual {v1}, LB0/n0;->z0()LB0/U;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-static {v1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    iget-wide v2, v1, Lz0/J;->u:J

    .line 89
    .line 90
    invoke-static {p1, p2, v2, v3}, LW0/i;->c(JJ)J

    .line 91
    .line 92
    .line 93
    move-result-wide v2

    .line 94
    invoke-virtual {v1, v2, v3}, LB0/U;->r0(J)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0}, LB0/Y;->c0()V

    .line 98
    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_6
    invoke-virtual {v0, v3}, LB0/P;->f(Z)V

    .line 102
    .line 103
    .line 104
    iget-object v4, p0, LB0/Y;->G:LB0/M;

    .line 105
    .line 106
    iput-boolean v3, v4, LB0/M;->e:Z

    .line 107
    .line 108
    move-object v3, v1

    .line 109
    check-cast v3, LC0/A;

    .line 110
    .line 111
    invoke-virtual {v3}, LC0/A;->getSnapshotObserver()LB0/v0;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    new-instance v4, LB0/X;

    .line 116
    .line 117
    invoke-direct {v4, p0, v1, p1, p2}, LB0/X;-><init>(LB0/Y;LB0/t0;J)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    iget-object v1, v2, LB0/L;->x:LB0/L;

    .line 124
    .line 125
    if-eqz v1, :cond_7

    .line 126
    .line 127
    iget-object v1, v3, LB0/v0;->g:LB0/f;

    .line 128
    .line 129
    invoke-virtual {v3, v2, v1, v4}, LB0/v0;->a(LB0/u0;LB5/c;LB5/a;)V

    .line 130
    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_7
    iget-object v1, v3, LB0/v0;->f:LB0/f;

    .line 134
    .line 135
    invoke-virtual {v3, v2, v1, v4}, LB0/v0;->a(LB0/u0;LB5/c;LB5/a;)V

    .line 136
    .line 137
    .line 138
    :goto_1
    iput-wide p1, p0, LB0/Y;->D:J

    .line 139
    .line 140
    iput-object p3, p0, LB0/Y;->E:LB5/c;

    .line 141
    .line 142
    sget-object p1, LB0/G;->u:LB0/G;

    .line 143
    .line 144
    iput-object p1, v0, LB0/P;->d:LB0/G;

    .line 145
    .line 146
    return-void
.end method

.method public final e0(J)Z
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p1

    .line 4
    .line 5
    iget-object v3, v0, LB0/Y;->v:LB0/P;

    .line 6
    .line 7
    iget-object v4, v3, LB0/P;->a:LB0/L;

    .line 8
    .line 9
    iget-object v5, v3, LB0/P;->a:LB0/L;

    .line 10
    .line 11
    iget-boolean v4, v4, LB0/L;->e0:Z

    .line 12
    .line 13
    if-eqz v4, :cond_0

    .line 14
    .line 15
    const-string v4, "measure is called on a deactivated node"

    .line 16
    .line 17
    invoke-static {v4}, Ly0/a;->a(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual {v5}, LB0/L;->s()LB0/L;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    iget-boolean v6, v5, LB0/L;->T:Z

    .line 25
    .line 26
    const/4 v7, 0x1

    .line 27
    const/4 v8, 0x0

    .line 28
    if-nez v6, :cond_2

    .line 29
    .line 30
    if-eqz v4, :cond_1

    .line 31
    .line 32
    iget-boolean v4, v4, LB0/L;->T:Z

    .line 33
    .line 34
    if-eqz v4, :cond_1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    move v4, v8

    .line 38
    goto :goto_1

    .line 39
    :cond_2
    :goto_0
    move v4, v7

    .line 40
    :goto_1
    iput-boolean v4, v5, LB0/L;->T:Z

    .line 41
    .line 42
    iget-object v4, v5, LB0/L;->V:LB0/P;

    .line 43
    .line 44
    iget-boolean v4, v4, LB0/P;->e:Z

    .line 45
    .line 46
    if-nez v4, :cond_6

    .line 47
    .line 48
    iget-object v4, v0, LB0/Y;->C:LW0/a;

    .line 49
    .line 50
    if-nez v4, :cond_3

    .line 51
    .line 52
    move v4, v8

    .line 53
    goto :goto_2

    .line 54
    :cond_3
    iget-wide v9, v4, LW0/a;->a:J

    .line 55
    .line 56
    invoke-static {v9, v10, v1, v2}, LW0/a;->b(JJ)Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    :goto_2
    if-nez v4, :cond_4

    .line 61
    .line 62
    goto :goto_3

    .line 63
    :cond_4
    iget-object v1, v5, LB0/L;->D:LB0/t0;

    .line 64
    .line 65
    if-eqz v1, :cond_5

    .line 66
    .line 67
    check-cast v1, LC0/A;

    .line 68
    .line 69
    invoke-virtual {v1, v5, v7}, LC0/A;->q(LB0/L;Z)V

    .line 70
    .line 71
    .line 72
    :cond_5
    invoke-virtual {v5}, LB0/L;->U()V

    .line 73
    .line 74
    .line 75
    return v8

    .line 76
    :cond_6
    :goto_3
    new-instance v4, LW0/a;

    .line 77
    .line 78
    invoke-direct {v4, v1, v2}, LW0/a;-><init>(J)V

    .line 79
    .line 80
    .line 81
    iput-object v4, v0, LB0/Y;->C:LW0/a;

    .line 82
    .line 83
    invoke-virtual/range {p0 .. p2}, Lz0/J;->X(J)V

    .line 84
    .line 85
    .line 86
    iget-object v4, v0, LB0/Y;->G:LB0/M;

    .line 87
    .line 88
    iput-boolean v8, v4, LB0/M;->d:Z

    .line 89
    .line 90
    invoke-virtual {v5}, LB0/L;->w()LR/e;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    iget-object v5, v4, LR/e;->q:[Ljava/lang/Object;

    .line 95
    .line 96
    iget v4, v4, LR/e;->s:I

    .line 97
    .line 98
    move v6, v8

    .line 99
    :goto_4
    if-ge v6, v4, :cond_7

    .line 100
    .line 101
    aget-object v9, v5, v6

    .line 102
    .line 103
    check-cast v9, LB0/L;

    .line 104
    .line 105
    iget-object v9, v9, LB0/L;->V:LB0/P;

    .line 106
    .line 107
    iget-object v9, v9, LB0/P;->q:LB0/Y;

    .line 108
    .line 109
    invoke-static {v9}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    iget-object v9, v9, LB0/Y;->G:LB0/M;

    .line 113
    .line 114
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    add-int/lit8 v6, v6, 0x1

    .line 118
    .line 119
    goto :goto_4

    .line 120
    :cond_7
    iget-boolean v4, v0, LB0/Y;->B:Z

    .line 121
    .line 122
    const-wide v5, 0xffffffffL

    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    const/16 v9, 0x20

    .line 128
    .line 129
    if-eqz v4, :cond_8

    .line 130
    .line 131
    iget-wide v10, v0, Lz0/J;->s:J

    .line 132
    .line 133
    goto :goto_5

    .line 134
    :cond_8
    const/high16 v4, -0x80000000

    .line 135
    .line 136
    int-to-long v10, v4

    .line 137
    shl-long v12, v10, v9

    .line 138
    .line 139
    and-long/2addr v10, v5

    .line 140
    or-long/2addr v10, v12

    .line 141
    :goto_5
    iput-boolean v7, v0, LB0/Y;->B:Z

    .line 142
    .line 143
    invoke-virtual {v3}, LB0/P;->a()LB0/n0;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    invoke-virtual {v4}, LB0/n0;->z0()LB0/U;

    .line 148
    .line 149
    .line 150
    move-result-object v4

    .line 151
    if-eqz v4, :cond_9

    .line 152
    .line 153
    move v12, v7

    .line 154
    goto :goto_6

    .line 155
    :cond_9
    move v12, v8

    .line 156
    :goto_6
    if-nez v12, :cond_a

    .line 157
    .line 158
    const-string v12, "Lookahead result from lookaheadRemeasure cannot be null"

    .line 159
    .line 160
    invoke-static {v12}, Ly0/a;->b(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    :cond_a
    iget-object v3, v3, LB0/P;->q:LB0/Y;

    .line 164
    .line 165
    if-eqz v3, :cond_d

    .line 166
    .line 167
    iget-object v12, v3, LB0/Y;->v:LB0/P;

    .line 168
    .line 169
    sget-object v13, LB0/G;->r:LB0/G;

    .line 170
    .line 171
    iput-object v13, v12, LB0/P;->d:LB0/G;

    .line 172
    .line 173
    iget-object v13, v12, LB0/P;->p:LB0/c0;

    .line 174
    .line 175
    iget-object v14, v12, LB0/P;->a:LB0/L;

    .line 176
    .line 177
    iput-boolean v8, v12, LB0/P;->e:Z

    .line 178
    .line 179
    invoke-static {v14}, LB0/O;->a(LB0/L;)LB0/t0;

    .line 180
    .line 181
    .line 182
    move-result-object v15

    .line 183
    check-cast v15, LC0/A;

    .line 184
    .line 185
    invoke-virtual {v15}, LC0/A;->getSnapshotObserver()LB0/v0;

    .line 186
    .line 187
    .line 188
    move-result-object v15

    .line 189
    move-wide/from16 v16, v5

    .line 190
    .line 191
    new-instance v5, LB0/W;

    .line 192
    .line 193
    invoke-direct {v5, v3, v1, v2}, LB0/W;-><init>(LB0/Y;J)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    iget-object v1, v14, LB0/L;->x:LB0/L;

    .line 200
    .line 201
    if-eqz v1, :cond_b

    .line 202
    .line 203
    iget-object v1, v15, LB0/v0;->b:LB0/f;

    .line 204
    .line 205
    invoke-virtual {v15, v14, v1, v5}, LB0/v0;->a(LB0/u0;LB5/c;LB5/a;)V

    .line 206
    .line 207
    .line 208
    goto :goto_7

    .line 209
    :cond_b
    iget-object v1, v15, LB0/v0;->c:LB0/f;

    .line 210
    .line 211
    invoke-virtual {v15, v14, v1, v5}, LB0/v0;->a(LB0/u0;LB5/c;LB5/a;)V

    .line 212
    .line 213
    .line 214
    :goto_7
    iput-boolean v7, v12, LB0/P;->f:Z

    .line 215
    .line 216
    iput-boolean v7, v12, LB0/P;->g:Z

    .line 217
    .line 218
    invoke-static {v14}, LB0/g;->q(LB0/L;)Z

    .line 219
    .line 220
    .line 221
    move-result v1

    .line 222
    if-eqz v1, :cond_c

    .line 223
    .line 224
    iput-boolean v7, v13, LB0/c0;->K:Z

    .line 225
    .line 226
    iput-boolean v7, v13, LB0/c0;->L:Z

    .line 227
    .line 228
    goto :goto_8

    .line 229
    :cond_c
    iput-boolean v7, v13, LB0/c0;->J:Z

    .line 230
    .line 231
    :goto_8
    sget-object v1, LB0/G;->u:LB0/G;

    .line 232
    .line 233
    iput-object v1, v12, LB0/P;->d:LB0/G;

    .line 234
    .line 235
    goto :goto_9

    .line 236
    :cond_d
    move-wide/from16 v16, v5

    .line 237
    .line 238
    :goto_9
    iget v1, v4, Lz0/J;->q:I

    .line 239
    .line 240
    iget v2, v4, Lz0/J;->r:I

    .line 241
    .line 242
    int-to-long v5, v1

    .line 243
    shl-long/2addr v5, v9

    .line 244
    int-to-long v1, v2

    .line 245
    and-long v1, v1, v16

    .line 246
    .line 247
    or-long/2addr v1, v5

    .line 248
    invoke-virtual {v0, v1, v2}, Lz0/J;->W(J)V

    .line 249
    .line 250
    .line 251
    shr-long v1, v10, v9

    .line 252
    .line 253
    long-to-int v1, v1

    .line 254
    iget v2, v4, Lz0/J;->q:I

    .line 255
    .line 256
    if-ne v1, v2, :cond_f

    .line 257
    .line 258
    and-long v1, v10, v16

    .line 259
    .line 260
    long-to-int v1, v1

    .line 261
    iget v2, v4, Lz0/J;->r:I

    .line 262
    .line 263
    if-eq v1, v2, :cond_e

    .line 264
    .line 265
    goto :goto_a

    .line 266
    :cond_e
    return v8

    .line 267
    :cond_f
    :goto_a
    return v7
.end method

.method public final g()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LB0/Y;->L:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public final k(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, LB0/Y;->v:LB0/P;

    .line 2
    .line 3
    invoke-virtual {v0}, LB0/P;->a()LB0/n0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, LB0/n0;->z0()LB0/U;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iget-boolean v1, v1, LB0/T;->v:Z

    .line 14
    .line 15
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v1, 0x0

    .line 21
    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-nez v1, :cond_2

    .line 30
    .line 31
    invoke-virtual {v0}, LB0/P;->a()LB0/n0;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, LB0/n0;->z0()LB0/U;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    if-nez v0, :cond_1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    iput-boolean p1, v0, LB0/T;->v:Z

    .line 43
    .line 44
    :cond_2
    :goto_1
    return-void
.end method

.method public final n()LB0/v;
    .locals 1

    .line 1
    iget-object v0, p0, LB0/Y;->v:LB0/P;

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
    iget-object v0, p0, LB0/Y;->v:LB0/P;

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
    iget-object v3, v3, LB0/P;->q:LB0/Y;

    .line 23
    .line 24
    invoke-static {v3}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v3}, LB0/a;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    add-int/lit8 v2, v2, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    return-void
.end method

.method public final q()LB0/b;
    .locals 1

    .line 1
    iget-object v0, p0, LB0/Y;->v:LB0/P;

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
    iget-object v0, v0, LB0/P;->q:LB0/Y;

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
    iget-object v0, p0, LB0/Y;->v:LB0/P;

    .line 2
    .line 3
    iget-object v0, v0, LB0/P;->a:LB0/L;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, LB0/L;->P(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final t()V
    .locals 10

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LB0/Y;->J:Z

    .line 3
    .line 4
    iget-object v0, p0, LB0/Y;->G:LB0/M;

    .line 5
    .line 6
    invoke-virtual {v0}, LB0/M;->h()V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, LB0/Y;->v:LB0/P;

    .line 10
    .line 11
    iget-boolean v2, v1, LB0/P;->f:Z

    .line 12
    .line 13
    iget-object v3, v1, LB0/P;->a:LB0/L;

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    if-eqz v2, :cond_2

    .line 17
    .line 18
    invoke-virtual {v3}, LB0/L;->w()LR/e;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    iget-object v5, v2, LR/e;->q:[Ljava/lang/Object;

    .line 23
    .line 24
    iget v2, v2, LR/e;->s:I

    .line 25
    .line 26
    move v6, v4

    .line 27
    :goto_0
    if-ge v6, v2, :cond_2

    .line 28
    .line 29
    aget-object v7, v5, v6

    .line 30
    .line 31
    check-cast v7, LB0/L;

    .line 32
    .line 33
    iget-object v8, v7, LB0/L;->V:LB0/P;

    .line 34
    .line 35
    iget-boolean v9, v8, LB0/P;->e:Z

    .line 36
    .line 37
    if-eqz v9, :cond_1

    .line 38
    .line 39
    invoke-virtual {v7}, LB0/L;->r()LB0/I;

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    sget-object v9, LB0/I;->q:LB0/I;

    .line 44
    .line 45
    if-ne v7, v9, :cond_1

    .line 46
    .line 47
    iget-object v7, v8, LB0/P;->q:LB0/Y;

    .line 48
    .line 49
    invoke-static {v7}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object v8, v8, LB0/P;->q:LB0/Y;

    .line 53
    .line 54
    if-eqz v8, :cond_0

    .line 55
    .line 56
    iget-object v8, v8, LB0/Y;->C:LW0/a;

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_0
    const/4 v8, 0x0

    .line 60
    :goto_1
    invoke-static {v8}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    iget-wide v8, v8, LW0/a;->a:J

    .line 64
    .line 65
    invoke-virtual {v7, v8, v9}, LB0/Y;->e0(J)Z

    .line 66
    .line 67
    .line 68
    move-result v7

    .line 69
    if-eqz v7, :cond_1

    .line 70
    .line 71
    const/4 v7, 0x7

    .line 72
    invoke-static {v3, v4, v7}, LB0/L;->Q(LB0/L;ZI)V

    .line 73
    .line 74
    .line 75
    :cond_1
    add-int/lit8 v6, v6, 0x1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_2
    invoke-virtual {p0}, LB0/Y;->n()LB0/v;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    iget-object v2, v2, LB0/v;->b0:LB0/u;

    .line 83
    .line 84
    invoke-static {v2}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    iget-boolean v5, v1, LB0/P;->g:Z

    .line 88
    .line 89
    if-nez v5, :cond_3

    .line 90
    .line 91
    iget-boolean v5, v2, LB0/T;->x:Z

    .line 92
    .line 93
    if-nez v5, :cond_6

    .line 94
    .line 95
    iget-boolean v5, v1, LB0/P;->f:Z

    .line 96
    .line 97
    if-eqz v5, :cond_6

    .line 98
    .line 99
    :cond_3
    iput-boolean v4, v1, LB0/P;->f:Z

    .line 100
    .line 101
    iget-object v5, v1, LB0/P;->d:LB0/G;

    .line 102
    .line 103
    sget-object v6, LB0/G;->t:LB0/G;

    .line 104
    .line 105
    iput-object v6, v1, LB0/P;->d:LB0/G;

    .line 106
    .line 107
    invoke-static {v3}, LB0/O;->a(LB0/L;)LB0/t0;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    invoke-virtual {v1, v4}, LB0/P;->g(Z)V

    .line 112
    .line 113
    .line 114
    check-cast v6, LC0/A;

    .line 115
    .line 116
    invoke-virtual {v6}, LC0/A;->getSnapshotObserver()LB0/v0;

    .line 117
    .line 118
    .line 119
    move-result-object v6

    .line 120
    new-instance v7, LB0/K;

    .line 121
    .line 122
    const/4 v8, 0x2

    .line 123
    invoke-direct {v7, v8, p0, v2}, LB0/K;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    iget-object v8, v3, LB0/L;->x:LB0/L;

    .line 130
    .line 131
    if-eqz v8, :cond_4

    .line 132
    .line 133
    iget-object v8, v6, LB0/v0;->h:LB0/f;

    .line 134
    .line 135
    invoke-virtual {v6, v3, v8, v7}, LB0/v0;->a(LB0/u0;LB5/c;LB5/a;)V

    .line 136
    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_4
    iget-object v8, v6, LB0/v0;->e:LB0/f;

    .line 140
    .line 141
    invoke-virtual {v6, v3, v8, v7}, LB0/v0;->a(LB0/u0;LB5/c;LB5/a;)V

    .line 142
    .line 143
    .line 144
    :goto_2
    iput-object v5, v1, LB0/P;->d:LB0/G;

    .line 145
    .line 146
    iget-boolean v3, v1, LB0/P;->m:Z

    .line 147
    .line 148
    if-eqz v3, :cond_5

    .line 149
    .line 150
    iget-boolean v2, v2, LB0/T;->x:Z

    .line 151
    .line 152
    if-eqz v2, :cond_5

    .line 153
    .line 154
    invoke-virtual {p0}, LB0/Y;->requestLayout()V

    .line 155
    .line 156
    .line 157
    :cond_5
    iput-boolean v4, v1, LB0/P;->g:Z

    .line 158
    .line 159
    :cond_6
    iget-boolean v1, v0, LB0/M;->b:Z

    .line 160
    .line 161
    if-eqz v1, :cond_7

    .line 162
    .line 163
    invoke-virtual {v0}, LB0/M;->e()Z

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    if-eqz v1, :cond_7

    .line 168
    .line 169
    invoke-virtual {v0}, LB0/M;->g()V

    .line 170
    .line 171
    .line 172
    :cond_7
    iput-boolean v4, p0, LB0/Y;->J:Z

    .line 173
    .line 174
    return-void
.end method
