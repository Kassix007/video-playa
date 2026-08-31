.class public final LD/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/A0;


# static fields
.field public static final w:LZ/m;


# instance fields
.field public final a:LC/a;

.field public b:Z

.field public c:LD/o;

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

.field public final p:Lk3/d;

.field public final q:LE/H;

.field public final r:LP/W;

.field public final s:LP/W;

.field public final t:LP/f0;

.field public final u:LP/f0;

.field public final v:Lk3/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, LD/g;->s:LD/g;

    .line 2
    .line 3
    sget-object v1, LD/n;->s:LD/n;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/measurement/K1;->y(LB5/e;LB5/c;)LZ/m;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, LD/y;->w:LZ/m;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(II)V
    .locals 3

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
    new-instance v1, LR/e;

    .line 10
    .line 11
    const/16 v2, 0x10

    .line 12
    .line 13
    new-array v2, v2, [LE/J;

    .line 14
    .line 15
    invoke-direct {v1, v2}, LR/e;-><init>([Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iput-object v1, v0, LC/a;->c:Ljava/lang/Object;

    .line 19
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, LD/y;->a:LC/a;

    .line 24
    .line 25
    new-instance v0, LC/u;

    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    invoke-direct {v0, p1, p2, v1}, LC/u;-><init>(III)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, LD/y;->d:LC/u;

    .line 32
    .line 33
    sget-object p2, LD/A;->a:LD/o;

    .line 34
    .line 35
    sget-object v0, LP/S;->s:LP/S;

    .line 36
    .line 37
    new-instance v1, LP/f0;

    .line 38
    .line 39
    invoke-direct {v1, p2, v0}, LP/f0;-><init>(Ljava/lang/Object;LP/I0;)V

    .line 40
    .line 41
    .line 42
    iput-object v1, p0, LD/y;->e:LP/f0;

    .line 43
    .line 44
    new-instance p2, Ly/i;

    .line 45
    .line 46
    invoke-direct {p2}, Ly/i;-><init>()V

    .line 47
    .line 48
    .line 49
    iput-object p2, p0, LD/y;->f:Ly/i;

    .line 50
    .line 51
    new-instance p2, LB0/a;

    .line 52
    .line 53
    const/16 v0, 0x8

    .line 54
    .line 55
    invoke-direct {p2, v0, p0}, LB0/a;-><init>(ILjava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    new-instance v0, Lp3/z0;

    .line 59
    .line 60
    invoke-direct {v0, p2}, Lp3/z0;-><init>(LB5/c;)V

    .line 61
    .line 62
    .line 63
    iput-object v0, p0, LD/y;->h:Lp3/z0;

    .line 64
    .line 65
    const/4 p2, 0x1

    .line 66
    iput-boolean p2, p0, LD/y;->i:Z

    .line 67
    .line 68
    new-instance p2, LC/x;

    .line 69
    .line 70
    const/4 v0, 0x1

    .line 71
    invoke-direct {p2, p0, v0}, LC/x;-><init>(Lw/A0;I)V

    .line 72
    .line 73
    .line 74
    iput-object p2, p0, LD/y;->k:LC/x;

    .line 75
    .line 76
    new-instance p2, LE/e;

    .line 77
    .line 78
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 79
    .line 80
    .line 81
    iput-object p2, p0, LD/y;->l:LE/e;

    .line 82
    .line 83
    new-instance p2, Landroidx/compose/foundation/lazy/layout/b;

    .line 84
    .line 85
    invoke-direct {p2}, Landroidx/compose/foundation/lazy/layout/b;-><init>()V

    .line 86
    .line 87
    .line 88
    iput-object p2, p0, LD/y;->m:Landroidx/compose/foundation/lazy/layout/b;

    .line 89
    .line 90
    new-instance p2, LE/k;

    .line 91
    .line 92
    const/4 v0, 0x0

    .line 93
    invoke-direct {p2, v0}, LE/k;-><init>(I)V

    .line 94
    .line 95
    .line 96
    iput-object p2, p0, LD/y;->n:LE/k;

    .line 97
    .line 98
    new-instance p2, LE/K;

    .line 99
    .line 100
    new-instance v0, LD/v;

    .line 101
    .line 102
    const/4 v1, 0x0

    .line 103
    invoke-direct {v0, p1, v1, p0}, LD/v;-><init>(IILjava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    invoke-direct {p2, v0}, LE/K;-><init>(LB5/c;)V

    .line 107
    .line 108
    .line 109
    iput-object p2, p0, LD/y;->o:LE/K;

    .line 110
    .line 111
    new-instance p1, Lk3/d;

    .line 112
    .line 113
    const/4 p2, 0x3

    .line 114
    invoke-direct {p1, p2, p0}, Lk3/d;-><init>(ILjava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    iput-object p1, p0, LD/y;->p:Lk3/d;

    .line 118
    .line 119
    new-instance p1, LE/H;

    .line 120
    .line 121
    invoke-direct {p1}, LE/H;-><init>()V

    .line 122
    .line 123
    .line 124
    iput-object p1, p0, LD/y;->q:LE/H;

    .line 125
    .line 126
    invoke-static {}, LE/C;->h()LP/W;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    iput-object p1, p0, LD/y;->r:LP/W;

    .line 131
    .line 132
    invoke-static {}, LE/C;->h()LP/W;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    iput-object p1, p0, LD/y;->s:LP/W;

    .line 137
    .line 138
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 139
    .line 140
    invoke-static {p1}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    .line 141
    .line 142
    .line 143
    move-result-object p2

    .line 144
    iput-object p2, p0, LD/y;->t:LP/f0;

    .line 145
    .line 146
    invoke-static {p1}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    iput-object p1, p0, LD/y;->u:LP/f0;

    .line 151
    .line 152
    new-instance p1, Lk3/c;

    .line 153
    .line 154
    const/4 p2, 0x4

    .line 155
    invoke-direct {p1, p2}, Lk3/c;-><init>(I)V

    .line 156
    .line 157
    .line 158
    iput-object p1, p0, LD/y;->v:Lk3/c;

    .line 159
    .line 160
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .line 1
    iget-object v0, p0, LD/y;->u:LP/f0;

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
    iget-object v0, p0, LD/y;->h:Lp3/z0;

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
    iget-object v0, p0, LD/y;->t:LP/f0;

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
    iget-object v0, p0, LD/y;->h:Lp3/z0;

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
    instance-of v0, p3, LD/w;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, LD/w;

    .line 7
    .line 8
    iget v1, v0, LD/w;->v:I

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
    iput v1, v0, LD/w;->v:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LD/w;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, LD/w;-><init>(LD/y;Ls5/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, LD/w;->t:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, LD/w;->v:I

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
    iget-object p1, v0, LD/w;->s:Ls5/i;

    .line 52
    .line 53
    move-object p2, p1

    .line 54
    check-cast p2, LB5/e;

    .line 55
    .line 56
    iget-object p1, v0, LD/w;->r:Lv/W;

    .line 57
    .line 58
    iget-object v1, v0, LD/w;->q:LD/y;

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
    iput-object p0, v0, LD/w;->q:LD/y;

    .line 68
    .line 69
    iput-object p1, v0, LD/w;->r:Lv/W;

    .line 70
    .line 71
    move-object p3, p2

    .line 72
    check-cast p3, Ls5/i;

    .line 73
    .line 74
    iput-object p3, v0, LD/w;->s:Ls5/i;

    .line 75
    .line 76
    iput v3, v0, LD/w;->v:I

    .line 77
    .line 78
    iget-object p3, p0, LD/y;->l:LE/e;

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
    iget-object p3, v1, LD/y;->h:Lp3/z0;

    .line 89
    .line 90
    const/4 v1, 0x0

    .line 91
    iput-object v1, v0, LD/w;->q:LD/y;

    .line 92
    .line 93
    iput-object v1, v0, LD/w;->r:Lv/W;

    .line 94
    .line 95
    iput-object v1, v0, LD/w;->s:Ls5/i;

    .line 96
    .line 97
    iput v2, v0, LD/w;->v:I

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

.method public final f(LD/o;ZZ)V
    .locals 10

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    iget-boolean v0, p0, LD/y;->b:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput-object p1, p0, LD/y;->c:LD/o;

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
    iput-boolean v0, p0, LD/y;->b:Z

    .line 14
    .line 15
    :cond_1
    iget v1, p0, LD/y;->g:F

    .line 16
    .line 17
    iget v2, p1, LD/o;->d:F

    .line 18
    .line 19
    iget-object v3, p1, LD/o;->p:Lw/d0;

    .line 20
    .line 21
    iget-object v4, p1, LD/o;->l:Ljava/lang/Object;

    .line 22
    .line 23
    iget v5, p1, LD/o;->b:I

    .line 24
    .line 25
    iget-object v6, p1, LD/o;->a:LD/q;

    .line 26
    .line 27
    sub-float/2addr v1, v2

    .line 28
    iput v1, p0, LD/y;->g:F

    .line 29
    .line 30
    iget-object v1, p0, LD/y;->e:LP/f0;

    .line 31
    .line 32
    invoke-virtual {v1, p1}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    if-eqz v6, :cond_2

    .line 37
    .line 38
    iget v2, v6, LD/q;->a:I

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    move v2, v1

    .line 42
    :goto_0
    if-nez v2, :cond_4

    .line 43
    .line 44
    if-eqz v5, :cond_3

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_3
    move v2, v1

    .line 48
    goto :goto_2

    .line 49
    :cond_4
    :goto_1
    move v2, v0

    .line 50
    :goto_2
    iget-object v7, p0, LD/y;->u:LP/f0;

    .line 51
    .line 52
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v7, v2}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    iget-boolean v2, p1, LD/o;->c:Z

    .line 60
    .line 61
    iget-object v7, p0, LD/y;->t:LP/f0;

    .line 62
    .line 63
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-virtual {v7, v2}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    const/4 v2, 0x0

    .line 71
    iget-object v7, p0, LD/y;->d:LC/u;

    .line 72
    .line 73
    if-eqz p3, :cond_7

    .line 74
    .line 75
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    int-to-float p3, v5

    .line 79
    cmpl-float p3, p3, v2

    .line 80
    .line 81
    if-ltz p3, :cond_5

    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_5
    move v0, v1

    .line 85
    :goto_3
    if-nez v0, :cond_6

    .line 86
    .line 87
    const-string p3, "scrollOffset should be non-negative"

    .line 88
    .line 89
    invoke-static {p3}, Lz/a;->c(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    :cond_6
    iget-object p3, v7, LC/u;->c:LP/c0;

    .line 93
    .line 94
    invoke-virtual {p3, v5}, LP/c0;->f(I)V

    .line 95
    .line 96
    .line 97
    goto/16 :goto_d

    .line 98
    .line 99
    :cond_7
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    const/4 p3, 0x0

    .line 103
    if-eqz v6, :cond_9

    .line 104
    .line 105
    iget-object v8, v6, LD/q;->b:[LD/p;

    .line 106
    .line 107
    array-length v9, v8

    .line 108
    if-nez v9, :cond_8

    .line 109
    .line 110
    move-object v8, p3

    .line 111
    goto :goto_4

    .line 112
    :cond_8
    aget-object v8, v8, v1

    .line 113
    .line 114
    :goto_4
    if-eqz v8, :cond_9

    .line 115
    .line 116
    iget-object v8, v8, LD/p;->b:Ljava/lang/Object;

    .line 117
    .line 118
    goto :goto_5

    .line 119
    :cond_9
    move-object v8, p3

    .line 120
    :goto_5
    iput-object v8, v7, LC/u;->e:Ljava/lang/Object;

    .line 121
    .line 122
    iget-boolean v8, v7, LC/u;->d:Z

    .line 123
    .line 124
    if-nez v8, :cond_a

    .line 125
    .line 126
    iget v8, p1, LD/o;->o:I

    .line 127
    .line 128
    if-lez v8, :cond_f

    .line 129
    .line 130
    :cond_a
    iput-boolean v0, v7, LC/u;->d:Z

    .line 131
    .line 132
    int-to-float v8, v5

    .line 133
    cmpl-float v2, v8, v2

    .line 134
    .line 135
    if-ltz v2, :cond_b

    .line 136
    .line 137
    move v2, v0

    .line 138
    goto :goto_6

    .line 139
    :cond_b
    move v2, v1

    .line 140
    :goto_6
    if-nez v2, :cond_c

    .line 141
    .line 142
    new-instance v2, Ljava/lang/StringBuilder;

    .line 143
    .line 144
    const-string v8, "scrollOffset should be non-negative ("

    .line 145
    .line 146
    invoke-direct {v2, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    const/16 v8, 0x29

    .line 153
    .line 154
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    invoke-static {v2}, Lz/a;->c(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    :cond_c
    if-eqz v6, :cond_e

    .line 165
    .line 166
    iget-object v2, v6, LD/q;->b:[LD/p;

    .line 167
    .line 168
    array-length v6, v2

    .line 169
    if-nez v6, :cond_d

    .line 170
    .line 171
    goto :goto_7

    .line 172
    :cond_d
    aget-object p3, v2, v1

    .line 173
    .line 174
    :goto_7
    if-eqz p3, :cond_e

    .line 175
    .line 176
    iget p3, p3, LD/p;->a:I

    .line 177
    .line 178
    goto :goto_8

    .line 179
    :cond_e
    move p3, v1

    .line 180
    :goto_8
    invoke-virtual {v7, p3, v5}, LC/u;->a(II)V

    .line 181
    .line 182
    .line 183
    :cond_f
    iget-boolean p3, p0, LD/y;->i:Z

    .line 184
    .line 185
    if-eqz p3, :cond_14

    .line 186
    .line 187
    iget-object p3, p0, LD/y;->a:LC/a;

    .line 188
    .line 189
    iget-object v2, p3, LC/a;->c:Ljava/lang/Object;

    .line 190
    .line 191
    check-cast v2, LR/e;

    .line 192
    .line 193
    iget v5, p3, LC/a;->a:I

    .line 194
    .line 195
    const/4 v6, -0x1

    .line 196
    if-eq v5, v6, :cond_14

    .line 197
    .line 198
    move-object v5, v4

    .line 199
    check-cast v5, Ljava/util/Collection;

    .line 200
    .line 201
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 202
    .line 203
    .line 204
    move-result v5

    .line 205
    if-nez v5, :cond_14

    .line 206
    .line 207
    iget-boolean v5, p3, LC/a;->b:Z

    .line 208
    .line 209
    sget-object v7, Lw/d0;->q:Lw/d0;

    .line 210
    .line 211
    if-eqz v5, :cond_11

    .line 212
    .line 213
    invoke-static {v4}, Ln5/l;->r0(Ljava/util/List;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v4

    .line 217
    check-cast v4, LD/p;

    .line 218
    .line 219
    if-ne v3, v7, :cond_10

    .line 220
    .line 221
    iget v3, v4, LD/p;->p:I

    .line 222
    .line 223
    goto :goto_9

    .line 224
    :cond_10
    iget v3, v4, LD/p;->q:I

    .line 225
    .line 226
    :goto_9
    add-int/2addr v3, v0

    .line 227
    goto :goto_b

    .line 228
    :cond_11
    invoke-static {v4}, Ln5/l;->l0(Ljava/util/List;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v4

    .line 232
    check-cast v4, LD/p;

    .line 233
    .line 234
    if-ne v3, v7, :cond_12

    .line 235
    .line 236
    iget v3, v4, LD/p;->p:I

    .line 237
    .line 238
    goto :goto_a

    .line 239
    :cond_12
    iget v3, v4, LD/p;->q:I

    .line 240
    .line 241
    :goto_a
    sub-int/2addr v3, v0

    .line 242
    :goto_b
    iget v0, p3, LC/a;->a:I

    .line 243
    .line 244
    if-eq v0, v3, :cond_14

    .line 245
    .line 246
    iput v6, p3, LC/a;->a:I

    .line 247
    .line 248
    iget-object p3, v2, LR/e;->q:[Ljava/lang/Object;

    .line 249
    .line 250
    iget v0, v2, LR/e;->s:I

    .line 251
    .line 252
    :goto_c
    if-ge v1, v0, :cond_13

    .line 253
    .line 254
    aget-object v3, p3, v1

    .line 255
    .line 256
    check-cast v3, LE/J;

    .line 257
    .line 258
    invoke-interface {v3}, LE/J;->cancel()V

    .line 259
    .line 260
    .line 261
    add-int/lit8 v1, v1, 0x1

    .line 262
    .line 263
    goto :goto_c

    .line 264
    :cond_13
    invoke-virtual {v2}, LR/e;->i()V

    .line 265
    .line 266
    .line 267
    :cond_14
    :goto_d
    if-eqz p2, :cond_15

    .line 268
    .line 269
    iget p2, p1, LD/o;->f:F

    .line 270
    .line 271
    iget-object p3, p1, LD/o;->i:LW0/c;

    .line 272
    .line 273
    iget-object p1, p1, LD/o;->h:LM5/w;

    .line 274
    .line 275
    iget-object v0, p0, LD/y;->v:Lk3/c;

    .line 276
    .line 277
    invoke-virtual {v0, p2, p3, p1}, Lk3/c;->r(FLW0/c;LM5/w;)V

    .line 278
    .line 279
    .line 280
    :cond_15
    return-void
.end method

.method public final g()LD/o;
    .locals 1

    .line 1
    iget-object v0, p0, LD/y;->e:LP/f0;

    .line 2
    .line 3
    invoke-virtual {v0}, LP/f0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LD/o;

    .line 8
    .line 9
    return-object v0
.end method

.method public final h(FLD/o;)V
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-boolean v3, v1, LD/y;->i:Z

    .line 8
    .line 9
    if-eqz v3, :cond_b

    .line 10
    .line 11
    iget-object v3, v1, LD/y;->a:LC/a;

    .line 12
    .line 13
    iget-object v4, v3, LC/a;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v4, LR/e;

    .line 16
    .line 17
    iget-object v5, v2, LD/o;->l:Ljava/lang/Object;

    .line 18
    .line 19
    iget-object v6, v2, LD/o;->p:Lw/d0;

    .line 20
    .line 21
    iget-object v7, v2, LD/o;->l:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v5, Ljava/util/Collection;

    .line 24
    .line 25
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    if-nez v5, :cond_b

    .line 30
    .line 31
    const/4 v5, 0x0

    .line 32
    cmpg-float v5, v0, v5

    .line 33
    .line 34
    const/4 v9, 0x1

    .line 35
    if-gez v5, :cond_0

    .line 36
    .line 37
    move v5, v9

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 v5, 0x0

    .line 40
    :goto_0
    sget-object v10, Lw/d0;->q:Lw/d0;

    .line 41
    .line 42
    if-eqz v5, :cond_2

    .line 43
    .line 44
    invoke-static {v7}, Ln5/l;->r0(Ljava/util/List;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v11

    .line 48
    check-cast v11, LD/p;

    .line 49
    .line 50
    if-ne v6, v10, :cond_1

    .line 51
    .line 52
    iget v11, v11, LD/p;->p:I

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    iget v11, v11, LD/p;->q:I

    .line 56
    .line 57
    :goto_1
    add-int/2addr v11, v9

    .line 58
    invoke-static {v7}, Ln5/l;->r0(Ljava/util/List;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v12

    .line 62
    check-cast v12, LD/p;

    .line 63
    .line 64
    iget v12, v12, LD/p;->a:I

    .line 65
    .line 66
    add-int/2addr v12, v9

    .line 67
    goto :goto_3

    .line 68
    :cond_2
    invoke-static {v7}, Ln5/l;->l0(Ljava/util/List;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v11

    .line 72
    check-cast v11, LD/p;

    .line 73
    .line 74
    if-ne v6, v10, :cond_3

    .line 75
    .line 76
    iget v11, v11, LD/p;->p:I

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_3
    iget v11, v11, LD/p;->q:I

    .line 80
    .line 81
    :goto_2
    add-int/lit8 v11, v11, -0x1

    .line 82
    .line 83
    invoke-static {v7}, Ln5/l;->l0(Ljava/util/List;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v12

    .line 87
    check-cast v12, LD/p;

    .line 88
    .line 89
    iget v12, v12, LD/p;->a:I

    .line 90
    .line 91
    sub-int/2addr v12, v9

    .line 92
    :goto_3
    if-ltz v12, :cond_b

    .line 93
    .line 94
    iget v9, v2, LD/o;->o:I

    .line 95
    .line 96
    if-ge v12, v9, :cond_b

    .line 97
    .line 98
    iget v9, v3, LC/a;->a:I

    .line 99
    .line 100
    if-eq v11, v9, :cond_8

    .line 101
    .line 102
    if-ltz v11, :cond_8

    .line 103
    .line 104
    iget-boolean v9, v3, LC/a;->b:Z

    .line 105
    .line 106
    if-eq v9, v5, :cond_4

    .line 107
    .line 108
    iget-object v9, v4, LR/e;->q:[Ljava/lang/Object;

    .line 109
    .line 110
    iget v12, v4, LR/e;->s:I

    .line 111
    .line 112
    const/4 v13, 0x0

    .line 113
    :goto_4
    if-ge v13, v12, :cond_4

    .line 114
    .line 115
    aget-object v14, v9, v13

    .line 116
    .line 117
    check-cast v14, LE/J;

    .line 118
    .line 119
    invoke-interface {v14}, LE/J;->cancel()V

    .line 120
    .line 121
    .line 122
    add-int/lit8 v13, v13, 0x1

    .line 123
    .line 124
    goto :goto_4

    .line 125
    :cond_4
    iput-boolean v5, v3, LC/a;->b:Z

    .line 126
    .line 127
    iput v11, v3, LC/a;->a:I

    .line 128
    .line 129
    invoke-virtual {v4}, LR/e;->i()V

    .line 130
    .line 131
    .line 132
    iget-object v3, v1, LD/y;->p:Lk3/d;

    .line 133
    .line 134
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    new-instance v9, Ljava/util/ArrayList;

    .line 138
    .line 139
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 140
    .line 141
    .line 142
    iget-object v3, v3, Lk3/d;->r:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v3, LD/y;

    .line 145
    .line 146
    invoke-static {}, La0/r;->c()La0/h;

    .line 147
    .line 148
    .line 149
    move-result-object v12

    .line 150
    if-eqz v12, :cond_5

    .line 151
    .line 152
    invoke-virtual {v12}, La0/h;->e()LB5/c;

    .line 153
    .line 154
    .line 155
    move-result-object v13

    .line 156
    goto :goto_5

    .line 157
    :cond_5
    const/4 v13, 0x0

    .line 158
    :goto_5
    invoke-static {v12}, La0/r;->d(La0/h;)La0/h;

    .line 159
    .line 160
    .line 161
    move-result-object v14

    .line 162
    :try_start_0
    iget-boolean v15, v3, LD/y;->b:Z

    .line 163
    .line 164
    if-eqz v15, :cond_6

    .line 165
    .line 166
    iget-object v15, v3, LD/y;->c:LD/o;

    .line 167
    .line 168
    goto :goto_6

    .line 169
    :catchall_0
    move-exception v0

    .line 170
    goto :goto_8

    .line 171
    :cond_6
    iget-object v15, v3, LD/y;->e:LP/f0;

    .line 172
    .line 173
    invoke-virtual {v15}, LP/f0;->getValue()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v15

    .line 177
    check-cast v15, LD/o;

    .line 178
    .line 179
    :goto_6
    if-eqz v15, :cond_7

    .line 180
    .line 181
    iget-object v15, v15, LD/o;->k:Lkotlin/jvm/internal/n;

    .line 182
    .line 183
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 184
    .line 185
    .line 186
    move-result-object v11

    .line 187
    invoke-interface {v15, v11}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v11

    .line 191
    check-cast v11, Ljava/util/List;

    .line 192
    .line 193
    move-object v15, v11

    .line 194
    check-cast v15, Ljava/util/Collection;

    .line 195
    .line 196
    invoke-interface {v15}, Ljava/util/Collection;->size()I

    .line 197
    .line 198
    .line 199
    move-result v15

    .line 200
    const/4 v8, 0x0

    .line 201
    :goto_7
    if-ge v8, v15, :cond_7

    .line 202
    .line 203
    invoke-interface {v11, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v16

    .line 207
    move-object/from16 v1, v16

    .line 208
    .line 209
    check-cast v1, Lm5/j;

    .line 210
    .line 211
    move/from16 v16, v5

    .line 212
    .line 213
    iget-object v5, v3, LD/y;->o:LE/K;

    .line 214
    .line 215
    move-object/from16 v17, v3

    .line 216
    .line 217
    iget-object v3, v1, Lm5/j;->q:Ljava/lang/Object;

    .line 218
    .line 219
    check-cast v3, Ljava/lang/Number;

    .line 220
    .line 221
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 222
    .line 223
    .line 224
    move-result v3

    .line 225
    iget-object v1, v1, Lm5/j;->r:Ljava/lang/Object;

    .line 226
    .line 227
    check-cast v1, LW0/a;

    .line 228
    .line 229
    move-object/from16 v18, v7

    .line 230
    .line 231
    move/from16 v19, v8

    .line 232
    .line 233
    iget-wide v7, v1, LW0/a;->a:J

    .line 234
    .line 235
    invoke-virtual {v5, v3, v7, v8}, LE/K;->a(IJ)LE/J;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    invoke-virtual {v9, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 240
    .line 241
    .line 242
    add-int/lit8 v8, v19, 0x1

    .line 243
    .line 244
    move-object/from16 v1, p0

    .line 245
    .line 246
    move/from16 v5, v16

    .line 247
    .line 248
    move-object/from16 v3, v17

    .line 249
    .line 250
    move-object/from16 v7, v18

    .line 251
    .line 252
    goto :goto_7

    .line 253
    :cond_7
    move/from16 v16, v5

    .line 254
    .line 255
    move-object/from16 v18, v7

    .line 256
    .line 257
    invoke-static {v12, v14, v13}, La0/r;->f(La0/h;La0/h;LB5/c;)V

    .line 258
    .line 259
    .line 260
    iget v1, v4, LR/e;->s:I

    .line 261
    .line 262
    invoke-virtual {v4, v1, v9}, LR/e;->e(ILjava/util/List;)V

    .line 263
    .line 264
    .line 265
    goto :goto_9

    .line 266
    :goto_8
    invoke-static {v12, v14, v13}, La0/r;->f(La0/h;La0/h;LB5/c;)V

    .line 267
    .line 268
    .line 269
    throw v0

    .line 270
    :cond_8
    move/from16 v16, v5

    .line 271
    .line 272
    move-object/from16 v18, v7

    .line 273
    .line 274
    :goto_9
    if-eqz v16, :cond_a

    .line 275
    .line 276
    invoke-static/range {v18 .. v18}, Ln5/l;->r0(Ljava/util/List;)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v1

    .line 280
    check-cast v1, LD/p;

    .line 281
    .line 282
    if-ne v6, v10, :cond_9

    .line 283
    .line 284
    iget-wide v7, v1, LD/p;->n:J

    .line 285
    .line 286
    const-wide v9, 0xffffffffL

    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    and-long/2addr v7, v9

    .line 292
    :goto_a
    long-to-int v3, v7

    .line 293
    goto :goto_b

    .line 294
    :cond_9
    iget-wide v7, v1, LD/p;->n:J

    .line 295
    .line 296
    const/16 v3, 0x20

    .line 297
    .line 298
    shr-long/2addr v7, v3

    .line 299
    goto :goto_a

    .line 300
    :goto_b
    iget v5, v2, LD/o;->r:I

    .line 301
    .line 302
    invoke-static {v1, v6}, LD5/a;->y(LD/p;Lw/d0;)I

    .line 303
    .line 304
    .line 305
    move-result v1

    .line 306
    add-int/2addr v1, v3

    .line 307
    add-int/2addr v1, v5

    .line 308
    iget v2, v2, LD/o;->n:I

    .line 309
    .line 310
    sub-int/2addr v1, v2

    .line 311
    int-to-float v1, v1

    .line 312
    neg-float v0, v0

    .line 313
    cmpg-float v0, v1, v0

    .line 314
    .line 315
    if-gez v0, :cond_b

    .line 316
    .line 317
    iget-object v0, v4, LR/e;->q:[Ljava/lang/Object;

    .line 318
    .line 319
    iget v1, v4, LR/e;->s:I

    .line 320
    .line 321
    const/4 v8, 0x0

    .line 322
    :goto_c
    if-ge v8, v1, :cond_b

    .line 323
    .line 324
    aget-object v2, v0, v8

    .line 325
    .line 326
    check-cast v2, LE/J;

    .line 327
    .line 328
    invoke-interface {v2}, LE/J;->a()V

    .line 329
    .line 330
    .line 331
    add-int/lit8 v8, v8, 0x1

    .line 332
    .line 333
    goto :goto_c

    .line 334
    :cond_a
    invoke-static/range {v18 .. v18}, Ln5/l;->l0(Ljava/util/List;)Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v1

    .line 338
    check-cast v1, LD/p;

    .line 339
    .line 340
    iget v2, v2, LD/o;->m:I

    .line 341
    .line 342
    invoke-static {v1, v6}, LD5/a;->y(LD/p;Lw/d0;)I

    .line 343
    .line 344
    .line 345
    move-result v1

    .line 346
    sub-int/2addr v2, v1

    .line 347
    int-to-float v1, v2

    .line 348
    cmpg-float v0, v1, v0

    .line 349
    .line 350
    if-gez v0, :cond_b

    .line 351
    .line 352
    iget-object v0, v4, LR/e;->q:[Ljava/lang/Object;

    .line 353
    .line 354
    iget v1, v4, LR/e;->s:I

    .line 355
    .line 356
    const/4 v8, 0x0

    .line 357
    :goto_d
    if-ge v8, v1, :cond_b

    .line 358
    .line 359
    aget-object v2, v0, v8

    .line 360
    .line 361
    check-cast v2, LE/J;

    .line 362
    .line 363
    invoke-interface {v2}, LE/J;->a()V

    .line 364
    .line 365
    .line 366
    add-int/lit8 v8, v8, 0x1

    .line 367
    .line 368
    goto :goto_d

    .line 369
    :cond_b
    return-void
.end method
