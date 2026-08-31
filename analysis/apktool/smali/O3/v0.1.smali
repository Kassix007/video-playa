.class public final LO3/v0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:LO3/a2;

.field public final synthetic s:LO3/C0;


# direct methods
.method public synthetic constructor <init>(LO3/C0;LO3/a2;I)V
    .locals 0

    .line 1
    iput p3, p0, LO3/v0;->q:I

    iput-object p2, p0, LO3/v0;->r:LO3/a2;

    iput-object p1, p0, LO3/v0;->s:LO3/C0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 1
    iget v0, p0, LO3/v0;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LO3/v0;->s:LO3/C0;

    .line 7
    .line 8
    iget-object v0, v0, LO3/C0;->c:LO3/T1;

    .line 9
    .line 10
    invoke-virtual {v0}, LO3/T1;->A()V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, LO3/v0;->r:LO3/a2;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, LO3/T1;->l0(LO3/a2;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_0
    iget-object v0, p0, LO3/v0;->s:LO3/C0;

    .line 20
    .line 21
    iget-object v0, v0, LO3/C0;->c:LO3/T1;

    .line 22
    .line 23
    invoke-virtual {v0}, LO3/T1;->A()V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, LO3/v0;->r:LO3/a2;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, LO3/T1;->m0(LO3/a2;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :pswitch_1
    iget-object v0, p0, LO3/v0;->s:LO3/C0;

    .line 33
    .line 34
    iget-object v1, v0, LO3/C0;->c:LO3/T1;

    .line 35
    .line 36
    invoke-virtual {v1}, LO3/T1;->A()V

    .line 37
    .line 38
    .line 39
    iget-object v0, v0, LO3/C0;->c:LO3/T1;

    .line 40
    .line 41
    invoke-virtual {v0}, LO3/T1;->c()LO3/p0;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v1}, LO3/p0;->o()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, LO3/T1;->k0()V

    .line 49
    .line 50
    .line 51
    iget-object v1, p0, LO3/v0;->r:LO3/a2;

    .line 52
    .line 53
    iget-object v2, v1, LO3/a2;->q:Ljava/lang/String;

    .line 54
    .line 55
    invoke-static {v2}, Lx3/A;->d(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v1}, LO3/T1;->l0(LO3/a2;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v1}, LO3/T1;->m0(LO3/a2;)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :pswitch_2
    iget-object v0, p0, LO3/v0;->s:LO3/C0;

    .line 66
    .line 67
    iget-object v1, v0, LO3/C0;->c:LO3/T1;

    .line 68
    .line 69
    invoke-virtual {v1}, LO3/T1;->A()V

    .line 70
    .line 71
    .line 72
    iget-object v0, v0, LO3/C0;->c:LO3/T1;

    .line 73
    .line 74
    const-string v1, "app_id=?"

    .line 75
    .line 76
    iget-object v2, v0, LO3/T1;->O:Ljava/util/ArrayList;

    .line 77
    .line 78
    if-eqz v2, :cond_0

    .line 79
    .line 80
    new-instance v2, Ljava/util/ArrayList;

    .line 81
    .line 82
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 83
    .line 84
    .line 85
    iput-object v2, v0, LO3/T1;->P:Ljava/util/ArrayList;

    .line 86
    .line 87
    iget-object v3, v0, LO3/T1;->O:Ljava/util/ArrayList;

    .line 88
    .line 89
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 90
    .line 91
    .line 92
    :cond_0
    iget-object v2, v0, LO3/T1;->s:LO3/n;

    .line 93
    .line 94
    invoke-static {v2}, LO3/T1;->S(LO3/O1;)V

    .line 95
    .line 96
    .line 97
    iget-object v3, v2, LO3/D0;->r:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v3, LO3/t0;

    .line 100
    .line 101
    iget-object v4, p0, LO3/v0;->r:LO3/a2;

    .line 102
    .line 103
    iget-object v5, v4, LO3/a2;->q:Ljava/lang/String;

    .line 104
    .line 105
    invoke-static {v5}, Lx3/A;->g(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    invoke-static {v5}, Lx3/A;->d(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2}, LO3/D0;->o()V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v2}, LO3/O1;->p()V

    .line 115
    .line 116
    .line 117
    :try_start_0
    invoke-virtual {v2}, LO3/n;->f0()Landroid/database/sqlite/SQLiteDatabase;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    filled-new-array {v5}, [Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v6

    .line 125
    const-string v7, "apps"

    .line 126
    .line 127
    invoke-virtual {v2, v7, v1, v6}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 128
    .line 129
    .line 130
    move-result v7

    .line 131
    const-string v8, "events"

    .line 132
    .line 133
    invoke-virtual {v2, v8, v1, v6}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 134
    .line 135
    .line 136
    move-result v8

    .line 137
    add-int/2addr v7, v8

    .line 138
    const-string v8, "events_snapshot"

    .line 139
    .line 140
    invoke-virtual {v2, v8, v1, v6}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 141
    .line 142
    .line 143
    move-result v8

    .line 144
    add-int/2addr v7, v8

    .line 145
    const-string v8, "user_attributes"

    .line 146
    .line 147
    invoke-virtual {v2, v8, v1, v6}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 148
    .line 149
    .line 150
    move-result v8

    .line 151
    add-int/2addr v7, v8

    .line 152
    const-string v8, "conditional_properties"

    .line 153
    .line 154
    invoke-virtual {v2, v8, v1, v6}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 155
    .line 156
    .line 157
    move-result v8

    .line 158
    add-int/2addr v7, v8

    .line 159
    const-string v8, "raw_events"

    .line 160
    .line 161
    invoke-virtual {v2, v8, v1, v6}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 162
    .line 163
    .line 164
    move-result v8

    .line 165
    add-int/2addr v7, v8

    .line 166
    const-string v8, "raw_events_metadata"

    .line 167
    .line 168
    invoke-virtual {v2, v8, v1, v6}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 169
    .line 170
    .line 171
    move-result v8

    .line 172
    add-int/2addr v7, v8

    .line 173
    const-string v8, "queue"

    .line 174
    .line 175
    invoke-virtual {v2, v8, v1, v6}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 176
    .line 177
    .line 178
    move-result v8

    .line 179
    add-int/2addr v7, v8

    .line 180
    const-string v8, "audience_filter_values"

    .line 181
    .line 182
    invoke-virtual {v2, v8, v1, v6}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 183
    .line 184
    .line 185
    move-result v8

    .line 186
    add-int/2addr v7, v8

    .line 187
    const-string v8, "main_event_params"

    .line 188
    .line 189
    invoke-virtual {v2, v8, v1, v6}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 190
    .line 191
    .line 192
    move-result v8

    .line 193
    add-int/2addr v7, v8

    .line 194
    const-string v8, "default_event_params"

    .line 195
    .line 196
    invoke-virtual {v2, v8, v1, v6}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 197
    .line 198
    .line 199
    move-result v8

    .line 200
    add-int/2addr v7, v8

    .line 201
    const-string v8, "trigger_uris"

    .line 202
    .line 203
    invoke-virtual {v2, v8, v1, v6}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 204
    .line 205
    .line 206
    move-result v8

    .line 207
    add-int/2addr v7, v8

    .line 208
    const-string v8, "upload_queue"

    .line 209
    .line 210
    invoke-virtual {v2, v8, v1, v6}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 211
    .line 212
    .line 213
    move-result v8

    .line 214
    add-int/2addr v7, v8

    .line 215
    sget-object v8, Lcom/google/android/gms/internal/measurement/x3;->r:Lcom/google/android/gms/internal/measurement/x3;

    .line 216
    .line 217
    iget-object v8, v8, Lcom/google/android/gms/internal/measurement/x3;->q:LG4/g;

    .line 218
    .line 219
    iget-object v8, v8, LG4/g;->q:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast v8, Lcom/google/android/gms/internal/measurement/y3;

    .line 222
    .line 223
    iget-object v8, v3, LO3/t0;->t:LO3/g;

    .line 224
    .line 225
    sget-object v9, LO3/F;->i1:LO3/E;

    .line 226
    .line 227
    const/4 v10, 0x0

    .line 228
    invoke-virtual {v8, v10, v9}, LO3/g;->y(Ljava/lang/String;LO3/E;)Z

    .line 229
    .line 230
    .line 231
    move-result v8

    .line 232
    if-eqz v8, :cond_1

    .line 233
    .line 234
    const-string v8, "no_data_mode_events"

    .line 235
    .line 236
    invoke-virtual {v2, v8, v1, v6}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 237
    .line 238
    .line 239
    move-result v1

    .line 240
    add-int/2addr v7, v1

    .line 241
    goto :goto_0

    .line 242
    :catch_0
    move-exception v1

    .line 243
    goto :goto_1

    .line 244
    :cond_1
    :goto_0
    if-lez v7, :cond_2

    .line 245
    .line 246
    iget-object v1, v3, LO3/t0;->v:LO3/X;

    .line 247
    .line 248
    invoke-static {v1}, LO3/t0;->l(LO3/E0;)V

    .line 249
    .line 250
    .line 251
    iget-object v1, v1, LO3/X;->E:LO3/V;

    .line 252
    .line 253
    const-string v2, "Reset analytics data. app, records"

    .line 254
    .line 255
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 256
    .line 257
    .line 258
    move-result-object v6

    .line 259
    invoke-virtual {v1, v5, v6, v2}, LO3/V;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 260
    .line 261
    .line 262
    goto :goto_2

    .line 263
    :goto_1
    iget-object v2, v3, LO3/t0;->v:LO3/X;

    .line 264
    .line 265
    invoke-static {v2}, LO3/t0;->l(LO3/E0;)V

    .line 266
    .line 267
    .line 268
    iget-object v2, v2, LO3/X;->w:LO3/V;

    .line 269
    .line 270
    invoke-static {v5}, LO3/X;->w(Ljava/lang/String;)LO3/W;

    .line 271
    .line 272
    .line 273
    move-result-object v3

    .line 274
    const-string v5, "Error resetting analytics data. appId, error"

    .line 275
    .line 276
    invoke-virtual {v2, v3, v1, v5}, LO3/V;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    :cond_2
    :goto_2
    iget-boolean v1, v4, LO3/a2;->x:Z

    .line 280
    .line 281
    if-eqz v1, :cond_3

    .line 282
    .line 283
    invoke-virtual {v0, v4}, LO3/T1;->W(LO3/a2;)V

    .line 284
    .line 285
    .line 286
    :cond_3
    return-void

    .line 287
    :pswitch_3
    iget-object v0, p0, LO3/v0;->s:LO3/C0;

    .line 288
    .line 289
    iget-object v1, v0, LO3/C0;->c:LO3/T1;

    .line 290
    .line 291
    invoke-virtual {v1}, LO3/T1;->A()V

    .line 292
    .line 293
    .line 294
    iget-object v0, v0, LO3/C0;->c:LO3/T1;

    .line 295
    .line 296
    invoke-virtual {v0}, LO3/T1;->c()LO3/p0;

    .line 297
    .line 298
    .line 299
    move-result-object v1

    .line 300
    invoke-virtual {v1}, LO3/p0;->o()V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v0}, LO3/T1;->k0()V

    .line 304
    .line 305
    .line 306
    iget-object v1, p0, LO3/v0;->r:LO3/a2;

    .line 307
    .line 308
    iget-object v2, v1, LO3/a2;->q:Ljava/lang/String;

    .line 309
    .line 310
    invoke-static {v2}, Lx3/A;->d(Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v0, v1}, LO3/T1;->a0(LO3/a2;)LO3/c0;

    .line 314
    .line 315
    .line 316
    return-void

    .line 317
    :pswitch_4
    iget-object v0, p0, LO3/v0;->s:LO3/C0;

    .line 318
    .line 319
    iget-object v1, v0, LO3/C0;->c:LO3/T1;

    .line 320
    .line 321
    invoke-virtual {v1}, LO3/T1;->A()V

    .line 322
    .line 323
    .line 324
    iget-object v0, v0, LO3/C0;->c:LO3/T1;

    .line 325
    .line 326
    invoke-virtual {v0}, LO3/T1;->c()LO3/p0;

    .line 327
    .line 328
    .line 329
    move-result-object v1

    .line 330
    invoke-virtual {v1}, LO3/p0;->o()V

    .line 331
    .line 332
    .line 333
    invoke-virtual {v0}, LO3/T1;->k0()V

    .line 334
    .line 335
    .line 336
    iget-object v1, p0, LO3/v0;->r:LO3/a2;

    .line 337
    .line 338
    invoke-static {v1}, Lx3/A;->g(Ljava/lang/Object;)V

    .line 339
    .line 340
    .line 341
    iget-object v2, v1, LO3/a2;->q:Ljava/lang/String;

    .line 342
    .line 343
    invoke-static {v2}, Lx3/A;->d(Ljava/lang/String;)V

    .line 344
    .line 345
    .line 346
    invoke-virtual {v0}, LO3/T1;->d0()LO3/g;

    .line 347
    .line 348
    .line 349
    move-result-object v3

    .line 350
    sget-object v4, LO3/F;->z0:LO3/E;

    .line 351
    .line 352
    const/4 v5, 0x0

    .line 353
    invoke-virtual {v3, v5, v4}, LO3/g;->y(Ljava/lang/String;LO3/E;)Z

    .line 354
    .line 355
    .line 356
    move-result v3

    .line 357
    const/4 v4, 0x0

    .line 358
    if-eqz v3, :cond_4

    .line 359
    .line 360
    invoke-virtual {v0}, LO3/T1;->e()LB3/a;

    .line 361
    .line 362
    .line 363
    move-result-object v3

    .line 364
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 365
    .line 366
    .line 367
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 368
    .line 369
    .line 370
    move-result-wide v6

    .line 371
    invoke-virtual {v0}, LO3/T1;->d0()LO3/g;

    .line 372
    .line 373
    .line 374
    move-result-object v3

    .line 375
    sget-object v8, LO3/F;->i0:LO3/E;

    .line 376
    .line 377
    invoke-virtual {v3, v5, v8}, LO3/g;->w(Ljava/lang/String;LO3/E;)I

    .line 378
    .line 379
    .line 380
    move-result v3

    .line 381
    invoke-virtual {v0}, LO3/T1;->d0()LO3/g;

    .line 382
    .line 383
    .line 384
    sget-object v8, LO3/F;->e:LO3/E;

    .line 385
    .line 386
    invoke-virtual {v8, v5}, LO3/E;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v8

    .line 390
    check-cast v8, Ljava/lang/Long;

    .line 391
    .line 392
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    .line 393
    .line 394
    .line 395
    move-result-wide v8

    .line 396
    sub-long/2addr v6, v8

    .line 397
    :goto_3
    if-ge v4, v3, :cond_5

    .line 398
    .line 399
    invoke-virtual {v0, v5, v6, v7}, LO3/T1;->G(Ljava/lang/String;J)Z

    .line 400
    .line 401
    .line 402
    move-result v8

    .line 403
    if-eqz v8, :cond_5

    .line 404
    .line 405
    add-int/lit8 v4, v4, 0x1

    .line 406
    .line 407
    goto :goto_3

    .line 408
    :cond_4
    invoke-virtual {v0}, LO3/T1;->d0()LO3/g;

    .line 409
    .line 410
    .line 411
    sget-object v3, LO3/F;->l:LO3/E;

    .line 412
    .line 413
    invoke-virtual {v3, v5}, LO3/E;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    move-result-object v3

    .line 417
    check-cast v3, Ljava/lang/Integer;

    .line 418
    .line 419
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 420
    .line 421
    .line 422
    move-result v3

    .line 423
    int-to-long v6, v3

    .line 424
    :goto_4
    int-to-long v8, v4

    .line 425
    cmp-long v3, v8, v6

    .line 426
    .line 427
    if-gez v3, :cond_5

    .line 428
    .line 429
    const-wide/16 v8, 0x0

    .line 430
    .line 431
    invoke-virtual {v0, v2, v8, v9}, LO3/T1;->G(Ljava/lang/String;J)Z

    .line 432
    .line 433
    .line 434
    move-result v3

    .line 435
    if-eqz v3, :cond_5

    .line 436
    .line 437
    add-int/lit8 v4, v4, 0x1

    .line 438
    .line 439
    goto :goto_4

    .line 440
    :cond_5
    invoke-virtual {v0}, LO3/T1;->d0()LO3/g;

    .line 441
    .line 442
    .line 443
    move-result-object v3

    .line 444
    sget-object v4, LO3/F;->A0:LO3/E;

    .line 445
    .line 446
    invoke-virtual {v3, v5, v4}, LO3/g;->y(Ljava/lang/String;LO3/E;)Z

    .line 447
    .line 448
    .line 449
    move-result v3

    .line 450
    if-eqz v3, :cond_6

    .line 451
    .line 452
    invoke-virtual {v0}, LO3/T1;->c()LO3/p0;

    .line 453
    .line 454
    .line 455
    move-result-object v3

    .line 456
    invoke-virtual {v3}, LO3/p0;->o()V

    .line 457
    .line 458
    .line 459
    invoke-virtual {v0}, LO3/T1;->F()V

    .line 460
    .line 461
    .line 462
    :cond_6
    iget-object v3, v0, LO3/T1;->z:LO3/Q1;

    .line 463
    .line 464
    iget v1, v1, LO3/a2;->U:I

    .line 465
    .line 466
    invoke-static {v1}, LC0/S;->d(I)I

    .line 467
    .line 468
    .line 469
    move-result v1

    .line 470
    invoke-virtual {v3}, LO3/D0;->o()V

    .line 471
    .line 472
    .line 473
    const/4 v4, 0x2

    .line 474
    if-ne v1, v4, :cond_8

    .line 475
    .line 476
    invoke-static {v2}, LO3/Q1;->r(Ljava/lang/String;)Z

    .line 477
    .line 478
    .line 479
    move-result v1

    .line 480
    if-eqz v1, :cond_7

    .line 481
    .line 482
    goto :goto_5

    .line 483
    :cond_7
    iget-object v1, v3, LO3/K1;->s:LO3/T1;

    .line 484
    .line 485
    iget-object v1, v1, LO3/T1;->q:LO3/l0;

    .line 486
    .line 487
    invoke-static {v1}, LO3/T1;->S(LO3/O1;)V

    .line 488
    .line 489
    .line 490
    invoke-virtual {v1, v2}, LO3/l0;->A(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/O0;

    .line 491
    .line 492
    .line 493
    move-result-object v1

    .line 494
    if-eqz v1, :cond_8

    .line 495
    .line 496
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/O0;->D()Z

    .line 497
    .line 498
    .line 499
    move-result v3

    .line 500
    if-eqz v3, :cond_8

    .line 501
    .line 502
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/O0;->E()Lcom/google/android/gms/internal/measurement/T0;

    .line 503
    .line 504
    .line 505
    move-result-object v1

    .line 506
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/T0;->q()Ljava/lang/String;

    .line 507
    .line 508
    .line 509
    move-result-object v1

    .line 510
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 511
    .line 512
    .line 513
    move-result v1

    .line 514
    if-nez v1, :cond_8

    .line 515
    .line 516
    invoke-virtual {v0}, LO3/T1;->b()LO3/X;

    .line 517
    .line 518
    .line 519
    move-result-object v1

    .line 520
    iget-object v1, v1, LO3/X;->E:LO3/V;

    .line 521
    .line 522
    const-string v3, "[sgtm] Going background, trigger client side upload. appId"

    .line 523
    .line 524
    invoke-virtual {v1, v2, v3}, LO3/V;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 525
    .line 526
    .line 527
    invoke-virtual {v0}, LO3/T1;->e()LB3/a;

    .line 528
    .line 529
    .line 530
    move-result-object v1

    .line 531
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 532
    .line 533
    .line 534
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 535
    .line 536
    .line 537
    move-result-wide v3

    .line 538
    invoke-virtual {v0, v2, v3, v4}, LO3/T1;->r(Ljava/lang/String;J)V

    .line 539
    .line 540
    .line 541
    :cond_8
    :goto_5
    return-void

    .line 542
    :pswitch_5
    iget-object v0, p0, LO3/v0;->s:LO3/C0;

    .line 543
    .line 544
    iget-object v1, v0, LO3/C0;->c:LO3/T1;

    .line 545
    .line 546
    invoke-virtual {v1}, LO3/T1;->A()V

    .line 547
    .line 548
    .line 549
    iget-object v0, v0, LO3/C0;->c:LO3/T1;

    .line 550
    .line 551
    iget-object v1, p0, LO3/v0;->r:LO3/a2;

    .line 552
    .line 553
    invoke-virtual {v0, v1}, LO3/T1;->W(LO3/a2;)V

    .line 554
    .line 555
    .line 556
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
