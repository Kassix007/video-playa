.class public final Lw2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;
.implements Ljava/io/Flushable;


# static fields
.field public static final G:LJ5/k;


# instance fields
.field public A:Z

.field public B:Z

.field public C:Z

.field public D:Z

.field public E:Z

.field public final F:Lw2/c;

.field public final q:Lq6/x;

.field public final r:J

.field public final s:Lq6/x;

.field public final t:Lq6/x;

.field public final u:Lq6/x;

.field public final v:Ljava/util/LinkedHashMap;

.field public final w:LR5/d;

.field public x:J

.field public y:I

.field public z:Lq6/z;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LJ5/k;

    .line 2
    .line 3
    const-string v1, "[a-z0-9_-]{1,120}"

    .line 4
    .line 5
    invoke-direct {v0, v1}, LJ5/k;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lw2/e;->G:LJ5/k;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(JLM5/s;Lq6/l;Lq6/x;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p5, p0, Lw2/e;->q:Lq6/x;

    .line 5
    .line 6
    iput-wide p1, p0, Lw2/e;->r:J

    .line 7
    .line 8
    const-wide/16 v0, 0x0

    .line 9
    .line 10
    cmp-long p1, p1, v0

    .line 11
    .line 12
    if-lez p1, :cond_0

    .line 13
    .line 14
    const-string p1, "journal"

    .line 15
    .line 16
    invoke-virtual {p5, p1}, Lq6/x;->e(Ljava/lang/String;)Lq6/x;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Lw2/e;->s:Lq6/x;

    .line 21
    .line 22
    const-string p1, "journal.tmp"

    .line 23
    .line 24
    invoke-virtual {p5, p1}, Lq6/x;->e(Ljava/lang/String;)Lq6/x;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, p0, Lw2/e;->t:Lq6/x;

    .line 29
    .line 30
    const-string p1, "journal.bkp"

    .line 31
    .line 32
    invoke-virtual {p5, p1}, Lq6/x;->e(Ljava/lang/String;)Lq6/x;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iput-object p1, p0, Lw2/e;->u:Lq6/x;

    .line 37
    .line 38
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 39
    .line 40
    const/4 p2, 0x0

    .line 41
    const/high16 p5, 0x3f400000    # 0.75f

    .line 42
    .line 43
    const/4 v0, 0x1

    .line 44
    invoke-direct {p1, p2, p5, v0}, Ljava/util/LinkedHashMap;-><init>(IFZ)V

    .line 45
    .line 46
    .line 47
    iput-object p1, p0, Lw2/e;->v:Ljava/util/LinkedHashMap;

    .line 48
    .line 49
    invoke-static {}, LM5/y;->c()LM5/q0;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-virtual {p3, v0}, LM5/s;->limitedParallelism(I)LM5/s;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    invoke-static {p1, p2}, LE3/h;->L(Lq5/f;Lq5/h;)Lq5/h;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-static {p1}, LM5/y;->a(Lq5/h;)LR5/d;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    iput-object p1, p0, Lw2/e;->w:LR5/d;

    .line 66
    .line 67
    new-instance p1, Lw2/c;

    .line 68
    .line 69
    invoke-direct {p1, p4}, Lq6/m;-><init>(Lq6/l;)V

    .line 70
    .line 71
    .line 72
    iput-object p1, p0, Lw2/e;->F:Lw2/c;

    .line 73
    .line 74
    return-void

    .line 75
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 76
    .line 77
    const-string p2, "maxSize <= 0"

    .line 78
    .line 79
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw p1
.end method

.method public static M(Ljava/lang/String;)V
    .locals 2

    .line 1
    sget-object v0, Lw2/e;->G:LJ5/k;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, LJ5/k;->c(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v1, "keys must match regex [a-z0-9_-]{1,120}: \""

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const/16 p0, 0x22

    .line 21
    .line 22
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw v0
.end method

.method public static final a(Lw2/e;LK2/a;Z)V
    .locals 9

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p1, LK2/a;->c:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lw2/a;

    .line 5
    .line 6
    iget-object v1, v0, Lw2/a;->g:LK2/a;

    .line 7
    .line 8
    invoke-static {v1, p1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_e

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    const/4 v2, 0x0

    .line 16
    if-eqz p2, :cond_5

    .line 17
    .line 18
    iget-boolean v3, v0, Lw2/a;->f:Z

    .line 19
    .line 20
    if-nez v3, :cond_5

    .line 21
    .line 22
    move v3, v2

    .line 23
    :goto_0
    if-ge v3, v1, :cond_1

    .line 24
    .line 25
    iget-object v4, p1, LK2/a;->d:Ljava/io/Serializable;

    .line 26
    .line 27
    check-cast v4, [Z

    .line 28
    .line 29
    aget-boolean v4, v4, v3

    .line 30
    .line 31
    if-eqz v4, :cond_0

    .line 32
    .line 33
    iget-object v4, p0, Lw2/e;->F:Lw2/c;

    .line 34
    .line 35
    iget-object v5, v0, Lw2/a;->d:Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    check-cast v5, Lq6/x;

    .line 42
    .line 43
    invoke-virtual {v4, v5}, Lq6/l;->v(Lq6/x;)Z

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-nez v4, :cond_0

    .line 48
    .line 49
    invoke-virtual {p1, v2}, LK2/a;->a(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    .line 52
    monitor-exit p0

    .line 53
    return-void

    .line 54
    :catchall_0
    move-exception p1

    .line 55
    goto/16 :goto_8

    .line 56
    .line 57
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    move p1, v2

    .line 61
    :goto_1
    if-ge p1, v1, :cond_6

    .line 62
    .line 63
    :try_start_1
    iget-object v3, v0, Lw2/a;->d:Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    check-cast v3, Lq6/x;

    .line 70
    .line 71
    iget-object v4, v0, Lw2/a;->c:Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    check-cast v4, Lq6/x;

    .line 78
    .line 79
    iget-object v5, p0, Lw2/e;->F:Lw2/c;

    .line 80
    .line 81
    invoke-virtual {v5, v3}, Lq6/l;->v(Lq6/x;)Z

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    if-eqz v5, :cond_2

    .line 86
    .line 87
    iget-object v5, p0, Lw2/e;->F:Lw2/c;

    .line 88
    .line 89
    invoke-virtual {v5, v3, v4}, Lq6/m;->b(Lq6/x;Lq6/x;)V

    .line 90
    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_2
    iget-object v3, p0, Lw2/e;->F:Lw2/c;

    .line 94
    .line 95
    iget-object v5, v0, Lw2/a;->c:Ljava/util/ArrayList;

    .line 96
    .line 97
    invoke-virtual {v5, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    check-cast v5, Lq6/x;

    .line 102
    .line 103
    invoke-virtual {v3, v5}, Lq6/l;->v(Lq6/x;)Z

    .line 104
    .line 105
    .line 106
    move-result v6

    .line 107
    if-nez v6, :cond_3

    .line 108
    .line 109
    invoke-virtual {v3, v5, v2}, Lw2/c;->W(Lq6/x;Z)Lq6/E;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    invoke-static {v3}, LH2/f;->a(Ljava/io/Closeable;)V

    .line 114
    .line 115
    .line 116
    :cond_3
    :goto_2
    iget-object v3, v0, Lw2/a;->b:[J

    .line 117
    .line 118
    aget-wide v5, v3, p1

    .line 119
    .line 120
    iget-object v3, p0, Lw2/e;->F:Lw2/c;

    .line 121
    .line 122
    invoke-virtual {v3, v4}, Lq6/l;->G(Lq6/x;)Le1/e;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    iget-object v3, v3, Le1/e;->e:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v3, Ljava/lang/Long;

    .line 129
    .line 130
    if-eqz v3, :cond_4

    .line 131
    .line 132
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 133
    .line 134
    .line 135
    move-result-wide v3

    .line 136
    goto :goto_3

    .line 137
    :cond_4
    const-wide/16 v3, 0x0

    .line 138
    .line 139
    :goto_3
    iget-object v7, v0, Lw2/a;->b:[J

    .line 140
    .line 141
    aput-wide v3, v7, p1

    .line 142
    .line 143
    iget-wide v7, p0, Lw2/e;->x:J

    .line 144
    .line 145
    sub-long/2addr v7, v5

    .line 146
    add-long/2addr v7, v3

    .line 147
    iput-wide v7, p0, Lw2/e;->x:J

    .line 148
    .line 149
    add-int/lit8 p1, p1, 0x1

    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_5
    move p1, v2

    .line 153
    :goto_4
    if-ge p1, v1, :cond_6

    .line 154
    .line 155
    iget-object v3, p0, Lw2/e;->F:Lw2/c;

    .line 156
    .line 157
    iget-object v4, v0, Lw2/a;->d:Ljava/util/ArrayList;

    .line 158
    .line 159
    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    check-cast v4, Lq6/x;

    .line 164
    .line 165
    invoke-virtual {v3, v4}, Lq6/l;->n(Lq6/x;)V

    .line 166
    .line 167
    .line 168
    add-int/lit8 p1, p1, 0x1

    .line 169
    .line 170
    goto :goto_4

    .line 171
    :cond_6
    const/4 p1, 0x0

    .line 172
    iput-object p1, v0, Lw2/a;->g:LK2/a;

    .line 173
    .line 174
    iget-boolean p1, v0, Lw2/a;->f:Z

    .line 175
    .line 176
    if-eqz p1, :cond_7

    .line 177
    .line 178
    invoke-virtual {p0, v0}, Lw2/e;->G(Lw2/a;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 179
    .line 180
    .line 181
    monitor-exit p0

    .line 182
    return-void

    .line 183
    :cond_7
    :try_start_2
    iget p1, p0, Lw2/e;->y:I

    .line 184
    .line 185
    const/4 v1, 0x1

    .line 186
    add-int/2addr p1, v1

    .line 187
    iput p1, p0, Lw2/e;->y:I

    .line 188
    .line 189
    iget-object p1, p0, Lw2/e;->z:Lq6/z;

    .line 190
    .line 191
    invoke-static {p1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    const/16 v3, 0xa

    .line 195
    .line 196
    const/16 v4, 0x20

    .line 197
    .line 198
    if-nez p2, :cond_9

    .line 199
    .line 200
    iget-boolean p2, v0, Lw2/a;->e:Z

    .line 201
    .line 202
    if-eqz p2, :cond_8

    .line 203
    .line 204
    goto :goto_5

    .line 205
    :cond_8
    iget-object p2, p0, Lw2/e;->v:Ljava/util/LinkedHashMap;

    .line 206
    .line 207
    iget-object v5, v0, Lw2/a;->a:Ljava/lang/String;

    .line 208
    .line 209
    invoke-virtual {p2, v5}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    const-string p2, "REMOVE"

    .line 213
    .line 214
    invoke-virtual {p1, p2}, Lq6/z;->R(Ljava/lang/String;)Lq6/h;

    .line 215
    .line 216
    .line 217
    invoke-virtual {p1, v4}, Lq6/z;->writeByte(I)Lq6/h;

    .line 218
    .line 219
    .line 220
    iget-object p2, v0, Lw2/a;->a:Ljava/lang/String;

    .line 221
    .line 222
    invoke-virtual {p1, p2}, Lq6/z;->R(Ljava/lang/String;)Lq6/h;

    .line 223
    .line 224
    .line 225
    invoke-virtual {p1, v3}, Lq6/z;->writeByte(I)Lq6/h;

    .line 226
    .line 227
    .line 228
    goto :goto_7

    .line 229
    :cond_9
    :goto_5
    iput-boolean v1, v0, Lw2/a;->e:Z

    .line 230
    .line 231
    const-string p2, "CLEAN"

    .line 232
    .line 233
    invoke-virtual {p1, p2}, Lq6/z;->R(Ljava/lang/String;)Lq6/h;

    .line 234
    .line 235
    .line 236
    invoke-virtual {p1, v4}, Lq6/z;->writeByte(I)Lq6/h;

    .line 237
    .line 238
    .line 239
    iget-object p2, v0, Lw2/a;->a:Ljava/lang/String;

    .line 240
    .line 241
    invoke-virtual {p1, p2}, Lq6/z;->R(Ljava/lang/String;)Lq6/h;

    .line 242
    .line 243
    .line 244
    iget-object p2, v0, Lw2/a;->b:[J

    .line 245
    .line 246
    array-length v0, p2

    .line 247
    move v5, v2

    .line 248
    :goto_6
    if-ge v5, v0, :cond_a

    .line 249
    .line 250
    aget-wide v6, p2, v5

    .line 251
    .line 252
    invoke-virtual {p1, v4}, Lq6/z;->writeByte(I)Lq6/h;

    .line 253
    .line 254
    .line 255
    invoke-virtual {p1, v6, v7}, Lq6/z;->b(J)Lq6/h;

    .line 256
    .line 257
    .line 258
    add-int/lit8 v5, v5, 0x1

    .line 259
    .line 260
    goto :goto_6

    .line 261
    :cond_a
    invoke-virtual {p1, v3}, Lq6/z;->writeByte(I)Lq6/h;

    .line 262
    .line 263
    .line 264
    :goto_7
    invoke-virtual {p1}, Lq6/z;->flush()V

    .line 265
    .line 266
    .line 267
    iget-wide p1, p0, Lw2/e;->x:J

    .line 268
    .line 269
    iget-wide v3, p0, Lw2/e;->r:J

    .line 270
    .line 271
    cmp-long p1, p1, v3

    .line 272
    .line 273
    if-gtz p1, :cond_c

    .line 274
    .line 275
    iget p1, p0, Lw2/e;->y:I

    .line 276
    .line 277
    const/16 p2, 0x7d0

    .line 278
    .line 279
    if-lt p1, p2, :cond_b

    .line 280
    .line 281
    move v2, v1

    .line 282
    :cond_b
    if-eqz v2, :cond_d

    .line 283
    .line 284
    :cond_c
    invoke-virtual {p0}, Lw2/e;->f()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 285
    .line 286
    .line 287
    :cond_d
    monitor-exit p0

    .line 288
    return-void

    .line 289
    :cond_e
    :try_start_3
    const-string p1, "Check failed."

    .line 290
    .line 291
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 292
    .line 293
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 294
    .line 295
    .line 296
    throw p2

    .line 297
    :goto_8
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 298
    throw p1
.end method


# virtual methods
.method public final G(Lw2/a;)V
    .locals 10

    .line 1
    iget v0, p1, Lw2/a;->h:I

    .line 2
    .line 3
    iget-object v1, p1, Lw2/a;->a:Ljava/lang/String;

    .line 4
    .line 5
    const/16 v2, 0xa

    .line 6
    .line 7
    const/16 v3, 0x20

    .line 8
    .line 9
    if-lez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lw2/e;->z:Lq6/z;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const-string v4, "DIRTY"

    .line 16
    .line 17
    invoke-virtual {v0, v4}, Lq6/z;->R(Ljava/lang/String;)Lq6/h;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v3}, Lq6/z;->writeByte(I)Lq6/h;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Lq6/z;->R(Ljava/lang/String;)Lq6/h;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v2}, Lq6/z;->writeByte(I)Lq6/h;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Lq6/z;->flush()V

    .line 30
    .line 31
    .line 32
    :cond_0
    iget v0, p1, Lw2/a;->h:I

    .line 33
    .line 34
    const/4 v4, 0x1

    .line 35
    if-gtz v0, :cond_5

    .line 36
    .line 37
    iget-object v0, p1, Lw2/a;->g:LK2/a;

    .line 38
    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const/4 v0, 0x0

    .line 43
    :goto_0
    const/4 v5, 0x2

    .line 44
    if-ge v0, v5, :cond_2

    .line 45
    .line 46
    iget-object v5, p1, Lw2/a;->c:Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    check-cast v5, Lq6/x;

    .line 53
    .line 54
    iget-object v6, p0, Lw2/e;->F:Lw2/c;

    .line 55
    .line 56
    invoke-virtual {v6, v5}, Lq6/l;->n(Lq6/x;)V

    .line 57
    .line 58
    .line 59
    iget-wide v5, p0, Lw2/e;->x:J

    .line 60
    .line 61
    iget-object v7, p1, Lw2/a;->b:[J

    .line 62
    .line 63
    aget-wide v8, v7, v0

    .line 64
    .line 65
    sub-long/2addr v5, v8

    .line 66
    iput-wide v5, p0, Lw2/e;->x:J

    .line 67
    .line 68
    const-wide/16 v5, 0x0

    .line 69
    .line 70
    aput-wide v5, v7, v0

    .line 71
    .line 72
    add-int/lit8 v0, v0, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_2
    iget p1, p0, Lw2/e;->y:I

    .line 76
    .line 77
    add-int/2addr p1, v4

    .line 78
    iput p1, p0, Lw2/e;->y:I

    .line 79
    .line 80
    iget-object p1, p0, Lw2/e;->z:Lq6/z;

    .line 81
    .line 82
    if-eqz p1, :cond_3

    .line 83
    .line 84
    const-string v0, "REMOVE"

    .line 85
    .line 86
    invoke-virtual {p1, v0}, Lq6/z;->R(Ljava/lang/String;)Lq6/h;

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1, v3}, Lq6/z;->writeByte(I)Lq6/h;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1, v1}, Lq6/z;->R(Ljava/lang/String;)Lq6/h;

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1, v2}, Lq6/z;->writeByte(I)Lq6/h;

    .line 96
    .line 97
    .line 98
    :cond_3
    iget-object p1, p0, Lw2/e;->v:Ljava/util/LinkedHashMap;

    .line 99
    .line 100
    invoke-virtual {p1, v1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    iget p1, p0, Lw2/e;->y:I

    .line 104
    .line 105
    const/16 v0, 0x7d0

    .line 106
    .line 107
    if-lt p1, v0, :cond_4

    .line 108
    .line 109
    invoke-virtual {p0}, Lw2/e;->f()V

    .line 110
    .line 111
    .line 112
    :cond_4
    return-void

    .line 113
    :cond_5
    :goto_1
    iput-boolean v4, p1, Lw2/a;->f:Z

    .line 114
    .line 115
    return-void
.end method

.method public final K()V
    .locals 4

    .line 1
    :goto_0
    iget-wide v0, p0, Lw2/e;->x:J

    .line 2
    .line 3
    iget-wide v2, p0, Lw2/e;->r:J

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-lez v0, :cond_2

    .line 8
    .line 9
    iget-object v0, p0, Lw2/e;->v:Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Lw2/a;

    .line 30
    .line 31
    iget-boolean v2, v1, Lw2/a;->f:Z

    .line 32
    .line 33
    if-nez v2, :cond_0

    .line 34
    .line 35
    invoke-virtual {p0, v1}, Lw2/e;->G(Lw2/a;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    return-void

    .line 40
    :cond_2
    const/4 v0, 0x0

    .line 41
    iput-boolean v0, p0, Lw2/e;->D:Z

    .line 42
    .line 43
    return-void
.end method

.method public final declared-synchronized W()V
    .locals 10

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lw2/e;->z:Lq6/z;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Lq6/z;->close()V

    .line 7
    .line 8
    .line 9
    goto :goto_0

    .line 10
    :catchall_0
    move-exception v0

    .line 11
    goto/16 :goto_7

    .line 12
    .line 13
    :cond_0
    :goto_0
    iget-object v0, p0, Lw2/e;->F:Lw2/c;

    .line 14
    .line 15
    iget-object v1, p0, Lw2/e;->t:Lq6/x;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-virtual {v0, v1, v2}, Lw2/c;->W(Lq6/x;Z)Lq6/E;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {v0}, La/a;->i(Lq6/E;)Lq6/z;

    .line 23
    .line 24
    .line 25
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    :try_start_1
    const-string v1, "libcore.io.DiskLruCache"

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Lq6/z;->R(Ljava/lang/String;)Lq6/h;

    .line 29
    .line 30
    .line 31
    const/16 v1, 0xa

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Lq6/z;->writeByte(I)Lq6/h;

    .line 34
    .line 35
    .line 36
    const-string v3, "1"

    .line 37
    .line 38
    invoke-virtual {v0, v3}, Lq6/z;->R(Ljava/lang/String;)Lq6/h;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v1}, Lq6/z;->writeByte(I)Lq6/h;

    .line 42
    .line 43
    .line 44
    const/4 v3, 0x1

    .line 45
    int-to-long v3, v3

    .line 46
    invoke-virtual {v0, v3, v4}, Lq6/z;->b(J)Lq6/h;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v1}, Lq6/z;->writeByte(I)Lq6/h;

    .line 50
    .line 51
    .line 52
    const/4 v3, 0x2

    .line 53
    int-to-long v3, v3

    .line 54
    invoke-virtual {v0, v3, v4}, Lq6/z;->b(J)Lq6/h;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v1}, Lq6/z;->writeByte(I)Lq6/h;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v1}, Lq6/z;->writeByte(I)Lq6/h;

    .line 61
    .line 62
    .line 63
    iget-object v3, p0, Lw2/e;->v:Ljava/util/LinkedHashMap;

    .line 64
    .line 65
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    if-eqz v4, :cond_3

    .line 78
    .line 79
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    check-cast v4, Lw2/a;

    .line 84
    .line 85
    iget-object v5, v4, Lw2/a;->g:LK2/a;

    .line 86
    .line 87
    const/16 v6, 0x20

    .line 88
    .line 89
    if-eqz v5, :cond_1

    .line 90
    .line 91
    const-string v5, "DIRTY"

    .line 92
    .line 93
    invoke-virtual {v0, v5}, Lq6/z;->R(Ljava/lang/String;)Lq6/h;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, v6}, Lq6/z;->writeByte(I)Lq6/h;

    .line 97
    .line 98
    .line 99
    iget-object v4, v4, Lw2/a;->a:Ljava/lang/String;

    .line 100
    .line 101
    invoke-virtual {v0, v4}, Lq6/z;->R(Ljava/lang/String;)Lq6/h;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0, v1}, Lq6/z;->writeByte(I)Lq6/h;

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :catchall_1
    move-exception v1

    .line 109
    goto :goto_3

    .line 110
    :cond_1
    const-string v5, "CLEAN"

    .line 111
    .line 112
    invoke-virtual {v0, v5}, Lq6/z;->R(Ljava/lang/String;)Lq6/h;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0, v6}, Lq6/z;->writeByte(I)Lq6/h;

    .line 116
    .line 117
    .line 118
    iget-object v5, v4, Lw2/a;->a:Ljava/lang/String;

    .line 119
    .line 120
    invoke-virtual {v0, v5}, Lq6/z;->R(Ljava/lang/String;)Lq6/h;

    .line 121
    .line 122
    .line 123
    iget-object v4, v4, Lw2/a;->b:[J

    .line 124
    .line 125
    array-length v5, v4

    .line 126
    move v7, v2

    .line 127
    :goto_2
    if-ge v7, v5, :cond_2

    .line 128
    .line 129
    aget-wide v8, v4, v7

    .line 130
    .line 131
    invoke-virtual {v0, v6}, Lq6/z;->writeByte(I)Lq6/h;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0, v8, v9}, Lq6/z;->b(J)Lq6/h;

    .line 135
    .line 136
    .line 137
    add-int/lit8 v7, v7, 0x1

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_2
    invoke-virtual {v0, v1}, Lq6/z;->writeByte(I)Lq6/h;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 141
    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_3
    :try_start_2
    invoke-virtual {v0}, Lq6/z;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 145
    .line 146
    .line 147
    const/4 v0, 0x0

    .line 148
    goto :goto_5

    .line 149
    :catchall_2
    move-exception v0

    .line 150
    goto :goto_5

    .line 151
    :goto_3
    :try_start_3
    invoke-virtual {v0}, Lq6/z;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 152
    .line 153
    .line 154
    goto :goto_4

    .line 155
    :catchall_3
    move-exception v0

    .line 156
    :try_start_4
    invoke-static {v1, v0}, Lm5/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 157
    .line 158
    .line 159
    :goto_4
    move-object v0, v1

    .line 160
    :goto_5
    if-nez v0, :cond_5

    .line 161
    .line 162
    iget-object v0, p0, Lw2/e;->F:Lw2/c;

    .line 163
    .line 164
    iget-object v1, p0, Lw2/e;->s:Lq6/x;

    .line 165
    .line 166
    invoke-virtual {v0, v1}, Lq6/l;->v(Lq6/x;)Z

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    if-eqz v0, :cond_4

    .line 171
    .line 172
    iget-object v0, p0, Lw2/e;->F:Lw2/c;

    .line 173
    .line 174
    iget-object v1, p0, Lw2/e;->s:Lq6/x;

    .line 175
    .line 176
    iget-object v3, p0, Lw2/e;->u:Lq6/x;

    .line 177
    .line 178
    invoke-virtual {v0, v1, v3}, Lq6/m;->b(Lq6/x;Lq6/x;)V

    .line 179
    .line 180
    .line 181
    iget-object v0, p0, Lw2/e;->F:Lw2/c;

    .line 182
    .line 183
    iget-object v1, p0, Lw2/e;->t:Lq6/x;

    .line 184
    .line 185
    iget-object v3, p0, Lw2/e;->s:Lq6/x;

    .line 186
    .line 187
    invoke-virtual {v0, v1, v3}, Lq6/m;->b(Lq6/x;Lq6/x;)V

    .line 188
    .line 189
    .line 190
    iget-object v0, p0, Lw2/e;->F:Lw2/c;

    .line 191
    .line 192
    iget-object v1, p0, Lw2/e;->u:Lq6/x;

    .line 193
    .line 194
    invoke-virtual {v0, v1}, Lq6/l;->n(Lq6/x;)V

    .line 195
    .line 196
    .line 197
    goto :goto_6

    .line 198
    :cond_4
    iget-object v0, p0, Lw2/e;->F:Lw2/c;

    .line 199
    .line 200
    iget-object v1, p0, Lw2/e;->t:Lq6/x;

    .line 201
    .line 202
    iget-object v3, p0, Lw2/e;->s:Lq6/x;

    .line 203
    .line 204
    invoke-virtual {v0, v1, v3}, Lq6/m;->b(Lq6/x;Lq6/x;)V

    .line 205
    .line 206
    .line 207
    :goto_6
    iget-object v0, p0, Lw2/e;->F:Lw2/c;

    .line 208
    .line 209
    iget-object v1, p0, Lw2/e;->s:Lq6/x;

    .line 210
    .line 211
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    const-string v3, "file"

    .line 215
    .line 216
    invoke-static {v1, v3}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v0, v1}, Lq6/m;->a(Lq6/x;)Lq6/E;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    new-instance v1, Lw2/f;

    .line 224
    .line 225
    new-instance v3, LJ5/i;

    .line 226
    .line 227
    const/16 v4, 0xe

    .line 228
    .line 229
    invoke-direct {v3, v4, p0}, LJ5/i;-><init>(ILjava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    invoke-direct {v1, v0, v3}, Lw2/f;-><init>(Lq6/E;LJ5/i;)V

    .line 233
    .line 234
    .line 235
    invoke-static {v1}, La/a;->i(Lq6/E;)Lq6/z;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    iput-object v0, p0, Lw2/e;->z:Lq6/z;

    .line 240
    .line 241
    iput v2, p0, Lw2/e;->y:I

    .line 242
    .line 243
    iput-boolean v2, p0, Lw2/e;->A:Z

    .line 244
    .line 245
    iput-boolean v2, p0, Lw2/e;->E:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 246
    .line 247
    monitor-exit p0

    .line 248
    return-void

    .line 249
    :cond_5
    :try_start_5
    throw v0

    .line 250
    :goto_7
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 251
    throw v0
.end method

.method public final declared-synchronized b(Ljava/lang/String;)LK2/a;
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lw2/e;->C:Z

    .line 3
    .line 4
    if-nez v0, :cond_7

    .line 5
    .line 6
    invoke-static {p1}, Lw2/e;->M(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lw2/e;->e()V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lw2/e;->v:Ljava/util/LinkedHashMap;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lw2/a;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    iget-object v2, v0, Lw2/a;->g:LK2/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    goto :goto_2

    .line 28
    :cond_0
    move-object v2, v1

    .line 29
    :goto_0
    if-eqz v2, :cond_1

    .line 30
    .line 31
    monitor-exit p0

    .line 32
    return-object v1

    .line 33
    :cond_1
    if-eqz v0, :cond_2

    .line 34
    .line 35
    :try_start_1
    iget v2, v0, Lw2/a;->h:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    monitor-exit p0

    .line 40
    return-object v1

    .line 41
    :cond_2
    :try_start_2
    iget-boolean v2, p0, Lw2/e;->D:Z

    .line 42
    .line 43
    if-nez v2, :cond_6

    .line 44
    .line 45
    iget-boolean v2, p0, Lw2/e;->E:Z

    .line 46
    .line 47
    if-eqz v2, :cond_3

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_3
    iget-object v2, p0, Lw2/e;->z:Lq6/z;

    .line 51
    .line 52
    invoke-static {v2}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    const-string v3, "DIRTY"

    .line 56
    .line 57
    invoke-virtual {v2, v3}, Lq6/z;->R(Ljava/lang/String;)Lq6/h;

    .line 58
    .line 59
    .line 60
    const/16 v3, 0x20

    .line 61
    .line 62
    invoke-virtual {v2, v3}, Lq6/z;->writeByte(I)Lq6/h;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2, p1}, Lq6/z;->R(Ljava/lang/String;)Lq6/h;

    .line 66
    .line 67
    .line 68
    const/16 v3, 0xa

    .line 69
    .line 70
    invoke-virtual {v2, v3}, Lq6/z;->writeByte(I)Lq6/h;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2}, Lq6/z;->flush()V

    .line 74
    .line 75
    .line 76
    iget-boolean v2, p0, Lw2/e;->A:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 77
    .line 78
    if-eqz v2, :cond_4

    .line 79
    .line 80
    monitor-exit p0

    .line 81
    return-object v1

    .line 82
    :cond_4
    if-nez v0, :cond_5

    .line 83
    .line 84
    :try_start_3
    new-instance v0, Lw2/a;

    .line 85
    .line 86
    invoke-direct {v0, p0, p1}, Lw2/a;-><init>(Lw2/e;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    iget-object v1, p0, Lw2/e;->v:Ljava/util/LinkedHashMap;

    .line 90
    .line 91
    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    :cond_5
    new-instance p1, LK2/a;

    .line 95
    .line 96
    invoke-direct {p1, p0, v0}, LK2/a;-><init>(Lw2/e;Lw2/a;)V

    .line 97
    .line 98
    .line 99
    iput-object p1, v0, Lw2/a;->g:LK2/a;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 100
    .line 101
    monitor-exit p0

    .line 102
    return-object p1

    .line 103
    :cond_6
    :goto_1
    :try_start_4
    invoke-virtual {p0}, Lw2/e;->f()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 104
    .line 105
    .line 106
    monitor-exit p0

    .line 107
    return-object v1

    .line 108
    :cond_7
    :try_start_5
    const-string p1, "cache is closed"

    .line 109
    .line 110
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 111
    .line 112
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    throw v0

    .line 116
    :goto_2
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 117
    throw p1
.end method

.method public final declared-synchronized c(Ljava/lang/String;)Lw2/b;
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lw2/e;->C:Z

    .line 3
    .line 4
    if-nez v0, :cond_4

    .line 5
    .line 6
    invoke-static {p1}, Lw2/e;->M(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lw2/e;->e()V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lw2/e;->v:Ljava/util/LinkedHashMap;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lw2/a;

    .line 19
    .line 20
    if-eqz v0, :cond_3

    .line 21
    .line 22
    invoke-virtual {v0}, Lw2/a;->a()Lw2/b;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_0
    iget v1, p0, Lw2/e;->y:I

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    add-int/2addr v1, v2

    .line 33
    iput v1, p0, Lw2/e;->y:I

    .line 34
    .line 35
    iget-object v1, p0, Lw2/e;->z:Lq6/z;

    .line 36
    .line 37
    invoke-static {v1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    const-string v3, "READ"

    .line 41
    .line 42
    invoke-virtual {v1, v3}, Lq6/z;->R(Ljava/lang/String;)Lq6/h;

    .line 43
    .line 44
    .line 45
    const/16 v3, 0x20

    .line 46
    .line 47
    invoke-virtual {v1, v3}, Lq6/z;->writeByte(I)Lq6/h;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, p1}, Lq6/z;->R(Ljava/lang/String;)Lq6/h;

    .line 51
    .line 52
    .line 53
    const/16 p1, 0xa

    .line 54
    .line 55
    invoke-virtual {v1, p1}, Lq6/z;->writeByte(I)Lq6/h;

    .line 56
    .line 57
    .line 58
    iget p1, p0, Lw2/e;->y:I

    .line 59
    .line 60
    const/16 v1, 0x7d0

    .line 61
    .line 62
    if-lt p1, v1, :cond_1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    const/4 v2, 0x0

    .line 66
    :goto_0
    if-eqz v2, :cond_2

    .line 67
    .line 68
    invoke-virtual {p0}, Lw2/e;->f()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :catchall_0
    move-exception p1

    .line 73
    goto :goto_3

    .line 74
    :cond_2
    :goto_1
    monitor-exit p0

    .line 75
    return-object v0

    .line 76
    :cond_3
    :goto_2
    monitor-exit p0

    .line 77
    const/4 p1, 0x0

    .line 78
    return-object p1

    .line 79
    :cond_4
    :try_start_1
    const-string p1, "cache is closed"

    .line 80
    .line 81
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 82
    .line 83
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw v0

    .line 87
    :goto_3
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 88
    throw p1
.end method

.method public final declared-synchronized close()V
    .locals 7

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lw2/e;->B:Z

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    iget-boolean v0, p0, Lw2/e;->C:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    iget-object v0, p0, Lw2/e;->v:Ljava/util/LinkedHashMap;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v2, 0x0

    .line 19
    new-array v3, v2, [Lw2/a;

    .line 20
    .line 21
    invoke-interface {v0, v3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, [Lw2/a;

    .line 26
    .line 27
    array-length v3, v0

    .line 28
    :goto_0
    if-ge v2, v3, :cond_2

    .line 29
    .line 30
    aget-object v4, v0, v2

    .line 31
    .line 32
    iget-object v4, v4, Lw2/a;->g:LK2/a;

    .line 33
    .line 34
    if-eqz v4, :cond_1

    .line 35
    .line 36
    iget-object v5, v4, LK2/a;->c:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v5, Lw2/a;

    .line 39
    .line 40
    iget-object v6, v5, Lw2/a;->g:LK2/a;

    .line 41
    .line 42
    invoke-static {v6, v4}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    if-eqz v4, :cond_1

    .line 47
    .line 48
    iput-boolean v1, v5, Lw2/a;->f:Z

    .line 49
    .line 50
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :catchall_0
    move-exception v0

    .line 54
    goto :goto_2

    .line 55
    :cond_2
    invoke-virtual {p0}, Lw2/e;->K()V

    .line 56
    .line 57
    .line 58
    iget-object v0, p0, Lw2/e;->w:LR5/d;

    .line 59
    .line 60
    const/4 v2, 0x0

    .line 61
    invoke-static {v0, v2}, LM5/y;->e(LM5/w;Ljava/util/concurrent/CancellationException;)V

    .line 62
    .line 63
    .line 64
    iget-object v0, p0, Lw2/e;->z:Lq6/z;

    .line 65
    .line 66
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Lq6/z;->close()V

    .line 70
    .line 71
    .line 72
    iput-object v2, p0, Lw2/e;->z:Lq6/z;

    .line 73
    .line 74
    iput-boolean v1, p0, Lw2/e;->C:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 75
    .line 76
    monitor-exit p0

    .line 77
    return-void

    .line 78
    :cond_3
    :goto_1
    :try_start_1
    iput-boolean v1, p0, Lw2/e;->C:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 79
    .line 80
    monitor-exit p0

    .line 81
    return-void

    .line 82
    :goto_2
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 83
    throw v0
.end method

.method public final declared-synchronized e()V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lw2/e;->B:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_1
    iget-object v0, p0, Lw2/e;->F:Lw2/c;

    .line 9
    .line 10
    iget-object v1, p0, Lw2/e;->t:Lq6/x;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lq6/l;->n(Lq6/x;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lw2/e;->F:Lw2/c;

    .line 16
    .line 17
    iget-object v1, p0, Lw2/e;->u:Lq6/x;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lq6/l;->v(Lq6/x;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    iget-object v0, p0, Lw2/e;->F:Lw2/c;

    .line 26
    .line 27
    iget-object v1, p0, Lw2/e;->s:Lq6/x;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Lq6/l;->v(Lq6/x;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    iget-object v0, p0, Lw2/e;->F:Lw2/c;

    .line 36
    .line 37
    iget-object v1, p0, Lw2/e;->u:Lq6/x;

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Lq6/l;->n(Lq6/x;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :catchall_0
    move-exception v0

    .line 44
    goto :goto_2

    .line 45
    :cond_1
    iget-object v0, p0, Lw2/e;->F:Lw2/c;

    .line 46
    .line 47
    iget-object v1, p0, Lw2/e;->u:Lq6/x;

    .line 48
    .line 49
    iget-object v2, p0, Lw2/e;->s:Lq6/x;

    .line 50
    .line 51
    invoke-virtual {v0, v1, v2}, Lq6/m;->b(Lq6/x;Lq6/x;)V

    .line 52
    .line 53
    .line 54
    :cond_2
    :goto_0
    iget-object v0, p0, Lw2/e;->F:Lw2/c;

    .line 55
    .line 56
    iget-object v1, p0, Lw2/e;->s:Lq6/x;

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Lq6/l;->v(Lq6/x;)Z

    .line 59
    .line 60
    .line 61
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 62
    const/4 v1, 0x1

    .line 63
    if-eqz v0, :cond_3

    .line 64
    .line 65
    :try_start_2
    invoke-virtual {p0}, Lw2/e;->v()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, Lw2/e;->n()V

    .line 69
    .line 70
    .line 71
    iput-boolean v1, p0, Lw2/e;->B:Z
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 72
    .line 73
    monitor-exit p0

    .line 74
    return-void

    .line 75
    :catch_0
    const/4 v0, 0x0

    .line 76
    :try_start_3
    invoke-virtual {p0}, Lw2/e;->close()V

    .line 77
    .line 78
    .line 79
    iget-object v2, p0, Lw2/e;->F:Lw2/c;

    .line 80
    .line 81
    iget-object v3, p0, Lw2/e;->q:Lq6/x;

    .line 82
    .line 83
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/measurement/K1;->n(Lq6/l;Lq6/x;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 84
    .line 85
    .line 86
    :try_start_4
    iput-boolean v0, p0, Lw2/e;->C:Z

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :catchall_1
    move-exception v1

    .line 90
    iput-boolean v0, p0, Lw2/e;->C:Z

    .line 91
    .line 92
    throw v1

    .line 93
    :cond_3
    :goto_1
    invoke-virtual {p0}, Lw2/e;->W()V

    .line 94
    .line 95
    .line 96
    iput-boolean v1, p0, Lw2/e;->B:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 97
    .line 98
    monitor-exit p0

    .line 99
    return-void

    .line 100
    :goto_2
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 101
    throw v0
.end method

.method public final f()V
    .locals 4

    .line 1
    new-instance v0, Lw2/d;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lw2/d;-><init>(Lw2/e;Lq5/c;)V

    .line 5
    .line 6
    .line 7
    const/4 v2, 0x3

    .line 8
    iget-object v3, p0, Lw2/e;->w:LR5/d;

    .line 9
    .line 10
    invoke-static {v3, v1, v1, v0, v2}, LM5/y;->t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final declared-synchronized flush()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lw2/e;->B:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_1
    iget-boolean v0, p0, Lw2/e;->C:Z

    .line 9
    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, Lw2/e;->K()V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lw2/e;->z:Lq6/z;

    .line 16
    .line 17
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Lq6/z;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    .line 22
    .line 23
    monitor-exit p0

    .line 24
    return-void

    .line 25
    :catchall_0
    move-exception v0

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    :try_start_2
    const-string v0, "cache is closed"

    .line 28
    .line 29
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 30
    .line 31
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw v1

    .line 35
    :goto_0
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 36
    throw v0
.end method

.method public final n()V
    .locals 9

    .line 1
    iget-object v0, p0, Lw2/e;->v:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-wide/16 v1, 0x0

    .line 12
    .line 13
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-eqz v3, :cond_3

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    check-cast v3, Lw2/a;

    .line 24
    .line 25
    iget-object v4, v3, Lw2/a;->g:LK2/a;

    .line 26
    .line 27
    const/4 v5, 0x2

    .line 28
    const/4 v6, 0x0

    .line 29
    if-nez v4, :cond_1

    .line 30
    .line 31
    :goto_1
    if-ge v6, v5, :cond_0

    .line 32
    .line 33
    iget-object v4, v3, Lw2/a;->b:[J

    .line 34
    .line 35
    aget-wide v7, v4, v6

    .line 36
    .line 37
    add-long/2addr v1, v7

    .line 38
    add-int/lit8 v6, v6, 0x1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const/4 v4, 0x0

    .line 42
    iput-object v4, v3, Lw2/a;->g:LK2/a;

    .line 43
    .line 44
    :goto_2
    if-ge v6, v5, :cond_2

    .line 45
    .line 46
    iget-object v4, v3, Lw2/a;->c:Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    check-cast v4, Lq6/x;

    .line 53
    .line 54
    iget-object v7, p0, Lw2/e;->F:Lw2/c;

    .line 55
    .line 56
    invoke-virtual {v7, v4}, Lq6/l;->n(Lq6/x;)V

    .line 57
    .line 58
    .line 59
    iget-object v4, v3, Lw2/a;->d:Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    check-cast v4, Lq6/x;

    .line 66
    .line 67
    invoke-virtual {v7, v4}, Lq6/l;->n(Lq6/x;)V

    .line 68
    .line 69
    .line 70
    add-int/lit8 v6, v6, 0x1

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_3
    iput-wide v1, p0, Lw2/e;->x:J

    .line 78
    .line 79
    return-void
.end method

.method public final v()V
    .locals 13

    .line 1
    const-string v0, ", "

    .line 2
    .line 3
    const-string v1, "unexpected journal header: ["

    .line 4
    .line 5
    iget-object v2, p0, Lw2/e;->F:Lw2/c;

    .line 6
    .line 7
    iget-object v3, p0, Lw2/e;->s:Lq6/x;

    .line 8
    .line 9
    invoke-virtual {v2, v3}, Lq6/m;->a0(Lq6/x;)Lq6/G;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    invoke-static {v4}, La/a;->j(Lq6/G;)Lq6/A;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    const-wide v5, 0x7fffffffffffffffL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    :try_start_0
    invoke-virtual {v4, v5, v6}, Lq6/A;->E(J)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v7

    .line 26
    invoke-virtual {v4, v5, v6}, Lq6/A;->E(J)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v8

    .line 30
    invoke-virtual {v4, v5, v6}, Lq6/A;->E(J)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v9

    .line 34
    invoke-virtual {v4, v5, v6}, Lq6/A;->E(J)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v10

    .line 38
    invoke-virtual {v4, v5, v6}, Lq6/A;->E(J)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v11

    .line 42
    const-string v12, "libcore.io.DiskLruCache"

    .line 43
    .line 44
    invoke-virtual {v12, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v12

    .line 48
    if-eqz v12, :cond_1

    .line 49
    .line 50
    const-string v12, "1"

    .line 51
    .line 52
    invoke-virtual {v12, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v12

    .line 56
    if-eqz v12, :cond_1

    .line 57
    .line 58
    const/4 v12, 0x1

    .line 59
    invoke-static {v12}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v12

    .line 63
    invoke-static {v12, v9}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v12

    .line 67
    if-eqz v12, :cond_1

    .line 68
    .line 69
    const/4 v12, 0x2

    .line 70
    invoke-static {v12}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v12

    .line 74
    invoke-static {v12, v10}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v12

    .line 78
    if-eqz v12, :cond_1

    .line 79
    .line 80
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 81
    .line 82
    .line 83
    move-result v12
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 84
    if-gtz v12, :cond_1

    .line 85
    .line 86
    const/4 v0, 0x0

    .line 87
    :goto_0
    :try_start_1
    invoke-virtual {v4, v5, v6}, Lq6/A;->E(J)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-virtual {p0, v1}, Lw2/e;->z(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 92
    .line 93
    .line 94
    add-int/lit8 v0, v0, 0x1

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :catchall_0
    move-exception v0

    .line 98
    goto :goto_2

    .line 99
    :catch_0
    :try_start_2
    iget-object v1, p0, Lw2/e;->v:Ljava/util/LinkedHashMap;

    .line 100
    .line 101
    invoke-virtual {v1}, Ljava/util/AbstractMap;->size()I

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    sub-int/2addr v0, v1

    .line 106
    iput v0, p0, Lw2/e;->y:I

    .line 107
    .line 108
    invoke-virtual {v4}, Lq6/A;->a()Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-nez v0, :cond_0

    .line 113
    .line 114
    invoke-virtual {p0}, Lw2/e;->W()V

    .line 115
    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    const-string v0, "file"

    .line 122
    .line 123
    invoke-static {v3, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2, v3}, Lq6/m;->a(Lq6/x;)Lq6/E;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    new-instance v1, Lw2/f;

    .line 131
    .line 132
    new-instance v2, LJ5/i;

    .line 133
    .line 134
    const/16 v3, 0xe

    .line 135
    .line 136
    invoke-direct {v2, v3, p0}, LJ5/i;-><init>(ILjava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    invoke-direct {v1, v0, v2}, Lw2/f;-><init>(Lq6/E;LJ5/i;)V

    .line 140
    .line 141
    .line 142
    invoke-static {v1}, La/a;->i(Lq6/E;)Lq6/z;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    iput-object v0, p0, Lw2/e;->z:Lq6/z;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 147
    .line 148
    :goto_1
    :try_start_3
    invoke-virtual {v4}, Lq6/A;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 149
    .line 150
    .line 151
    const/4 v0, 0x0

    .line 152
    goto :goto_3

    .line 153
    :catchall_1
    move-exception v0

    .line 154
    goto :goto_3

    .line 155
    :cond_1
    :try_start_4
    new-instance v2, Ljava/io/IOException;

    .line 156
    .line 157
    new-instance v3, Ljava/lang/StringBuilder;

    .line 158
    .line 159
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    const/16 v0, 0x5d

    .line 190
    .line 191
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    invoke-direct {v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 202
    :goto_2
    :try_start_5
    invoke-virtual {v4}, Lq6/A;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 203
    .line 204
    .line 205
    goto :goto_3

    .line 206
    :catchall_2
    move-exception v1

    .line 207
    invoke-static {v0, v1}, Lm5/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 208
    .line 209
    .line 210
    :goto_3
    if-nez v0, :cond_2

    .line 211
    .line 212
    return-void

    .line 213
    :cond_2
    throw v0
.end method

.method public final z(Ljava/lang/String;)V
    .locals 11

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x6

    .line 5
    invoke-static {p1, v0, v1, v2}, LJ5/m;->R0(Ljava/lang/CharSequence;CII)I

    .line 6
    .line 7
    .line 8
    move-result v3

    .line 9
    const-string v4, "unexpected journal line: "

    .line 10
    .line 11
    const/4 v5, -0x1

    .line 12
    if-eq v3, v5, :cond_8

    .line 13
    .line 14
    add-int/lit8 v6, v3, 0x1

    .line 15
    .line 16
    const/4 v7, 0x4

    .line 17
    invoke-static {p1, v0, v6, v7}, LJ5/m;->R0(Ljava/lang/CharSequence;CII)I

    .line 18
    .line 19
    .line 20
    move-result v8

    .line 21
    iget-object v9, p0, Lw2/e;->v:Ljava/util/LinkedHashMap;

    .line 22
    .line 23
    const-string v10, "substring(...)"

    .line 24
    .line 25
    if-ne v8, v5, :cond_0

    .line 26
    .line 27
    invoke-virtual {p1, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    invoke-static {v6, v10}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    if-ne v3, v2, :cond_1

    .line 35
    .line 36
    const-string v2, "REMOVE"

    .line 37
    .line 38
    invoke-static {p1, v2, v1}, LJ5/t;->G0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_1

    .line 43
    .line 44
    invoke-virtual {v9, v6}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_0
    invoke-virtual {p1, v6, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    invoke-static {v6, v10}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    invoke-virtual {v9, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    if-nez v2, :cond_2

    .line 60
    .line 61
    new-instance v2, Lw2/a;

    .line 62
    .line 63
    invoke-direct {v2, p0, v6}, Lw2/a;-><init>(Lw2/e;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-interface {v9, v6, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    :cond_2
    check-cast v2, Lw2/a;

    .line 70
    .line 71
    const/4 v6, 0x5

    .line 72
    if-eq v8, v5, :cond_4

    .line 73
    .line 74
    if-ne v3, v6, :cond_4

    .line 75
    .line 76
    const-string v9, "CLEAN"

    .line 77
    .line 78
    invoke-static {p1, v9, v1}, LJ5/t;->G0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 79
    .line 80
    .line 81
    move-result v9

    .line 82
    if-eqz v9, :cond_4

    .line 83
    .line 84
    const/4 v3, 0x1

    .line 85
    add-int/2addr v8, v3

    .line 86
    invoke-virtual {p1, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-static {p1, v10}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    new-array v5, v3, [C

    .line 94
    .line 95
    aput-char v0, v5, v1

    .line 96
    .line 97
    invoke-static {p1, v5}, LJ5/m;->e1(Ljava/lang/String;[C)Ljava/util/List;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    iput-boolean v3, v2, Lw2/a;->e:Z

    .line 102
    .line 103
    const/4 v0, 0x0

    .line 104
    iput-object v0, v2, Lw2/a;->g:LK2/a;

    .line 105
    .line 106
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    const/4 v3, 0x2

    .line 111
    if-ne v0, v3, :cond_3

    .line 112
    .line 113
    :try_start_0
    move-object v0, p1

    .line 114
    check-cast v0, Ljava/util/Collection;

    .line 115
    .line 116
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    :goto_0
    if-ge v1, v0, :cond_6

    .line 121
    .line 122
    iget-object v3, v2, Lw2/a;->b:[J

    .line 123
    .line 124
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v5

    .line 128
    check-cast v5, Ljava/lang/String;

    .line 129
    .line 130
    invoke-static {v5}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 131
    .line 132
    .line 133
    move-result-wide v5

    .line 134
    aput-wide v5, v3, v1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 135
    .line 136
    add-int/lit8 v1, v1, 0x1

    .line 137
    .line 138
    goto :goto_0

    .line 139
    :catch_0
    new-instance v0, Ljava/io/IOException;

    .line 140
    .line 141
    new-instance v1, Ljava/lang/StringBuilder;

    .line 142
    .line 143
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    throw v0

    .line 157
    :cond_3
    new-instance v0, Ljava/io/IOException;

    .line 158
    .line 159
    new-instance v1, Ljava/lang/StringBuilder;

    .line 160
    .line 161
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    throw v0

    .line 175
    :cond_4
    if-ne v8, v5, :cond_5

    .line 176
    .line 177
    if-ne v3, v6, :cond_5

    .line 178
    .line 179
    const-string v0, "DIRTY"

    .line 180
    .line 181
    invoke-static {p1, v0, v1}, LJ5/t;->G0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 182
    .line 183
    .line 184
    move-result v0

    .line 185
    if-eqz v0, :cond_5

    .line 186
    .line 187
    new-instance p1, LK2/a;

    .line 188
    .line 189
    invoke-direct {p1, p0, v2}, LK2/a;-><init>(Lw2/e;Lw2/a;)V

    .line 190
    .line 191
    .line 192
    iput-object p1, v2, Lw2/a;->g:LK2/a;

    .line 193
    .line 194
    return-void

    .line 195
    :cond_5
    if-ne v8, v5, :cond_7

    .line 196
    .line 197
    if-ne v3, v7, :cond_7

    .line 198
    .line 199
    const-string v0, "READ"

    .line 200
    .line 201
    invoke-static {p1, v0, v1}, LJ5/t;->G0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 202
    .line 203
    .line 204
    move-result v0

    .line 205
    if-eqz v0, :cond_7

    .line 206
    .line 207
    :cond_6
    return-void

    .line 208
    :cond_7
    new-instance v0, Ljava/io/IOException;

    .line 209
    .line 210
    invoke-virtual {v4, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    throw v0

    .line 218
    :cond_8
    new-instance v0, Ljava/io/IOException;

    .line 219
    .line 220
    invoke-virtual {v4, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    throw v0
.end method
