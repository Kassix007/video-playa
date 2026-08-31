.class public final Lz0/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz0/T;
.implements Lz0/E;


# instance fields
.field public final synthetic q:Lz0/t;

.field public final synthetic r:Lz0/y;


# direct methods
.method public constructor <init>(Lz0/y;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lz0/q;->r:Lz0/y;

    .line 5
    .line 6
    iget-object p1, p1, Lz0/y;->x:Lz0/t;

    .line 7
    .line 8
    iput-object p1, p0, Lz0/q;->q:Lz0/t;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final D(J)F
    .locals 1

    .line 1
    iget-object v0, p0, Lz0/q;->q:Lz0/t;

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
    iget-object v0, p0, Lz0/q;->q:Lz0/t;

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

.method public final H(Ljava/lang/Object;LB5/e;)Ljava/util/List;
    .locals 6

    .line 1
    iget-object v0, p0, Lz0/q;->r:Lz0/y;

    .line 2
    .line 3
    iget-object v1, v0, Lz0/y;->q:LB0/L;

    .line 4
    .line 5
    iget-object v2, v0, Lz0/y;->w:Lr/G;

    .line 6
    .line 7
    invoke-virtual {v2, p1}, Lr/G;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    check-cast v2, LB0/L;

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    invoke-virtual {v1}, LB0/L;->o()Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, LR/b;

    .line 20
    .line 21
    iget-object v3, v3, LR/b;->q:LR/e;

    .line 22
    .line 23
    invoke-virtual {v3, v2}, LR/e;->k(Ljava/lang/Object;)I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    iget v4, v0, Lz0/y;->t:I

    .line 28
    .line 29
    if-ge v3, v4, :cond_0

    .line 30
    .line 31
    iget-object p1, v2, LB0/L;->V:LB0/P;

    .line 32
    .line 33
    iget-object p1, p1, LB0/P;->p:LB0/c0;

    .line 34
    .line 35
    invoke-virtual {p1}, LB0/c0;->Y()Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    return-object p1

    .line 40
    :cond_0
    iget-object v2, v0, Lz0/y;->z:Lr/G;

    .line 41
    .line 42
    iget-object v3, v0, Lz0/y;->C:LR/e;

    .line 43
    .line 44
    iget v4, v3, LR/e;->s:I

    .line 45
    .line 46
    iget v5, v0, Lz0/y;->u:I

    .line 47
    .line 48
    if-lt v4, v5, :cond_1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    const-string v4, "Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list."

    .line 52
    .line 53
    invoke-static {v4}, Ly0/a;->a(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    :goto_0
    iget v4, v3, LR/e;->s:I

    .line 57
    .line 58
    iget v5, v0, Lz0/y;->u:I

    .line 59
    .line 60
    if-ne v4, v5, :cond_2

    .line 61
    .line 62
    invoke-virtual {v3, p1}, LR/e;->c(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_2
    iget-object v3, v3, LR/e;->q:[Ljava/lang/Object;

    .line 67
    .line 68
    aget-object v4, v3, v5

    .line 69
    .line 70
    aput-object p1, v3, v5

    .line 71
    .line 72
    :goto_1
    iget v3, v0, Lz0/y;->u:I

    .line 73
    .line 74
    const/4 v4, 0x1

    .line 75
    add-int/2addr v3, v4

    .line 76
    iput v3, v0, Lz0/y;->u:I

    .line 77
    .line 78
    invoke-virtual {v2, p1}, Lr/G;->b(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    if-nez v3, :cond_4

    .line 83
    .line 84
    invoke-virtual {v0, p1, p2}, Lz0/y;->d(Ljava/lang/Object;LB5/e;)Lz0/P;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    iget-object v0, v0, Lz0/y;->B:Lr/G;

    .line 89
    .line 90
    invoke-virtual {v0, p1, p2}, Lr/G;->l(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    iget-object p2, v1, LB0/L;->V:LB0/P;

    .line 94
    .line 95
    iget-object p2, p2, LB0/P;->d:LB0/G;

    .line 96
    .line 97
    sget-object v0, LB0/G;->s:LB0/G;

    .line 98
    .line 99
    if-ne p2, v0, :cond_3

    .line 100
    .line 101
    invoke-virtual {v1, v4}, LB0/L;->P(Z)V

    .line 102
    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_3
    const/4 p2, 0x6

    .line 106
    invoke-static {v1, v4, p2}, LB0/L;->Q(LB0/L;ZI)V

    .line 107
    .line 108
    .line 109
    :cond_4
    :goto_2
    invoke-virtual {v2, p1}, Lr/G;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    check-cast p1, LB0/L;

    .line 114
    .line 115
    if-eqz p1, :cond_6

    .line 116
    .line 117
    iget-object p1, p1, LB0/L;->V:LB0/P;

    .line 118
    .line 119
    iget-object p1, p1, LB0/P;->p:LB0/c0;

    .line 120
    .line 121
    invoke-virtual {p1}, LB0/c0;->Y()Ljava/util/List;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 126
    .line 127
    .line 128
    move-result p2

    .line 129
    const/4 v0, 0x0

    .line 130
    :goto_3
    if-ge v0, p2, :cond_5

    .line 131
    .line 132
    move-object v1, p1

    .line 133
    check-cast v1, LR/b;

    .line 134
    .line 135
    invoke-virtual {v1, v0}, LR/b;->get(I)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    check-cast v1, LB0/c0;

    .line 140
    .line 141
    iget-object v1, v1, LB0/c0;->v:LB0/P;

    .line 142
    .line 143
    iput-boolean v4, v1, LB0/P;->b:Z

    .line 144
    .line 145
    add-int/lit8 v0, v0, 0x1

    .line 146
    .line 147
    goto :goto_3

    .line 148
    :cond_5
    return-object p1

    .line 149
    :cond_6
    sget-object p1, Ln5/s;->q:Ln5/s;

    .line 150
    .line 151
    return-object p1
.end method

.method public final O(IILjava/util/Map;LB5/c;)Lz0/D;
    .locals 1

    .line 1
    iget-object v0, p0, Lz0/q;->q:Lz0/t;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, Lz0/t;->O(IILjava/util/Map;LB5/c;)Lz0/D;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final Q(J)J
    .locals 1

    .line 1
    iget-object v0, p0, Lz0/q;->q:Lz0/t;

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
    iget-object v0, p0, Lz0/q;->q:Lz0/t;

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

.method public final a0(F)J
    .locals 2

    .line 1
    iget-object v0, p0, Lz0/q;->q:Lz0/t;

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
    iget-object v0, p0, Lz0/q;->q:Lz0/t;

    .line 2
    .line 3
    iget v0, v0, Lz0/t;->r:F

    .line 4
    .line 5
    return v0
.end method

.method public final f(IILjava/util/Map;LB5/c;)Lz0/D;
    .locals 1

    .line 1
    iget-object v0, p0, Lz0/q;->q:Lz0/t;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, Lz0/t;->O(IILjava/util/Map;LB5/c;)Lz0/D;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final f0(I)F
    .locals 1

    .line 1
    iget-object v0, p0, Lz0/q;->q:Lz0/t;

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

.method public final getLayoutDirection()LW0/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lz0/q;->q:Lz0/t;

    .line 2
    .line 3
    iget-object v0, v0, Lz0/t;->q:LW0/l;

    .line 4
    .line 5
    return-object v0
.end method

.method public final i0(F)F
    .locals 1

    .line 1
    iget-object v0, p0, Lz0/q;->q:Lz0/t;

    .line 2
    .line 3
    invoke-virtual {v0}, Lz0/t;->b()F

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
    iget-object v0, p0, Lz0/q;->q:Lz0/t;

    .line 2
    .line 3
    iget v0, v0, Lz0/t;->s:F

    .line 4
    .line 5
    return v0
.end method

.method public final r()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lz0/q;->q:Lz0/t;

    .line 2
    .line 3
    invoke-virtual {v0}, Lz0/t;->r()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final s(F)J
    .locals 2

    .line 1
    iget-object v0, p0, Lz0/q;->q:Lz0/t;

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
    iget-object v0, p0, Lz0/q;->q:Lz0/t;

    .line 2
    .line 3
    invoke-virtual {v0}, Lz0/t;->b()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-float/2addr v0, p1

    .line 8
    return v0
.end method
