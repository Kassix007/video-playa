.class public abstract Ln1/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LQ2/g;

.field public static final b:Ld2/d0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-string v0, "TypefaceCompat static init"

    .line 2
    .line 3
    invoke-static {v0}, LE3/h;->O(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 11
    .line 12
    const/16 v1, 0x1d

    .line 13
    .line 14
    if-lt v0, v1, :cond_0

    .line 15
    .line 16
    new-instance v0, Ln1/j;

    .line 17
    .line 18
    invoke-direct {v0}, LQ2/g;-><init>()V

    .line 19
    .line 20
    .line 21
    sput-object v0, Ln1/e;->a:LQ2/g;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/16 v1, 0x1c

    .line 25
    .line 26
    if-lt v0, v1, :cond_1

    .line 27
    .line 28
    new-instance v0, Ln1/i;

    .line 29
    .line 30
    invoke-direct {v0}, Ln1/h;-><init>()V

    .line 31
    .line 32
    .line 33
    sput-object v0, Ln1/e;->a:LQ2/g;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/16 v1, 0x1a

    .line 37
    .line 38
    if-lt v0, v1, :cond_2

    .line 39
    .line 40
    new-instance v0, Ln1/h;

    .line 41
    .line 42
    invoke-direct {v0}, Ln1/h;-><init>()V

    .line 43
    .line 44
    .line 45
    sput-object v0, Ln1/e;->a:LQ2/g;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    sget-object v0, Ln1/g;->g:Ljava/lang/reflect/Method;

    .line 49
    .line 50
    if-nez v0, :cond_3

    .line 51
    .line 52
    const-string v1, "TypefaceCompatApi24Impl"

    .line 53
    .line 54
    const-string v2, "Unable to collect necessary private methods.Fallback to legacy implementation."

    .line 55
    .line 56
    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 57
    .line 58
    .line 59
    :cond_3
    if-eqz v0, :cond_4

    .line 60
    .line 61
    new-instance v0, Ln1/g;

    .line 62
    .line 63
    invoke-direct {v0}, LQ2/g;-><init>()V

    .line 64
    .line 65
    .line 66
    sput-object v0, Ln1/e;->a:LQ2/g;

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_4
    new-instance v0, Ln1/f;

    .line 70
    .line 71
    invoke-direct {v0}, LQ2/g;-><init>()V

    .line 72
    .line 73
    .line 74
    sput-object v0, Ln1/e;->a:LQ2/g;

    .line 75
    .line 76
    :goto_0
    new-instance v0, Ld2/d0;

    .line 77
    .line 78
    const/16 v1, 0x10

    .line 79
    .line 80
    invoke-direct {v0, v1}, Ld2/d0;-><init>(I)V

    .line 81
    .line 82
    .line 83
    sput-object v0, Ln1/e;->b:Ld2/d0;

    .line 84
    .line 85
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method public static a(Landroid/content/Context;Lm1/d;Landroid/content/res/Resources;ILjava/lang/String;IILm1/b;Z)Landroid/graphics/Typeface;
    .locals 16

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move/from16 v4, p6

    .line 6
    .line 7
    move-object/from16 v1, p7

    .line 8
    .line 9
    instance-of v3, v0, Lm1/g;

    .line 10
    .line 11
    const/16 v5, 0x8

    .line 12
    .line 13
    const/4 v6, -0x3

    .line 14
    if-eqz v3, :cond_10

    .line 15
    .line 16
    check-cast v0, Lm1/g;

    .line 17
    .line 18
    iget-object v3, v0, Lm1/g;->e:Ljava/lang/String;

    .line 19
    .line 20
    const/4 v7, 0x0

    .line 21
    const/4 v8, 0x0

    .line 22
    if-eqz v3, :cond_1

    .line 23
    .line 24
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v9

    .line 28
    if-eqz v9, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-static {v3, v8}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    sget-object v9, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    .line 36
    .line 37
    invoke-static {v9, v8}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    .line 38
    .line 39
    .line 40
    move-result-object v9

    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    invoke-virtual {v3, v9}, Landroid/graphics/Typeface;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v9

    .line 47
    if-nez v9, :cond_1

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    :goto_0
    move-object v3, v7

    .line 51
    :goto_1
    if-eqz v3, :cond_3

    .line 52
    .line 53
    if-eqz v1, :cond_2

    .line 54
    .line 55
    new-instance v0, Landroid/os/Handler;

    .line 56
    .line 57
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-direct {v0, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 62
    .line 63
    .line 64
    new-instance v2, LN5/c;

    .line 65
    .line 66
    invoke-direct {v2, v5, v1, v3}, LN5/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 70
    .line 71
    .line 72
    :cond_2
    return-object v3

    .line 73
    :cond_3
    const/4 v9, 0x1

    .line 74
    if-eqz p8, :cond_5

    .line 75
    .line 76
    iget v3, v0, Lm1/g;->d:I

    .line 77
    .line 78
    if-nez v3, :cond_4

    .line 79
    .line 80
    :goto_2
    move v3, v9

    .line 81
    goto :goto_3

    .line 82
    :cond_4
    move v3, v8

    .line 83
    goto :goto_3

    .line 84
    :cond_5
    if-nez v1, :cond_4

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :goto_3
    const/4 v5, -0x1

    .line 88
    if-eqz p8, :cond_6

    .line 89
    .line 90
    iget v10, v0, Lm1/g;->c:I

    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_6
    move v10, v5

    .line 94
    :goto_4
    new-instance v11, Landroid/os/Handler;

    .line 95
    .line 96
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 97
    .line 98
    .line 99
    move-result-object v12

    .line 100
    invoke-direct {v11, v12}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 101
    .line 102
    .line 103
    new-instance v12, Li3/a;

    .line 104
    .line 105
    const/4 v13, 0x5

    .line 106
    invoke-direct {v12, v13}, Li3/a;-><init>(I)V

    .line 107
    .line 108
    .line 109
    iput-object v1, v12, Li3/a;->r:Ljava/lang/Object;

    .line 110
    .line 111
    iget-object v1, v0, Lm1/g;->b:Ls1/c;

    .line 112
    .line 113
    const/4 v13, 0x2

    .line 114
    if-eqz v1, :cond_8

    .line 115
    .line 116
    iget-object v0, v0, Lm1/g;->a:Ls1/c;

    .line 117
    .line 118
    filled-new-array {v0, v1}, [Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    new-instance v1, Ljava/util/ArrayList;

    .line 123
    .line 124
    invoke-direct {v1, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 125
    .line 126
    .line 127
    move v14, v8

    .line 128
    :goto_5
    if-ge v14, v13, :cond_7

    .line 129
    .line 130
    aget-object v15, v0, v14

    .line 131
    .line 132
    invoke-static {v15}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v1, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    add-int/lit8 v14, v14, 0x1

    .line 139
    .line 140
    goto :goto_5

    .line 141
    :cond_7
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    goto :goto_6

    .line 146
    :cond_8
    iget-object v0, v0, Lm1/g;->a:Ls1/c;

    .line 147
    .line 148
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    new-instance v1, Ljava/util/ArrayList;

    .line 153
    .line 154
    invoke-direct {v1, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 155
    .line 156
    .line 157
    aget-object v0, v0, v8

    .line 158
    .line 159
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    :goto_6
    new-instance v14, LZ/m;

    .line 170
    .line 171
    new-instance v1, LO3/Q0;

    .line 172
    .line 173
    invoke-direct {v1, v13, v11}, LO3/Q0;-><init>(ILjava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    const/16 v11, 0x18

    .line 177
    .line 178
    invoke-direct {v14, v11, v12, v1}, LZ/m;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    const/16 v11, 0x1c

    .line 182
    .line 183
    if-eqz v3, :cond_c

    .line 184
    .line 185
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 186
    .line 187
    .line 188
    move-result v3

    .line 189
    if-gt v3, v9, :cond_b

    .line 190
    .line 191
    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    move-object v3, v0

    .line 196
    check-cast v3, Ls1/c;

    .line 197
    .line 198
    sget-object v0, Ls1/g;->a:Ld2/d0;

    .line 199
    .line 200
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    new-instance v13, Ljava/util/ArrayList;

    .line 205
    .line 206
    invoke-direct {v13, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 207
    .line 208
    .line 209
    aget-object v0, v0, v8

    .line 210
    .line 211
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v13, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    invoke-static {v13}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    invoke-static {v4, v0}, Ls1/g;->a(ILjava/util/List;)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    sget-object v13, Ls1/g;->a:Ld2/d0;

    .line 226
    .line 227
    invoke-virtual {v13, v0}, Ld2/d0;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v13

    .line 231
    check-cast v13, Landroid/graphics/Typeface;

    .line 232
    .line 233
    if-eqz v13, :cond_9

    .line 234
    .line 235
    new-instance v0, LI4/a;

    .line 236
    .line 237
    invoke-direct {v0, v11, v12, v13}, LI4/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v1, v0}, LO3/Q0;->execute(Ljava/lang/Runnable;)V

    .line 241
    .line 242
    .line 243
    move-object v7, v13

    .line 244
    goto/16 :goto_a

    .line 245
    .line 246
    :cond_9
    if-ne v10, v5, :cond_a

    .line 247
    .line 248
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v1

    .line 252
    new-instance v3, Ljava/util/ArrayList;

    .line 253
    .line 254
    invoke-direct {v3, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 255
    .line 256
    .line 257
    aget-object v1, v1, v8

    .line 258
    .line 259
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    invoke-static {v3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 266
    .line 267
    .line 268
    move-result-object v1

    .line 269
    invoke-static {v0, v2, v1, v4}, Ls1/g;->b(Ljava/lang/String;Landroid/content/Context;Ljava/util/List;I)Ls1/f;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    invoke-virtual {v14, v0}, LZ/m;->x(Ls1/f;)V

    .line 274
    .line 275
    .line 276
    iget-object v7, v0, Ls1/f;->a:Landroid/graphics/Typeface;

    .line 277
    .line 278
    goto/16 :goto_a

    .line 279
    .line 280
    :cond_a
    move-object v1, v0

    .line 281
    new-instance v0, Ls1/d;

    .line 282
    .line 283
    const/4 v5, 0x0

    .line 284
    invoke-direct/range {v0 .. v5}, Ls1/d;-><init>(Ljava/lang/String;Landroid/content/Context;Ljava/lang/Object;II)V

    .line 285
    .line 286
    .line 287
    :try_start_0
    sget-object v1, Ls1/g;->b:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 288
    .line 289
    invoke-interface {v1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 290
    .line 291
    .line 292
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_3

    .line 293
    int-to-long v1, v10

    .line 294
    :try_start_1
    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 295
    .line 296
    invoke-interface {v0, v1, v2, v3}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v0
    :try_end_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_1 .. :try_end_1} :catch_2

    .line 300
    :try_start_2
    check-cast v0, Ls1/f;

    .line 301
    .line 302
    invoke-virtual {v14, v0}, LZ/m;->x(Ls1/f;)V

    .line 303
    .line 304
    .line 305
    iget-object v7, v0, Ls1/f;->a:Landroid/graphics/Typeface;

    .line 306
    .line 307
    goto/16 :goto_a

    .line 308
    .line 309
    :catch_0
    move-exception v0

    .line 310
    goto :goto_7

    .line 311
    :catch_1
    move-exception v0

    .line 312
    goto :goto_8

    .line 313
    :catch_2
    new-instance v0, Ljava/lang/InterruptedException;

    .line 314
    .line 315
    const-string v1, "timeout"

    .line 316
    .line 317
    invoke-direct {v0, v1}, Ljava/lang/InterruptedException;-><init>(Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    throw v0

    .line 321
    :goto_7
    throw v0

    .line 322
    :goto_8
    new-instance v1, Ljava/lang/RuntimeException;

    .line 323
    .line 324
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 325
    .line 326
    .line 327
    throw v1
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_3

    .line 328
    :catch_3
    iget-object v0, v14, LZ/m;->s:Ljava/lang/Object;

    .line 329
    .line 330
    check-cast v0, LO3/Q0;

    .line 331
    .line 332
    iget-object v1, v14, LZ/m;->r:Ljava/lang/Object;

    .line 333
    .line 334
    check-cast v1, Li3/a;

    .line 335
    .line 336
    new-instance v2, LE1/j;

    .line 337
    .line 338
    const/4 v3, 0x3

    .line 339
    invoke-direct {v2, v6, v3, v1}, LE1/j;-><init>(IILjava/lang/Object;)V

    .line 340
    .line 341
    .line 342
    invoke-virtual {v0, v2}, LO3/Q0;->execute(Ljava/lang/Runnable;)V

    .line 343
    .line 344
    .line 345
    goto/16 :goto_a

    .line 346
    .line 347
    :cond_b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 348
    .line 349
    const-string v1, "Fallbacks with blocking fetches are not supported for performance reasons"

    .line 350
    .line 351
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    throw v0

    .line 355
    :cond_c
    invoke-static {v4, v0}, Ls1/g;->a(ILjava/util/List;)Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v2

    .line 359
    sget-object v3, Ls1/g;->a:Ld2/d0;

    .line 360
    .line 361
    invoke-virtual {v3, v2}, Ld2/d0;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v3

    .line 365
    check-cast v3, Landroid/graphics/Typeface;

    .line 366
    .line 367
    if-eqz v3, :cond_d

    .line 368
    .line 369
    new-instance v0, LI4/a;

    .line 370
    .line 371
    invoke-direct {v0, v11, v12, v3}, LI4/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 372
    .line 373
    .line 374
    invoke-virtual {v1, v0}, LO3/Q0;->execute(Ljava/lang/Runnable;)V

    .line 375
    .line 376
    .line 377
    move-object v7, v3

    .line 378
    goto :goto_a

    .line 379
    :cond_d
    new-instance v1, Ls1/e;

    .line 380
    .line 381
    invoke-direct {v1, v8, v14}, Ls1/e;-><init>(ILjava/lang/Object;)V

    .line 382
    .line 383
    .line 384
    sget-object v3, Ls1/g;->c:Ljava/lang/Object;

    .line 385
    .line 386
    monitor-enter v3

    .line 387
    :try_start_3
    sget-object v5, Ls1/g;->d:Lr/Q;

    .line 388
    .line 389
    invoke-virtual {v5, v2}, Lr/Q;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 390
    .line 391
    .line 392
    move-result-object v6

    .line 393
    check-cast v6, Ljava/util/ArrayList;

    .line 394
    .line 395
    if-eqz v6, :cond_e

    .line 396
    .line 397
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 398
    .line 399
    .line 400
    monitor-exit v3

    .line 401
    goto :goto_a

    .line 402
    :catchall_0
    move-exception v0

    .line 403
    goto :goto_b

    .line 404
    :cond_e
    new-instance v6, Ljava/util/ArrayList;

    .line 405
    .line 406
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 407
    .line 408
    .line 409
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 410
    .line 411
    .line 412
    invoke-virtual {v5, v2, v6}, Lr/Q;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 416
    move-object v3, v0

    .line 417
    new-instance v0, Ls1/d;

    .line 418
    .line 419
    const/4 v5, 0x1

    .line 420
    move-object v1, v2

    .line 421
    move-object/from16 v2, p0

    .line 422
    .line 423
    invoke-direct/range {v0 .. v5}, Ls1/d;-><init>(Ljava/lang/String;Landroid/content/Context;Ljava/lang/Object;II)V

    .line 424
    .line 425
    .line 426
    sget-object v2, Ls1/g;->b:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 427
    .line 428
    new-instance v3, Ls1/e;

    .line 429
    .line 430
    invoke-direct {v3, v9, v1}, Ls1/e;-><init>(ILjava/lang/Object;)V

    .line 431
    .line 432
    .line 433
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 434
    .line 435
    .line 436
    move-result-object v1

    .line 437
    if-nez v1, :cond_f

    .line 438
    .line 439
    new-instance v1, Landroid/os/Handler;

    .line 440
    .line 441
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 442
    .line 443
    .line 444
    move-result-object v5

    .line 445
    invoke-direct {v1, v5}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 446
    .line 447
    .line 448
    goto :goto_9

    .line 449
    :cond_f
    new-instance v1, Landroid/os/Handler;

    .line 450
    .line 451
    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    .line 452
    .line 453
    .line 454
    :goto_9
    new-instance v5, LO3/x0;

    .line 455
    .line 456
    invoke-direct {v5}, LO3/x0;-><init>()V

    .line 457
    .line 458
    .line 459
    iput-object v0, v5, LO3/x0;->t:Ljava/lang/Object;

    .line 460
    .line 461
    iput-object v3, v5, LO3/x0;->r:Ljava/lang/Object;

    .line 462
    .line 463
    iput-object v1, v5, LO3/x0;->s:Ljava/lang/Object;

    .line 464
    .line 465
    invoke-virtual {v2, v5}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 466
    .line 467
    .line 468
    :goto_a
    move-object v0, v7

    .line 469
    move-object/from16 v7, p2

    .line 470
    .line 471
    goto :goto_c

    .line 472
    :goto_b
    :try_start_4
    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 473
    throw v0

    .line 474
    :cond_10
    sget-object v3, Ln1/e;->a:LQ2/g;

    .line 475
    .line 476
    check-cast v0, Lm1/e;

    .line 477
    .line 478
    move-object/from16 v7, p2

    .line 479
    .line 480
    invoke-virtual {v3, v2, v0, v7, v4}, LQ2/g;->s(Landroid/content/Context;Lm1/e;Landroid/content/res/Resources;I)Landroid/graphics/Typeface;

    .line 481
    .line 482
    .line 483
    move-result-object v0

    .line 484
    if-eqz v1, :cond_12

    .line 485
    .line 486
    if-eqz v0, :cond_11

    .line 487
    .line 488
    new-instance v2, Landroid/os/Handler;

    .line 489
    .line 490
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 491
    .line 492
    .line 493
    move-result-object v3

    .line 494
    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 495
    .line 496
    .line 497
    new-instance v3, LN5/c;

    .line 498
    .line 499
    invoke-direct {v3, v5, v1, v0}, LN5/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 500
    .line 501
    .line 502
    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 503
    .line 504
    .line 505
    goto :goto_c

    .line 506
    :cond_11
    invoke-virtual {v1, v6}, Lm1/b;->a(I)V

    .line 507
    .line 508
    .line 509
    :cond_12
    :goto_c
    if-eqz v0, :cond_13

    .line 510
    .line 511
    sget-object v1, Ln1/e;->b:Ld2/d0;

    .line 512
    .line 513
    invoke-static/range {p2 .. p6}, Ln1/e;->b(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;

    .line 514
    .line 515
    .line 516
    move-result-object v2

    .line 517
    invoke-virtual {v1, v2, v0}, Ld2/d0;->l(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 518
    .line 519
    .line 520
    :cond_13
    return-object v0
.end method

.method public static b(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourcePackageName(I)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 p0, 0x2d

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
.end method
