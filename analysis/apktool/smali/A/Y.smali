.class public final LA/Y;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Ljava/lang/Object;

.field public final synthetic s:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LA/Y;->q:I

    iput-object p2, p0, LA/Y;->r:Ljava/lang/Object;

    iput-object p3, p0, LA/Y;->s:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method

.method private final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    check-cast p1, Ljava/lang/Throwable;

    .line 2
    .line 3
    iget-object v0, p0, LA/Y;->r:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, LP/v0;

    .line 6
    .line 7
    iget-object v1, v0, LP/v0;->b:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v2, p0, LA/Y;->s:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Ljava/lang/Throwable;

    .line 12
    .line 13
    monitor-enter v1

    .line 14
    const/4 v3, 0x0

    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    if-eqz p1, :cond_2

    .line 18
    .line 19
    :try_start_0
    instance-of v4, p1, Ljava/util/concurrent/CancellationException;

    .line 20
    .line 21
    if-nez v4, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move-object p1, v3

    .line 25
    :goto_0
    if-eqz p1, :cond_2

    .line 26
    .line 27
    invoke-static {v2, p1}, Lm5/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    goto :goto_1

    .line 31
    :catchall_0
    move-exception p1

    .line 32
    goto :goto_2

    .line 33
    :cond_1
    move-object v2, v3

    .line 34
    :cond_2
    :goto_1
    iput-object v2, v0, LP/v0;->d:Ljava/lang/Throwable;

    .line 35
    .line 36
    iget-object p1, v0, LP/v0;->t:LP5/S;

    .line 37
    .line 38
    sget-object v0, LP/p0;->q:LP/p0;

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, v3, v0}, LP5/S;->h(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    .line 46
    monitor-exit v1

    .line 47
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 48
    .line 49
    return-object p1

    .line 50
    :goto_2
    monitor-exit v1

    .line 51
    throw p1
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, LA/Y;->q:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/16 v2, 0x9

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x0

    .line 8
    const/4 v5, 0x1

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object v6, p1

    .line 13
    check-cast v6, LB0/N;

    .line 14
    .line 15
    invoke-virtual {v6}, LB0/N;->a()V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, LA/Y;->r:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p1, Lj0/x;

    .line 21
    .line 22
    iget-object v7, p1, Lj0/x;->e:Lj0/A;

    .line 23
    .line 24
    iget-object p1, p0, LA/Y;->s:Ljava/lang/Object;

    .line 25
    .line 26
    move-object v8, p1

    .line 27
    check-cast v8, Lj0/B;

    .line 28
    .line 29
    const/4 v10, 0x0

    .line 30
    const/16 v11, 0x3c

    .line 31
    .line 32
    const/4 v9, 0x0

    .line 33
    invoke-static/range {v6 .. v11}, Ll0/d;->j(Ll0/d;Lj0/A;Lj0/B;FLl0/g;I)V

    .line 34
    .line 35
    .line 36
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 37
    .line 38
    return-object p1

    .line 39
    :pswitch_0
    check-cast p1, LP/F;

    .line 40
    .line 41
    iget-object p1, p0, LA/Y;->r:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p1, Lu/v0;

    .line 44
    .line 45
    iget-object v0, p0, LA/Y;->s:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, Lu/p0;

    .line 48
    .line 49
    new-instance v1, LA/X;

    .line 50
    .line 51
    const/16 v2, 0xa

    .line 52
    .line 53
    invoke-direct {v1, v2, p1, v0}, LA/X;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    return-object v1

    .line 57
    :pswitch_1
    check-cast p1, LP/F;

    .line 58
    .line 59
    iget-object p1, p0, LA/Y;->r:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast p1, Lu/v0;

    .line 62
    .line 63
    iget-object v0, p0, LA/Y;->s:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v0, Lu/v0;

    .line 66
    .line 67
    iget-object v1, p1, Lu/v0;->j:La0/q;

    .line 68
    .line 69
    invoke-virtual {v1, v0}, La0/q;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    new-instance v1, LA/X;

    .line 73
    .line 74
    invoke-direct {v1, v2, p1, v0}, LA/X;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    return-object v1

    .line 78
    :pswitch_2
    check-cast p1, LP/F;

    .line 79
    .line 80
    iget-object p1, p0, LA/Y;->r:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast p1, LM5/w;

    .line 83
    .line 84
    sget-object v0, LM5/x;->t:LM5/x;

    .line 85
    .line 86
    new-instance v1, Lu/u0;

    .line 87
    .line 88
    iget-object v2, p0, LA/Y;->s:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v2, Lu/v0;

    .line 91
    .line 92
    invoke-direct {v1, v2, v3}, Lu/u0;-><init>(Lu/v0;Lq5/c;)V

    .line 93
    .line 94
    .line 95
    invoke-static {p1, v3, v0, v1, v5}, LM5/y;->t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;

    .line 96
    .line 97
    .line 98
    new-instance p1, LU4/f0;

    .line 99
    .line 100
    invoke-direct {p1, v5}, LU4/f0;-><init>(I)V

    .line 101
    .line 102
    .line 103
    return-object p1

    .line 104
    :pswitch_3
    check-cast p1, LP/F;

    .line 105
    .line 106
    iget-object p1, p0, LA/Y;->r:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast p1, Lu/H;

    .line 109
    .line 110
    iget-object v0, p0, LA/Y;->s:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v0, Lu/E;

    .line 113
    .line 114
    iget-object v1, p1, Lu/H;->a:LR/e;

    .line 115
    .line 116
    invoke-virtual {v1, v0}, LR/e;->c(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    iget-object v1, p1, Lu/H;->b:LP/f0;

    .line 120
    .line 121
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 122
    .line 123
    invoke-virtual {v1, v2}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    new-instance v1, LA/X;

    .line 127
    .line 128
    const/16 v2, 0x8

    .line 129
    .line 130
    invoke-direct {v1, v2, p1, v0}, LA/X;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    return-object v1

    .line 134
    :pswitch_4
    check-cast p1, Lz0/I;

    .line 135
    .line 136
    iget-object v0, p0, LA/Y;->r:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v0, Lz0/J;

    .line 139
    .line 140
    iget-object v1, p0, LA/Y;->s:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v1, Lt/s;

    .line 143
    .line 144
    iget-object v1, v1, Lt/s;->c:LP/b0;

    .line 145
    .line 146
    invoke-virtual {v1}, LP/b0;->e()F

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    int-to-long v4, v4

    .line 154
    const/16 v2, 0x20

    .line 155
    .line 156
    shl-long v6, v4, v2

    .line 157
    .line 158
    const-wide v8, 0xffffffffL

    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    and-long/2addr v4, v8

    .line 164
    or-long/2addr v4, v6

    .line 165
    invoke-static {p1, v0}, Lz0/I;->a(Lz0/I;Lz0/J;)V

    .line 166
    .line 167
    .line 168
    iget-wide v6, v0, Lz0/J;->u:J

    .line 169
    .line 170
    invoke-static {v4, v5, v6, v7}, LW0/i;->c(JJ)J

    .line 171
    .line 172
    .line 173
    move-result-wide v4

    .line 174
    invoke-virtual {v0, v4, v5, v1, v3}, Lz0/J;->U(JFLB5/c;)V

    .line 175
    .line 176
    .line 177
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 178
    .line 179
    return-object p1

    .line 180
    :pswitch_5
    check-cast p1, Lz0/I;

    .line 181
    .line 182
    iget-object v0, p0, LA/Y;->r:Ljava/lang/Object;

    .line 183
    .line 184
    check-cast v0, Lz0/J;

    .line 185
    .line 186
    iget-object v1, p0, LA/Y;->s:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast v1, Lj0/F;

    .line 189
    .line 190
    iget-object v1, v1, Lj0/F;->O:LB0/a;

    .line 191
    .line 192
    invoke-static {p1, v0, v1}, Lz0/I;->h(Lz0/I;Lz0/J;LB5/c;)V

    .line 193
    .line 194
    .line 195
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 196
    .line 197
    return-object p1

    .line 198
    :pswitch_6
    check-cast p1, Lz0/I;

    .line 199
    .line 200
    iget-object v0, p0, LA/Y;->r:Ljava/lang/Object;

    .line 201
    .line 202
    check-cast v0, Lz0/J;

    .line 203
    .line 204
    iget-object v1, p0, LA/Y;->s:Ljava/lang/Object;

    .line 205
    .line 206
    check-cast v1, Lj0/k;

    .line 207
    .line 208
    iget-object v1, v1, Lj0/k;->E:LB5/c;

    .line 209
    .line 210
    invoke-static {p1, v0, v1}, Lz0/I;->h(Lz0/I;Lz0/J;LB5/c;)V

    .line 211
    .line 212
    .line 213
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 214
    .line 215
    return-object p1

    .line 216
    :pswitch_7
    check-cast p1, Lc0/m;

    .line 217
    .line 218
    iget-object v0, p0, LA/Y;->r:Ljava/lang/Object;

    .line 219
    .line 220
    check-cast v0, LB0/L;

    .line 221
    .line 222
    iget-object v1, p0, LA/Y;->s:Ljava/lang/Object;

    .line 223
    .line 224
    check-cast v1, Lc0/m;

    .line 225
    .line 226
    invoke-interface {p1, v1}, Lc0/m;->d(Lc0/m;)Lc0/m;

    .line 227
    .line 228
    .line 229
    move-result-object p1

    .line 230
    invoke-virtual {v0, p1}, LB0/L;->Y(Lc0/m;)V

    .line 231
    .line 232
    .line 233
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 234
    .line 235
    return-object p1

    .line 236
    :pswitch_8
    check-cast p1, Ljava/lang/Throwable;

    .line 237
    .line 238
    iget-object v0, p0, LA/Y;->r:Ljava/lang/Object;

    .line 239
    .line 240
    check-cast v0, Landroidx/concurrent/futures/k;

    .line 241
    .line 242
    if-eqz p1, :cond_1

    .line 243
    .line 244
    instance-of v1, p1, Ljava/util/concurrent/CancellationException;

    .line 245
    .line 246
    if-eqz v1, :cond_0

    .line 247
    .line 248
    iput-boolean v5, v0, Landroidx/concurrent/futures/k;->d:Z

    .line 249
    .line 250
    iget-object p1, v0, Landroidx/concurrent/futures/k;->b:Landroidx/concurrent/futures/n;

    .line 251
    .line 252
    if-eqz p1, :cond_2

    .line 253
    .line 254
    iget-object p1, p1, Landroidx/concurrent/futures/n;->r:Landroidx/concurrent/futures/m;

    .line 255
    .line 256
    invoke-virtual {p1, v5}, Landroidx/concurrent/futures/j;->cancel(Z)Z

    .line 257
    .line 258
    .line 259
    move-result p1

    .line 260
    if-eqz p1, :cond_2

    .line 261
    .line 262
    iput-object v3, v0, Landroidx/concurrent/futures/k;->a:Ljava/lang/Object;

    .line 263
    .line 264
    iput-object v3, v0, Landroidx/concurrent/futures/k;->b:Landroidx/concurrent/futures/n;

    .line 265
    .line 266
    iput-object v3, v0, Landroidx/concurrent/futures/k;->c:Landroidx/concurrent/futures/p;

    .line 267
    .line 268
    goto :goto_0

    .line 269
    :cond_0
    invoke-virtual {v0, p1}, Landroidx/concurrent/futures/k;->b(Ljava/lang/Throwable;)V

    .line 270
    .line 271
    .line 272
    goto :goto_0

    .line 273
    :cond_1
    iget-object p1, p0, LA/Y;->s:Ljava/lang/Object;

    .line 274
    .line 275
    check-cast p1, LM5/B;

    .line 276
    .line 277
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 278
    .line 279
    .line 280
    sget-object v1, LM5/i0;->q:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 281
    .line 282
    invoke-virtual {v1, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object p1

    .line 286
    instance-of v1, p1, LM5/X;

    .line 287
    .line 288
    if-nez v1, :cond_4

    .line 289
    .line 290
    instance-of v1, p1, LM5/p;

    .line 291
    .line 292
    if-nez v1, :cond_3

    .line 293
    .line 294
    invoke-static {p1}, LM5/y;->z(Ljava/lang/Object;)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object p1

    .line 298
    invoke-virtual {v0, p1}, Landroidx/concurrent/futures/k;->a(Ljava/lang/Object;)V

    .line 299
    .line 300
    .line 301
    :cond_2
    :goto_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 302
    .line 303
    return-object p1

    .line 304
    :cond_3
    check-cast p1, LM5/p;

    .line 305
    .line 306
    iget-object p1, p1, LM5/p;->a:Ljava/lang/Throwable;

    .line 307
    .line 308
    throw p1

    .line 309
    :cond_4
    const-string p1, "This job has not completed yet"

    .line 310
    .line 311
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 312
    .line 313
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 314
    .line 315
    .line 316
    throw v0

    .line 317
    :pswitch_9
    iget-object v0, p0, LA/Y;->r:Ljava/lang/Object;

    .line 318
    .line 319
    check-cast v0, LP/u;

    .line 320
    .line 321
    invoke-virtual {v0, p1}, LP/u;->y(Ljava/lang/Object;)V

    .line 322
    .line 323
    .line 324
    iget-object v0, p0, LA/Y;->s:Ljava/lang/Object;

    .line 325
    .line 326
    check-cast v0, Lr/H;

    .line 327
    .line 328
    if-eqz v0, :cond_5

    .line 329
    .line 330
    invoke-virtual {v0, p1}, Lr/H;->a(Ljava/lang/Object;)Z

    .line 331
    .line 332
    .line 333
    :cond_5
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 334
    .line 335
    return-object p1

    .line 336
    :pswitch_a
    invoke-direct {p0, p1}, LA/Y;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object p1

    .line 340
    return-object p1

    .line 341
    :pswitch_b
    check-cast p1, Ljava/lang/Throwable;

    .line 342
    .line 343
    iget-object p1, p0, LA/Y;->r:Ljava/lang/Object;

    .line 344
    .line 345
    check-cast p1, LK2/a;

    .line 346
    .line 347
    iget-object v1, p1, LK2/a;->c:Ljava/lang/Object;

    .line 348
    .line 349
    iget-object v0, p0, LA/Y;->s:Ljava/lang/Object;

    .line 350
    .line 351
    check-cast v0, LM5/h;

    .line 352
    .line 353
    monitor-enter v1

    .line 354
    :try_start_0
    iget-object p1, p1, LK2/a;->d:Ljava/io/Serializable;

    .line 355
    .line 356
    check-cast p1, Ljava/util/ArrayList;

    .line 357
    .line 358
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 359
    .line 360
    .line 361
    monitor-exit v1

    .line 362
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 363
    .line 364
    return-object p1

    .line 365
    :catchall_0
    move-exception v0

    .line 366
    move-object p1, v0

    .line 367
    monitor-exit v1

    .line 368
    throw p1

    .line 369
    :pswitch_c
    check-cast p1, Ljava/lang/Throwable;

    .line 370
    .line 371
    iget-object p1, p0, LA/Y;->r:Ljava/lang/Object;

    .line 372
    .line 373
    check-cast p1, LP/e;

    .line 374
    .line 375
    iget-object v1, p1, LP/e;->r:Ljava/lang/Object;

    .line 376
    .line 377
    iget-object v0, p0, LA/Y;->s:Ljava/lang/Object;

    .line 378
    .line 379
    check-cast v0, LP/d;

    .line 380
    .line 381
    monitor-enter v1

    .line 382
    :try_start_1
    iget-object v2, p1, LP/e;->t:Ljava/util/ArrayList;

    .line 383
    .line 384
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 385
    .line 386
    .line 387
    iget-object v0, p1, LP/e;->t:Ljava/util/ArrayList;

    .line 388
    .line 389
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 390
    .line 391
    .line 392
    move-result v0

    .line 393
    if-eqz v0, :cond_6

    .line 394
    .line 395
    iget-object p1, p1, LP/e;->v:LX/a;

    .line 396
    .line 397
    invoke-virtual {p1, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 398
    .line 399
    .line 400
    goto :goto_1

    .line 401
    :catchall_1
    move-exception v0

    .line 402
    move-object p1, v0

    .line 403
    goto :goto_2

    .line 404
    :cond_6
    :goto_1
    monitor-exit v1

    .line 405
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 406
    .line 407
    return-object p1

    .line 408
    :goto_2
    monitor-exit v1

    .line 409
    throw p1

    .line 410
    :pswitch_d
    check-cast p1, LO0/r;

    .line 411
    .line 412
    iget-object v0, p0, LA/Y;->r:Ljava/lang/Object;

    .line 413
    .line 414
    check-cast v0, LB0/o;

    .line 415
    .line 416
    iget-object v1, v0, LB0/o;->q:Ljava/lang/Object;

    .line 417
    .line 418
    check-cast v1, LO3/D;

    .line 419
    .line 420
    iget-object v2, p0, LA/Y;->s:Ljava/lang/Object;

    .line 421
    .line 422
    check-cast v2, LO0/q;

    .line 423
    .line 424
    monitor-enter v1

    .line 425
    :try_start_2
    iget-boolean v3, p1, LO0/r;->r:Z

    .line 426
    .line 427
    if-eqz v3, :cond_7

    .line 428
    .line 429
    iget-object v0, v0, LB0/o;->r:Ljava/lang/Object;

    .line 430
    .line 431
    check-cast v0, Ld2/d0;

    .line 432
    .line 433
    invoke-virtual {v0, v2, p1}, Ld2/d0;->l(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    goto :goto_3

    .line 437
    :catchall_2
    move-exception v0

    .line 438
    move-object p1, v0

    .line 439
    goto :goto_4

    .line 440
    :cond_7
    iget-object p1, v0, LB0/o;->r:Ljava/lang/Object;

    .line 441
    .line 442
    check-cast p1, Ld2/d0;

    .line 443
    .line 444
    invoke-virtual {p1, v2}, Ld2/d0;->m(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 445
    .line 446
    .line 447
    :goto_3
    monitor-exit v1

    .line 448
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 449
    .line 450
    return-object p1

    .line 451
    :goto_4
    monitor-exit v1

    .line 452
    throw p1

    .line 453
    :pswitch_e
    check-cast p1, LB5/c;

    .line 454
    .line 455
    iget-object p1, p0, LA/Y;->r:Ljava/lang/Object;

    .line 456
    .line 457
    check-cast p1, LO0/e;

    .line 458
    .line 459
    iget-object v0, p1, LO0/e;->d:LO0/g;

    .line 460
    .line 461
    iget-object v1, p0, LA/Y;->s:Ljava/lang/Object;

    .line 462
    .line 463
    check-cast v1, LO0/q;

    .line 464
    .line 465
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 466
    .line 467
    .line 468
    iget-object v0, v1, LO0/q;->a:LO0/p;

    .line 469
    .line 470
    iget-object p1, p1, LO0/e;->e:Lk3/c;

    .line 471
    .line 472
    iget-object p1, p1, Lk3/c;->q:Ljava/lang/Object;

    .line 473
    .line 474
    check-cast p1, LO0/o;

    .line 475
    .line 476
    iget v2, v1, LO0/q;->c:I

    .line 477
    .line 478
    iget-object v1, v1, LO0/q;->b:LO0/j;

    .line 479
    .line 480
    if-nez v0, :cond_8

    .line 481
    .line 482
    goto :goto_5

    .line 483
    :cond_8
    instance-of v5, v0, LO0/b;

    .line 484
    .line 485
    :goto_5
    if-eqz v5, :cond_9

    .line 486
    .line 487
    invoke-interface {p1, v1, v2}, LO0/o;->e(LO0/j;I)Landroid/graphics/Typeface;

    .line 488
    .line 489
    .line 490
    move-result-object p1

    .line 491
    goto :goto_6

    .line 492
    :cond_9
    instance-of v4, v0, LO0/l;

    .line 493
    .line 494
    if-eqz v4, :cond_a

    .line 495
    .line 496
    check-cast v0, LO0/l;

    .line 497
    .line 498
    invoke-interface {p1, v0, v1, v2}, LO0/o;->d(LO0/l;LO0/j;I)Landroid/graphics/Typeface;

    .line 499
    .line 500
    .line 501
    move-result-object p1

    .line 502
    :goto_6
    new-instance v3, LO0/r;

    .line 503
    .line 504
    invoke-direct {v3, p1}, LO0/r;-><init>(Landroid/graphics/Typeface;)V

    .line 505
    .line 506
    .line 507
    :cond_a
    if-eqz v3, :cond_b

    .line 508
    .line 509
    return-object v3

    .line 510
    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 511
    .line 512
    const-string v0, "Could not load font"

    .line 513
    .line 514
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 515
    .line 516
    .line 517
    throw p1

    .line 518
    :pswitch_f
    check-cast p1, LA/W;

    .line 519
    .line 520
    iget-object v0, p0, LA/Y;->r:Ljava/lang/Object;

    .line 521
    .line 522
    check-cast v0, LN/z;

    .line 523
    .line 524
    iget-object v1, p0, LA/Y;->s:Ljava/lang/Object;

    .line 525
    .line 526
    check-cast v1, LA/W;

    .line 527
    .line 528
    new-instance v2, LA/y;

    .line 529
    .line 530
    invoke-direct {v2, v1, p1}, LA/y;-><init>(LA/W;LA/W;)V

    .line 531
    .line 532
    .line 533
    iget-object p1, v0, LN/z;->a:LP/f0;

    .line 534
    .line 535
    invoke-virtual {p1, v2}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 536
    .line 537
    .line 538
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 539
    .line 540
    return-object p1

    .line 541
    :pswitch_10
    check-cast p1, LI0/i;

    .line 542
    .line 543
    sget-object v0, LI0/r;->a:[LH5/k;

    .line 544
    .line 545
    sget-object v0, LI0/p;->r:LI0/s;

    .line 546
    .line 547
    sget-object v4, LI0/r;->a:[LH5/k;

    .line 548
    .line 549
    aget-object v2, v4, v2

    .line 550
    .line 551
    const/high16 v2, 0x3f800000    # 1.0f

    .line 552
    .line 553
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 554
    .line 555
    .line 556
    move-result-object v2

    .line 557
    invoke-virtual {v0, p1, v2}, LI0/s;->a(LI0/i;Ljava/lang/Object;)V

    .line 558
    .line 559
    .line 560
    iget-object v0, p0, LA/Y;->r:Ljava/lang/Object;

    .line 561
    .line 562
    check-cast v0, Ljava/lang/String;

    .line 563
    .line 564
    invoke-static {p1, v0}, LI0/r;->c(LI0/i;Ljava/lang/String;)V

    .line 565
    .line 566
    .line 567
    new-instance v0, LF/Q;

    .line 568
    .line 569
    iget-object v2, p0, LA/Y;->s:Ljava/lang/Object;

    .line 570
    .line 571
    check-cast v2, LB5/a;

    .line 572
    .line 573
    invoke-direct {v0, v2, v1}, LF/Q;-><init>(LB5/a;I)V

    .line 574
    .line 575
    .line 576
    sget-object v1, LI0/h;->b:LI0/s;

    .line 577
    .line 578
    new-instance v2, LI0/a;

    .line 579
    .line 580
    invoke-direct {v2, v3, v0}, LI0/a;-><init>(Ljava/lang/String;Lm5/e;)V

    .line 581
    .line 582
    .line 583
    invoke-virtual {p1, v1, v2}, LI0/i;->j(LI0/s;Ljava/lang/Object;)V

    .line 584
    .line 585
    .line 586
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 587
    .line 588
    return-object p1

    .line 589
    :pswitch_11
    check-cast p1, Lj0/C;

    .line 590
    .line 591
    iget-object v0, p0, LA/Y;->r:Ljava/lang/Object;

    .line 592
    .line 593
    check-cast v0, LM/I0;

    .line 594
    .line 595
    iget-object v0, v0, LM/I0;->c:LN/r;

    .line 596
    .line 597
    iget-object v0, v0, LN/r;->j:LP/b0;

    .line 598
    .line 599
    invoke-virtual {v0}, LP/b0;->e()F

    .line 600
    .line 601
    .line 602
    move-result v0

    .line 603
    iget-wide v1, p1, Lj0/C;->B:J

    .line 604
    .line 605
    invoke-static {v1, v2}, Li0/e;->b(J)F

    .line 606
    .line 607
    .line 608
    move-result v1

    .line 609
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 610
    .line 611
    .line 612
    move-result v2

    .line 613
    if-nez v2, :cond_d

    .line 614
    .line 615
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 616
    .line 617
    .line 618
    move-result v2

    .line 619
    if-nez v2, :cond_d

    .line 620
    .line 621
    const/4 v2, 0x0

    .line 622
    cmpg-float v2, v1, v2

    .line 623
    .line 624
    if-nez v2, :cond_c

    .line 625
    .line 626
    goto :goto_7

    .line 627
    :cond_c
    iget-object v2, p0, LA/Y;->s:Ljava/lang/Object;

    .line 628
    .line 629
    check-cast v2, Lu/c;

    .line 630
    .line 631
    invoke-virtual {v2}, Lu/c;->d()Ljava/lang/Object;

    .line 632
    .line 633
    .line 634
    move-result-object v2

    .line 635
    check-cast v2, Ljava/lang/Number;

    .line 636
    .line 637
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 638
    .line 639
    .line 640
    move-result v2

    .line 641
    invoke-static {p1, v2}, LM/g0;->d(Lj0/C;F)F

    .line 642
    .line 643
    .line 644
    move-result v3

    .line 645
    invoke-virtual {p1, v3}, Lj0/C;->c(F)V

    .line 646
    .line 647
    .line 648
    invoke-static {p1, v2}, LM/g0;->e(Lj0/C;F)F

    .line 649
    .line 650
    .line 651
    move-result v2

    .line 652
    invoke-virtual {p1, v2}, Lj0/C;->e(F)V

    .line 653
    .line 654
    .line 655
    add-float/2addr v0, v1

    .line 656
    div-float/2addr v0, v1

    .line 657
    const/high16 v1, 0x3f000000    # 0.5f

    .line 658
    .line 659
    invoke-static {v1, v0}, Lj0/B;->g(FF)J

    .line 660
    .line 661
    .line 662
    move-result-wide v0

    .line 663
    invoke-virtual {p1, v0, v1}, Lj0/C;->g(J)V

    .line 664
    .line 665
    .line 666
    :cond_d
    :goto_7
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 667
    .line 668
    return-object p1

    .line 669
    :pswitch_12
    check-cast p1, Lz0/I;

    .line 670
    .line 671
    new-instance v0, LF/y;

    .line 672
    .line 673
    iget-object v1, p0, LA/Y;->s:Ljava/lang/Object;

    .line 674
    .line 675
    check-cast v1, Ljava/util/ArrayList;

    .line 676
    .line 677
    invoke-direct {v0, v4, v1}, LF/y;-><init>(ILjava/util/ArrayList;)V

    .line 678
    .line 679
    .line 680
    iput-boolean v5, p1, Lz0/I;->a:Z

    .line 681
    .line 682
    invoke-virtual {v0, p1}, LF/y;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 683
    .line 684
    .line 685
    iput-boolean v4, p1, Lz0/I;->a:Z

    .line 686
    .line 687
    iget-object p1, p0, LA/Y;->r:Ljava/lang/Object;

    .line 688
    .line 689
    check-cast p1, LP/W;

    .line 690
    .line 691
    invoke-interface {p1}, LP/S0;->getValue()Ljava/lang/Object;

    .line 692
    .line 693
    .line 694
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 695
    .line 696
    return-object p1

    .line 697
    :pswitch_13
    check-cast p1, LP/F;

    .line 698
    .line 699
    iget-object p1, p0, LA/Y;->r:Ljava/lang/Object;

    .line 700
    .line 701
    check-cast p1, LE/W;

    .line 702
    .line 703
    iget-object v0, p1, LE/W;->c:Lr/H;

    .line 704
    .line 705
    iget-object v1, p0, LA/Y;->s:Ljava/lang/Object;

    .line 706
    .line 707
    invoke-virtual {v0, v1}, Lr/H;->i(Ljava/lang/Object;)V

    .line 708
    .line 709
    .line 710
    new-instance v0, LA/X;

    .line 711
    .line 712
    const/4 v2, 0x3

    .line 713
    invoke-direct {v0, v2, p1, v1}, LA/X;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 714
    .line 715
    .line 716
    return-object v0

    .line 717
    :pswitch_14
    check-cast p1, Ljava/util/Map;

    .line 718
    .line 719
    new-instance v0, LE/W;

    .line 720
    .line 721
    iget-object v1, p0, LA/Y;->r:Ljava/lang/Object;

    .line 722
    .line 723
    check-cast v1, LZ/i;

    .line 724
    .line 725
    iget-object v2, p0, LA/Y;->s:Ljava/lang/Object;

    .line 726
    .line 727
    check-cast v2, LZ/c;

    .line 728
    .line 729
    invoke-direct {v0, v1, p1, v2}, LE/W;-><init>(LZ/i;Ljava/util/Map;LZ/c;)V

    .line 730
    .line 731
    .line 732
    return-object v0

    .line 733
    :pswitch_15
    check-cast p1, Ljava/lang/Number;

    .line 734
    .line 735
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 736
    .line 737
    .line 738
    move-result v6

    .line 739
    iget-object p1, p0, LA/Y;->r:Ljava/lang/Object;

    .line 740
    .line 741
    check-cast p1, LD/m;

    .line 742
    .line 743
    iget-object v0, p1, LD/m;->e:LD/u;

    .line 744
    .line 745
    iget v1, v0, LD/u;->b:I

    .line 746
    .line 747
    invoke-virtual {v0, v6}, LD/u;->A(I)I

    .line 748
    .line 749
    .line 750
    move-result v8

    .line 751
    invoke-virtual {p1, v4, v8}, LD/m;->a(II)J

    .line 752
    .line 753
    .line 754
    move-result-wide v10

    .line 755
    iget-object p1, p0, LA/Y;->s:Ljava/lang/Object;

    .line 756
    .line 757
    move-object v5, p1

    .line 758
    check-cast v5, LD/l;

    .line 759
    .line 760
    const/4 v7, 0x0

    .line 761
    iget v9, v5, LD/l;->c:I

    .line 762
    .line 763
    invoke-virtual/range {v5 .. v11}, LD/l;->a(IIIIJ)LD/p;

    .line 764
    .line 765
    .line 766
    move-result-object p1

    .line 767
    return-object p1

    .line 768
    :pswitch_16
    check-cast p1, Ljava/lang/Number;

    .line 769
    .line 770
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 771
    .line 772
    .line 773
    move-result p1

    .line 774
    iget-object v0, p0, LA/Y;->r:Ljava/lang/Object;

    .line 775
    .line 776
    check-cast v0, LD/u;

    .line 777
    .line 778
    invoke-virtual {v0, p1}, LD/u;->r(I)LD/t;

    .line 779
    .line 780
    .line 781
    move-result-object p1

    .line 782
    iget v0, p1, LD/t;->a:I

    .line 783
    .line 784
    new-instance v1, Ljava/util/ArrayList;

    .line 785
    .line 786
    iget-object p1, p1, LD/t;->b:Ljava/util/List;

    .line 787
    .line 788
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 789
    .line 790
    .line 791
    move-result v2

    .line 792
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 793
    .line 794
    .line 795
    iget-object v2, p0, LA/Y;->s:Ljava/lang/Object;

    .line 796
    .line 797
    check-cast v2, LD/m;

    .line 798
    .line 799
    move-object v3, p1

    .line 800
    check-cast v3, Ljava/util/Collection;

    .line 801
    .line 802
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 803
    .line 804
    .line 805
    move-result v3

    .line 806
    move v6, v4

    .line 807
    :goto_8
    if-ge v4, v3, :cond_e

    .line 808
    .line 809
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 810
    .line 811
    .line 812
    move-result-object v7

    .line 813
    check-cast v7, LD/b;

    .line 814
    .line 815
    iget-wide v7, v7, LD/b;->a:J

    .line 816
    .line 817
    long-to-int v7, v7

    .line 818
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 819
    .line 820
    .line 821
    move-result-object v8

    .line 822
    invoke-virtual {v2, v6, v7}, LD/m;->a(II)J

    .line 823
    .line 824
    .line 825
    move-result-wide v9

    .line 826
    new-instance v11, LW0/a;

    .line 827
    .line 828
    invoke-direct {v11, v9, v10}, LW0/a;-><init>(J)V

    .line 829
    .line 830
    .line 831
    new-instance v9, Lm5/j;

    .line 832
    .line 833
    invoke-direct {v9, v8, v11}, Lm5/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 834
    .line 835
    .line 836
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 837
    .line 838
    .line 839
    add-int/2addr v0, v5

    .line 840
    add-int/2addr v6, v7

    .line 841
    add-int/lit8 v4, v4, 0x1

    .line 842
    .line 843
    goto :goto_8

    .line 844
    :cond_e
    return-object v1

    .line 845
    :pswitch_17
    check-cast p1, LC0/n;

    .line 846
    .line 847
    iget-object v0, p0, LA/Y;->s:Ljava/lang/Object;

    .line 848
    .line 849
    check-cast v0, LB5/e;

    .line 850
    .line 851
    iget-object v1, p0, LA/Y;->r:Ljava/lang/Object;

    .line 852
    .line 853
    check-cast v1, LC0/w1;

    .line 854
    .line 855
    iget-boolean v2, v1, LC0/w1;->s:Z

    .line 856
    .line 857
    if-nez v2, :cond_10

    .line 858
    .line 859
    iget-object p1, p1, LC0/n;->a:Landroidx/lifecycle/x;

    .line 860
    .line 861
    invoke-interface {p1}, Landroidx/lifecycle/x;->getLifecycle()Landroidx/lifecycle/q;

    .line 862
    .line 863
    .line 864
    move-result-object p1

    .line 865
    iput-object v0, v1, LC0/w1;->u:LB5/e;

    .line 866
    .line 867
    iget-object v2, v1, LC0/w1;->t:Landroidx/lifecycle/q;

    .line 868
    .line 869
    if-nez v2, :cond_f

    .line 870
    .line 871
    iput-object p1, v1, LC0/w1;->t:Landroidx/lifecycle/q;

    .line 872
    .line 873
    invoke-virtual {p1, v1}, Landroidx/lifecycle/q;->a(Landroidx/lifecycle/w;)V

    .line 874
    .line 875
    .line 876
    goto :goto_9

    .line 877
    :cond_f
    invoke-virtual {p1}, Landroidx/lifecycle/q;->b()Landroidx/lifecycle/p;

    .line 878
    .line 879
    .line 880
    move-result-object p1

    .line 881
    sget-object v2, Landroidx/lifecycle/p;->s:Landroidx/lifecycle/p;

    .line 882
    .line 883
    invoke-virtual {p1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 884
    .line 885
    .line 886
    move-result p1

    .line 887
    if-ltz p1, :cond_10

    .line 888
    .line 889
    iget-object p1, v1, LC0/w1;->r:LP/u;

    .line 890
    .line 891
    new-instance v2, LC0/v1;

    .line 892
    .line 893
    invoke-direct {v2, v1, v0, v5}, LC0/v1;-><init>(LC0/w1;LB5/e;I)V

    .line 894
    .line 895
    .line 896
    new-instance v0, LX/e;

    .line 897
    .line 898
    const v1, -0x773f589e

    .line 899
    .line 900
    .line 901
    invoke-direct {v0, v1, v5, v2}, LX/e;-><init>(IZLjava/lang/Object;)V

    .line 902
    .line 903
    .line 904
    invoke-virtual {p1, v0}, LP/u;->j(LX/e;)V

    .line 905
    .line 906
    .line 907
    :cond_10
    :goto_9
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 908
    .line 909
    return-object p1

    .line 910
    :pswitch_18
    check-cast p1, Ljava/lang/Throwable;

    .line 911
    .line 912
    iget-object p1, p0, LA/Y;->r:Ljava/lang/Object;

    .line 913
    .line 914
    check-cast p1, LC0/h0;

    .line 915
    .line 916
    iget-object p1, p1, LC0/h0;->r:Ljava/lang/Object;

    .line 917
    .line 918
    check-cast p1, Landroid/view/Choreographer;

    .line 919
    .line 920
    iget-object v0, p0, LA/Y;->s:Ljava/lang/Object;

    .line 921
    .line 922
    check-cast v0, LC0/g0;

    .line 923
    .line 924
    invoke-virtual {p1, v0}, Landroid/view/Choreographer;->removeFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    .line 925
    .line 926
    .line 927
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 928
    .line 929
    return-object p1

    .line 930
    :pswitch_19
    check-cast p1, Ljava/lang/Throwable;

    .line 931
    .line 932
    iget-object p1, p0, LA/Y;->r:Ljava/lang/Object;

    .line 933
    .line 934
    check-cast p1, LC0/f0;

    .line 935
    .line 936
    iget-object v0, p0, LA/Y;->s:Ljava/lang/Object;

    .line 937
    .line 938
    check-cast v0, LC0/g0;

    .line 939
    .line 940
    iget-object v1, p1, LC0/f0;->s:Ljava/lang/Object;

    .line 941
    .line 942
    monitor-enter v1

    .line 943
    :try_start_3
    iget-object p1, p1, LC0/f0;->u:Ljava/util/ArrayList;

    .line 944
    .line 945
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 946
    .line 947
    .line 948
    monitor-exit v1

    .line 949
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 950
    .line 951
    return-object p1

    .line 952
    :catchall_3
    move-exception v0

    .line 953
    move-object p1, v0

    .line 954
    monitor-exit v1

    .line 955
    throw p1

    .line 956
    :pswitch_1a
    check-cast p1, LP/F;

    .line 957
    .line 958
    iget-object p1, p0, LA/Y;->r:Ljava/lang/Object;

    .line 959
    .line 960
    check-cast p1, Landroid/content/Context;

    .line 961
    .line 962
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 963
    .line 964
    .line 965
    move-result-object v0

    .line 966
    iget-object v2, p0, LA/Y;->s:Ljava/lang/Object;

    .line 967
    .line 968
    check-cast v2, LC0/b0;

    .line 969
    .line 970
    invoke-virtual {v0, v2}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 971
    .line 972
    .line 973
    new-instance v0, LA/X;

    .line 974
    .line 975
    invoke-direct {v0, v1, p1, v2}, LA/X;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 976
    .line 977
    .line 978
    return-object v0

    .line 979
    :pswitch_1b
    check-cast p1, LP/F;

    .line 980
    .line 981
    iget-object p1, p0, LA/Y;->r:Ljava/lang/Object;

    .line 982
    .line 983
    check-cast p1, Landroid/content/Context;

    .line 984
    .line 985
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 986
    .line 987
    .line 988
    move-result-object v0

    .line 989
    iget-object v1, p0, LA/Y;->s:Ljava/lang/Object;

    .line 990
    .line 991
    check-cast v1, LC0/a0;

    .line 992
    .line 993
    invoke-virtual {v0, v1}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 994
    .line 995
    .line 996
    new-instance v0, LA/X;

    .line 997
    .line 998
    invoke-direct {v0, v5, p1, v1}, LA/X;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 999
    .line 1000
    .line 1001
    return-object v0

    .line 1002
    :pswitch_1c
    check-cast p1, LP/F;

    .line 1003
    .line 1004
    iget-object p1, p0, LA/Y;->r:Ljava/lang/Object;

    .line 1005
    .line 1006
    check-cast p1, LA/Z;

    .line 1007
    .line 1008
    iget-object v0, p0, LA/Y;->s:Ljava/lang/Object;

    .line 1009
    .line 1010
    check-cast v0, Landroid/view/View;

    .line 1011
    .line 1012
    iget-object v1, p1, LA/Z;->u:LA/D;

    .line 1013
    .line 1014
    iget v2, p1, LA/Z;->t:I

    .line 1015
    .line 1016
    if-nez v2, :cond_12

    .line 1017
    .line 1018
    sget-object v2, Lw1/K;->a:Ljava/util/WeakHashMap;

    .line 1019
    .line 1020
    invoke-static {v0, v1}, Lw1/B;->l(Landroid/view/View;Lw1/m;)V

    .line 1021
    .line 1022
    .line 1023
    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 1024
    .line 1025
    .line 1026
    move-result v2

    .line 1027
    if-eqz v2, :cond_11

    .line 1028
    .line 1029
    invoke-virtual {v0}, Landroid/view/View;->requestApplyInsets()V

    .line 1030
    .line 1031
    .line 1032
    :cond_11
    invoke-virtual {v0, v1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 1033
    .line 1034
    .line 1035
    invoke-static {v0, v1}, Lw1/K;->o(Landroid/view/View;Lw1/Q;)V

    .line 1036
    .line 1037
    .line 1038
    :cond_12
    iget v1, p1, LA/Z;->t:I

    .line 1039
    .line 1040
    add-int/2addr v1, v5

    .line 1041
    iput v1, p1, LA/Z;->t:I

    .line 1042
    .line 1043
    new-instance v1, LA/X;

    .line 1044
    .line 1045
    invoke-direct {v1, v4, p1, v0}, LA/X;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1046
    .line 1047
    .line 1048
    return-object v1

    .line 1049
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
