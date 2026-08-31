.class public abstract LB0/T;
.super Lz0/J;
.source "SourceFile"

# interfaces
.implements Lz0/E;
.implements LB0/e0;


# instance fields
.field public A:Lr/A;

.field public v:Z

.field public w:Z

.field public x:Z

.field public final y:Lz0/z;

.field public z:Lr/A;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lz0/J;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lz0/z;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1, p0}, Lz0/z;-><init>(ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, LB0/T;->y:Lz0/z;

    .line 11
    .line 12
    return-void
.end method

.method public static n0(LB0/n0;)V
    .locals 1

    .line 1
    iget-object v0, p0, LB0/n0;->C:LB0/n0;

    .line 2
    .line 3
    iget-object p0, p0, LB0/n0;->B:LB0/L;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, v0, LB0/n0;->B:LB0/L;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    invoke-static {v0, p0}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    iget-object p0, p0, LB0/L;->V:LB0/P;

    .line 18
    .line 19
    iget-object p0, p0, LB0/P;->p:LB0/c0;

    .line 20
    .line 21
    iget-object p0, p0, LB0/c0;->M:LB0/M;

    .line 22
    .line 23
    invoke-virtual {p0}, LB0/M;->f()V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    iget-object p0, p0, LB0/L;->V:LB0/P;

    .line 28
    .line 29
    iget-object p0, p0, LB0/P;->p:LB0/c0;

    .line 30
    .line 31
    invoke-virtual {p0}, LB0/c0;->q()LB0/b;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    if-eqz p0, :cond_2

    .line 36
    .line 37
    check-cast p0, LB0/c0;

    .line 38
    .line 39
    iget-object p0, p0, LB0/c0;->M:LB0/M;

    .line 40
    .line 41
    if-eqz p0, :cond_2

    .line 42
    .line 43
    invoke-virtual {p0}, LB0/M;->f()V

    .line 44
    .line 45
    .line 46
    :cond_2
    return-void
.end method


# virtual methods
.method public final O(IILjava/util/Map;LB5/c;)Lz0/D;
    .locals 7

    .line 1
    const/high16 v0, -0x1000000

    .line 2
    .line 3
    and-int v1, p1, v0

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    and-int/2addr v0, p2

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v1, "Size("

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v1, " x "

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v1, ") is out of range. Each dimension must be between 0 and 16777215."

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {v0}, Ly0/a;->b(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    :goto_0
    new-instance v1, LB0/Q;

    .line 42
    .line 43
    move-object v6, p0

    .line 44
    move v2, p1

    .line 45
    move v3, p2

    .line 46
    move-object v4, p3

    .line 47
    move-object v5, p4

    .line 48
    invoke-direct/range {v1 .. v6}, LB0/Q;-><init>(IILjava/util/Map;LB5/c;LB0/T;)V

    .line 49
    .line 50
    .line 51
    return-object v1
.end method

.method public abstract Y(Lz0/l;)I
.end method

.method public final Z(LB0/x0;)V
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-boolean v2, v0, LB0/T;->x:Z

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v2, v1, LB0/x0;->q:Lz0/D;

    .line 11
    .line 12
    invoke-interface {v2}, Lz0/D;->e()LB5/c;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    if-nez v2, :cond_1

    .line 17
    .line 18
    :goto_0
    return-void

    .line 19
    :cond_1
    iget-object v2, v0, LB0/T;->A:Lr/A;

    .line 20
    .line 21
    if-nez v2, :cond_2

    .line 22
    .line 23
    new-instance v2, Lr/A;

    .line 24
    .line 25
    invoke-direct {v2}, Lr/A;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v2, v0, LB0/T;->A:Lr/A;

    .line 29
    .line 30
    :cond_2
    iget-object v3, v0, LB0/T;->z:Lr/A;

    .line 31
    .line 32
    if-nez v3, :cond_3

    .line 33
    .line 34
    new-instance v3, Lr/A;

    .line 35
    .line 36
    invoke-direct {v3}, Lr/A;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object v3, v0, LB0/T;->z:Lr/A;

    .line 40
    .line 41
    :cond_3
    iget-object v4, v3, Lr/A;->b:[Ljava/lang/Object;

    .line 42
    .line 43
    iget-object v5, v3, Lr/A;->c:[F

    .line 44
    .line 45
    iget-object v6, v3, Lr/A;->a:[J

    .line 46
    .line 47
    array-length v7, v6

    .line 48
    add-int/lit8 v7, v7, -0x2

    .line 49
    .line 50
    const/16 v15, 0x8

    .line 51
    .line 52
    const/16 v16, 0x0

    .line 53
    .line 54
    if-ltz v7, :cond_7

    .line 55
    .line 56
    move/from16 v8, v16

    .line 57
    .line 58
    const-wide/16 v17, 0x80

    .line 59
    .line 60
    const-wide/16 v19, 0xff

    .line 61
    .line 62
    :goto_1
    aget-wide v10, v6, v8

    .line 63
    .line 64
    const/4 v9, 0x7

    .line 65
    const-wide v21, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    not-long v12, v10

    .line 71
    shl-long/2addr v12, v9

    .line 72
    and-long/2addr v12, v10

    .line 73
    and-long v12, v12, v21

    .line 74
    .line 75
    cmp-long v12, v12, v21

    .line 76
    .line 77
    if-eqz v12, :cond_6

    .line 78
    .line 79
    sub-int v12, v8, v7

    .line 80
    .line 81
    not-int v12, v12

    .line 82
    ushr-int/lit8 v12, v12, 0x1f

    .line 83
    .line 84
    rsub-int/lit8 v12, v12, 0x8

    .line 85
    .line 86
    move/from16 v13, v16

    .line 87
    .line 88
    :goto_2
    if-ge v13, v12, :cond_5

    .line 89
    .line 90
    and-long v23, v10, v19

    .line 91
    .line 92
    cmp-long v14, v23, v17

    .line 93
    .line 94
    if-gez v14, :cond_4

    .line 95
    .line 96
    shl-int/lit8 v14, v8, 0x3

    .line 97
    .line 98
    add-int/2addr v14, v13

    .line 99
    move/from16 v23, v9

    .line 100
    .line 101
    aget-object v9, v4, v14

    .line 102
    .line 103
    aget v14, v5, v14

    .line 104
    .line 105
    invoke-virtual {v2, v14, v9}, Lr/A;->e(FLjava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_4
    move/from16 v23, v9

    .line 110
    .line 111
    :goto_3
    shr-long/2addr v10, v15

    .line 112
    add-int/lit8 v13, v13, 0x1

    .line 113
    .line 114
    move/from16 v9, v23

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_5
    move/from16 v23, v9

    .line 118
    .line 119
    if-ne v12, v15, :cond_8

    .line 120
    .line 121
    goto :goto_4

    .line 122
    :cond_6
    move/from16 v23, v9

    .line 123
    .line 124
    :goto_4
    if-eq v8, v7, :cond_8

    .line 125
    .line 126
    add-int/lit8 v8, v8, 0x1

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_7
    const-wide/16 v17, 0x80

    .line 130
    .line 131
    const-wide/16 v19, 0xff

    .line 132
    .line 133
    const-wide v21, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    const/16 v23, 0x7

    .line 139
    .line 140
    :cond_8
    invoke-virtual {v3}, Lr/A;->a()V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0}, LB0/T;->h0()LB0/L;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    iget-object v4, v4, LB0/L;->D:LB0/t0;

    .line 148
    .line 149
    if-eqz v4, :cond_9

    .line 150
    .line 151
    check-cast v4, LC0/A;

    .line 152
    .line 153
    invoke-virtual {v4}, LC0/A;->getSnapshotObserver()LB0/v0;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    if-eqz v4, :cond_9

    .line 158
    .line 159
    sget-object v5, LB0/f;->s:LB0/f;

    .line 160
    .line 161
    new-instance v6, LB0/K;

    .line 162
    .line 163
    const/4 v7, 0x1

    .line 164
    invoke-direct {v6, v7, v1, v0}, LB0/K;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v4, v1, v5, v6}, LB0/v0;->a(LB0/u0;LB5/c;LB5/a;)V

    .line 168
    .line 169
    .line 170
    :cond_9
    iget-object v1, v3, Lr/A;->b:[Ljava/lang/Object;

    .line 171
    .line 172
    iget-object v3, v3, Lr/A;->a:[J

    .line 173
    .line 174
    array-length v4, v3

    .line 175
    add-int/lit8 v4, v4, -0x2

    .line 176
    .line 177
    if-ltz v4, :cond_11

    .line 178
    .line 179
    move/from16 v5, v16

    .line 180
    .line 181
    :goto_5
    aget-wide v6, v3, v5

    .line 182
    .line 183
    not-long v8, v6

    .line 184
    shl-long v8, v8, v23

    .line 185
    .line 186
    and-long/2addr v8, v6

    .line 187
    and-long v8, v8, v21

    .line 188
    .line 189
    cmp-long v8, v8, v21

    .line 190
    .line 191
    if-eqz v8, :cond_10

    .line 192
    .line 193
    sub-int v8, v5, v4

    .line 194
    .line 195
    not-int v8, v8

    .line 196
    ushr-int/lit8 v8, v8, 0x1f

    .line 197
    .line 198
    rsub-int/lit8 v8, v8, 0x8

    .line 199
    .line 200
    move/from16 v9, v16

    .line 201
    .line 202
    :goto_6
    if-ge v9, v8, :cond_f

    .line 203
    .line 204
    and-long v10, v6, v19

    .line 205
    .line 206
    cmp-long v10, v10, v17

    .line 207
    .line 208
    if-gez v10, :cond_e

    .line 209
    .line 210
    shl-int/lit8 v10, v5, 0x3

    .line 211
    .line 212
    add-int/2addr v10, v9

    .line 213
    aget-object v10, v1, v10

    .line 214
    .line 215
    if-nez v10, :cond_d

    .line 216
    .line 217
    const/4 v10, 0x0

    .line 218
    invoke-virtual {v2, v10}, Lr/A;->c(Ljava/lang/Object;)I

    .line 219
    .line 220
    .line 221
    move-result v11

    .line 222
    if-ltz v11, :cond_a

    .line 223
    .line 224
    goto :goto_7

    .line 225
    :cond_a
    invoke-virtual {v0}, LB0/T;->l0()LB0/T;

    .line 226
    .line 227
    .line 228
    move-result-object v11

    .line 229
    if-eqz v11, :cond_e

    .line 230
    .line 231
    :cond_b
    iget-object v12, v11, LB0/T;->z:Lr/A;

    .line 232
    .line 233
    if-eqz v12, :cond_c

    .line 234
    .line 235
    invoke-virtual {v12, v10}, Lr/A;->c(Ljava/lang/Object;)I

    .line 236
    .line 237
    .line 238
    move-result v12

    .line 239
    if-ltz v12, :cond_c

    .line 240
    .line 241
    goto :goto_7

    .line 242
    :cond_c
    invoke-virtual {v11}, LB0/T;->l0()LB0/T;

    .line 243
    .line 244
    .line 245
    move-result-object v11

    .line 246
    if-nez v11, :cond_b

    .line 247
    .line 248
    goto :goto_7

    .line 249
    :cond_d
    new-instance v1, Ljava/lang/ClassCastException;

    .line 250
    .line 251
    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    .line 252
    .line 253
    .line 254
    throw v1

    .line 255
    :cond_e
    :goto_7
    shr-long/2addr v6, v15

    .line 256
    add-int/lit8 v9, v9, 0x1

    .line 257
    .line 258
    goto :goto_6

    .line 259
    :cond_f
    if-ne v8, v15, :cond_11

    .line 260
    .line 261
    :cond_10
    if-eq v5, v4, :cond_11

    .line 262
    .line 263
    add-int/lit8 v5, v5, 0x1

    .line 264
    .line 265
    goto :goto_5

    .line 266
    :cond_11
    invoke-virtual {v2}, Lr/A;->a()V

    .line 267
    .line 268
    .line 269
    return-void
.end method

.method public final b0(Lz0/l;)I
    .locals 4

    .line 1
    invoke-virtual {p0}, LB0/T;->e0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/high16 v1, -0x80000000

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p0, p1}, LB0/T;->Y(Lz0/l;)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-ne p1, v1, :cond_1

    .line 15
    .line 16
    :goto_0
    return v1

    .line 17
    :cond_1
    iget-wide v0, p0, Lz0/J;->u:J

    .line 18
    .line 19
    const-wide v2, 0xffffffffL

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    and-long/2addr v0, v2

    .line 25
    long-to-int v0, v0

    .line 26
    add-int/2addr p1, v0

    .line 27
    return p1
.end method

.method public abstract c0()LB0/T;
.end method

.method public abstract d0()Lz0/m;
.end method

.method public abstract e0()Z
.end method

.method public abstract h0()LB0/L;
.end method

.method public abstract j0()Lz0/D;
.end method

.method public final k(Z)V
    .locals 4

    .line 1
    invoke-virtual {p0}, LB0/T;->l0()LB0/T;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, LB0/T;->h0()LB0/L;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, v1

    .line 14
    :goto_0
    invoke-virtual {p0}, LB0/T;->h0()LB0/L;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-static {v0, v2}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    iput-boolean p1, p0, LB0/T;->v:Z

    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    if-eqz v0, :cond_2

    .line 28
    .line 29
    iget-object v2, v0, LB0/L;->V:LB0/P;

    .line 30
    .line 31
    iget-object v2, v2, LB0/P;->d:LB0/G;

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_2
    move-object v2, v1

    .line 35
    :goto_1
    sget-object v3, LB0/G;->s:LB0/G;

    .line 36
    .line 37
    if-eq v2, v3, :cond_5

    .line 38
    .line 39
    if-eqz v0, :cond_3

    .line 40
    .line 41
    iget-object v0, v0, LB0/L;->V:LB0/P;

    .line 42
    .line 43
    iget-object v1, v0, LB0/P;->d:LB0/G;

    .line 44
    .line 45
    :cond_3
    sget-object v0, LB0/G;->t:LB0/G;

    .line 46
    .line 47
    if-ne v1, v0, :cond_4

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_4
    return-void

    .line 51
    :cond_5
    :goto_2
    iput-boolean p1, p0, LB0/T;->v:Z

    .line 52
    .line 53
    return-void
.end method

.method public abstract l0()LB0/T;
.end method

.method public abstract m0()J
.end method

.method public abstract o0()V
.end method

.method public r()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method
