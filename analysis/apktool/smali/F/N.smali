.class public abstract LF/N;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/A0;


# instance fields
.field public final A:LE/H;

.field public final B:LP/W;

.field public final C:LP/W;

.field public final D:LP/f0;

.field public final E:LP/f0;

.field public final F:LP/f0;

.field public final G:LP/f0;

.field public a:Z

.field public b:LF/B;

.field public final c:LP/f0;

.field public final d:LF/D;

.field public e:I

.field public f:I

.field public g:J

.field public h:J

.field public i:F

.field public j:F

.field public final k:Lp3/z0;

.field public final l:Z

.field public m:I

.field public n:LE/J;

.field public o:Z

.field public final p:LP/f0;

.field public q:LW0/c;

.field public final r:Ly/i;

.field public final s:LP/c0;

.field public final t:LP/c0;

.field public final u:LE/K;

.field public final v:LE/k;

.field public final w:LE/e;

.field public final x:LP/f0;

.field public final y:LC/x;

.field public z:J


# direct methods
.method public constructor <init>(IF)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    float-to-double v0, p2

    .line 5
    const-wide/high16 v2, -0x4020000000000000L    # -0.5

    .line 6
    .line 7
    cmpg-double v2, v2, v0

    .line 8
    .line 9
    if-gtz v2, :cond_0

    .line 10
    .line 11
    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    .line 12
    .line 13
    cmpg-double v0, v0, v2

    .line 14
    .line 15
    if-gtz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v1, "currentPageOffsetFraction "

    .line 21
    .line 22
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, " is not within the range -0.5 to 0.5"

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {v0}, Lz/a;->a(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :goto_0
    new-instance v0, Li0/b;

    .line 41
    .line 42
    const-wide/16 v1, 0x0

    .line 43
    .line 44
    invoke-direct {v0, v1, v2}, Li0/b;-><init>(J)V

    .line 45
    .line 46
    .line 47
    invoke-static {v0}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iput-object v0, p0, LF/N;->c:LP/f0;

    .line 52
    .line 53
    new-instance v0, LF/D;

    .line 54
    .line 55
    invoke-direct {v0, p1, p2, p0}, LF/D;-><init>(IFLF/N;)V

    .line 56
    .line 57
    .line 58
    iput-object v0, p0, LF/N;->d:LF/D;

    .line 59
    .line 60
    iput p1, p0, LF/N;->e:I

    .line 61
    .line 62
    const-wide v0, 0x7fffffffffffffffL

    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    iput-wide v0, p0, LF/N;->g:J

    .line 68
    .line 69
    new-instance p2, LF/I;

    .line 70
    .line 71
    const/4 v0, 0x1

    .line 72
    invoke-direct {p2, p0, v0}, LF/I;-><init>(LF/N;I)V

    .line 73
    .line 74
    .line 75
    new-instance v0, Lp3/z0;

    .line 76
    .line 77
    invoke-direct {v0, p2}, Lp3/z0;-><init>(LB5/c;)V

    .line 78
    .line 79
    .line 80
    iput-object v0, p0, LF/N;->k:Lp3/z0;

    .line 81
    .line 82
    const/4 p2, 0x1

    .line 83
    iput-boolean p2, p0, LF/N;->l:Z

    .line 84
    .line 85
    const/4 p2, -0x1

    .line 86
    iput p2, p0, LF/N;->m:I

    .line 87
    .line 88
    sget-object v0, LF/S;->b:LF/B;

    .line 89
    .line 90
    sget-object v1, LP/S;->s:LP/S;

    .line 91
    .line 92
    new-instance v2, LP/f0;

    .line 93
    .line 94
    invoke-direct {v2, v0, v1}, LP/f0;-><init>(Ljava/lang/Object;LP/I0;)V

    .line 95
    .line 96
    .line 97
    iput-object v2, p0, LF/N;->p:LP/f0;

    .line 98
    .line 99
    sget-object v0, LF/S;->c:LF/P;

    .line 100
    .line 101
    iput-object v0, p0, LF/N;->q:LW0/c;

    .line 102
    .line 103
    new-instance v0, Ly/i;

    .line 104
    .line 105
    invoke-direct {v0}, Ly/i;-><init>()V

    .line 106
    .line 107
    .line 108
    iput-object v0, p0, LF/N;->r:Ly/i;

    .line 109
    .line 110
    new-instance v0, LP/c0;

    .line 111
    .line 112
    invoke-direct {v0, p2}, LP/c0;-><init>(I)V

    .line 113
    .line 114
    .line 115
    iput-object v0, p0, LF/N;->s:LP/c0;

    .line 116
    .line 117
    new-instance p2, LP/c0;

    .line 118
    .line 119
    invoke-direct {p2, p1}, LP/c0;-><init>(I)V

    .line 120
    .line 121
    .line 122
    iput-object p2, p0, LF/N;->t:LP/c0;

    .line 123
    .line 124
    sget-object p1, LP/S;->v:LP/S;

    .line 125
    .line 126
    new-instance p2, LF/M;

    .line 127
    .line 128
    const/4 v0, 0x0

    .line 129
    invoke-direct {p2, p0, v0}, LF/M;-><init>(LF/N;I)V

    .line 130
    .line 131
    .line 132
    invoke-static {p2, p1}, LP/b;->n(LB5/a;LP/I0;)LP/C;

    .line 133
    .line 134
    .line 135
    new-instance p2, LF/M;

    .line 136
    .line 137
    const/4 v0, 0x1

    .line 138
    invoke-direct {p2, p0, v0}, LF/M;-><init>(LF/N;I)V

    .line 139
    .line 140
    .line 141
    invoke-static {p2, p1}, LP/b;->n(LB5/a;LP/I0;)LP/C;

    .line 142
    .line 143
    .line 144
    new-instance p1, LE/K;

    .line 145
    .line 146
    new-instance p2, LF/I;

    .line 147
    .line 148
    const/4 v0, 0x0

    .line 149
    invoke-direct {p2, p0, v0}, LF/I;-><init>(LF/N;I)V

    .line 150
    .line 151
    .line 152
    invoke-direct {p1, p2}, LE/K;-><init>(LB5/c;)V

    .line 153
    .line 154
    .line 155
    iput-object p1, p0, LF/N;->u:LE/K;

    .line 156
    .line 157
    new-instance p1, LE/k;

    .line 158
    .line 159
    const/4 p2, 0x0

    .line 160
    invoke-direct {p1, p2}, LE/k;-><init>(I)V

    .line 161
    .line 162
    .line 163
    iput-object p1, p0, LF/N;->v:LE/k;

    .line 164
    .line 165
    new-instance p1, LE/e;

    .line 166
    .line 167
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 168
    .line 169
    .line 170
    iput-object p1, p0, LF/N;->w:LE/e;

    .line 171
    .line 172
    const/4 p1, 0x0

    .line 173
    invoke-static {p1}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    iput-object p1, p0, LF/N;->x:LP/f0;

    .line 178
    .line 179
    new-instance p1, LC/x;

    .line 180
    .line 181
    const/4 p2, 0x2

    .line 182
    invoke-direct {p1, p0, p2}, LC/x;-><init>(Lw/A0;I)V

    .line 183
    .line 184
    .line 185
    iput-object p1, p0, LF/N;->y:LC/x;

    .line 186
    .line 187
    const/16 p1, 0xf

    .line 188
    .line 189
    const/4 p2, 0x0

    .line 190
    invoke-static {p2, p2, p1}, LW0/b;->b(III)J

    .line 191
    .line 192
    .line 193
    move-result-wide p1

    .line 194
    iput-wide p1, p0, LF/N;->z:J

    .line 195
    .line 196
    new-instance p1, LE/H;

    .line 197
    .line 198
    invoke-direct {p1}, LE/H;-><init>()V

    .line 199
    .line 200
    .line 201
    iput-object p1, p0, LF/N;->A:LE/H;

    .line 202
    .line 203
    invoke-static {}, LE/C;->h()LP/W;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    iput-object p1, p0, LF/N;->B:LP/W;

    .line 208
    .line 209
    invoke-static {}, LE/C;->h()LP/W;

    .line 210
    .line 211
    .line 212
    move-result-object p1

    .line 213
    iput-object p1, p0, LF/N;->C:LP/W;

    .line 214
    .line 215
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 216
    .line 217
    invoke-static {p1}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    .line 218
    .line 219
    .line 220
    move-result-object p2

    .line 221
    iput-object p2, p0, LF/N;->D:LP/f0;

    .line 222
    .line 223
    invoke-static {p1}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    .line 224
    .line 225
    .line 226
    move-result-object p2

    .line 227
    iput-object p2, p0, LF/N;->E:LP/f0;

    .line 228
    .line 229
    invoke-static {p1}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    .line 230
    .line 231
    .line 232
    move-result-object p2

    .line 233
    iput-object p2, p0, LF/N;->F:LP/f0;

    .line 234
    .line 235
    invoke-static {p1}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    iput-object p1, p0, LF/N;->G:LP/f0;

    .line 240
    .line 241
    return-void
.end method

.method public static synthetic g(LF/e;ILs5/i;)Ljava/lang/Object;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x7

    .line 3
    invoke-static {v1, v0}, Lu/d;->o(ILjava/lang/Object;)Lu/f0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p0, p1, v0, p2}, LF/N;->f(ILu/f0;Ls5/c;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static r(LF/N;Lv/W;LB5/e;Ls5/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p3, LF/K;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, LF/K;

    .line 7
    .line 8
    iget v1, v0, LF/K;->v:I

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
    iput v1, v0, LF/K;->v:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LF/K;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, LF/K;-><init>(LF/N;Ls5/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, LF/K;->t:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, LF/K;->v:I

    .line 28
    .line 29
    sget-object v2, Lm5/y;->a:Lm5/y;

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const/4 v4, 0x1

    .line 33
    sget-object v5, Lr5/a;->q:Lr5/a;

    .line 34
    .line 35
    if-eqz v1, :cond_3

    .line 36
    .line 37
    if-eq v1, v4, :cond_2

    .line 38
    .line 39
    if-ne v1, v3, :cond_1

    .line 40
    .line 41
    iget-object p0, v0, LF/K;->q:LF/N;

    .line 42
    .line 43
    invoke-static {p3}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_4

    .line 47
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 48
    .line 49
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p0

    .line 55
    :cond_2
    iget-object p0, v0, LF/K;->s:Ls5/i;

    .line 56
    .line 57
    move-object p2, p0

    .line 58
    check-cast p2, LB5/e;

    .line 59
    .line 60
    iget-object p1, v0, LF/K;->r:Lv/W;

    .line 61
    .line 62
    iget-object p0, v0, LF/K;->q:LF/N;

    .line 63
    .line 64
    invoke-static {p3}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_3
    invoke-static {p3}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    iput-object p0, v0, LF/K;->q:LF/N;

    .line 72
    .line 73
    iput-object p1, v0, LF/K;->r:Lv/W;

    .line 74
    .line 75
    move-object p3, p2

    .line 76
    check-cast p3, Ls5/i;

    .line 77
    .line 78
    iput-object p3, v0, LF/K;->s:Ls5/i;

    .line 79
    .line 80
    iput v4, v0, LF/K;->v:I

    .line 81
    .line 82
    iget-object p3, p0, LF/N;->w:LE/e;

    .line 83
    .line 84
    invoke-virtual {p3, v0}, LE/e;->f(Ls5/c;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p3

    .line 88
    if-ne p3, v5, :cond_4

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_4
    move-object p3, v2

    .line 92
    :goto_1
    if-ne p3, v5, :cond_5

    .line 93
    .line 94
    goto :goto_3

    .line 95
    :cond_5
    :goto_2
    iget-object p3, p0, LF/N;->k:Lp3/z0;

    .line 96
    .line 97
    invoke-virtual {p3}, Lp3/z0;->b()Z

    .line 98
    .line 99
    .line 100
    move-result p3

    .line 101
    if-nez p3, :cond_6

    .line 102
    .line 103
    invoke-virtual {p0}, LF/N;->j()I

    .line 104
    .line 105
    .line 106
    move-result p3

    .line 107
    iget-object v1, p0, LF/N;->t:LP/c0;

    .line 108
    .line 109
    invoke-virtual {v1, p3}, LP/c0;->f(I)V

    .line 110
    .line 111
    .line 112
    :cond_6
    iget-object p3, p0, LF/N;->k:Lp3/z0;

    .line 113
    .line 114
    iput-object p0, v0, LF/K;->q:LF/N;

    .line 115
    .line 116
    const/4 v1, 0x0

    .line 117
    iput-object v1, v0, LF/K;->r:Lv/W;

    .line 118
    .line 119
    iput-object v1, v0, LF/K;->s:Ls5/i;

    .line 120
    .line 121
    iput v3, v0, LF/K;->v:I

    .line 122
    .line 123
    invoke-virtual {p3, p1, p2, v0}, Lp3/z0;->e(Lv/W;LB5/e;Ls5/c;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    if-ne p1, v5, :cond_7

    .line 128
    .line 129
    :goto_3
    return-object v5

    .line 130
    :cond_7
    :goto_4
    const/4 p1, -0x1

    .line 131
    iget-object p0, p0, LF/N;->s:LP/c0;

    .line 132
    .line 133
    invoke-virtual {p0, p1}, LP/c0;->f(I)V

    .line 134
    .line 135
    .line 136
    return-object v2
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .line 1
    iget-object v0, p0, LF/N;->E:LP/f0;

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
    iget-object v0, p0, LF/N;->k:Lp3/z0;

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
    iget-object v0, p0, LF/N;->D:LP/f0;

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
    iget-object v0, p0, LF/N;->k:Lp3/z0;

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
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, LF/N;->r(LF/N;Lv/W;LB5/e;Ls5/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final f(ILu/f0;Ls5/c;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    instance-of v3, v2, LF/G;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, LF/G;

    .line 13
    .line 14
    iget v4, v3, LF/G;->v:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, LF/G;->v:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, LF/G;

    .line 27
    .line 28
    invoke-direct {v3, v0, v2}, LF/G;-><init>(LF/N;Ls5/c;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v2, v3, LF/G;->t:Ljava/lang/Object;

    .line 32
    .line 33
    iget v4, v3, LF/G;->v:I

    .line 34
    .line 35
    const/4 v5, 0x0

    .line 36
    sget-object v6, Lm5/y;->a:Lm5/y;

    .line 37
    .line 38
    const/4 v7, 0x2

    .line 39
    const/4 v8, 0x1

    .line 40
    sget-object v9, Lr5/a;->q:Lr5/a;

    .line 41
    .line 42
    if-eqz v4, :cond_3

    .line 43
    .line 44
    if-eq v4, v8, :cond_2

    .line 45
    .line 46
    if-ne v4, v7, :cond_1

    .line 47
    .line 48
    invoke-static {v2}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    return-object v6

    .line 52
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw v1

    .line 60
    :cond_2
    iget v1, v3, LF/G;->s:I

    .line 61
    .line 62
    iget-object v4, v3, LF/G;->r:Lu/f0;

    .line 63
    .line 64
    iget-object v8, v3, LF/G;->q:LF/N;

    .line 65
    .line 66
    invoke-static {v2}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    move-object v14, v4

    .line 70
    move-object v11, v8

    .line 71
    goto :goto_2

    .line 72
    :cond_3
    invoke-static {v2}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, LF/N;->j()I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-ne v1, v2, :cond_4

    .line 80
    .line 81
    iget-object v2, v0, LF/N;->d:LF/D;

    .line 82
    .line 83
    iget-object v2, v2, LF/D;->t:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v2, LP/b0;

    .line 86
    .line 87
    invoke-virtual {v2}, LP/b0;->e()F

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    cmpg-float v2, v2, v5

    .line 92
    .line 93
    if-nez v2, :cond_4

    .line 94
    .line 95
    goto :goto_5

    .line 96
    :cond_4
    invoke-virtual {v0}, LF/N;->l()I

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    if-nez v2, :cond_5

    .line 101
    .line 102
    goto :goto_5

    .line 103
    :cond_5
    iput-object v0, v3, LF/G;->q:LF/N;

    .line 104
    .line 105
    move-object/from16 v2, p2

    .line 106
    .line 107
    iput-object v2, v3, LF/G;->r:Lu/f0;

    .line 108
    .line 109
    iput v1, v3, LF/G;->s:I

    .line 110
    .line 111
    iput v8, v3, LF/G;->v:I

    .line 112
    .line 113
    iget-object v4, v0, LF/N;->w:LE/e;

    .line 114
    .line 115
    invoke-virtual {v4, v3}, LE/e;->f(Ls5/c;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    if-ne v4, v9, :cond_6

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_6
    move-object v4, v6

    .line 123
    :goto_1
    if-ne v4, v9, :cond_7

    .line 124
    .line 125
    goto :goto_4

    .line 126
    :cond_7
    move-object v11, v0

    .line 127
    move-object v14, v2

    .line 128
    :goto_2
    float-to-double v12, v5

    .line 129
    const-wide/high16 v15, -0x4020000000000000L    # -0.5

    .line 130
    .line 131
    cmpg-double v2, v15, v12

    .line 132
    .line 133
    if-gtz v2, :cond_8

    .line 134
    .line 135
    const-wide/high16 v15, 0x3fe0000000000000L    # 0.5

    .line 136
    .line 137
    cmpg-double v2, v12, v15

    .line 138
    .line 139
    if-gtz v2, :cond_8

    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_8
    new-instance v2, Ljava/lang/StringBuilder;

    .line 143
    .line 144
    const-string v4, "pageOffsetFraction "

    .line 145
    .line 146
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    const-string v4, " is not within the range -0.5 to 0.5"

    .line 153
    .line 154
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    invoke-static {v2}, Lz/a;->a(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    :goto_3
    invoke-virtual {v11, v1}, LF/N;->i(I)I

    .line 165
    .line 166
    .line 167
    move-result v12

    .line 168
    invoke-virtual {v11}, LF/N;->n()I

    .line 169
    .line 170
    .line 171
    move-result v1

    .line 172
    int-to-float v1, v1

    .line 173
    mul-float v13, v5, v1

    .line 174
    .line 175
    new-instance v10, LF/H;

    .line 176
    .line 177
    const/4 v15, 0x0

    .line 178
    invoke-direct/range {v10 .. v15}, LF/H;-><init>(LF/N;IFLu/k;Lq5/c;)V

    .line 179
    .line 180
    .line 181
    const/4 v1, 0x0

    .line 182
    iput-object v1, v3, LF/G;->q:LF/N;

    .line 183
    .line 184
    iput-object v1, v3, LF/G;->r:Lu/f0;

    .line 185
    .line 186
    iput v7, v3, LF/G;->v:I

    .line 187
    .line 188
    sget-object v1, Lv/W;->q:Lv/W;

    .line 189
    .line 190
    invoke-virtual {v11, v1, v10, v3}, LF/N;->e(Lv/W;LB5/e;Ls5/c;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    if-ne v1, v9, :cond_9

    .line 195
    .line 196
    :goto_4
    return-object v9

    .line 197
    :cond_9
    :goto_5
    return-object v6
.end method

.method public final h(LF/B;ZZ)V
    .locals 9

    .line 1
    iget-object v0, p1, LF/B;->i:LF/l;

    .line 2
    .line 3
    iget v1, p1, LF/B;->j:F

    .line 4
    .line 5
    if-nez p2, :cond_0

    .line 6
    .line 7
    iget-boolean v2, p0, LF/N;->a:Z

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    iput-object p1, p0, LF/N;->b:LF/B;

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    const/4 v2, 0x1

    .line 15
    if-eqz p2, :cond_1

    .line 16
    .line 17
    iput-boolean v2, p0, LF/N;->a:Z

    .line 18
    .line 19
    :cond_1
    iget-object p2, p0, LF/N;->d:LF/D;

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    const/4 v4, 0x0

    .line 23
    if-eqz p3, :cond_2

    .line 24
    .line 25
    iget-object p2, p2, LF/D;->t:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p2, LP/b0;

    .line 28
    .line 29
    invoke-virtual {p2, v1}, LP/b0;->f(F)V

    .line 30
    .line 31
    .line 32
    goto/16 :goto_3

    .line 33
    .line 34
    :cond_2
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    iget-object p3, p1, LF/B;->a:Ljava/util/List;

    .line 38
    .line 39
    if-eqz v0, :cond_3

    .line 40
    .line 41
    iget-object v5, v0, LF/l;->d:Ljava/lang/Object;

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_3
    move-object v5, v3

    .line 45
    :goto_0
    iput-object v5, p2, LF/D;->u:Ljava/lang/Object;

    .line 46
    .line 47
    iget-boolean v5, p2, LF/D;->q:Z

    .line 48
    .line 49
    if-nez v5, :cond_4

    .line 50
    .line 51
    move-object v5, p3

    .line 52
    check-cast v5, Ljava/util/Collection;

    .line 53
    .line 54
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    if-nez v5, :cond_6

    .line 59
    .line 60
    :cond_4
    iput-boolean v2, p2, LF/D;->q:Z

    .line 61
    .line 62
    if-eqz v0, :cond_5

    .line 63
    .line 64
    iget v0, v0, LF/l;->a:I

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_5
    move v0, v4

    .line 68
    :goto_1
    iget-object v5, p2, LF/D;->s:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v5, LP/c0;

    .line 71
    .line 72
    invoke-virtual {v5, v0}, LP/c0;->f(I)V

    .line 73
    .line 74
    .line 75
    iget-object v5, p2, LF/D;->v:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v5, LE/F;

    .line 78
    .line 79
    invoke-virtual {v5, v0}, LE/F;->b(I)V

    .line 80
    .line 81
    .line 82
    iget-object p2, p2, LF/D;->t:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast p2, LP/b0;

    .line 85
    .line 86
    invoke-virtual {p2, v1}, LP/b0;->f(F)V

    .line 87
    .line 88
    .line 89
    :cond_6
    iget p2, p0, LF/N;->m:I

    .line 90
    .line 91
    const/4 v0, -0x1

    .line 92
    if-eq p2, v0, :cond_9

    .line 93
    .line 94
    move-object p2, p3

    .line 95
    check-cast p2, Ljava/util/Collection;

    .line 96
    .line 97
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 98
    .line 99
    .line 100
    move-result p2

    .line 101
    if-nez p2, :cond_9

    .line 102
    .line 103
    iget-boolean p2, p0, LF/N;->o:Z

    .line 104
    .line 105
    if-eqz p2, :cond_7

    .line 106
    .line 107
    invoke-static {p3}, Ln5/l;->r0(Ljava/util/List;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    check-cast p2, LF/l;

    .line 112
    .line 113
    iget p2, p2, LF/l;->a:I

    .line 114
    .line 115
    add-int/2addr p2, v2

    .line 116
    goto :goto_2

    .line 117
    :cond_7
    invoke-static {p3}, Ln5/l;->l0(Ljava/util/List;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p2

    .line 121
    check-cast p2, LF/l;

    .line 122
    .line 123
    iget p2, p2, LF/l;->a:I

    .line 124
    .line 125
    sub-int/2addr p2, v2

    .line 126
    :goto_2
    iget p3, p0, LF/N;->m:I

    .line 127
    .line 128
    if-eq p3, p2, :cond_9

    .line 129
    .line 130
    iput v0, p0, LF/N;->m:I

    .line 131
    .line 132
    iget-object p2, p0, LF/N;->n:LE/J;

    .line 133
    .line 134
    if-eqz p2, :cond_8

    .line 135
    .line 136
    invoke-interface {p2}, LE/J;->cancel()V

    .line 137
    .line 138
    .line 139
    :cond_8
    iput-object v3, p0, LF/N;->n:LE/J;

    .line 140
    .line 141
    :cond_9
    :goto_3
    iget-object p2, p0, LF/N;->p:LP/f0;

    .line 142
    .line 143
    invoke-virtual {p2, p1}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    iget-boolean p2, p1, LF/B;->l:Z

    .line 147
    .line 148
    iget p3, p1, LF/B;->k:I

    .line 149
    .line 150
    iget-object v0, p1, LF/B;->h:LF/l;

    .line 151
    .line 152
    iget-object v1, p0, LF/N;->D:LP/f0;

    .line 153
    .line 154
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 155
    .line 156
    .line 157
    move-result-object p2

    .line 158
    invoke-virtual {v1, p2}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    if-eqz v0, :cond_a

    .line 162
    .line 163
    iget p2, v0, LF/l;->a:I

    .line 164
    .line 165
    goto :goto_4

    .line 166
    :cond_a
    move p2, v4

    .line 167
    :goto_4
    if-nez p2, :cond_c

    .line 168
    .line 169
    if-eqz p3, :cond_b

    .line 170
    .line 171
    goto :goto_5

    .line 172
    :cond_b
    move p2, v4

    .line 173
    goto :goto_6

    .line 174
    :cond_c
    :goto_5
    move p2, v2

    .line 175
    :goto_6
    iget-object v1, p0, LF/N;->E:LP/f0;

    .line 176
    .line 177
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 178
    .line 179
    .line 180
    move-result-object p2

    .line 181
    invoke-virtual {v1, p2}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    if-eqz v0, :cond_d

    .line 185
    .line 186
    iget p2, v0, LF/l;->a:I

    .line 187
    .line 188
    iput p2, p0, LF/N;->e:I

    .line 189
    .line 190
    :cond_d
    iput p3, p0, LF/N;->f:I

    .line 191
    .line 192
    invoke-static {}, La0/r;->c()La0/h;

    .line 193
    .line 194
    .line 195
    move-result-object p2

    .line 196
    if-eqz p2, :cond_e

    .line 197
    .line 198
    invoke-virtual {p2}, La0/h;->e()LB5/c;

    .line 199
    .line 200
    .line 201
    move-result-object v3

    .line 202
    :cond_e
    invoke-static {p2}, La0/r;->d(La0/h;)La0/h;

    .line 203
    .line 204
    .line 205
    move-result-object p3

    .line 206
    :try_start_0
    iget v0, p0, LF/N;->j:F

    .line 207
    .line 208
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    const/high16 v1, 0x3f000000    # 0.5f

    .line 213
    .line 214
    cmpl-float v0, v0, v1

    .line 215
    .line 216
    const/16 v1, 0x20

    .line 217
    .line 218
    const-wide v5, 0xffffffffL

    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    if-lez v0, :cond_12

    .line 224
    .line 225
    iget-boolean v0, p0, LF/N;->l:Z

    .line 226
    .line 227
    if-eqz v0, :cond_12

    .line 228
    .line 229
    iget v0, p0, LF/N;->j:F

    .line 230
    .line 231
    invoke-virtual {p0}, LF/N;->k()LF/B;

    .line 232
    .line 233
    .line 234
    move-result-object v7

    .line 235
    iget-object v7, v7, LF/B;->e:Lw/d0;

    .line 236
    .line 237
    sget-object v8, Lw/d0;->q:Lw/d0;

    .line 238
    .line 239
    if-ne v7, v8, :cond_f

    .line 240
    .line 241
    invoke-static {v0}, Ljava/lang/Math;->signum(F)F

    .line 242
    .line 243
    .line 244
    move-result v0

    .line 245
    invoke-virtual {p0}, LF/N;->o()J

    .line 246
    .line 247
    .line 248
    move-result-wide v7

    .line 249
    and-long/2addr v7, v5

    .line 250
    long-to-int v7, v7

    .line 251
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 252
    .line 253
    .line 254
    move-result v7

    .line 255
    neg-float v7, v7

    .line 256
    invoke-static {v7}, Ljava/lang/Math;->signum(F)F

    .line 257
    .line 258
    .line 259
    move-result v7

    .line 260
    cmpg-float v0, v0, v7

    .line 261
    .line 262
    if-nez v0, :cond_10

    .line 263
    .line 264
    goto :goto_7

    .line 265
    :cond_f
    invoke-static {v0}, Ljava/lang/Math;->signum(F)F

    .line 266
    .line 267
    .line 268
    move-result v0

    .line 269
    invoke-virtual {p0}, LF/N;->o()J

    .line 270
    .line 271
    .line 272
    move-result-wide v7

    .line 273
    shr-long/2addr v7, v1

    .line 274
    long-to-int v7, v7

    .line 275
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 276
    .line 277
    .line 278
    move-result v7

    .line 279
    neg-float v7, v7

    .line 280
    invoke-static {v7}, Ljava/lang/Math;->signum(F)F

    .line 281
    .line 282
    .line 283
    move-result v7

    .line 284
    cmpg-float v0, v0, v7

    .line 285
    .line 286
    if-nez v0, :cond_10

    .line 287
    .line 288
    goto :goto_7

    .line 289
    :cond_10
    invoke-virtual {p0}, LF/N;->p()Z

    .line 290
    .line 291
    .line 292
    move-result v0

    .line 293
    if-eqz v0, :cond_11

    .line 294
    .line 295
    goto :goto_7

    .line 296
    :cond_11
    move v2, v4

    .line 297
    :goto_7
    if-eqz v2, :cond_12

    .line 298
    .line 299
    iget v0, p0, LF/N;->j:F

    .line 300
    .line 301
    invoke-virtual {p0, v0, p1}, LF/N;->q(FLF/B;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 302
    .line 303
    .line 304
    goto :goto_8

    .line 305
    :catchall_0
    move-exception p1

    .line 306
    goto :goto_b

    .line 307
    :cond_12
    :goto_8
    invoke-static {p2, p3, v3}, La0/r;->f(La0/h;La0/h;LB5/c;)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {p0}, LF/N;->l()I

    .line 311
    .line 312
    .line 313
    move-result p2

    .line 314
    invoke-static {p1, p2}, LF/S;->a(LF/B;I)J

    .line 315
    .line 316
    .line 317
    move-result-wide p2

    .line 318
    iput-wide p2, p0, LF/N;->g:J

    .line 319
    .line 320
    invoke-virtual {p0}, LF/N;->l()I

    .line 321
    .line 322
    .line 323
    iget-object p2, p1, LF/B;->e:Lw/d0;

    .line 324
    .line 325
    sget-object p3, Lw/d0;->r:Lw/d0;

    .line 326
    .line 327
    if-ne p2, p3, :cond_13

    .line 328
    .line 329
    invoke-virtual {p1}, LF/B;->g()J

    .line 330
    .line 331
    .line 332
    move-result-wide p2

    .line 333
    shr-long/2addr p2, v1

    .line 334
    :goto_9
    long-to-int p2, p2

    .line 335
    goto :goto_a

    .line 336
    :cond_13
    invoke-virtual {p1}, LF/B;->g()J

    .line 337
    .line 338
    .line 339
    move-result-wide p2

    .line 340
    and-long/2addr p2, v5

    .line 341
    goto :goto_9

    .line 342
    :goto_a
    iget-object p1, p1, LF/B;->m:Lx/m;

    .line 343
    .line 344
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 345
    .line 346
    .line 347
    invoke-static {v4, v4, p2}, LD5/a;->q(III)I

    .line 348
    .line 349
    .line 350
    move-result p1

    .line 351
    int-to-long p1, p1

    .line 352
    iput-wide p1, p0, LF/N;->h:J

    .line 353
    .line 354
    return-void

    .line 355
    :goto_b
    invoke-static {p2, p3, v3}, La0/r;->f(La0/h;La0/h;LB5/c;)V

    .line 356
    .line 357
    .line 358
    throw p1
.end method

.method public final i(I)I
    .locals 2

    .line 1
    invoke-virtual {p0}, LF/N;->l()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-lez v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, LF/N;->l()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    add-int/lit8 v0, v0, -0x1

    .line 13
    .line 14
    invoke-static {p1, v1, v0}, LD5/a;->q(III)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    return p1

    .line 19
    :cond_0
    return v1
.end method

.method public final j()I
    .locals 1

    .line 1
    iget-object v0, p0, LF/N;->d:LF/D;

    .line 2
    .line 3
    iget-object v0, v0, LF/D;->s:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, LP/c0;

    .line 6
    .line 7
    invoke-virtual {v0}, LP/c0;->e()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public final k()LF/B;
    .locals 1

    .line 1
    iget-object v0, p0, LF/N;->p:LP/f0;

    .line 2
    .line 3
    invoke-virtual {v0}, LP/f0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LF/B;

    .line 8
    .line 9
    return-object v0
.end method

.method public abstract l()I
.end method

.method public final m()I
    .locals 1

    .line 1
    iget-object v0, p0, LF/N;->p:LP/f0;

    .line 2
    .line 3
    invoke-virtual {v0}, LP/f0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LF/B;

    .line 8
    .line 9
    iget v0, v0, LF/B;->b:I

    .line 10
    .line 11
    return v0
.end method

.method public final n()I
    .locals 2

    .line 1
    invoke-virtual {p0}, LF/N;->m()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, LF/N;->p:LP/f0;

    .line 6
    .line 7
    invoke-virtual {v1}, LP/f0;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, LF/B;

    .line 12
    .line 13
    iget v1, v1, LF/B;->c:I

    .line 14
    .line 15
    add-int/2addr v1, v0

    .line 16
    return v1
.end method

.method public final o()J
    .locals 2

    .line 1
    iget-object v0, p0, LF/N;->c:LP/f0;

    .line 2
    .line 3
    invoke-virtual {v0}, LP/f0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Li0/b;

    .line 8
    .line 9
    iget-wide v0, v0, Li0/b;->a:J

    .line 10
    .line 11
    return-wide v0
.end method

.method public final p()Z
    .locals 4

    .line 1
    invoke-virtual {p0}, LF/N;->o()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const/16 v2, 0x20

    .line 6
    .line 7
    shr-long/2addr v0, v2

    .line 8
    long-to-int v0, v0

    .line 9
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    float-to-int v0, v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, LF/N;->o()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    const-wide v2, 0xffffffffL

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    and-long/2addr v0, v2

    .line 26
    long-to-int v0, v0

    .line 27
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    float-to-int v0, v0

    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    const/4 v0, 0x1

    .line 35
    return v0

    .line 36
    :cond_0
    const/4 v0, 0x0

    .line 37
    return v0
.end method

.method public final q(FLF/B;)V
    .locals 6

    .line 1
    iget-object v0, p2, LF/B;->a:Ljava/util/List;

    .line 2
    .line 3
    iget-boolean v1, p0, LF/N;->l:Z

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    goto/16 :goto_2

    .line 8
    .line 9
    :cond_0
    move-object v1, v0

    .line 10
    check-cast v1, Ljava/util/Collection;

    .line 11
    .line 12
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_6

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    cmpl-float v1, p1, v1

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    if-lez v1, :cond_1

    .line 23
    .line 24
    move v1, v2

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 v1, 0x0

    .line 27
    :goto_0
    if-eqz v1, :cond_2

    .line 28
    .line 29
    invoke-static {v0}, Ln5/l;->r0(Ljava/util/List;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    check-cast v3, LF/l;

    .line 34
    .line 35
    iget v3, v3, LF/l;->a:I

    .line 36
    .line 37
    add-int/2addr v3, v2

    .line 38
    goto :goto_1

    .line 39
    :cond_2
    invoke-static {v0}, Ln5/l;->l0(Ljava/util/List;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    check-cast v3, LF/l;

    .line 44
    .line 45
    iget v3, v3, LF/l;->a:I

    .line 46
    .line 47
    sub-int/2addr v3, v2

    .line 48
    :goto_1
    if-ltz v3, :cond_6

    .line 49
    .line 50
    invoke-virtual {p0}, LF/N;->l()I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-ge v3, v2, :cond_6

    .line 55
    .line 56
    iget v2, p0, LF/N;->m:I

    .line 57
    .line 58
    if-eq v3, v2, :cond_4

    .line 59
    .line 60
    iget-boolean v2, p0, LF/N;->o:Z

    .line 61
    .line 62
    if-eq v2, v1, :cond_3

    .line 63
    .line 64
    iget-object v2, p0, LF/N;->n:LE/J;

    .line 65
    .line 66
    if-eqz v2, :cond_3

    .line 67
    .line 68
    invoke-interface {v2}, LE/J;->cancel()V

    .line 69
    .line 70
    .line 71
    :cond_3
    iput-boolean v1, p0, LF/N;->o:Z

    .line 72
    .line 73
    iput v3, p0, LF/N;->m:I

    .line 74
    .line 75
    iget-object v2, p0, LF/N;->u:LE/K;

    .line 76
    .line 77
    iget-wide v4, p0, LF/N;->z:J

    .line 78
    .line 79
    invoke-virtual {v2, v3, v4, v5}, LE/K;->a(IJ)LE/J;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    iput-object v2, p0, LF/N;->n:LE/J;

    .line 84
    .line 85
    :cond_4
    if-eqz v1, :cond_5

    .line 86
    .line 87
    invoke-static {v0}, Ln5/l;->r0(Ljava/util/List;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    check-cast v0, LF/l;

    .line 92
    .line 93
    iget v1, p2, LF/B;->b:I

    .line 94
    .line 95
    iget v2, p2, LF/B;->c:I

    .line 96
    .line 97
    add-int/2addr v1, v2

    .line 98
    iget v0, v0, LF/l;->l:I

    .line 99
    .line 100
    add-int/2addr v0, v1

    .line 101
    iget p2, p2, LF/B;->g:I

    .line 102
    .line 103
    sub-int/2addr v0, p2

    .line 104
    int-to-float p2, v0

    .line 105
    cmpg-float p1, p2, p1

    .line 106
    .line 107
    if-gez p1, :cond_6

    .line 108
    .line 109
    iget-object p1, p0, LF/N;->n:LE/J;

    .line 110
    .line 111
    if-eqz p1, :cond_6

    .line 112
    .line 113
    invoke-interface {p1}, LE/J;->a()V

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :cond_5
    invoke-static {v0}, Ln5/l;->l0(Ljava/util/List;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    check-cast v0, LF/l;

    .line 122
    .line 123
    iget p2, p2, LF/B;->f:I

    .line 124
    .line 125
    iget v0, v0, LF/l;->l:I

    .line 126
    .line 127
    sub-int/2addr p2, v0

    .line 128
    int-to-float p2, p2

    .line 129
    neg-float p1, p1

    .line 130
    cmpg-float p1, p2, p1

    .line 131
    .line 132
    if-gez p1, :cond_6

    .line 133
    .line 134
    iget-object p1, p0, LF/N;->n:LE/J;

    .line 135
    .line 136
    if-eqz p1, :cond_6

    .line 137
    .line 138
    invoke-interface {p1}, LE/J;->a()V

    .line 139
    .line 140
    .line 141
    :cond_6
    :goto_2
    return-void
.end method

.method public final s(IFZ)V
    .locals 2

    .line 1
    iget-object v0, p0, LF/N;->d:LF/D;

    .line 2
    .line 3
    iget-object v1, v0, LF/D;->s:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, LP/c0;

    .line 6
    .line 7
    invoke-virtual {v1, p1}, LP/c0;->f(I)V

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, LF/D;->v:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, LE/F;

    .line 13
    .line 14
    invoke-virtual {v1, p1}, LE/F;->b(I)V

    .line 15
    .line 16
    .line 17
    iget-object p1, v0, LF/D;->t:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p1, LP/b0;

    .line 20
    .line 21
    invoke-virtual {p1, p2}, LP/b0;->f(F)V

    .line 22
    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    iput-object p1, v0, LF/D;->u:Ljava/lang/Object;

    .line 26
    .line 27
    if-eqz p3, :cond_1

    .line 28
    .line 29
    iget-object p1, p0, LF/N;->x:LP/f0;

    .line 30
    .line 31
    invoke-virtual {p1}, LP/f0;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, LB0/L;

    .line 36
    .line 37
    if-eqz p1, :cond_0

    .line 38
    .line 39
    invoke-virtual {p1}, LB0/L;->l()V

    .line 40
    .line 41
    .line 42
    :cond_0
    return-void

    .line 43
    :cond_1
    iget-object p1, p0, LF/N;->C:LP/W;

    .line 44
    .line 45
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 46
    .line 47
    invoke-interface {p1, p2}, LP/W;->setValue(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method
