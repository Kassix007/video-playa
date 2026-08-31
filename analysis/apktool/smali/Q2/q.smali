.class public final LQ2/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LL2/g;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:LU2/n;

.field public final c:Lm5/h;

.field public final d:Lm5/o;

.field public final e:Lm5/h;

.field public final f:LQ2/e;


# direct methods
.method public constructor <init>(Ljava/lang/String;LU2/n;Lm5/o;Lm5/o;Lm5/o;LQ2/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LQ2/q;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, LQ2/q;->b:LU2/n;

    .line 7
    .line 8
    iput-object p3, p0, LQ2/q;->c:Lm5/h;

    .line 9
    .line 10
    iput-object p4, p0, LQ2/q;->d:Lm5/o;

    .line 11
    .line 12
    iput-object p5, p0, LQ2/q;->e:Lm5/h;

    .line 13
    .line 14
    iput-object p6, p0, LQ2/q;->f:LQ2/e;

    .line 15
    .line 16
    return-void
.end method

.method public static final b(LQ2/q;LQ2/v;Ls5/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, LQ2/o;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, LQ2/o;

    .line 7
    .line 8
    iget v1, v0, LQ2/o;->t:I

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
    iput v1, v0, LQ2/o;->t:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LQ2/o;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, LQ2/o;-><init>(LQ2/q;Ls5/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, LQ2/o;->r:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, LQ2/o;->t:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    iget-object p1, v0, LQ2/o;->q:Lq6/g;

    .line 35
    .line 36
    invoke-static {p2}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 41
    .line 42
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p0

    .line 48
    :cond_2
    invoke-static {p2}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    new-instance p2, Lq6/g;

    .line 52
    .line 53
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object p2, v0, LQ2/o;->q:Lq6/g;

    .line 57
    .line 58
    iput v2, v0, LQ2/o;->t:I

    .line 59
    .line 60
    iget-object p1, p1, LQ2/v;->q:Lq6/i;

    .line 61
    .line 62
    invoke-interface {p1, p2}, Lq6/i;->T(Lq6/h;)J

    .line 63
    .line 64
    .line 65
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 66
    .line 67
    sget-object v0, Lr5/a;->q:Lr5/a;

    .line 68
    .line 69
    if-ne p1, v0, :cond_3

    .line 70
    .line 71
    return-object v0

    .line 72
    :cond_3
    move-object p1, p2

    .line 73
    :goto_1
    invoke-virtual {p0}, LQ2/q;->e()Lq6/l;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    new-instance p2, LJ2/s;

    .line 78
    .line 79
    const/4 v0, 0x0

    .line 80
    invoke-direct {p2, p1, p0, v0}, LJ2/s;-><init>(Lq6/i;Lq6/l;LE3/h;)V

    .line 81
    .line 82
    .line 83
    return-object p2
.end method

.method public static final c(LQ2/q;LK2/h;LQ2/u;LQ2/u;Ls5/c;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    move-object/from16 v4, p4

    .line 10
    .line 11
    instance-of v5, v4, LQ2/p;

    .line 12
    .line 13
    if-eqz v5, :cond_0

    .line 14
    .line 15
    move-object v5, v4

    .line 16
    check-cast v5, LQ2/p;

    .line 17
    .line 18
    iget v6, v5, LQ2/p;->v:I

    .line 19
    .line 20
    const/high16 v7, -0x80000000

    .line 21
    .line 22
    and-int v8, v6, v7

    .line 23
    .line 24
    if-eqz v8, :cond_0

    .line 25
    .line 26
    sub-int/2addr v6, v7

    .line 27
    iput v6, v5, LQ2/p;->v:I

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    new-instance v5, LQ2/p;

    .line 31
    .line 32
    invoke-direct {v5, v1, v4}, LQ2/p;-><init>(LQ2/q;Ls5/c;)V

    .line 33
    .line 34
    .line 35
    :goto_0
    iget-object v4, v5, LQ2/p;->t:Ljava/lang/Object;

    .line 36
    .line 37
    sget-object v6, Lr5/a;->q:Lr5/a;

    .line 38
    .line 39
    iget v7, v5, LQ2/p;->v:I

    .line 40
    .line 41
    const/4 v8, 0x2

    .line 42
    const/4 v9, 0x0

    .line 43
    const/4 v10, 0x1

    .line 44
    const/4 v11, 0x0

    .line 45
    if-eqz v7, :cond_3

    .line 46
    .line 47
    if-eq v7, v10, :cond_2

    .line 48
    .line 49
    if-ne v7, v8, :cond_1

    .line 50
    .line 51
    iget-object v1, v5, LQ2/p;->s:Lk3/c;

    .line 52
    .line 53
    iget-object v2, v5, LQ2/p;->r:LQ2/u;

    .line 54
    .line 55
    iget-object v0, v5, LQ2/p;->q:Ljava/lang/Object;

    .line 56
    .line 57
    move-object v3, v0

    .line 58
    check-cast v3, LQ2/u;

    .line 59
    .line 60
    :try_start_0
    invoke-static {v4}, Lm5/a;->e(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    .line 62
    .line 63
    move-object/from16 p4, v11

    .line 64
    .line 65
    goto/16 :goto_e

    .line 66
    .line 67
    :catch_0
    move-exception v0

    .line 68
    goto/16 :goto_10

    .line 69
    .line 70
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 71
    .line 72
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 73
    .line 74
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    throw v0

    .line 78
    :cond_2
    iget-object v0, v5, LQ2/p;->r:LQ2/u;

    .line 79
    .line 80
    iget-object v2, v5, LQ2/p;->q:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v2, LK2/h;

    .line 83
    .line 84
    invoke-static {v4}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    move-object v3, v0

    .line 88
    move-object v0, v2

    .line 89
    move-object/from16 p4, v11

    .line 90
    .line 91
    goto/16 :goto_4

    .line 92
    .line 93
    :cond_3
    invoke-static {v4}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    iget-object v4, v1, LQ2/q;->b:LU2/n;

    .line 97
    .line 98
    iget-object v4, v4, LU2/n;->h:LU2/b;

    .line 99
    .line 100
    iget-boolean v4, v4, LU2/b;->r:Z

    .line 101
    .line 102
    if-nez v4, :cond_5

    .line 103
    .line 104
    if-eqz v0, :cond_4

    .line 105
    .line 106
    :try_start_1
    invoke-static {v0}, LC0/S;->s(Ljava/lang/AutoCloseable;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 107
    .line 108
    .line 109
    :catch_1
    return-object v11

    .line 110
    :catch_2
    move-exception v0

    .line 111
    throw v0

    .line 112
    :cond_4
    move-object/from16 p4, v11

    .line 113
    .line 114
    goto/16 :goto_6

    .line 115
    .line 116
    :cond_5
    iget-object v4, v1, LQ2/q;->e:Lm5/h;

    .line 117
    .line 118
    invoke-interface {v4}, Lm5/h;->getValue()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    check-cast v4, LQ2/c;

    .line 123
    .line 124
    iput-object v0, v5, LQ2/p;->q:Ljava/lang/Object;

    .line 125
    .line 126
    iput-object v3, v5, LQ2/p;->r:LQ2/u;

    .line 127
    .line 128
    iput v10, v5, LQ2/p;->v:I

    .line 129
    .line 130
    check-cast v4, LR2/a;

    .line 131
    .line 132
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    iget v4, v3, LQ2/u;->a:I

    .line 136
    .line 137
    const/16 v7, 0x130

    .line 138
    .line 139
    if-ne v4, v7, :cond_8

    .line 140
    .line 141
    if-eqz v2, :cond_8

    .line 142
    .line 143
    iget-object v2, v2, LQ2/u;->d:LQ2/s;

    .line 144
    .line 145
    iget-object v4, v3, LQ2/u;->d:LQ2/s;

    .line 146
    .line 147
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    iget-object v2, v2, LQ2/s;->a:Ljava/util/Map;

    .line 151
    .line 152
    new-instance v7, Ljava/util/LinkedHashMap;

    .line 153
    .line 154
    invoke-direct {v7}, Ljava/util/LinkedHashMap;-><init>()V

    .line 155
    .line 156
    .line 157
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    check-cast v2, Ljava/lang/Iterable;

    .line 162
    .line 163
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 168
    .line 169
    .line 170
    move-result v12

    .line 171
    if-eqz v12, :cond_6

    .line 172
    .line 173
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v12

    .line 177
    check-cast v12, Ljava/util/Map$Entry;

    .line 178
    .line 179
    invoke-interface {v12}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v13

    .line 183
    invoke-interface {v12}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v12

    .line 187
    check-cast v12, Ljava/util/Collection;

    .line 188
    .line 189
    invoke-static {v12}, Ln5/l;->C0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 190
    .line 191
    .line 192
    move-result-object v12

    .line 193
    invoke-interface {v7, v13, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    goto :goto_1

    .line 197
    :cond_6
    iget-object v2, v4, LQ2/s;->a:Ljava/util/Map;

    .line 198
    .line 199
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 208
    .line 209
    .line 210
    move-result v4

    .line 211
    if-eqz v4, :cond_7

    .line 212
    .line 213
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v4

    .line 217
    check-cast v4, Ljava/util/Map$Entry;

    .line 218
    .line 219
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v12

    .line 223
    check-cast v12, Ljava/lang/String;

    .line 224
    .line 225
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v4

    .line 229
    check-cast v4, Ljava/util/List;

    .line 230
    .line 231
    sget-object v13, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 232
    .line 233
    invoke-virtual {v12, v13}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v12

    .line 237
    const-string v13, "toLowerCase(...)"

    .line 238
    .line 239
    invoke-static {v12, v13}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    check-cast v4, Ljava/util/Collection;

    .line 243
    .line 244
    invoke-static {v4}, Ln5/l;->C0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 245
    .line 246
    .line 247
    move-result-object v4

    .line 248
    invoke-interface {v7, v12, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    goto :goto_2

    .line 252
    :cond_7
    new-instance v2, LQ2/s;

    .line 253
    .line 254
    invoke-static {v7}, Ln5/x;->O(Ljava/util/Map;)Ljava/util/Map;

    .line 255
    .line 256
    .line 257
    move-result-object v4

    .line 258
    invoke-direct {v2, v4}, LQ2/s;-><init>(Ljava/util/Map;)V

    .line 259
    .line 260
    .line 261
    new-instance v4, LQ2/b;

    .line 262
    .line 263
    iget v14, v3, LQ2/u;->a:I

    .line 264
    .line 265
    iget-wide v12, v3, LQ2/u;->b:J

    .line 266
    .line 267
    move-object/from16 p4, v11

    .line 268
    .line 269
    move-wide v15, v12

    .line 270
    iget-wide v11, v3, LQ2/u;->c:J

    .line 271
    .line 272
    iget-object v7, v3, LQ2/u;->f:Ljava/lang/Object;

    .line 273
    .line 274
    new-instance v13, LQ2/u;

    .line 275
    .line 276
    const/16 v20, 0x0

    .line 277
    .line 278
    move-object/from16 v19, v2

    .line 279
    .line 280
    move-object/from16 v21, v7

    .line 281
    .line 282
    move-wide/from16 v17, v11

    .line 283
    .line 284
    invoke-direct/range {v13 .. v21}, LQ2/u;-><init>(IJJLQ2/s;LQ2/v;Ljava/lang/Object;)V

    .line 285
    .line 286
    .line 287
    invoke-direct {v4, v13}, LQ2/b;-><init>(LQ2/u;)V

    .line 288
    .line 289
    .line 290
    goto :goto_3

    .line 291
    :cond_8
    move-object/from16 p4, v11

    .line 292
    .line 293
    new-instance v2, LQ2/b;

    .line 294
    .line 295
    invoke-direct {v2, v3}, LQ2/b;-><init>(LQ2/u;)V

    .line 296
    .line 297
    .line 298
    move-object v4, v2

    .line 299
    :goto_3
    if-ne v4, v6, :cond_9

    .line 300
    .line 301
    goto/16 :goto_f

    .line 302
    .line 303
    :cond_9
    :goto_4
    check-cast v4, LQ2/b;

    .line 304
    .line 305
    iget-object v2, v4, LQ2/b;->a:LQ2/u;

    .line 306
    .line 307
    if-nez v2, :cond_a

    .line 308
    .line 309
    goto :goto_6

    .line 310
    :cond_a
    if-eqz v0, :cond_b

    .line 311
    .line 312
    iget-object v0, v0, LK2/h;->q:LK2/c;

    .line 313
    .line 314
    iget-object v4, v0, LK2/c;->s:LK2/f;

    .line 315
    .line 316
    iget-object v7, v4, LK2/f;->x:Ljava/lang/Object;

    .line 317
    .line 318
    monitor-enter v7

    .line 319
    :try_start_2
    invoke-virtual {v0}, LK2/c;->close()V

    .line 320
    .line 321
    .line 322
    iget-object v0, v0, LK2/c;->q:LK2/b;

    .line 323
    .line 324
    iget-object v0, v0, LK2/b;->a:Ljava/lang/String;

    .line 325
    .line 326
    invoke-virtual {v4, v0}, LK2/f;->b(Ljava/lang/String;)LK2/a;

    .line 327
    .line 328
    .line 329
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 330
    monitor-exit v7

    .line 331
    if-eqz v0, :cond_d

    .line 332
    .line 333
    new-instance v4, Lk3/c;

    .line 334
    .line 335
    invoke-direct {v4, v0}, Lk3/c;-><init>(Ljava/lang/Object;)V

    .line 336
    .line 337
    .line 338
    goto :goto_5

    .line 339
    :catchall_0
    move-exception v0

    .line 340
    monitor-exit v7

    .line 341
    throw v0

    .line 342
    :cond_b
    iget-object v0, v1, LQ2/q;->d:Lm5/o;

    .line 343
    .line 344
    invoke-virtual {v0}, Lm5/o;->getValue()Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    check-cast v0, LK2/i;

    .line 349
    .line 350
    if-eqz v0, :cond_d

    .line 351
    .line 352
    iget-object v4, v1, LQ2/q;->b:LU2/n;

    .line 353
    .line 354
    iget-object v4, v4, LU2/n;->e:Ljava/lang/String;

    .line 355
    .line 356
    if-nez v4, :cond_c

    .line 357
    .line 358
    iget-object v4, v1, LQ2/q;->a:Ljava/lang/String;

    .line 359
    .line 360
    :cond_c
    iget-object v0, v0, LK2/i;->b:LK2/f;

    .line 361
    .line 362
    sget-object v7, Lq6/j;->t:Lq6/j;

    .line 363
    .line 364
    invoke-static {v4}, LO3/B;->h(Ljava/lang/String;)Lq6/j;

    .line 365
    .line 366
    .line 367
    move-result-object v4

    .line 368
    const-string v7, "SHA-256"

    .line 369
    .line 370
    invoke-virtual {v4, v7}, Lq6/j;->b(Ljava/lang/String;)Lq6/j;

    .line 371
    .line 372
    .line 373
    move-result-object v4

    .line 374
    invoke-virtual {v4}, Lq6/j;->d()Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object v4

    .line 378
    invoke-virtual {v0, v4}, LK2/f;->b(Ljava/lang/String;)LK2/a;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    if-eqz v0, :cond_d

    .line 383
    .line 384
    new-instance v4, Lk3/c;

    .line 385
    .line 386
    invoke-direct {v4, v0}, Lk3/c;-><init>(Ljava/lang/Object;)V

    .line 387
    .line 388
    .line 389
    goto :goto_5

    .line 390
    :cond_d
    move-object/from16 v4, p4

    .line 391
    .line 392
    :goto_5
    if-nez v4, :cond_e

    .line 393
    .line 394
    :goto_6
    return-object p4

    .line 395
    :cond_e
    :try_start_3
    invoke-virtual {v1}, LQ2/q;->e()Lq6/l;

    .line 396
    .line 397
    .line 398
    move-result-object v0

    .line 399
    iget-object v7, v4, Lk3/c;->q:Ljava/lang/Object;

    .line 400
    .line 401
    check-cast v7, LK2/a;

    .line 402
    .line 403
    invoke-virtual {v7, v9}, LK2/a;->b(I)Lq6/x;

    .line 404
    .line 405
    .line 406
    move-result-object v7

    .line 407
    invoke-virtual {v0, v7, v9}, Lq6/l;->W(Lq6/x;Z)Lq6/E;

    .line 408
    .line 409
    .line 410
    move-result-object v0

    .line 411
    invoke-static {v0}, La/a;->i(Lq6/E;)Lq6/z;

    .line 412
    .line 413
    .line 414
    move-result-object v7
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 415
    :try_start_4
    invoke-static {v2, v7}, LQ2/g;->R(LQ2/u;Lq6/z;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 416
    .line 417
    .line 418
    :try_start_5
    invoke-virtual {v7}, Lq6/z;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 419
    .line 420
    .line 421
    move-object/from16 v0, p4

    .line 422
    .line 423
    goto :goto_8

    .line 424
    :catchall_1
    move-exception v0

    .line 425
    goto :goto_8

    .line 426
    :catchall_2
    move-exception v0

    .line 427
    move-object v11, v0

    .line 428
    :try_start_6
    invoke-virtual {v7}, Lq6/z;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 429
    .line 430
    .line 431
    goto :goto_7

    .line 432
    :catchall_3
    move-exception v0

    .line 433
    :try_start_7
    invoke-static {v11, v0}, Lm5/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 434
    .line 435
    .line 436
    :goto_7
    move-object v0, v11

    .line 437
    :goto_8
    if-nez v0, :cond_12

    .line 438
    .line 439
    iget-object v0, v2, LQ2/u;->e:LQ2/v;

    .line 440
    .line 441
    if-eqz v0, :cond_10

    .line 442
    .line 443
    invoke-virtual {v1}, LQ2/q;->e()Lq6/l;

    .line 444
    .line 445
    .line 446
    move-result-object v1

    .line 447
    iget-object v7, v4, Lk3/c;->q:Ljava/lang/Object;

    .line 448
    .line 449
    check-cast v7, LK2/a;

    .line 450
    .line 451
    invoke-virtual {v7, v10}, LK2/a;->b(I)Lq6/x;

    .line 452
    .line 453
    .line 454
    move-result-object v7

    .line 455
    iput-object v3, v5, LQ2/p;->q:Ljava/lang/Object;

    .line 456
    .line 457
    iput-object v2, v5, LQ2/p;->r:LQ2/u;

    .line 458
    .line 459
    iput-object v4, v5, LQ2/p;->s:Lk3/c;

    .line 460
    .line 461
    iput v8, v5, LQ2/p;->v:I

    .line 462
    .line 463
    iget-object v0, v0, LQ2/v;->q:Lq6/i;

    .line 464
    .line 465
    invoke-virtual {v1, v7, v9}, Lq6/l;->W(Lq6/x;Z)Lq6/E;

    .line 466
    .line 467
    .line 468
    move-result-object v1

    .line 469
    invoke-static {v1}, La/a;->i(Lq6/E;)Lq6/z;

    .line 470
    .line 471
    .line 472
    move-result-object v1
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3

    .line 473
    :try_start_8
    invoke-interface {v0, v1}, Lq6/i;->T(Lq6/h;)J

    .line 474
    .line 475
    .line 476
    move-result-wide v7

    .line 477
    new-instance v0, Ljava/lang/Long;

    .line 478
    .line 479
    invoke-direct {v0, v7, v8}, Ljava/lang/Long;-><init>(J)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 480
    .line 481
    .line 482
    :try_start_9
    invoke-virtual {v1}, Lq6/z;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 483
    .line 484
    .line 485
    move-object/from16 v0, p4

    .line 486
    .line 487
    goto :goto_c

    .line 488
    :catchall_4
    move-exception v0

    .line 489
    goto :goto_c

    .line 490
    :goto_9
    move-object v5, v0

    .line 491
    goto :goto_a

    .line 492
    :catchall_5
    move-exception v0

    .line 493
    goto :goto_9

    .line 494
    :goto_a
    :try_start_a
    invoke-virtual {v1}, Lq6/z;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    .line 495
    .line 496
    .line 497
    goto :goto_b

    .line 498
    :catchall_6
    move-exception v0

    .line 499
    :try_start_b
    invoke-static {v5, v0}, Lm5/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 500
    .line 501
    .line 502
    :goto_b
    move-object v0, v5

    .line 503
    :goto_c
    if-nez v0, :cond_f

    .line 504
    .line 505
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 506
    .line 507
    if-ne v0, v6, :cond_10

    .line 508
    .line 509
    goto :goto_f

    .line 510
    :cond_f
    throw v0
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_3

    .line 511
    :goto_d
    move-object v1, v4

    .line 512
    goto :goto_10

    .line 513
    :catch_3
    move-exception v0

    .line 514
    goto :goto_d

    .line 515
    :cond_10
    move-object v1, v4

    .line 516
    :goto_e
    :try_start_c
    iget-object v0, v1, Lk3/c;->q:Ljava/lang/Object;

    .line 517
    .line 518
    check-cast v0, LK2/a;

    .line 519
    .line 520
    iget-object v4, v0, LK2/a;->e:Ljava/lang/Object;

    .line 521
    .line 522
    check-cast v4, LK2/f;

    .line 523
    .line 524
    iget-object v5, v4, LK2/f;->x:Ljava/lang/Object;

    .line 525
    .line 526
    monitor-enter v5
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_0

    .line 527
    :try_start_d
    invoke-virtual {v0, v10}, LK2/a;->a(Z)V

    .line 528
    .line 529
    .line 530
    iget-object v0, v0, LK2/a;->c:Ljava/lang/Object;

    .line 531
    .line 532
    check-cast v0, LK2/b;

    .line 533
    .line 534
    iget-object v0, v0, LK2/b;->a:Ljava/lang/String;

    .line 535
    .line 536
    invoke-virtual {v4, v0}, LK2/f;->c(Ljava/lang/String;)LK2/c;

    .line 537
    .line 538
    .line 539
    move-result-object v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    .line 540
    :try_start_e
    monitor-exit v5

    .line 541
    if-eqz v0, :cond_11

    .line 542
    .line 543
    new-instance v4, LK2/h;

    .line 544
    .line 545
    invoke-direct {v4, v0}, LK2/h;-><init>(LK2/c;)V

    .line 546
    .line 547
    .line 548
    move-object v6, v4

    .line 549
    goto :goto_f

    .line 550
    :cond_11
    move-object/from16 v6, p4

    .line 551
    .line 552
    :goto_f
    return-object v6

    .line 553
    :catchall_7
    move-exception v0

    .line 554
    monitor-exit v5

    .line 555
    throw v0
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_0

    .line 556
    :cond_12
    :try_start_f
    throw v0
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_3

    .line 557
    :goto_10
    :try_start_10
    iget-object v1, v1, Lk3/c;->q:Ljava/lang/Object;

    .line 558
    .line 559
    check-cast v1, LK2/a;

    .line 560
    .line 561
    invoke-virtual {v1, v9}, LK2/a;->a(Z)V
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_4

    .line 562
    .line 563
    .line 564
    :catch_4
    iget-object v1, v3, LQ2/u;->e:LQ2/v;

    .line 565
    .line 566
    if-eqz v1, :cond_13

    .line 567
    .line 568
    :try_start_11
    invoke-static {v1}, LC0/S;->s(Ljava/lang/AutoCloseable;)V
    :try_end_11
    .catch Ljava/lang/RuntimeException; {:try_start_11 .. :try_end_11} :catch_5
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_6

    .line 569
    .line 570
    .line 571
    goto :goto_11

    .line 572
    :catch_5
    move-exception v0

    .line 573
    throw v0

    .line 574
    :catch_6
    :cond_13
    :goto_11
    iget-object v1, v2, LQ2/u;->e:LQ2/v;

    .line 575
    .line 576
    if-eqz v1, :cond_14

    .line 577
    .line 578
    :try_start_12
    invoke-static {v1}, LC0/S;->s(Ljava/lang/AutoCloseable;)V
    :try_end_12
    .catch Ljava/lang/RuntimeException; {:try_start_12 .. :try_end_12} :catch_7
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_8

    .line 579
    .line 580
    .line 581
    goto :goto_12

    .line 582
    :catch_7
    move-exception v0

    .line 583
    throw v0

    .line 584
    :catch_8
    :cond_14
    :goto_12
    throw v0
.end method

.method public static f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const-string v0, "text/plain"

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-static {p1, v0, v1}, LJ5/t;->G0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    :cond_0
    invoke-static {p0}, LE3/h;->B(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    if-eqz p0, :cond_1

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_1
    if-eqz p1, :cond_2

    .line 20
    .line 21
    const/16 p0, 0x3b

    .line 22
    .line 23
    invoke-static {p1, p0}, LJ5/m;->j1(Ljava/lang/String;C)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0

    .line 28
    :cond_2
    const/4 p0, 0x0

    .line 29
    return-object p0
.end method


# virtual methods
.method public final a(Lq5/c;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    instance-of v1, v0, LQ2/l;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move-object v1, v0

    .line 10
    check-cast v1, LQ2/l;

    .line 11
    .line 12
    iget v3, v1, LQ2/l;->u:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v1, LQ2/l;->u:I

    .line 22
    .line 23
    :goto_0
    move-object v6, v1

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v1, LQ2/l;

    .line 26
    .line 27
    check-cast v0, Ls5/c;

    .line 28
    .line 29
    invoke-direct {v1, v2, v0}, LQ2/l;-><init>(LQ2/q;Ls5/c;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :goto_1
    iget-object v0, v6, LQ2/l;->s:Ljava/lang/Object;

    .line 34
    .line 35
    iget v1, v6, LQ2/l;->u:I

    .line 36
    .line 37
    sget-object v3, LJ2/h;->s:LJ2/h;

    .line 38
    .line 39
    iget-object v4, v2, LQ2/q;->a:Ljava/lang/String;

    .line 40
    .line 41
    const/4 v7, 0x3

    .line 42
    const/4 v8, 0x2

    .line 43
    const/4 v5, 0x1

    .line 44
    const/4 v9, 0x0

    .line 45
    sget-object v10, Lr5/a;->q:Lr5/a;

    .line 46
    .line 47
    if-eqz v1, :cond_4

    .line 48
    .line 49
    if-eq v1, v5, :cond_3

    .line 50
    .line 51
    if-eq v1, v8, :cond_2

    .line 52
    .line 53
    if-ne v1, v7, :cond_1

    .line 54
    .line 55
    iget-object v1, v6, LQ2/l;->q:Lkotlin/jvm/internal/y;

    .line 56
    .line 57
    :try_start_0
    invoke-static {v0}, Lm5/a;->e(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 58
    .line 59
    .line 60
    goto/16 :goto_8

    .line 61
    .line 62
    :catch_0
    move-exception v0

    .line 63
    goto/16 :goto_9

    .line 64
    .line 65
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 66
    .line 67
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 68
    .line 69
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw v0

    .line 73
    :cond_2
    iget-object v1, v6, LQ2/l;->q:Lkotlin/jvm/internal/y;

    .line 74
    .line 75
    :try_start_1
    invoke-static {v0}, Lm5/a;->e(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 76
    .line 77
    .line 78
    goto/16 :goto_6

    .line 79
    .line 80
    :cond_3
    iget-object v1, v6, LQ2/l;->r:Lkotlin/jvm/internal/y;

    .line 81
    .line 82
    iget-object v5, v6, LQ2/l;->q:Lkotlin/jvm/internal/y;

    .line 83
    .line 84
    :try_start_2
    invoke-static {v0}, Lm5/a;->e(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 85
    .line 86
    .line 87
    move-object v15, v5

    .line 88
    move-object v5, v1

    .line 89
    move-object v1, v15

    .line 90
    goto/16 :goto_4

    .line 91
    .line 92
    :catch_1
    move-exception v0

    .line 93
    move-object v1, v5

    .line 94
    goto/16 :goto_9

    .line 95
    .line 96
    :cond_4
    invoke-static {v0}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    new-instance v1, Lkotlin/jvm/internal/y;

    .line 100
    .line 101
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 102
    .line 103
    .line 104
    iget-object v0, v2, LQ2/q;->b:LU2/n;

    .line 105
    .line 106
    iget-object v11, v0, LU2/n;->h:LU2/b;

    .line 107
    .line 108
    iget-boolean v11, v11, LU2/b;->q:Z

    .line 109
    .line 110
    if-eqz v11, :cond_6

    .line 111
    .line 112
    iget-object v11, v2, LQ2/q;->d:Lm5/o;

    .line 113
    .line 114
    invoke-virtual {v11}, Lm5/o;->getValue()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v11

    .line 118
    check-cast v11, LK2/i;

    .line 119
    .line 120
    if-eqz v11, :cond_6

    .line 121
    .line 122
    iget-object v0, v0, LU2/n;->e:Ljava/lang/String;

    .line 123
    .line 124
    if-nez v0, :cond_5

    .line 125
    .line 126
    move-object v0, v4

    .line 127
    :cond_5
    iget-object v11, v11, LK2/i;->b:LK2/f;

    .line 128
    .line 129
    sget-object v12, Lq6/j;->t:Lq6/j;

    .line 130
    .line 131
    invoke-static {v0}, LO3/B;->h(Ljava/lang/String;)Lq6/j;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    const-string v12, "SHA-256"

    .line 136
    .line 137
    invoke-virtual {v0, v12}, Lq6/j;->b(Ljava/lang/String;)Lq6/j;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-virtual {v0}, Lq6/j;->d()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-virtual {v11, v0}, LK2/f;->c(Ljava/lang/String;)LK2/c;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    if-eqz v0, :cond_6

    .line 150
    .line 151
    new-instance v11, LK2/h;

    .line 152
    .line 153
    invoke-direct {v11, v0}, LK2/h;-><init>(LK2/c;)V

    .line 154
    .line 155
    .line 156
    goto :goto_2

    .line 157
    :cond_6
    move-object v11, v9

    .line 158
    :goto_2
    iput-object v11, v1, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 159
    .line 160
    :try_start_3
    new-instance v0, Lkotlin/jvm/internal/y;

    .line 161
    .line 162
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 163
    .line 164
    .line 165
    if-eqz v11, :cond_c

    .line 166
    .line 167
    invoke-virtual {v2}, LQ2/q;->e()Lq6/l;

    .line 168
    .line 169
    .line 170
    move-result-object v11

    .line 171
    iget-object v12, v1, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v12, LK2/h;

    .line 174
    .line 175
    iget-object v12, v12, LK2/h;->q:LK2/c;

    .line 176
    .line 177
    iget-boolean v13, v12, LK2/c;->r:Z

    .line 178
    .line 179
    if-nez v13, :cond_b

    .line 180
    .line 181
    iget-object v12, v12, LK2/c;->q:LK2/b;

    .line 182
    .line 183
    iget-object v12, v12, LK2/b;->c:Ljava/util/ArrayList;

    .line 184
    .line 185
    const/4 v13, 0x0

    .line 186
    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v12

    .line 190
    check-cast v12, Lq6/x;

    .line 191
    .line 192
    invoke-virtual {v11, v12}, Lq6/l;->G(Lq6/x;)Le1/e;

    .line 193
    .line 194
    .line 195
    move-result-object v11

    .line 196
    iget-object v11, v11, Le1/e;->e:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast v11, Ljava/lang/Long;

    .line 199
    .line 200
    if-nez v11, :cond_7

    .line 201
    .line 202
    goto :goto_3

    .line 203
    :cond_7
    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    .line 204
    .line 205
    .line 206
    move-result-wide v11

    .line 207
    const-wide/16 v13, 0x0

    .line 208
    .line 209
    cmp-long v11, v11, v13

    .line 210
    .line 211
    if-nez v11, :cond_8

    .line 212
    .line 213
    new-instance v0, LL2/i;

    .line 214
    .line 215
    iget-object v5, v1, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 216
    .line 217
    check-cast v5, LK2/h;

    .line 218
    .line 219
    invoke-virtual {v2, v5}, LQ2/q;->h(LK2/h;)LJ2/p;

    .line 220
    .line 221
    .line 222
    move-result-object v5

    .line 223
    invoke-static {v4, v9}, LQ2/q;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v4

    .line 227
    invoke-direct {v0, v5, v4, v3}, LL2/i;-><init>(LJ2/q;Ljava/lang/String;LJ2/h;)V

    .line 228
    .line 229
    .line 230
    return-object v0

    .line 231
    :cond_8
    :goto_3
    iget-object v11, v1, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 232
    .line 233
    check-cast v11, LK2/h;

    .line 234
    .line 235
    invoke-virtual {v2, v11}, LQ2/q;->i(LK2/h;)LQ2/u;

    .line 236
    .line 237
    .line 238
    move-result-object v11

    .line 239
    iput-object v11, v0, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 240
    .line 241
    if-eqz v11, :cond_c

    .line 242
    .line 243
    iget-object v11, v2, LQ2/q;->e:Lm5/h;

    .line 244
    .line 245
    invoke-interface {v11}, Lm5/h;->getValue()Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v11

    .line 249
    check-cast v11, LQ2/c;

    .line 250
    .line 251
    iget-object v12, v0, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 252
    .line 253
    check-cast v12, LQ2/u;

    .line 254
    .line 255
    invoke-virtual {v2}, LQ2/q;->g()LQ2/t;

    .line 256
    .line 257
    .line 258
    iput-object v1, v6, LQ2/l;->q:Lkotlin/jvm/internal/y;

    .line 259
    .line 260
    iput-object v0, v6, LQ2/l;->r:Lkotlin/jvm/internal/y;

    .line 261
    .line 262
    iput v5, v6, LQ2/l;->u:I

    .line 263
    .line 264
    check-cast v11, LR2/a;

    .line 265
    .line 266
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 267
    .line 268
    .line 269
    new-instance v5, LQ2/a;

    .line 270
    .line 271
    invoke-direct {v5, v12}, LQ2/a;-><init>(LQ2/u;)V

    .line 272
    .line 273
    .line 274
    if-ne v5, v10, :cond_9

    .line 275
    .line 276
    goto :goto_7

    .line 277
    :cond_9
    move-object v15, v5

    .line 278
    move-object v5, v0

    .line 279
    move-object v0, v15

    .line 280
    :goto_4
    check-cast v0, LQ2/a;

    .line 281
    .line 282
    iget-object v11, v0, LQ2/a;->a:LQ2/u;

    .line 283
    .line 284
    if-eqz v11, :cond_a

    .line 285
    .line 286
    new-instance v5, LL2/i;

    .line 287
    .line 288
    iget-object v6, v1, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 289
    .line 290
    check-cast v6, LK2/h;

    .line 291
    .line 292
    invoke-virtual {v2, v6}, LQ2/q;->h(LK2/h;)LJ2/p;

    .line 293
    .line 294
    .line 295
    move-result-object v6

    .line 296
    iget-object v0, v0, LQ2/a;->a:LQ2/u;

    .line 297
    .line 298
    iget-object v0, v0, LQ2/u;->d:LQ2/s;

    .line 299
    .line 300
    invoke-virtual {v0}, LQ2/s;->a()Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    invoke-static {v4, v0}, LQ2/q;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    invoke-direct {v5, v6, v0, v3}, LL2/i;-><init>(LJ2/q;Ljava/lang/String;LJ2/h;)V

    .line 309
    .line 310
    .line 311
    return-object v5

    .line 312
    :cond_a
    move-object v3, v5

    .line 313
    goto :goto_5

    .line 314
    :cond_b
    const-string v0, "snapshot is closed"

    .line 315
    .line 316
    new-instance v3, Ljava/lang/IllegalStateException;

    .line 317
    .line 318
    invoke-direct {v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    throw v3

    .line 322
    :cond_c
    move-object v3, v0

    .line 323
    :goto_5
    invoke-virtual {v2}, LQ2/q;->g()LQ2/t;

    .line 324
    .line 325
    .line 326
    move-result-object v4

    .line 327
    new-instance v0, LQ2/n;

    .line 328
    .line 329
    const/4 v5, 0x0

    .line 330
    invoke-direct/range {v0 .. v5}, LQ2/n;-><init>(Lkotlin/jvm/internal/y;LQ2/q;Lkotlin/jvm/internal/y;LQ2/t;Lq5/c;)V

    .line 331
    .line 332
    .line 333
    iput-object v1, v6, LQ2/l;->q:Lkotlin/jvm/internal/y;

    .line 334
    .line 335
    iput-object v9, v6, LQ2/l;->r:Lkotlin/jvm/internal/y;

    .line 336
    .line 337
    iput v8, v6, LQ2/l;->u:I

    .line 338
    .line 339
    invoke-virtual {v2, v4, v0, v6}, LQ2/q;->d(LQ2/t;LB5/e;LQ2/l;)Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    if-ne v0, v10, :cond_d

    .line 344
    .line 345
    goto :goto_7

    .line 346
    :cond_d
    :goto_6
    check-cast v0, LL2/i;

    .line 347
    .line 348
    if-nez v0, :cond_f

    .line 349
    .line 350
    invoke-virtual {v2}, LQ2/q;->g()LQ2/t;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    new-instance v3, LQ2/m;

    .line 355
    .line 356
    invoke-direct {v3, v2, v9}, LQ2/m;-><init>(LQ2/q;Lq5/c;)V

    .line 357
    .line 358
    .line 359
    iput-object v1, v6, LQ2/l;->q:Lkotlin/jvm/internal/y;

    .line 360
    .line 361
    iput v7, v6, LQ2/l;->u:I

    .line 362
    .line 363
    invoke-virtual {v2, v0, v3, v6}, LQ2/q;->d(LQ2/t;LB5/e;LQ2/l;)Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    if-ne v0, v10, :cond_e

    .line 368
    .line 369
    :goto_7
    return-object v10

    .line 370
    :cond_e
    :goto_8
    check-cast v0, LL2/i;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 371
    .line 372
    :cond_f
    return-object v0

    .line 373
    :goto_9
    iget-object v1, v1, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 374
    .line 375
    check-cast v1, LK2/h;

    .line 376
    .line 377
    if-eqz v1, :cond_10

    .line 378
    .line 379
    :try_start_4
    invoke-static {v1}, LC0/S;->s(Ljava/lang/AutoCloseable;)V
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    .line 380
    .line 381
    .line 382
    goto :goto_a

    .line 383
    :catch_2
    move-exception v0

    .line 384
    throw v0

    .line 385
    :catch_3
    :cond_10
    :goto_a
    throw v0
.end method

.method public final d(LQ2/t;LB5/e;LQ2/l;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, LQ2/q;->b:LU2/n;

    .line 2
    .line 3
    iget-object v0, v0, LU2/n;->i:LU2/b;

    .line 4
    .line 5
    iget-boolean v0, v0, LU2/b;->q:Z

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance p1, Landroid/os/NetworkOnMainThreadException;

    .line 25
    .line 26
    invoke-direct {p1}, Landroid/os/NetworkOnMainThreadException;-><init>()V

    .line 27
    .line 28
    .line 29
    throw p1

    .line 30
    :cond_1
    :goto_0
    iget-object v0, p0, LQ2/q;->c:Lm5/h;

    .line 31
    .line 32
    invoke-interface {v0}, Lm5/h;->getValue()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, LT2/b;

    .line 37
    .line 38
    new-instance v1, LQ2/k;

    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    invoke-direct {v1, p2, v2}, LQ2/k;-><init>(LB5/e;Lq5/c;)V

    .line 42
    .line 43
    .line 44
    iget-object p2, v0, LT2/b;->a:Ld6/q;

    .line 45
    .line 46
    invoke-static {p2, p1, v1, p3}, LT2/b;->a(Ld6/q;LQ2/t;LQ2/k;Ls5/c;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    return-object p1
.end method

.method public final e()Lq6/l;
    .locals 1

    .line 1
    iget-object v0, p0, LQ2/q;->d:Lm5/o;

    .line 2
    .line 3
    invoke-virtual {v0}, Lm5/o;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LK2/i;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-object v0, v0, LK2/i;->a:Lq6/l;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    return-object v0

    .line 17
    :cond_1
    :goto_0
    iget-object v0, p0, LQ2/q;->b:LU2/n;

    .line 18
    .line 19
    iget-object v0, v0, LU2/n;->f:Lq6/l;

    .line 20
    .line 21
    return-object v0
.end method

.method public final g()LQ2/t;
    .locals 5

    .line 1
    sget-object v0, LQ2/h;->b:LI2/l;

    .line 2
    .line 3
    iget-object v1, p0, LQ2/q;->b:LU2/n;

    .line 4
    .line 5
    invoke-static {v1, v0}, LI2/q;->e(LU2/n;LI2/l;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, LQ2/s;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    new-instance v2, LQ2/r;

    .line 15
    .line 16
    invoke-direct {v2, v0}, LQ2/r;-><init>(LQ2/s;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, v1, LU2/n;->h:LU2/b;

    .line 20
    .line 21
    iget-boolean v3, v0, LU2/b;->q:Z

    .line 22
    .line 23
    iget-object v4, v1, LU2/n;->i:LU2/b;

    .line 24
    .line 25
    iget-boolean v4, v4, LU2/b;->q:Z

    .line 26
    .line 27
    if-eqz v4, :cond_0

    .line 28
    .line 29
    iget-object v4, p0, LQ2/q;->f:LQ2/e;

    .line 30
    .line 31
    invoke-interface {v4}, LQ2/e;->a()Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-eqz v4, :cond_0

    .line 36
    .line 37
    const/4 v4, 0x1

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 v4, 0x0

    .line 40
    :goto_0
    if-nez v4, :cond_1

    .line 41
    .line 42
    if-eqz v3, :cond_1

    .line 43
    .line 44
    const-string v0, "only-if-cached, max-stale=2147483647"

    .line 45
    .line 46
    invoke-virtual {v2, v0}, LQ2/r;->a(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    if-eqz v4, :cond_3

    .line 51
    .line 52
    if-nez v3, :cond_3

    .line 53
    .line 54
    iget-boolean v0, v0, LU2/b;->r:Z

    .line 55
    .line 56
    if-eqz v0, :cond_2

    .line 57
    .line 58
    const-string v0, "no-cache"

    .line 59
    .line 60
    invoke-virtual {v2, v0}, LQ2/r;->a(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_2
    const-string v0, "no-cache, no-store"

    .line 65
    .line 66
    invoke-virtual {v2, v0}, LQ2/r;->a(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_3
    if-nez v4, :cond_4

    .line 71
    .line 72
    if-nez v3, :cond_4

    .line 73
    .line 74
    const-string v0, "no-cache, only-if-cached"

    .line 75
    .line 76
    invoke-virtual {v2, v0}, LQ2/r;->a(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    :cond_4
    :goto_1
    new-instance v0, LQ2/t;

    .line 80
    .line 81
    sget-object v3, LQ2/h;->a:LI2/l;

    .line 82
    .line 83
    invoke-static {v1, v3}, LI2/q;->e(LU2/n;LI2/l;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    check-cast v3, Ljava/lang/String;

    .line 88
    .line 89
    new-instance v4, LQ2/s;

    .line 90
    .line 91
    iget-object v2, v2, LQ2/r;->a:Ljava/util/LinkedHashMap;

    .line 92
    .line 93
    invoke-static {v2}, Ln5/x;->O(Ljava/util/Map;)Ljava/util/Map;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    invoke-direct {v4, v2}, LQ2/s;-><init>(Ljava/util/Map;)V

    .line 98
    .line 99
    .line 100
    sget-object v2, LQ2/h;->c:LI2/l;

    .line 101
    .line 102
    invoke-static {v1, v2}, LI2/q;->e(LU2/n;LI2/l;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    if-nez v2, :cond_5

    .line 107
    .line 108
    iget-object v1, v1, LU2/n;->j:LI2/m;

    .line 109
    .line 110
    iget-object v2, p0, LQ2/q;->a:Ljava/lang/String;

    .line 111
    .line 112
    invoke-direct {v0, v2, v3, v4, v1}, LQ2/t;-><init>(Ljava/lang/String;Ljava/lang/String;LQ2/s;LI2/m;)V

    .line 113
    .line 114
    .line 115
    return-object v0

    .line 116
    :cond_5
    new-instance v0, Ljava/lang/ClassCastException;

    .line 117
    .line 118
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 119
    .line 120
    .line 121
    throw v0
.end method

.method public final h(LK2/h;)LJ2/p;
    .locals 4

    .line 1
    iget-object v0, p1, LK2/h;->q:LK2/c;

    .line 2
    .line 3
    iget-boolean v1, v0, LK2/c;->r:Z

    .line 4
    .line 5
    if-nez v1, :cond_1

    .line 6
    .line 7
    iget-object v0, v0, LK2/c;->q:LK2/b;

    .line 8
    .line 9
    iget-object v0, v0, LK2/b;->c:Ljava/util/ArrayList;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Lq6/x;

    .line 17
    .line 18
    invoke-virtual {p0}, LQ2/q;->e()Lq6/l;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iget-object v2, p0, LQ2/q;->b:LU2/n;

    .line 23
    .line 24
    iget-object v2, v2, LU2/n;->e:Ljava/lang/String;

    .line 25
    .line 26
    if-nez v2, :cond_0

    .line 27
    .line 28
    iget-object v2, p0, LQ2/q;->a:Ljava/lang/String;

    .line 29
    .line 30
    :cond_0
    const/16 v3, 0x10

    .line 31
    .line 32
    invoke-static {v0, v1, v2, p1, v3}, LQ2/g;->c(Lq6/x;Lq6/l;Ljava/lang/String;LK2/h;I)LJ2/p;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    return-object p1

    .line 37
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 38
    .line 39
    const-string v0, "snapshot is closed"

    .line 40
    .line 41
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw p1
.end method

.method public final i(LK2/h;)LQ2/u;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0}, LQ2/q;->e()Lq6/l;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    iget-object p1, p1, LK2/h;->q:LK2/c;

    .line 7
    .line 8
    iget-boolean v2, p1, LK2/c;->r:Z

    .line 9
    .line 10
    if-nez v2, :cond_1

    .line 11
    .line 12
    iget-object p1, p1, LK2/c;->q:LK2/b;

    .line 13
    .line 14
    iget-object p1, p1, LK2/b;->c:Ljava/util/ArrayList;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Lq6/x;

    .line 22
    .line 23
    invoke-virtual {v1, p1}, Lq6/l;->a0(Lq6/x;)Lq6/G;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {p1}, La/a;->j(Lq6/G;)Lq6/A;

    .line 28
    .line 29
    .line 30
    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    :try_start_1
    invoke-static {p1}, LQ2/g;->L(Lq6/A;)LQ2/u;

    .line 32
    .line 33
    .line 34
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 35
    :try_start_2
    invoke-virtual {p1}, Lq6/A;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 36
    .line 37
    .line 38
    move-object p1, v0

    .line 39
    goto :goto_1

    .line 40
    :catchall_0
    move-exception p1

    .line 41
    goto :goto_1

    .line 42
    :catchall_1
    move-exception v1

    .line 43
    :try_start_3
    invoke-virtual {p1}, Lq6/A;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catchall_2
    move-exception p1

    .line 48
    :try_start_4
    invoke-static {v1, p1}, Lm5/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 49
    .line 50
    .line 51
    :goto_0
    move-object p1, v1

    .line 52
    move-object v1, v0

    .line 53
    :goto_1
    if-nez p1, :cond_0

    .line 54
    .line 55
    return-object v1

    .line 56
    :cond_0
    throw p1

    .line 57
    :cond_1
    const-string p1, "snapshot is closed"

    .line 58
    .line 59
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 60
    .line 61
    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw v1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 65
    :catch_0
    return-object v0
.end method
