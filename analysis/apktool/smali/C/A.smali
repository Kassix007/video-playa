.class public final LC/A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/A0;


# static fields
.field public static final w:LZ/m;


# instance fields
.field public final a:LC/a;

.field public b:Z

.field public c:LC/s;

.field public final d:LC/u;

.field public final e:LP/f0;

.field public final f:Ly/i;

.field public g:F

.field public final h:Lp3/z0;

.field public final i:Z

.field public j:LB0/L;

.field public final k:LC/x;

.field public final l:LE/e;

.field public final m:Landroidx/compose/foundation/lazy/layout/b;

.field public final n:LE/k;

.field public final o:LE/K;

.field public final p:Lk3/c;

.field public final q:LE/H;

.field public final r:LP/W;

.field public final s:LP/f0;

.field public final t:LP/f0;

.field public final u:LP/W;

.field public final v:Lk3/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, LC/v;->q:LC/v;

    .line 2
    .line 3
    sget-object v1, LC/p;->s:LC/p;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/measurement/K1;->y(LB5/e;LB5/c;)LZ/m;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, LC/A;->w:LZ/m;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(II)V
    .locals 2

    .line 1
    new-instance v0, LC/a;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, -0x1

    .line 7
    iput v1, v0, LC/a;->a:I

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, LC/A;->a:LC/a;

    .line 13
    .line 14
    new-instance v0, LC/u;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-direct {v0, p1, p2, v1}, LC/u;-><init>(III)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, LC/A;->d:LC/u;

    .line 21
    .line 22
    sget-object p2, LC/D;->a:LC/s;

    .line 23
    .line 24
    sget-object v0, LP/S;->s:LP/S;

    .line 25
    .line 26
    new-instance v1, LP/f0;

    .line 27
    .line 28
    invoke-direct {v1, p2, v0}, LP/f0;-><init>(Ljava/lang/Object;LP/I0;)V

    .line 29
    .line 30
    .line 31
    iput-object v1, p0, LC/A;->e:LP/f0;

    .line 32
    .line 33
    new-instance p2, Ly/i;

    .line 34
    .line 35
    invoke-direct {p2}, Ly/i;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object p2, p0, LC/A;->f:Ly/i;

    .line 39
    .line 40
    new-instance p2, LB0/a;

    .line 41
    .line 42
    const/4 v0, 0x3

    .line 43
    invoke-direct {p2, v0, p0}, LB0/a;-><init>(ILjava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    new-instance v0, Lp3/z0;

    .line 47
    .line 48
    invoke-direct {v0, p2}, Lp3/z0;-><init>(LB5/c;)V

    .line 49
    .line 50
    .line 51
    iput-object v0, p0, LC/A;->h:Lp3/z0;

    .line 52
    .line 53
    const/4 p2, 0x1

    .line 54
    iput-boolean p2, p0, LC/A;->i:Z

    .line 55
    .line 56
    new-instance p2, LC/x;

    .line 57
    .line 58
    const/4 v0, 0x0

    .line 59
    invoke-direct {p2, p0, v0}, LC/x;-><init>(Lw/A0;I)V

    .line 60
    .line 61
    .line 62
    iput-object p2, p0, LC/A;->k:LC/x;

    .line 63
    .line 64
    new-instance p2, LE/e;

    .line 65
    .line 66
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 67
    .line 68
    .line 69
    iput-object p2, p0, LC/A;->l:LE/e;

    .line 70
    .line 71
    new-instance p2, Landroidx/compose/foundation/lazy/layout/b;

    .line 72
    .line 73
    invoke-direct {p2}, Landroidx/compose/foundation/lazy/layout/b;-><init>()V

    .line 74
    .line 75
    .line 76
    iput-object p2, p0, LC/A;->m:Landroidx/compose/foundation/lazy/layout/b;

    .line 77
    .line 78
    new-instance p2, LE/k;

    .line 79
    .line 80
    invoke-direct {p2, v0}, LE/k;-><init>(I)V

    .line 81
    .line 82
    .line 83
    iput-object p2, p0, LC/A;->n:LE/k;

    .line 84
    .line 85
    new-instance p2, LE/K;

    .line 86
    .line 87
    new-instance v0, LC/w;

    .line 88
    .line 89
    invoke-direct {v0, p0, p1}, LC/w;-><init>(LC/A;I)V

    .line 90
    .line 91
    .line 92
    invoke-direct {p2, v0}, LE/K;-><init>(LB5/c;)V

    .line 93
    .line 94
    .line 95
    iput-object p2, p0, LC/A;->o:LE/K;

    .line 96
    .line 97
    new-instance p1, Lk3/c;

    .line 98
    .line 99
    invoke-direct {p1, p0}, Lk3/c;-><init>(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    iput-object p1, p0, LC/A;->p:Lk3/c;

    .line 103
    .line 104
    new-instance p1, LE/H;

    .line 105
    .line 106
    invoke-direct {p1}, LE/H;-><init>()V

    .line 107
    .line 108
    .line 109
    iput-object p1, p0, LC/A;->q:LE/H;

    .line 110
    .line 111
    invoke-static {}, LE/C;->h()LP/W;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    iput-object p1, p0, LC/A;->r:LP/W;

    .line 116
    .line 117
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 118
    .line 119
    invoke-static {p1}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    iput-object p2, p0, LC/A;->s:LP/f0;

    .line 124
    .line 125
    invoke-static {p1}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    iput-object p1, p0, LC/A;->t:LP/f0;

    .line 130
    .line 131
    invoke-static {}, LE/C;->h()LP/W;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    iput-object p1, p0, LC/A;->u:LP/W;

    .line 136
    .line 137
    new-instance p1, Lk3/c;

    .line 138
    .line 139
    const/4 p2, 0x4

    .line 140
    invoke-direct {p1, p2}, Lk3/c;-><init>(I)V

    .line 141
    .line 142
    .line 143
    iput-object p1, p0, LC/A;->v:Lk3/c;

    .line 144
    .line 145
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .line 1
    iget-object v0, p0, LC/A;->t:LP/f0;

    .line 2
    .line 3
    invoke-virtual {v0}, LP/f0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public final b()Z
    .locals 1

    .line 1
    iget-object v0, p0, LC/A;->h:Lp3/z0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lp3/z0;->b()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final c()Z
    .locals 1

    .line 1
    iget-object v0, p0, LC/A;->s:LP/f0;

    .line 2
    .line 3
    invoke-virtual {v0}, LP/f0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public final d(F)F
    .locals 1

    .line 1
    iget-object v0, p0, LC/A;->h:Lp3/z0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lp3/z0;->d(F)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final e(Lv/W;LB5/e;Ls5/c;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p3, LC/y;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, LC/y;

    .line 7
    .line 8
    iget v1, v0, LC/y;->v:I

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
    iput v1, v0, LC/y;->v:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LC/y;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, LC/y;-><init>(LC/A;Ls5/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, LC/y;->t:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, LC/y;->v:I

    .line 28
    .line 29
    const/4 v2, 0x2

    .line 30
    const/4 v3, 0x1

    .line 31
    sget-object v4, Lr5/a;->q:Lr5/a;

    .line 32
    .line 33
    if-eqz v1, :cond_3

    .line 34
    .line 35
    if-eq v1, v3, :cond_2

    .line 36
    .line 37
    if-ne v1, v2, :cond_1

    .line 38
    .line 39
    invoke-static {p3}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_3

    .line 43
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 44
    .line 45
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p1

    .line 51
    :cond_2
    iget-object p1, v0, LC/y;->s:Ls5/i;

    .line 52
    .line 53
    move-object p2, p1

    .line 54
    check-cast p2, LB5/e;

    .line 55
    .line 56
    iget-object p1, v0, LC/y;->r:Lv/W;

    .line 57
    .line 58
    iget-object v1, v0, LC/y;->q:LC/A;

    .line 59
    .line 60
    invoke-static {p3}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_3
    invoke-static {p3}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iput-object p0, v0, LC/y;->q:LC/A;

    .line 68
    .line 69
    iput-object p1, v0, LC/y;->r:Lv/W;

    .line 70
    .line 71
    move-object p3, p2

    .line 72
    check-cast p3, Ls5/i;

    .line 73
    .line 74
    iput-object p3, v0, LC/y;->s:Ls5/i;

    .line 75
    .line 76
    iput v3, v0, LC/y;->v:I

    .line 77
    .line 78
    iget-object p3, p0, LC/A;->l:LE/e;

    .line 79
    .line 80
    invoke-virtual {p3, v0}, LE/e;->f(Ls5/c;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p3

    .line 84
    if-ne p3, v4, :cond_4

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_4
    move-object v1, p0

    .line 88
    :goto_1
    iget-object p3, v1, LC/A;->h:Lp3/z0;

    .line 89
    .line 90
    const/4 v1, 0x0

    .line 91
    iput-object v1, v0, LC/y;->q:LC/A;

    .line 92
    .line 93
    iput-object v1, v0, LC/y;->r:Lv/W;

    .line 94
    .line 95
    iput-object v1, v0, LC/y;->s:Ls5/i;

    .line 96
    .line 97
    iput v2, v0, LC/y;->v:I

    .line 98
    .line 99
    invoke-virtual {p3, p1, p2, v0}, Lp3/z0;->e(Lv/W;LB5/e;Ls5/c;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    if-ne p1, v4, :cond_5

    .line 104
    .line 105
    :goto_2
    return-object v4

    .line 106
    :cond_5
    :goto_3
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 107
    .line 108
    return-object p1
.end method

.method public final f(LC/s;ZZ)V
    .locals 9

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    iget-boolean v0, p0, LC/A;->b:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput-object p1, p0, LC/A;->c:LC/s;

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const/4 v0, 0x1

    .line 11
    if-eqz p2, :cond_1

    .line 12
    .line 13
    iput-boolean v0, p0, LC/A;->b:Z

    .line 14
    .line 15
    :cond_1
    iget-object v1, p1, LC/s;->a:LC/t;

    .line 16
    .line 17
    iget-object v2, p1, LC/s;->k:Ljava/lang/Object;

    .line 18
    .line 19
    iget v3, p1, LC/s;->b:I

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    iget v5, v1, LC/t;->a:I

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_2
    move v5, v4

    .line 28
    :goto_0
    if-nez v5, :cond_4

    .line 29
    .line 30
    if-eqz v3, :cond_3

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_3
    move v5, v4

    .line 34
    goto :goto_2

    .line 35
    :cond_4
    :goto_1
    move v5, v0

    .line 36
    :goto_2
    iget-object v6, p0, LC/A;->t:LP/f0;

    .line 37
    .line 38
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    invoke-virtual {v6, v5}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iget-boolean v5, p1, LC/s;->c:Z

    .line 46
    .line 47
    iget-object v6, p0, LC/A;->s:LP/f0;

    .line 48
    .line 49
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    invoke-virtual {v6, v5}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget v5, p0, LC/A;->g:F

    .line 57
    .line 58
    iget v6, p1, LC/s;->d:F

    .line 59
    .line 60
    sub-float/2addr v5, v6

    .line 61
    iput v5, p0, LC/A;->g:F

    .line 62
    .line 63
    iget-object v5, p0, LC/A;->e:LP/f0;

    .line 64
    .line 65
    invoke-virtual {v5, p1}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    const-string v5, "scrollOffset should be non-negative"

    .line 69
    .line 70
    const/4 v6, 0x0

    .line 71
    iget-object v7, p0, LC/A;->d:LC/u;

    .line 72
    .line 73
    if-eqz p3, :cond_7

    .line 74
    .line 75
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    int-to-float p3, v3

    .line 79
    cmpl-float p3, p3, v6

    .line 80
    .line 81
    if-ltz p3, :cond_5

    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_5
    move v0, v4

    .line 85
    :goto_3
    if-nez v0, :cond_6

    .line 86
    .line 87
    invoke-static {v5}, Lz/a;->c(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    :cond_6
    iget-object p3, v7, LC/u;->c:LP/c0;

    .line 91
    .line 92
    invoke-virtual {p3, v3}, LP/c0;->f(I)V

    .line 93
    .line 94
    .line 95
    goto/16 :goto_7

    .line 96
    .line 97
    :cond_7
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    const/4 p3, 0x0

    .line 101
    if-eqz v1, :cond_8

    .line 102
    .line 103
    iget-object v8, v1, LC/t;->g:Ljava/lang/Object;

    .line 104
    .line 105
    goto :goto_4

    .line 106
    :cond_8
    move-object v8, p3

    .line 107
    :goto_4
    iput-object v8, v7, LC/u;->e:Ljava/lang/Object;

    .line 108
    .line 109
    iget-boolean v8, v7, LC/u;->d:Z

    .line 110
    .line 111
    if-nez v8, :cond_9

    .line 112
    .line 113
    iget v8, p1, LC/s;->n:I

    .line 114
    .line 115
    if-lez v8, :cond_d

    .line 116
    .line 117
    :cond_9
    iput-boolean v0, v7, LC/u;->d:Z

    .line 118
    .line 119
    int-to-float v8, v3

    .line 120
    cmpl-float v6, v8, v6

    .line 121
    .line 122
    if-ltz v6, :cond_a

    .line 123
    .line 124
    move v6, v0

    .line 125
    goto :goto_5

    .line 126
    :cond_a
    move v6, v4

    .line 127
    :goto_5
    if-nez v6, :cond_b

    .line 128
    .line 129
    invoke-static {v5}, Lz/a;->c(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    :cond_b
    if-eqz v1, :cond_c

    .line 133
    .line 134
    iget v4, v1, LC/t;->a:I

    .line 135
    .line 136
    :cond_c
    invoke-virtual {v7, v4, v3}, LC/u;->a(II)V

    .line 137
    .line 138
    .line 139
    :cond_d
    iget-boolean v1, p0, LC/A;->i:Z

    .line 140
    .line 141
    if-eqz v1, :cond_10

    .line 142
    .line 143
    iget-object v1, p0, LC/A;->a:LC/a;

    .line 144
    .line 145
    iget v3, v1, LC/a;->a:I

    .line 146
    .line 147
    const/4 v4, -0x1

    .line 148
    if-eq v3, v4, :cond_10

    .line 149
    .line 150
    move-object v3, v2

    .line 151
    check-cast v3, Ljava/util/Collection;

    .line 152
    .line 153
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 154
    .line 155
    .line 156
    move-result v3

    .line 157
    if-nez v3, :cond_10

    .line 158
    .line 159
    iget-boolean v3, v1, LC/a;->b:Z

    .line 160
    .line 161
    if-eqz v3, :cond_e

    .line 162
    .line 163
    invoke-static {v2}, Ln5/l;->r0(Ljava/util/List;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    check-cast v2, LC/t;

    .line 168
    .line 169
    iget v2, v2, LC/t;->a:I

    .line 170
    .line 171
    add-int/2addr v2, v0

    .line 172
    goto :goto_6

    .line 173
    :cond_e
    invoke-static {v2}, Ln5/l;->l0(Ljava/util/List;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    check-cast v2, LC/t;

    .line 178
    .line 179
    iget v2, v2, LC/t;->a:I

    .line 180
    .line 181
    sub-int/2addr v2, v0

    .line 182
    :goto_6
    iget v0, v1, LC/a;->a:I

    .line 183
    .line 184
    if-eq v0, v2, :cond_10

    .line 185
    .line 186
    iput v4, v1, LC/a;->a:I

    .line 187
    .line 188
    iget-object v0, v1, LC/a;->c:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v0, LE/J;

    .line 191
    .line 192
    if-eqz v0, :cond_f

    .line 193
    .line 194
    invoke-interface {v0}, LE/J;->cancel()V

    .line 195
    .line 196
    .line 197
    :cond_f
    iput-object p3, v1, LC/a;->c:Ljava/lang/Object;

    .line 198
    .line 199
    :cond_10
    :goto_7
    if-eqz p2, :cond_11

    .line 200
    .line 201
    iget p2, p1, LC/s;->f:F

    .line 202
    .line 203
    iget-object p3, p1, LC/s;->i:LW0/c;

    .line 204
    .line 205
    iget-object p1, p1, LC/s;->h:LM5/w;

    .line 206
    .line 207
    iget-object v0, p0, LC/A;->v:Lk3/c;

    .line 208
    .line 209
    invoke-virtual {v0, p2, p3, p1}, Lk3/c;->r(FLW0/c;LM5/w;)V

    .line 210
    .line 211
    .line 212
    :cond_11
    return-void
.end method

.method public final g()LC/s;
    .locals 1

    .line 1
    iget-object v0, p0, LC/A;->e:LP/f0;

    .line 2
    .line 3
    invoke-virtual {v0}, LP/f0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LC/s;

    .line 8
    .line 9
    return-object v0
.end method

.method public final h(FLC/s;)V
    .locals 10

    .line 1
    iget-boolean v0, p0, LC/A;->i:Z

    .line 2
    .line 3
    if-eqz v0, :cond_6

    .line 4
    .line 5
    iget-object v0, p2, LC/s;->k:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v1, p2, LC/s;->k:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ljava/util/Collection;

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_6

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    cmpg-float v0, p1, v0

    .line 19
    .line 20
    const/4 v2, 0x1

    .line 21
    if-gez v0, :cond_0

    .line 22
    .line 23
    move v0, v2

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v0, 0x0

    .line 26
    :goto_0
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-static {v1}, Ln5/l;->r0(Ljava/util/List;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    check-cast v3, LC/t;

    .line 33
    .line 34
    iget v3, v3, LC/t;->a:I

    .line 35
    .line 36
    add-int/2addr v3, v2

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    invoke-static {v1}, Ln5/l;->l0(Ljava/util/List;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    check-cast v3, LC/t;

    .line 43
    .line 44
    iget v3, v3, LC/t;->a:I

    .line 45
    .line 46
    sub-int/2addr v3, v2

    .line 47
    :goto_1
    if-ltz v3, :cond_6

    .line 48
    .line 49
    iget v2, p2, LC/s;->n:I

    .line 50
    .line 51
    if-ge v3, v2, :cond_6

    .line 52
    .line 53
    iget-object v2, p0, LC/A;->a:LC/a;

    .line 54
    .line 55
    iget v4, v2, LC/a;->a:I

    .line 56
    .line 57
    if-eq v3, v4, :cond_4

    .line 58
    .line 59
    iget-boolean v4, v2, LC/a;->b:Z

    .line 60
    .line 61
    if-eq v4, v0, :cond_2

    .line 62
    .line 63
    iget-object v4, v2, LC/a;->c:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v4, LE/J;

    .line 66
    .line 67
    if-eqz v4, :cond_2

    .line 68
    .line 69
    invoke-interface {v4}, LE/J;->cancel()V

    .line 70
    .line 71
    .line 72
    :cond_2
    iput-boolean v0, v2, LC/a;->b:Z

    .line 73
    .line 74
    iput v3, v2, LC/a;->a:I

    .line 75
    .line 76
    iget-object v4, p0, LC/A;->p:Lk3/c;

    .line 77
    .line 78
    iget-object v4, v4, Lk3/c;->q:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v4, LC/A;

    .line 81
    .line 82
    invoke-static {}, La0/r;->c()La0/h;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    if-eqz v5, :cond_3

    .line 87
    .line 88
    invoke-virtual {v5}, La0/h;->e()LB5/c;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    goto :goto_2

    .line 93
    :cond_3
    const/4 v6, 0x0

    .line 94
    :goto_2
    invoke-static {v5}, La0/r;->d(La0/h;)La0/h;

    .line 95
    .line 96
    .line 97
    move-result-object v7

    .line 98
    :try_start_0
    iget-object v8, v4, LC/A;->e:LP/f0;

    .line 99
    .line 100
    invoke-virtual {v8}, LP/f0;->getValue()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v8

    .line 104
    check-cast v8, LC/s;

    .line 105
    .line 106
    iget-wide v8, v8, LC/s;->j:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 107
    .line 108
    invoke-static {v5, v7, v6}, La0/r;->f(La0/h;La0/h;LB5/c;)V

    .line 109
    .line 110
    .line 111
    iget-object v4, v4, LC/A;->o:LE/K;

    .line 112
    .line 113
    invoke-virtual {v4, v3, v8, v9}, LE/K;->a(IJ)LE/J;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    iput-object v3, v2, LC/a;->c:Ljava/lang/Object;

    .line 118
    .line 119
    goto :goto_3

    .line 120
    :catchall_0
    move-exception p1

    .line 121
    invoke-static {v5, v7, v6}, La0/r;->f(La0/h;La0/h;LB5/c;)V

    .line 122
    .line 123
    .line 124
    throw p1

    .line 125
    :cond_4
    :goto_3
    if-eqz v0, :cond_5

    .line 126
    .line 127
    invoke-static {v1}, Ln5/l;->r0(Ljava/util/List;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    check-cast v0, LC/t;

    .line 132
    .line 133
    iget v1, p2, LC/s;->q:I

    .line 134
    .line 135
    iget v3, v0, LC/t;->j:I

    .line 136
    .line 137
    iget v0, v0, LC/t;->k:I

    .line 138
    .line 139
    add-int/2addr v3, v0

    .line 140
    add-int/2addr v3, v1

    .line 141
    iget p2, p2, LC/s;->m:I

    .line 142
    .line 143
    sub-int/2addr v3, p2

    .line 144
    int-to-float p2, v3

    .line 145
    neg-float p1, p1

    .line 146
    cmpg-float p1, p2, p1

    .line 147
    .line 148
    if-gez p1, :cond_6

    .line 149
    .line 150
    iget-object p1, v2, LC/a;->c:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast p1, LE/J;

    .line 153
    .line 154
    if-eqz p1, :cond_6

    .line 155
    .line 156
    invoke-interface {p1}, LE/J;->a()V

    .line 157
    .line 158
    .line 159
    return-void

    .line 160
    :cond_5
    invoke-static {v1}, Ln5/l;->l0(Ljava/util/List;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    check-cast v0, LC/t;

    .line 165
    .line 166
    iget p2, p2, LC/s;->l:I

    .line 167
    .line 168
    iget v0, v0, LC/t;->j:I

    .line 169
    .line 170
    sub-int/2addr p2, v0

    .line 171
    int-to-float p2, p2

    .line 172
    cmpg-float p1, p2, p1

    .line 173
    .line 174
    if-gez p1, :cond_6

    .line 175
    .line 176
    iget-object p1, v2, LC/a;->c:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast p1, LE/J;

    .line 179
    .line 180
    if-eqz p1, :cond_6

    .line 181
    .line 182
    invoke-interface {p1}, LE/J;->a()V

    .line 183
    .line 184
    .line 185
    :cond_6
    return-void
.end method
