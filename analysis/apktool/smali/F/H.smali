.class public final LF/H;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:I

.field public synthetic r:Ljava/lang/Object;

.field public final synthetic s:LF/N;

.field public final synthetic t:I

.field public final synthetic u:F

.field public final synthetic v:Lu/k;


# direct methods
.method public constructor <init>(LF/N;IFLu/k;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LF/H;->s:LF/N;

    .line 2
    .line 3
    iput p2, p0, LF/H;->t:I

    .line 4
    .line 5
    iput p3, p0, LF/H;->u:F

    .line 6
    .line 7
    iput-object p4, p0, LF/H;->v:Lu/k;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Ls5/i;-><init>(ILq5/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 6

    .line 1
    new-instance v0, LF/H;

    .line 2
    .line 3
    iget v3, p0, LF/H;->u:F

    .line 4
    .line 5
    iget-object v4, p0, LF/H;->v:Lu/k;

    .line 6
    .line 7
    iget-object v1, p0, LF/H;->s:LF/N;

    .line 8
    .line 9
    iget v2, p0, LF/H;->t:I

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, LF/H;-><init>(LF/N;IFLu/k;Lq5/c;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, LF/H;->r:Ljava/lang/Object;

    .line 16
    .line 17
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lw/i0;

    .line 2
    .line 3
    check-cast p2, Lq5/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LF/H;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LF/H;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LF/H;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget v0, p0, LF/H;->q:I

    .line 2
    .line 3
    sget-object v1, Lm5/y;->a:Lm5/y;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    if-ne v0, v2, :cond_0

    .line 9
    .line 10
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-object v1

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 17
    .line 18
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p1

    .line 22
    :cond_1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, LF/H;->r:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p1, Lw/i0;

    .line 28
    .line 29
    new-instance v0, LF/E;

    .line 30
    .line 31
    iget-object v3, p0, LF/H;->s:LF/N;

    .line 32
    .line 33
    invoke-direct {v0, p1, v3}, LF/E;-><init>(Lw/i0;LF/N;)V

    .line 34
    .line 35
    .line 36
    new-instance p1, LA/e0;

    .line 37
    .line 38
    const/4 v4, 0x4

    .line 39
    invoke-direct {p1, v4, v3}, LA/e0;-><init>(ILjava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iput v2, p0, LF/H;->q:I

    .line 43
    .line 44
    sget v4, LF/S;->a:F

    .line 45
    .line 46
    new-instance v4, Ljava/lang/Integer;

    .line 47
    .line 48
    iget v5, p0, LF/H;->t:I

    .line 49
    .line 50
    invoke-direct {v4, v5}, Ljava/lang/Integer;-><init>(I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1, v0, v4}, LA/e0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    iget p1, v3, LF/N;->e:I

    .line 57
    .line 58
    const/4 v4, 0x0

    .line 59
    if-le v5, p1, :cond_2

    .line 60
    .line 61
    move p1, v2

    .line 62
    goto :goto_0

    .line 63
    :cond_2
    move p1, v4

    .line 64
    :goto_0
    invoke-virtual {v3}, LF/N;->k()LF/B;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    iget-object v6, v6, LF/B;->a:Ljava/util/List;

    .line 69
    .line 70
    invoke-static {v6}, Ln5/l;->r0(Ljava/util/List;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    check-cast v6, LF/l;

    .line 75
    .line 76
    iget v6, v6, LF/l;->a:I

    .line 77
    .line 78
    iget v7, v3, LF/N;->e:I

    .line 79
    .line 80
    sub-int/2addr v6, v7

    .line 81
    add-int/2addr v6, v2

    .line 82
    if-eqz p1, :cond_3

    .line 83
    .line 84
    invoke-virtual {v3}, LF/N;->k()LF/B;

    .line 85
    .line 86
    .line 87
    move-result-object v7

    .line 88
    iget-object v7, v7, LF/B;->a:Ljava/util/List;

    .line 89
    .line 90
    invoke-static {v7}, Ln5/l;->r0(Ljava/util/List;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    check-cast v7, LF/l;

    .line 95
    .line 96
    iget v7, v7, LF/l;->a:I

    .line 97
    .line 98
    if-gt v5, v7, :cond_4

    .line 99
    .line 100
    :cond_3
    if-nez p1, :cond_8

    .line 101
    .line 102
    iget v7, v3, LF/N;->e:I

    .line 103
    .line 104
    if-ge v5, v7, :cond_8

    .line 105
    .line 106
    :cond_4
    iget v7, v3, LF/N;->e:I

    .line 107
    .line 108
    sub-int v7, v5, v7

    .line 109
    .line 110
    invoke-static {v7}, Ljava/lang/Math;->abs(I)I

    .line 111
    .line 112
    .line 113
    move-result v7

    .line 114
    const/4 v8, 0x3

    .line 115
    if-lt v7, v8, :cond_8

    .line 116
    .line 117
    if-eqz p1, :cond_6

    .line 118
    .line 119
    sub-int p1, v5, v6

    .line 120
    .line 121
    iget v6, v3, LF/N;->e:I

    .line 122
    .line 123
    if-ge p1, v6, :cond_7

    .line 124
    .line 125
    :cond_5
    move p1, v6

    .line 126
    goto :goto_1

    .line 127
    :cond_6
    add-int/2addr v6, v5

    .line 128
    iget p1, v3, LF/N;->e:I

    .line 129
    .line 130
    if-le v6, p1, :cond_5

    .line 131
    .line 132
    :cond_7
    :goto_1
    int-to-float v6, v4

    .line 133
    invoke-virtual {v3}, LF/N;->n()I

    .line 134
    .line 135
    .line 136
    move-result v7

    .line 137
    int-to-float v7, v7

    .line 138
    div-float/2addr v6, v7

    .line 139
    invoke-virtual {v3, p1, v6, v2}, LF/N;->s(IFZ)V

    .line 140
    .line 141
    .line 142
    :cond_8
    invoke-virtual {v3}, LF/N;->j()I

    .line 143
    .line 144
    .line 145
    move-result p1

    .line 146
    sub-int/2addr v5, p1

    .line 147
    invoke-virtual {v3}, LF/N;->n()I

    .line 148
    .line 149
    .line 150
    move-result p1

    .line 151
    mul-int/2addr p1, v5

    .line 152
    int-to-float p1, p1

    .line 153
    iget-object v2, v3, LF/N;->d:LF/D;

    .line 154
    .line 155
    iget-object v2, v2, LF/D;->t:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v2, LP/b0;

    .line 158
    .line 159
    invoke-virtual {v2}, LP/b0;->e()F

    .line 160
    .line 161
    .line 162
    move-result v2

    .line 163
    invoke-virtual {v3}, LF/N;->n()I

    .line 164
    .line 165
    .line 166
    move-result v5

    .line 167
    int-to-float v5, v5

    .line 168
    mul-float/2addr v2, v5

    .line 169
    sub-float/2addr p1, v2

    .line 170
    int-to-float v2, v4

    .line 171
    add-float/2addr p1, v2

    .line 172
    invoke-static {p1}, LD5/a;->G(F)I

    .line 173
    .line 174
    .line 175
    move-result p1

    .line 176
    invoke-static {v3}, Lcom/google/android/gms/internal/measurement/I1;->R(LF/N;)J

    .line 177
    .line 178
    .line 179
    move-result-wide v4

    .line 180
    int-to-long v6, p1

    .line 181
    add-long v8, v4, v6

    .line 182
    .line 183
    iget-wide v10, v3, LF/N;->h:J

    .line 184
    .line 185
    iget-wide v12, v3, LF/N;->g:J

    .line 186
    .line 187
    invoke-static/range {v8 .. v13}, LD5/a;->r(JJJ)J

    .line 188
    .line 189
    .line 190
    move-result-wide v4

    .line 191
    invoke-static {v3}, Lcom/google/android/gms/internal/measurement/I1;->R(LF/N;)J

    .line 192
    .line 193
    .line 194
    move-result-wide v2

    .line 195
    sub-long/2addr v4, v2

    .line 196
    long-to-int p1, v4

    .line 197
    int-to-float p1, p1

    .line 198
    iget v2, p0, LF/H;->u:F

    .line 199
    .line 200
    add-float v4, p1, v2

    .line 201
    .line 202
    new-instance p1, Lkotlin/jvm/internal/v;

    .line 203
    .line 204
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 205
    .line 206
    .line 207
    new-instance v6, LB0/j0;

    .line 208
    .line 209
    const/4 v2, 0x6

    .line 210
    invoke-direct {v6, v2, p1, v0}, LB0/j0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    const/4 v8, 0x4

    .line 214
    const/4 v3, 0x0

    .line 215
    iget-object v5, p0, LF/H;->v:Lu/k;

    .line 216
    .line 217
    move-object v7, p0

    .line 218
    invoke-static/range {v3 .. v8}, Lu/d;->d(FFLu/k;LB5/e;Ls5/i;I)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    sget-object v0, Lr5/a;->q:Lr5/a;

    .line 223
    .line 224
    if-ne p1, v0, :cond_9

    .line 225
    .line 226
    goto :goto_2

    .line 227
    :cond_9
    move-object p1, v1

    .line 228
    :goto_2
    if-ne p1, v0, :cond_a

    .line 229
    .line 230
    return-object v0

    .line 231
    :cond_a
    return-object v1
.end method
